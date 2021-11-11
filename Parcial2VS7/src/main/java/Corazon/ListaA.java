
package Corazon;

public class ListaA {
    
    private Nodo first;
    private int size;
    private Nodo ultimo;    
    
    public void ListaCircularDoble(){
        first=null;
        ultimo=null;
        size=0; 
    }
    
    public void add(Nodo N){
        if (first==null) {
            first=N;
            ultimo=N;
            first.setNext(ultimo);
            first.setPrevius(ultimo);
            ultimo.setNext(first);
            ultimo.setPrevius(first);
            size++;
        }else{
            ultimo.setNext(N);
            N.setPrevius(ultimo);
            ultimo=N; 
            ultimo.setNext(first);
            first.setPrevius(ultimo);
            size++;
        }
    } 
    
    public String buscarPacientePorDocumento(int identidad){
        if(first==null){
            return "Lista vacia";
        }else{ 
            Nodo current=first;
            for(int i=0 ; i<size ; i++){
                long documentoIdentidad = current.getPaciente().getDocumento(); 
                if(documentoIdentidad==identidad){
                   return current.getPaciente().ShowData();  
                }
                current=current.getNext();
            }
        }
        return "Paciente no encontrado";
    }  
    
    public String imprimir(){ 
        String a = "";
        if(first==null){
            return "Lista vacia";
        }else{ 
            Nodo current=first;
            for(int i=0 ; i<size ; i++){
                a += current.getPaciente().ShowData();
                current=current.getNext();
            }
        }
        return a;
    }

    public int getSize() {
        return size;
    }
}

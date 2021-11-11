 
package Corazon;

public class ColaP {
    private Nodo first;
    private int size;
    
    private ListaA atendidos = new ListaA();
    
    public ListaA getatendidos(){
        return this.atendidos;
    }
    
    public ColaP(){
        first=null; 
    }
    
    public void add(Nodo m){
        if(first==null){
                first = m;  
            }else{
                Nodo current = first; 
                while(true){ 
                    if (m.getPaciente().getTriage()<current.getPaciente().getTriage()) {
                       if(current==first){
                            first.setPrevius(m);
                            m.setNext(first);
                            first = m;
                            break;
                        }
                        m.setNext(current);
                        m.setPrevius(current.getPrevius()); 
                        current.getPrevius().setNext(m);
                        current.setPrevius(m); 
                        break;
                    }else if(current.getNext()==null){
                        current.setNext(m);
                        m.setPrevius(current);
                        break;
                    }
                    current = current.getNext();
                }  
            }
        size++;  
    }
    
    public String ShowAllData(){
        String a = "";
        if(size==0){
            return "lista vacia";
        }else{
            Nodo current = first; 
            for(int i=0 ; i<size ; i++){
                System.out.println(current);
                a += current.getPaciente().ShowData();
                current = current.getNext();
            }
            return a;
        }
    }
    
    public void reviewPacient(int x){
        if(size==0){
            System.out.println("lista vacia");
        }else{
            Nodo current = first;
            for(int i=0 ; i<x ; i++){
                System.out.println(current);
                current = current.getNext();  
                }
            current.getPaciente().setAttention(); 
        }
    }
    
    public void buscarPaciente(int documento){
        if(size==0){
            System.out.println("Sin elementos");
        }else{
            Nodo current = first;
            for(int i=0 ; i<size ; i++){
                if(current.getPaciente().getDocumento()==documento){
                    if(size==1){
                        atendidos.add(current);
                        first=null;
                        break;
                    }else{
                    current.getPrevius().setNext(current.getNext());
                    current.getNext().setPrevius(current.getPrevius());
                    atendidos.add(current);
                    break;
                    }
                }
                current=current.getNext();
            }
        }
        size--;
    }
    
    public void ShowSpecificData(int l){
        if (size==0) {
            System.out.println("lista vacia");
        }else{
            Nodo current=first;
            for(int i=0 ; i<l ; i++){    
                current = current.getNext();
            }
            current.getPaciente().ShowData();
            }
    }
    
    public void salidaDePacientes(){
        if(size==0){
            System.out.println("lista vacia");
        }else{
            Nodo current = first;
            for(int i=0 ; i<size ; i++){
                if (current.getPaciente().getAttention()) {
                    if (current==first) {
                        first=first.getNext();
                        atendidos.add(current);
                    }else{
                        current.getPrevius().setNext(current.getNext());
                        current.getNext().setPrevius(current.getPrevius());
                        atendidos.add(current);
                    } 
                }
                current = current.getNext();
                size--;
            }
        }
    }
    
    public void verPacientesAtendidos(){
        System.out.println(atendidos.imprimir());
    }

    public Nodo getFirst() {
        return first;
    }

    public int getSize() {
        return size;
    }

    public ListaA getAtendidos() {
        return atendidos;
    }
    
    
    
    
}


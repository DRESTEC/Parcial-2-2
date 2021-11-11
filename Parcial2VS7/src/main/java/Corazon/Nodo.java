
package Corazon;

public class Nodo {
    private Nodo next;
    private Nodo previus;
    private Pacient paciente;
     
    //Constructor
    public Nodo(String nombre, int documento, String genero, String grupo, int triage){
        
        Pacient P = new Pacient(nombre, documento, genero, grupo, triage);  
        paciente = P;
    }
    
    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrevius() {
        return previus;
    }

    public void setPrevius(Nodo previus) {
        this.previus = previus;
    }

    public Pacient getPaciente() {
        return paciente;
    }
}

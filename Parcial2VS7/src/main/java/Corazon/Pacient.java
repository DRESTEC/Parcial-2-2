
package Corazon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pacient {
    
    private LocalDateTime fecha;
    private String Nombre;
    private int documento;
    private String genero;
    private String grupoP;
    private int triage;
    
    private Boolean attention=false;
    
    //Constructor
    public Pacient(String nombre, int documento, String genero, String grupo, int triage){
        fecha = LocalDateTime.now();
        setNombre(nombre);
        setDocumento(documento);
        setGenero(genero);
        setGrupoP(grupo);
        setTriage(triage);
    } 
   
    public String ShowData(){
        DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy  || hh:mm:ss");
        return    "Nombre " + Nombre   + "\nGeneror: " + genero + "\ngrupo: " + grupoP
                + "\nTriage: " + triage
                + "\nDocumento" + documento
                + "\nCheck In: " + fecha.format(esDateFormat)+"\n---------\n";
    }
    
    public String getHourCheckInt(){
        DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("hh:mm:ss");
        return fecha.format(esDateFormat);
    }
    
    public String getDayCheckIn(){
        DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(esDateFormat);
    }

    public void setAttention() {
        if(attention){
            attention=false;
        }else{
            attention=true;
        }
    }

    public Boolean getAttention() {
        return attention;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    private void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDocumento() {
        return documento;
    }

    private void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getGenero() {
        return genero;
    }

    private void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGrupoP() {
        return grupoP;
    }

    private void setGrupoP(String grupoP) {
        this.grupoP = grupoP;
    }

    public int getTriage() {
        return triage;
    }

    private void setTriage(int triage) {
        this.triage = triage;
    }
}

import Corazon.ColaP;
import Corazon.Nodo;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


 


public class prueba {
   
    ColaP cola = new ColaP();
     
    @Before
    public void PilaDePrueba(){
        
        Nodo uno = new Nodo("aaaa", 1,"mujer", "neonato", 1);
        cola.add(uno);
        Nodo dos = new Nodo("aaab", 2,"mujer", "neonato", 4);
        cola.add(dos);
        Nodo tres = new Nodo("aaac", 4,"mujer", "neonato", 5);
        cola.add(tres);
        //noe
        Nodo cuatro = new Nodo("aaad", 3,"mujer", "neonato", 2); 
        cola.add(cuatro);
    }
     
    @Test
    public void pruebaLongitud(){ 
        assertEquals(cola.getSize(), 4);
    }
    
    @Test
    public void muestraDeContenido(){ 
        cola.ShowAllData();  
    }
}
    
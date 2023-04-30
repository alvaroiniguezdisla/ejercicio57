package org.example;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class ej57_tests {
    //creamos un test para lista vacia
    @Test
    public void testListaVacia() throws Exception {
        List<Double> datos = new ArrayList<>();
        assertEquals("Lista vacia ,contiene algun elemento 0 ó la suma de sus inversos es 0",ej_57.mediaArmonicalammbda(datos));
    }
    //creamos un test para lista con algun elemento 0
    @Test
    public void testListaConCero() throws Exception {
        List<Double> datos = new ArrayList<>();
        datos.add(1.0);
        datos.add(2.0);
        datos.add(0.0);
        assertEquals("Lista vacia ,contiene algun elemento 0 ó la suma de sus inversos es 0",ej_57.mediaArmonicalammbda(datos));
    }
    //creamos un test para lista con suma de inversos 0
    @Test
    public void testListaConSumaInversosCero() throws Exception {
        List<Double> datos = new ArrayList<>();
        datos.add(1.0);
        datos.add(2.0);
        datos.add(3.0);
        assertEquals("Lista vacia ,contiene algun elemento 0 ó la suma de sus inversos es 0",ej_57.mediaArmonicalammbda(datos));
    }
}

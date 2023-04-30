package org.example;
import java.util.List;
import java.util.stream.Collectors;

public class ej_57 {
    public static double mediaArmonicalammbda(List<Double> datos) throws Exception{
        //return excepcion si la lista esta vacia,contiene algún elemento que sea 0 ó la suma de sus inversos es 0
        if (datos.isEmpty() || datos.contains(0.0) || datos.stream().mapToDouble(d -> 1/d).sum() == 0) {
            throw new Exception("Lista vacia ,contiene algun elemento 0 ó la suma de sus inversos es 0");

        }
        //return la media armonica de los elementos de la lista funcion lambda
        return datos.size() / datos.stream().mapToDouble(d -> 1 / d).sum();





    }
}

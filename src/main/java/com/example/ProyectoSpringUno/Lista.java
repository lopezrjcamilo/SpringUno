package com.example.ProyectoSpringUno;

import java.util.ArrayList;

public interface Lista {
    void agregarElementos(ArrayList<String> lista);
    void mostrarElementos(ArrayList<String> lista);
    void eliminarElemento(ArrayList<String> lista);
    void modificarElemento(ArrayList<String> lista);
}

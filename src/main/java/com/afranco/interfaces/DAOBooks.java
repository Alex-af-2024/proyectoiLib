package com.afranco.interfaces;

import com.afranco.models.Books;
import java.util.List;

public interface DAOBooks {
    public void registrar(Books user) throws Exception;
    public void modificar(Books user) throws Exception;
    public void eliminar(Books user) throws Exception;
    public  List<Books> listar() throws Exception;
}

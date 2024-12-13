package com.afranco.interfaces;

import com.afranco.models.Books;
import java.util.List;

public interface DAOBooks {
     void registrar(Books user) throws Exception;
     void modificar(Books user) throws Exception;
     void eliminar(Books user) throws Exception;
      List<Books> listar() throws Exception;
}

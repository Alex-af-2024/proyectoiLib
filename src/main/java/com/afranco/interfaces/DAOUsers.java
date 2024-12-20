package com.afranco.interfaces;

import com.afranco.models.Users;
import java.util.List;


public interface DAOUsers {
    public void registrar(Users user) throws Exception;
    public void modificar(Users user) throws Exception;
    public void eliminar(int userId) throws Exception;
    public  List<Users> listar() throws Exception;
    
}

package com.afranco.ilib;

import com.afranco.conexion.DataBase;
import com.afranco.interfaces.DAOUsers;
import com.afranco.models.Users;
import java.sql.PreparedStatement;
import java.util.List;

public class DAOUsersImpl extends DataBase implements DAOUsers{

    @Override
    public void registrar(Users user) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(("INSERT INTO users(name, lastNameP,lastNameM,domicilio,tel) VALUES(?,?,?,?,?)"));
            st.setString(1, user.getName());
            st.setString(2, user.getLastNameP());
            st.setString(3, user.getLastNameM());
            st.setString(4, user.getDomicilio());
            st.setString(5, user.getTel());
        } catch (Exception e) {
        }
    }

    @Override
    public void modificar(Users user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Users user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Users> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

package com.afranco.ilib;

import com.afranco.conexion.DataBase;
import com.afranco.interfaces.DAOUsers;
import com.afranco.models.Users;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOUsersImpl extends DataBase implements DAOUsers{

    @Override
    public void registrar(Users user) throws Exception { /* User es el array que aloja datos y manda a mySql*/
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(("INSERT INTO users(name, lastNameP,lastNameM,domicilio,tel) VALUES(?,?,?,?,?)"));
            st.setString(1, user.getName());
            st.setString(2, user.getLastNameP());
            st.setString(3, user.getLastNameM());
            st.setString(4, user.getDomicilio());
            st.setString(5, user.getTel());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        }finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Users user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int userId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM users WHERE id = ?;");
            st.setInt(1, userId);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<Users> listar() throws Exception { // consultar
        List<Users> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(("SELECT * FROM users;")); //crea declaración preparada para consultar a mysql
            lista = new ArrayList(); //ver despues si podemos implementar en el atributo en lugar de null....
            ResultSet rs = st.executeQuery(); //ejecuta la consulta preparada y los guarda en rs.
            while(rs.next()){
                Users user = new Users();
                user.setId(rs.getInt("Id"));
                user.setName(rs.getString("name"));
                user.setLastNameP(rs.getString("lastNameP"));
                user.setLastNameM(rs.getString("lastNameM"));
                user.setDomicilio(rs.getString("domicilio"));
                user.setTel(rs.getString("tel"));
                user.setSanctions(rs.getInt("sanctions"));
                user.setSanc_money(rs.getInt("sanc_money"));
                
                lista.add(user);//extrae datos de user y los agrega a array lista. luego se cierran las declaraciones.
            }
            rs.close();
            st.close();
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.Cerrar();
        }
        return  lista;
    }
    
}

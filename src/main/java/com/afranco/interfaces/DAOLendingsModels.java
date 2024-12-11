package com.afranco.interfaces;

import com.afranco.views.LendingModel;
import java.util.List;

public interface DAOLendingsModels {
    public void registrar(LendingModel user) throws Exception;
    public void modificar(LendingModel user) throws Exception;
    //public void eliminar(LendingsModel user) throws Exception;
    public  List<LendingModel> listar() throws Exception;
}


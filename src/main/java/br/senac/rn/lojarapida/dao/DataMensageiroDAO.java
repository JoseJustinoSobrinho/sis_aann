package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.DataMensageiro;
import br.senac.rn.lojarapida.util.GenericDAO;

public class DataMensageiroDAO extends GenericDAO<DataMensageiro> {

    @Override
    public Class<DataMensageiro> getClassType() {
        return DataMensageiro.class;
    }

   
}
package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Expedidor;
import br.senac.rn.lojarapida.util.GenericDAO;

public class ExpedidorDAO extends GenericDAO<Expedidor> {

    @Override
    public Class<Expedidor> getClassType() {
        return Expedidor.class;
    }

}
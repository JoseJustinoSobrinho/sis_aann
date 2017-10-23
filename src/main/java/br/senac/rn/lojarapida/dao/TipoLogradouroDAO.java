package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.TipoLogradouro;
import br.senac.rn.lojarapida.util.GenericDAO;

public class TipoLogradouroDAO extends GenericDAO<TipoLogradouro> {

    @Override
    public Class<TipoLogradouro> getClassType() {
        return TipoLogradouro.class;
    }

}
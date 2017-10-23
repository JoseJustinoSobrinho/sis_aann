package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Complemento;
import br.senac.rn.lojarapida.util.GenericDAO;

public class ComplementoDAO extends GenericDAO<Complemento> {

    @Override
    public Class<Complemento> getClassType() {
        return Complemento.class;
    }

}
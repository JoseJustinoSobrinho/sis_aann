package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Cidade;
import br.senac.rn.lojarapida.util.GenericDAO;

public class CidadeDAO extends GenericDAO<Cidade> {

    @Override
    public Class<Cidade> getClassType() {
        return Cidade.class;
    }

}
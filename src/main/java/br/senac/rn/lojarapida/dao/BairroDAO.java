package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Bairro;
import br.senac.rn.lojarapida.util.GenericDAO;

public class BairroDAO extends GenericDAO<Bairro> {

    @Override
    public Class<Bairro> getClassType() {
        return Bairro.class;
    }

}
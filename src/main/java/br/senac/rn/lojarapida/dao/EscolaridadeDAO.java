package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Escolaridade;
import br.senac.rn.lojarapida.util.GenericDAO;

public class EscolaridadeDAO extends GenericDAO<Escolaridade> {

    @Override
    public Class<Escolaridade> getClassType() {
        return Escolaridade.class;
    }

}
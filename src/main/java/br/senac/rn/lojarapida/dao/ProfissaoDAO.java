package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Profissao;
import br.senac.rn.lojarapida.util.GenericDAO;

public class ProfissaoDAO extends GenericDAO<Profissao> {

    @Override
    public Class<Profissao> getClassType() {
        return Profissao.class;
    }

}
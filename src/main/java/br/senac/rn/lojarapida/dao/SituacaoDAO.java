package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Situacao;
import br.senac.rn.lojarapida.util.GenericDAO;

public class SituacaoDAO extends GenericDAO<Situacao> {

    @Override
    public Class<Situacao> getClassType() {
        return Situacao.class;
    }

}
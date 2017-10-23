package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.LocVotacao;
import br.senac.rn.lojarapida.util.GenericDAO;


public class LocVotacaoDAO extends GenericDAO<LocVotacao> {

    @Override
    public Class<LocVotacao> getClassType() {
        return LocVotacao.class;
    }

   

}
package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Mensageiro;
import br.senac.rn.lojarapida.util.GenericDAO;

public class MensageiroDAO extends GenericDAO<Mensageiro> {

    @Override
    public Class<Mensageiro> getClassType() {
        return Mensageiro.class;
    }

}
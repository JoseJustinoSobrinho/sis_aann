package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Status;
import br.senac.rn.lojarapida.util.GenericDAO;

public class StatusDAO extends GenericDAO<Status> {

    @Override
    public Class<Status> getClassType() {
        return Status.class;
    }

}
package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.EstadoCivil;
import br.senac.rn.lojarapida.util.GenericDAO;

public class EstadoCivilDAO extends GenericDAO<EstadoCivil> {

    @Override
    public Class<EstadoCivil> getClassType() {
        return EstadoCivil.class;
    }

}
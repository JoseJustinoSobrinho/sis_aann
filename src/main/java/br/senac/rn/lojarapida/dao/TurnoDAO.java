package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Turno;
import br.senac.rn.lojarapida.util.GenericDAO;

public class TurnoDAO extends GenericDAO<Turno> {

    @Override
    public Class<Turno> getClassType() {
        return Turno.class;
    }

   
}
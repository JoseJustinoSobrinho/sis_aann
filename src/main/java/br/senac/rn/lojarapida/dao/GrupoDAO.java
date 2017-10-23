package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Grupo;
import br.senac.rn.lojarapida.util.GenericDAO;

public class GrupoDAO extends GenericDAO<Grupo> {

    @Override
    public Class<Grupo> getClassType() {
        return Grupo.class;
    }

} 
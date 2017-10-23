package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Socio;
import br.senac.rn.lojarapida.util.GenericDAO;

public class SocioDAO extends GenericDAO<Socio> {

    @Override
    public Class<Socio> getClassType() {
        return Socio.class;
    }

}
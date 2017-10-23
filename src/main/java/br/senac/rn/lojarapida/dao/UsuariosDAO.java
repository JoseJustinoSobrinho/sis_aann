package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Usuarios;
import br.senac.rn.lojarapida.util.GenericDAO;

public class UsuariosDAO extends GenericDAO<Usuarios> {

    @Override
    public Class<Usuarios> getClassType() {
        return Usuarios.class;
    }

}
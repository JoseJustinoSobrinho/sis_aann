package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Logradouro;
import br.senac.rn.lojarapida.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;

public class LogradouroDAO extends GenericDAO<Logradouro> {

    @Override
    public Class<Logradouro> getClassType() {
        return Logradouro.class;
    }

    public List<Logradouro> buscarPorNome(String logradouro) {
        String jpql = "select p from Logradouro p where p.nome like :nome";
        TypedQuery<Logradouro> query = getEm().createQuery(jpql, Logradouro.class).setMaxResults(10);
        query.setParameter("nome", "%"+ logradouro + "%");
        return query.getResultList();
    }

}
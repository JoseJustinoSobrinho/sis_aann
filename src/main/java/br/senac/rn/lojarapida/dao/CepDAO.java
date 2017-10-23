package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Cep;
import br.senac.rn.lojarapida.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;



public class CepDAO extends GenericDAO<Cep> {

    @Override
    public Class<Cep> getClassType() {
        return Cep.class;
    }
 public List<Cep> buscarEnd(String cep) {
        String jpql = "select p from Cep p where p.cep like :cep";
        TypedQuery<Cep> query = getEm().createQuery(jpql, Cep.class).setMaxResults(10);
        query.setParameter("cep", "%"+ cep + "%");
        return query.getResultList();
    }
 
 
}
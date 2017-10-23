package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Contribuinte;
import br.senac.rn.lojarapida.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;



public class ContribuinteDAO extends GenericDAO<Contribuinte> {

    @Override
    public Class<Contribuinte> getClassType() {
        return Contribuinte.class;
    }
public List<Contribuinte> buscarPorCpf(String cpf) {
        String jpql = "SELECT c FROM Contribuinte c WHERE c.cpf like :cpfContribuinte";
        TypedQuery<Contribuinte> consulta = manager.createQuery(jpql, Contribuinte.class);
        consulta.setParameter("cpfContribuinte", "%" + cpf + "%");
        return consulta.getResultList();
    }
}
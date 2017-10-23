package br.senac.rn.lojarapida.controller;

import br.senac.rn.lojarapida.dao.CepDAO;
import br.senac.rn.lojarapida.model.Cep;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "cepBean")
public class CepBean {

    private Cep cep = new Cep();

    
   
public List<Cep> getBuscarEnd(String cep) {
        CepDAO dao = new CepDAO();
        return dao.buscarEnd(cep);
    }
    
    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }
    
}
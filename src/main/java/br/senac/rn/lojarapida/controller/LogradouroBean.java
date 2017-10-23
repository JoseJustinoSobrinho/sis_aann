package br.senac.rn.lojarapida.controller;
 
import br.senac.rn.lojarapida.dao.ContribuinteDAO;
import br.senac.rn.lojarapida.dao.CepDAO;
import br.senac.rn.lojarapida.model.Contribuinte;
import br.senac.rn.lojarapida.model.Logradouro;
import br.senac.rn.lojarapida.model.Cep;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "logradouroBean")
public class LogradouroBean {

    private Logradouro logradouro = new Logradouro();
    private Contribuinte contribuinte;
    private Cep produto = new Cep();
    

    
  

    public List<Contribuinte> getContribuintesPorCpf(String cpf) {
        ContribuinteDAO dao = new ContribuinteDAO();
        return dao.buscarPorCpf(cpf);
    }
    
    public Contribuinte getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }

    public Cep getCep() {
        return produto;
    }

    public void setCep(Cep produto) {
        this.produto = produto;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }
    
    
    
}
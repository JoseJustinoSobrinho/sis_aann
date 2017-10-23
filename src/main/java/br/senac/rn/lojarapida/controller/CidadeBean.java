package br.senac.rn.lojarapida.controller;

import br.senac.rn.lojarapida.dao.CidadeDAO;
import br.senac.rn.lojarapida.model.Cidade;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "cidadeBean")
public class CidadeBean {

    private Cidade cidade = new Cidade();

    public void salvar() {
        CidadeDAO dao = new CidadeDAO();
        if (this.cidade.getId() == 0) {
            dao.insert(this.cidade);
        } else {
            dao.update(this.cidade);
        }
        this.cidade = new Cidade();
    }
    
    public void editar(Cidade categoria) {
        this.cidade = categoria;
    }
    
    public void remover(Cidade categoria) {
        CidadeDAO dao = new CidadeDAO();
        dao.delete(categoria);
    }
    
    public List<Cidade> getCidades() {
        CidadeDAO dao = new CidadeDAO();
        return dao.selectAll();
    }
    
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade categoria) {
        this.cidade = categoria;
    }
    
}
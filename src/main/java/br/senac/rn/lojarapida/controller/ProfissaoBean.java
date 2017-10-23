package br.senac.rn.lojarapida.controller;

import br.senac.rn.lojarapida.dao.ProfissaoDAO;
import br.senac.rn.lojarapida.model.Profissao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "profissaoBean")
public class ProfissaoBean {

    private Profissao profissao = new Profissao();

    public void salvar() {
        ProfissaoDAO dao = new ProfissaoDAO();
        if (this.profissao.getId() == 0) {
            dao.insert(this.profissao);
        } else {
            dao.update(this.profissao);
        }
        this.profissao = new Profissao();
    }
    
    public void editar(Profissao profissao) {
        this.profissao = profissao;
    }
    
    public void remover(Profissao profissao) {
        ProfissaoDAO dao = new ProfissaoDAO();
        dao.delete(profissao);
    }
    
    public List<Profissao> getProfissaos() {
        ProfissaoDAO dao = new ProfissaoDAO();
        return dao.selectAll();
    }
    
    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
    
}
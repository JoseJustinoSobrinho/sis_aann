package br.senac.rn.lojarapida.controller;

import br.senac.rn.lojarapida.dao.GrupoDAO;
import br.senac.rn.lojarapida.model.Grupo;
import java.util.List;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

//@SessionScoped    /// escopo de seção para usar o login
@ViewScoped
@ManagedBean(name = "grupoBean")
public class GrupoBean {

    private Grupo grupo = new Grupo();

    public void salvar() {
        GrupoDAO dao = new GrupoDAO();
        if(this.grupo.getId() ==0){
            dao.insert(this.grupo);
        } else{
            dao.update(this.grupo);
        }
         this.grupo = new Grupo();  // recebe nova instacia e limpa na tela...      
    }
    
    public void editar(Grupo grupo) {
    this.grupo = grupo;
    }
    
    public void remover(Grupo grupo) {
        GrupoDAO dao = new GrupoDAO();
        dao.delete(grupo);        
    }
    
    public List<Grupo> getGrupos() {
        GrupoDAO dao = new GrupoDAO();
        return dao.selectAll();
    }
    
    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
}
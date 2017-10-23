package br.senac.rn.lojarapida.controller;

import br.senac.rn.lojarapida.dao.EstadoCivilDAO;
import br.senac.rn.lojarapida.model.EstadoCivil;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "estadoCivilBean")
public class EstadoCivilBean {

    private EstadoCivil estadoCivil = new EstadoCivil();

    public void salvar() {
        EstadoCivilDAO dao = new EstadoCivilDAO();
        if (this.estadoCivil.getId() == 0) {
            dao.insert(this.estadoCivil);
        } else {
            dao.update(this.estadoCivil);
        }
        this.estadoCivil = new EstadoCivil();
    }
    
    public void editar(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public void remover(EstadoCivil estadoCivil) {
        EstadoCivilDAO dao = new EstadoCivilDAO();
        dao.delete(estadoCivil);
    }
    
    public List<EstadoCivil> getEstadoCivils() {
        EstadoCivilDAO dao = new EstadoCivilDAO();
        return dao.selectAll();
    }
    
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
}
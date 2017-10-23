
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Isentos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sim_nao;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAutecao;
    @ManyToOne
    private Usuarios codUsuario;
    private int total;
    
    public Isentos() {
    }

    public Isentos(int id, String sim_nao, Calendar dataAutecao, Usuarios codUsuario, int total) {
        this.id = id;
        this.sim_nao = sim_nao;
        this.dataAutecao = dataAutecao;
        this.codUsuario = codUsuario;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSim_nao() {
        return sim_nao;
    }

    public void setSim_nao(String sim_nao) {
        this.sim_nao = sim_nao;
    }

    public Calendar getDataAutecao() {
        return dataAutecao;
    }

    public void setDataAutecao(Calendar dataAutecao) {
        this.dataAutecao = dataAutecao;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Isentos other = (Isentos) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Isentos{" + "id=" + id + ", sim_nao=" + sim_nao + ", dataAutecao=" + dataAutecao + ", codUsuario=" + codUsuario + ", total=" + total + '}';
    }

    
    
}

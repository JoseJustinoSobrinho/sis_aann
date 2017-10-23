
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Especialidade implements Serializable{    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String especialidade;
    private String tipo;

    public Especialidade() {
    }

    public Especialidade(int id, String especialidade, String tipo) {
        this.id = id;
        this.especialidade = especialidade;
        this.tipo = tipo;
    }

    public Especialidade(String especialidade, String tipo) {
        this.especialidade = especialidade;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id;
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
        final Especialidade other = (Especialidade) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Especialidade{" + "id=" + id + ", especialidade=" + especialidade + ", tipo=" + tipo + '}';
    }

    
    
}

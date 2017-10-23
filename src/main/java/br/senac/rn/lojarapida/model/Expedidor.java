
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Expedidor implements Serializable {    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String expedicao;  

    public Expedidor() {
    }

    public Expedidor(int id, String expedicao) {
        this.id = id;
        this.expedicao = expedicao;
    }

    public Expedidor(String expedicao) {
        this.expedicao = expedicao;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExpedicao() {
        return expedicao;
    }

    public void setExpedicao(String expedicao) {
        this.expedicao = expedicao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
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
        final Expedidor other = (Expedidor) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Expedidor{" + "id=" + id + ", expedicao=" + expedicao + '}';
    }

    
    
}

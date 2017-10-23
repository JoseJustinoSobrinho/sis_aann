
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Mensageiro implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mensageiro;
    private String fone; 
    @ManyToOne
    private Situacao situacao;
    
    public Mensageiro() {
    }

    public Mensageiro(int id, String mensageiro, String fone, Situacao situacao) {
        this.id = id;
        this.mensageiro = mensageiro;
        this.fone = fone;
        this.situacao = situacao;
    }
    
    

    public Mensageiro(String mensageiro, String fone, Situacao situacao) {
        this.mensageiro = mensageiro;
        this.fone = fone;
        this.situacao = situacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensageiro() {
        return mensageiro;
    }

    public void setMensageiro(String mensageiro) {
        this.mensageiro = mensageiro;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
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
        final Mensageiro other = (Mensageiro) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mensageiro{" + "id=" + id + ", mensageiro=" + mensageiro + ", fone=" + fone + ", situacao=" + situacao + '}';
    }
    
    
   
    
    
    
}

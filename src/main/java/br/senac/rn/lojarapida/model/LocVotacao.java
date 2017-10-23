
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LocVotacao implements Serializable{    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String tipo;
    @ManyToOne
    private Situacao situacao;

    public LocVotacao() {
    }

    public LocVotacao(int id, String nome, String tipo, Situacao situacao) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.situacao = situacao;
    }

    public LocVotacao(String nome, String tipo, Situacao situacao) {
        this.nome = nome;
        this.tipo = tipo;
        this.situacao = situacao;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        hash = 97 * hash + this.id;
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
        final LocVotacao other = (LocVotacao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LocVotacao{" + "id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", situacao=" + situacao + '}';
    }

    

    
    
}

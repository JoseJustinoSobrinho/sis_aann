
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Logradouro implements Serializable{    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String nome;
    private int rota;
    @ManyToOne
    private Usuarios usuario;

    public Logradouro() {
    }

    public Logradouro(int id, String nome, int rota, Usuarios usuario) {
        this.id = id;
        this.nome = nome;
        this.rota = rota;
        this.usuario = usuario;
    }

    public Logradouro(String nome, int rota, Usuarios usuario) {
        this.nome = nome;
        this.rota = rota;
        this.usuario = usuario;
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

    public int getRota() {
        return rota;
    }

    public void setRota(int rota) {
        this.rota = rota;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Logradouro other = (Logradouro) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Logradouro{" + "id=" + id + ", nome=" + nome + ", rota=" + rota + ", usuario=" + usuario + '}';
    }

    
    
    
}

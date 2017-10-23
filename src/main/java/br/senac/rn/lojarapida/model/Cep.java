
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Cep implements Serializable{
    
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    @Column(unique = true)
    private String cep;
    @ManyToOne
    private TipoLogradouro tipoLogradouro;
    @ManyToOne
    private Logradouro logradouro;
    @ManyToOne
    private Bairro bairro;
    @ManyToOne
    private Cidade cidade;
    @ManyToMany
    private List<Complemento> complemento;    
        
    public Cep() {
    }

    public Cep(int id, String cep, TipoLogradouro tipoLogradouro, Logradouro logradouro, Bairro bairro, Cidade cidade, List<Complemento> complemento) {
        this.id = id;
        this.cep = cep;
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
    }

    public Cep(String cep, TipoLogradouro tipoLogradouro, Logradouro logradouro, Bairro bairro, Cidade cidade) {
        this.cep = cep;
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Cep(String cep, TipoLogradouro tipoLogradouro, Logradouro logradouro, Bairro bairro, Cidade cidade, List<Complemento> complemento) {
        this.cep = cep;
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
    }

    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Complemento> getComplemento() {
        return complemento;
    }

    public void setComplemento(List<Complemento> complemento) {
        this.complemento = complemento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.id;
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
        final Cep other = (Cep) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cep{" + "id=" + id + ", cep=" + cep + ", tipoLogradouro=" + tipoLogradouro + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade + ", complemento=" + complemento + '}';
    }

    



}

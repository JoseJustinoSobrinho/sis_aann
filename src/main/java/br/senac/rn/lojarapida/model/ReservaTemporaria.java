
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
public class ReservaTemporaria implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataEntrada;
    private String cpf_cnpj;
    private String tipo;
    private String dados;
    @ManyToOne
    private Situacao situacao;
    
    
    public ReservaTemporaria() {
    }

    public ReservaTemporaria(int id, Calendar dataEntrada, String cpf_cnpj, String tipo, String dados, Situacao situacao) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.cpf_cnpj = cpf_cnpj;
        this.tipo = tipo;
        this.dados = dados;
        this.situacao = situacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Calendar dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final ReservaTemporaria other = (ReservaTemporaria) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ReservaTemporaria{" + "id=" + id + ", dataEntrada=" + dataEntrada + ", cpf_cnpj=" + cpf_cnpj + ", tipo=" + tipo + ", dados=" + dados + ", situacao=" + situacao + '}';
    }

    
   
    
    
    
    
}

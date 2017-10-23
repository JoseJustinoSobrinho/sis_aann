
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Funcionario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cnpj;
    private String cpf;
    private String rg_Crm;
    @ManyToOne
    private Situacao situacao;
    @ManyToOne
    private Especialidade tipo;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, String cnpj, String cpf, String rg_Crm, Situacao situacao, Especialidade tipo) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.rg_Crm = rg_Crm;
        this.situacao = situacao;
        this.tipo = tipo;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg_Crm() {
        return rg_Crm;
    }

    public void setRg_Crm(String rg_Crm) {
        this.rg_Crm = rg_Crm;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Especialidade getTipo() {
        return tipo;
    }

    public void setTipo(Especialidade tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
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
        final Funcionario other = (Funcionario) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + ", cpf=" + cpf + ", rg_Crm=" + rg_Crm + ", situacao=" + situacao + ", tipo=" + tipo + '}';
    }

    

    
}

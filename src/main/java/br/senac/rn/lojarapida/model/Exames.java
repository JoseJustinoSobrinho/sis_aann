
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Exames implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sigla;
    private float valorLab;
    private float valorLabdesconto;
    private float aann;
    private float enfermeira;
    private float desconto;
    @ManyToOne
    private Situacao situacao;
    @ManyToOne
    private LocVotacao local;
    
    public Exames() {
    }

    public Exames(int id, String sigla, float valorLab, float valorLabdesconto, float aann, float enfermeira, float desconto, Situacao situacao, LocVotacao local) {
        this.id = id;
        this.sigla = sigla;
        this.valorLab = valorLab;
        this.valorLabdesconto = valorLabdesconto;
        this.aann = aann;
        this.enfermeira = enfermeira;
        this.desconto = desconto;
        this.situacao = situacao;
        this.local = local;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public float getValorLab() {
        return valorLab;
    }

    public void setValorLab(float valorLab) {
        this.valorLab = valorLab;
    }

    public float getValorLabdesconto() {
        return valorLabdesconto;
    }

    public void setValorLabdesconto(float valorLabdesconto) {
        this.valorLabdesconto = valorLabdesconto;
    }

    public float getAann() {
        return aann;
    }

    public void setAann(float aann) {
        this.aann = aann;
    }

    public float getEnfermeira() {
        return enfermeira;
    }

    public void setEnfermeira(float enfermeira) {
        this.enfermeira = enfermeira;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public LocVotacao getLocal() {
        return local;
    }

    public void setLocal(LocVotacao local) {
        this.local = local;
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
        final Exames other = (Exames) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Exames{" + "id=" + id + ", sigla=" + sigla + ", valorLab=" + valorLab + ", valorLabdesconto=" + valorLabdesconto + ", aann=" + aann + ", enfermeira=" + enfermeira + ", desconto=" + desconto + ", situacao=" + situacao + ", local=" + local + '}';
    }

    
    
}

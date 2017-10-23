
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
public class EspacoSocial implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataEntrada;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataSaida;
    private float valor;
    private float desconto;
    private float total;
    @ManyToOne
    private Situacao situacao;
    @ManyToOne
    private Funcionario codFun;
    private int numSocio;
    @ManyToOne
    private Socio codSocio;
    @ManyToOne
    private Status codStatus;
    @ManyToOne
    private Categoria codCategoria;
    private int numDepen;
    @ManyToOne
    private Socio codSocioDepen;
    private String obs;    
    
    public EspacoSocial() {
    }

    public EspacoSocial(int id, Calendar dataEntrada, Calendar dataSaida, float valor, float desconto, float total, Situacao situacao, Funcionario codFun, int numSocio, Socio codSocio, Status codStatus, Categoria codCategoria, int numDepen, Socio codSocioDepen, String obs) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.valor = valor;
        this.desconto = desconto;
        this.total = total;
        this.situacao = situacao;
        this.codFun = codFun;
        this.numSocio = numSocio;
        this.codSocio = codSocio;
        this.codStatus = codStatus;
        this.codCategoria = codCategoria;
        this.numDepen = numDepen;
        this.codSocioDepen = codSocioDepen;
        this.obs = obs;
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

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Funcionario getCodFun() {
        return codFun;
    }

    public void setCodFun(Funcionario codFun) {
        this.codFun = codFun;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public Socio getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(Socio codSocio) {
        this.codSocio = codSocio;
    }

    public Status getCodStatus() {
        return codStatus;
    }

    public void setCodStatus(Status codStatus) {
        this.codStatus = codStatus;
    }

    public Categoria getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(Categoria codCategoria) {
        this.codCategoria = codCategoria;
    }

    public int getNumDepen() {
        return numDepen;
    }

    public void setNumDepen(int numDepen) {
        this.numDepen = numDepen;
    }

    public Socio getCodSocioDepen() {
        return codSocioDepen;
    }

    public void setCodSocioDepen(Socio codSocioDepen) {
        this.codSocioDepen = codSocioDepen;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        final EspacoSocial other = (EspacoSocial) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EspacoSocial{" + "id=" + id + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", valor=" + valor + ", desconto=" + desconto + ", total=" + total + ", situacao=" + situacao + ", codFun=" + codFun + ", numSocio=" + numSocio + ", codSocio=" + codSocio + ", codStatus=" + codStatus + ", codCategoria=" + codCategoria + ", numDepen=" + numDepen + ", codSocioDepen=" + codSocioDepen + ", obs=" + obs + '}';
    }

    
    
}

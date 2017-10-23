
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
public class ExamesMarcados implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataEntrada;
    private String ano;
    private float valorTotal;
    private float laboratorio;   
    private float aann;
    private float enfermeira;
    private int numSocio;
    @ManyToOne
    private Socio CodSocio;
    @ManyToOne
    private Beneficios codBeneficio;
    @ManyToOne
    private Recurso codRecurso;
    @ManyToOne
    private Situacao codSituacao;
    @ManyToOne
    private Usuarios codUsuario;
    @ManyToOne
    private Exames codExame;
    
    public ExamesMarcados() {
    }

    public ExamesMarcados(int id, Calendar dataEntrada, String ano, float valorTotal, float laboratorio, float aann, float enfermeira, int numSocio, Socio CodSocio, Beneficios codBeneficio, Recurso codRecurso, Situacao codSituacao, Usuarios codUsuario, Exames codExame) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.ano = ano;
        this.valorTotal = valorTotal;
        this.laboratorio = laboratorio;
        this.aann = aann;
        this.enfermeira = enfermeira;
        this.numSocio = numSocio;
        this.CodSocio = CodSocio;
        this.codBeneficio = codBeneficio;
        this.codRecurso = codRecurso;
        this.codSituacao = codSituacao;
        this.codUsuario = codUsuario;
        this.codExame = codExame;
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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(float laboratorio) {
        this.laboratorio = laboratorio;
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

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public Socio getCodSocio() {
        return CodSocio;
    }

    public void setCodSocio(Socio CodSocio) {
        this.CodSocio = CodSocio;
    }

    public Beneficios getCodBeneficio() {
        return codBeneficio;
    }

    public void setCodBeneficio(Beneficios codBeneficio) {
        this.codBeneficio = codBeneficio;
    }

    public Recurso getCodRecurso() {
        return codRecurso;
    }

    public void setCodRecurso(Recurso codRecurso) {
        this.codRecurso = codRecurso;
    }

    public Situacao getCodSituacao() {
        return codSituacao;
    }

    public void setCodSituacao(Situacao codSituacao) {
        this.codSituacao = codSituacao;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Exames getCodExame() {
        return codExame;
    }

    public void setCodExame(Exames codExame) {
        this.codExame = codExame;
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
        final ExamesMarcados other = (ExamesMarcados) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExamesMarcados{" + "id=" + id + ", dataEntrada=" + dataEntrada + ", ano=" + ano + ", valorTotal=" + valorTotal + ", laboratorio=" + laboratorio + ", aann=" + aann + ", enfermeira=" + enfermeira + ", numSocio=" + numSocio + ", CodSocio=" + CodSocio + ", codBeneficio=" + codBeneficio + ", codRecurso=" + codRecurso + ", codSituacao=" + codSituacao + ", codUsuario=" + codUsuario + ", codExame=" + codExame + '}';
    }

    
}

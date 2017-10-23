
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
public class Auditoria implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataEntrada;
    private int numSocio;
    @ManyToOne
    private Socio codSocio;
    @ManyToOne
    private Usuarios codUsuario;
    @ManyToOne
    private TipoAuditoria codAuditoria;
    private float valor;
    private String obs;
    

    public Auditoria() {
    }

    public Auditoria(int id, Calendar dataEntrada, int numSocio, Socio codSocio, Usuarios codUsuario, TipoAuditoria codAuditoria, float valor, String obs) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.numSocio = numSocio;
        this.codSocio = codSocio;
        this.codUsuario = codUsuario;
        this.codAuditoria = codAuditoria;
        this.valor = valor;
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

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public TipoAuditoria getCodAuditoria() {
        return codAuditoria;
    }

    public void setCodAuditoria(TipoAuditoria codAuditoria) {
        this.codAuditoria = codAuditoria;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.id;
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
        final Auditoria other = (Auditoria) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Auditoria{" + "id=" + id + ", dataEntrada=" + dataEntrada + ", numSocio=" + numSocio + ", codSocio=" + codSocio + ", codUsuario=" + codUsuario + ", codAuditoria=" + codAuditoria + ", valor=" + valor + ", obs=" + obs + '}';
    }

    

    
}

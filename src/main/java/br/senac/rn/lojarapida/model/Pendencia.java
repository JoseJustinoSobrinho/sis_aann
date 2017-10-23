
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
public class Pendencia implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataEntrada;
    private int numSocio;
    @ManyToOne
    private Socio codSocio;
    @ManyToOne
    private TipoPendencia codPendencia;
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataSaida;
    @ManyToOne
    private Usuarios codUsuario;
    
    public Pendencia() {
    }

    public Pendencia(int id, Calendar dataEntrada, int numSocio, Socio codSocio, TipoPendencia codPendencia, String status, Calendar dataSaida, Usuarios codUsuario) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.numSocio = numSocio;
        this.codSocio = codSocio;
        this.codPendencia = codPendencia;
        this.status = status;
        this.dataSaida = dataSaida;
        this.codUsuario = codUsuario;
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

    public TipoPendencia getCodPendencia() {
        return codPendencia;
    }

    public void setCodPendencia(TipoPendencia codPendencia) {
        this.codPendencia = codPendencia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.id;
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
        final Pendencia other = (Pendencia) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pendencia{" + "id=" + id + ", dataEntrada=" + dataEntrada + ", numSocio=" + numSocio + ", codSocio=" + codSocio + ", codPendencia=" + codPendencia + ", status=" + status + ", dataSaida=" + dataSaida + ", codUsuario=" + codUsuario + '}';
    }

    
    
}

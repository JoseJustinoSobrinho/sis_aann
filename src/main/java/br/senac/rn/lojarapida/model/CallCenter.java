
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
public class CallCenter implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataEntrada;
    private int numSocio;
    @ManyToOne
    private Socio codSocio;
    @ManyToOne
    private TipoCallCenter codCall;
    @ManyToOne
    private Usuarios usuario;
    private String obs;

    public CallCenter() {
    }

    public CallCenter(int id, Calendar dataEntrada, int numSocio, Socio codSocio, TipoCallCenter codCall, Usuarios usuario, String obs) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.numSocio = numSocio;
        this.codSocio = codSocio;
        this.codCall = codCall;
        this.usuario = usuario;
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

    public TipoCallCenter getCodCall() {
        return codCall;
    }

    public void setCodCall(TipoCallCenter codCall) {
        this.codCall = codCall;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
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
        hash = 59 * hash + this.id;
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
        final CallCenter other = (CallCenter) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CallCenter{" + "id=" + id + ", dataEntrada=" + dataEntrada + ", numSocio=" + numSocio + ", codSocio=" + codSocio + ", codCall=" + codCall + ", usuario=" + usuario + ", obs=" + obs + '}';
    }

}

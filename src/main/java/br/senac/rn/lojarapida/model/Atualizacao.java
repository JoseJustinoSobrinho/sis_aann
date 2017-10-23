
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
public class Atualizacao implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String atualizacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAtu;    
    private String cancelado;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataCancelado;
    private String reativado;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataReativado;
    @ManyToOne
    private Usuarios codUsuario;    

    public Atualizacao() {
    }

    public Atualizacao(int id, String atualizacao, Calendar dataAtu, String cancelado, Calendar dataCancelado, String reativado, Calendar dataReativado, Usuarios codUsuario) {
        this.id = id;
        this.atualizacao = atualizacao;
        this.dataAtu = dataAtu;
        this.cancelado = cancelado;
        this.dataCancelado = dataCancelado;
        this.reativado = reativado;
        this.dataReativado = dataReativado;
        this.codUsuario = codUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAtualizacao() {
        return atualizacao;
    }

    public void setAtualizacao(String atualizacao) {
        this.atualizacao = atualizacao;
    }

    public Calendar getDataAtu() {
        return dataAtu;
    }

    public void setDataAtu(Calendar dataAtu) {
        this.dataAtu = dataAtu;
    }

    public String getCancelado() {
        return cancelado;
    }

    public void setCancelado(String cancelado) {
        this.cancelado = cancelado;
    }

    public Calendar getDataCancelado() {
        return dataCancelado;
    }

    public void setDataCancelado(Calendar dataCancelado) {
        this.dataCancelado = dataCancelado;
    }

    public String getReativado() {
        return reativado;
    }

    public void setReativado(String reativado) {
        this.reativado = reativado;
    }

    public Calendar getDataReativado() {
        return dataReativado;
    }

    public void setDataReativado(Calendar dataReativado) {
        this.dataReativado = dataReativado;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
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
        final Atualizacao other = (Atualizacao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atualizacao{" + "id=" + id + ", atualizacao=" + atualizacao + ", dataAtu=" + dataAtu + ", cancelado=" + cancelado + ", dataCancelado=" + dataCancelado + ", reativado=" + reativado + ", dataReativado=" + dataReativado + ", codUsuario=" + codUsuario + '}';
    }

    
}

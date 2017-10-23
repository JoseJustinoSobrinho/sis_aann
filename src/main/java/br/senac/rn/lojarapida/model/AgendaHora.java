
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
public class AgendaHora implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataMarcacao;
    @ManyToOne
    private Agenda codAgenda;
    @ManyToOne
    private Beneficios codBeneficio;
    
    public AgendaHora() {
    }

    public AgendaHora(int id, String status, Calendar dataMarcacao, Agenda codAgenda, Beneficios codBeneficio) {
        this.id = id;
        this.status = status;
        this.dataMarcacao = dataMarcacao;
        this.codAgenda = codAgenda;
        this.codBeneficio = codBeneficio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Calendar getDataMarcacao() {
        return dataMarcacao;
    }

    public void setDataMarcacao(Calendar dataMarcacao) {
        this.dataMarcacao = dataMarcacao;
    }

    public Agenda getCodAgenda() {
        return codAgenda;
    }

    public void setCodAgenda(Agenda codAgenda) {
        this.codAgenda = codAgenda;
    }

    public Beneficios getCodBeneficio() {
        return codBeneficio;
    }

    public void setCodBeneficio(Beneficios codBeneficio) {
        this.codBeneficio = codBeneficio;
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
        final AgendaHora other = (AgendaHora) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AgendaHora{" + "id=" + id + ", status=" + status + ", dataMarcacao=" + dataMarcacao + ", codAgenda=" + codAgenda + ", codBeneficio=" + codBeneficio + '}';
    }

    
    
}

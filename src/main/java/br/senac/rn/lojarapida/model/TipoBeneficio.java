
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TipoBeneficio implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tipo;
    @ManyToOne
    private Situacao situacao;
    private String agenda_turma;

    public TipoBeneficio() {
    }

    public TipoBeneficio(int id, String tipo, Situacao situacao, String agenda_turma) {
        this.id = id;
        this.tipo = tipo;
        this.situacao = situacao;
        this.agenda_turma = agenda_turma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public String getAgenda_turma() {
        return agenda_turma;
    }

    public void setAgenda_turma(String agenda_turma) {
        this.agenda_turma = agenda_turma;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.id;
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
        final TipoBeneficio other = (TipoBeneficio) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TipoBeneficios{" + "id=" + id + ", tipo=" + tipo + ", situacao=" + situacao + ", agenda_turma=" + agenda_turma + '}';
    }

    
}

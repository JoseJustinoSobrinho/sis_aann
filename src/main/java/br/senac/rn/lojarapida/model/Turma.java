
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Turma implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String turma;
    private int total;
    private int usadas;
    @ManyToOne
    private TipoBeneficio tipoBeneficio;
    @ManyToOne
    private Funcionario funcionario;
    @ManyToOne
    private Situacao situacao;

    public Turma() {
    }

    public Turma(int id, String turma, int total, int usadas, TipoBeneficio tipoBeneficio, Funcionario funcionario, Situacao situacao) {
        this.id = id;
        this.turma = turma;
        this.total = total;
        this.usadas = usadas;
        this.tipoBeneficio = tipoBeneficio;
        this.funcionario = funcionario;
        this.situacao = situacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getUsadas() {
        return usadas;
    }

    public void setUsadas(int usadas) {
        this.usadas = usadas;
    }

    public TipoBeneficio getTipoBeneficio() {
        return tipoBeneficio;
    }

    public void setTipoBeneficio(TipoBeneficio tipoBeneficio) {
        this.tipoBeneficio = tipoBeneficio;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
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
        final Turma other = (Turma) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Turma{" + "id=" + id + ", turma=" + turma + ", total=" + total + ", usadas=" + usadas + ", tipoBeneficio=" + tipoBeneficio + ", funcionario=" + funcionario + ", situacao=" + situacao + '}';
    }

    
    
}

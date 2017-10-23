
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
public class Agenda implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAgenda;
    private String horaAgenda;
    private int vagas;
    private int usadas;
    private float valor;
    @ManyToOne
    private LocVotacao codLocal;
    @ManyToOne
    private Especialidade codEsp;
    @ManyToOne
    private Funcionario codFun;
    @ManyToOne
    private TipoBeneficio codTbf;
    @ManyToOne
    private Usuarios codUsu;
    private String tipo;
    
    
    public Agenda() {
    }

    public Agenda(int id, Calendar dataAgenda, String horaAgenda, int vagas, int usadas, float valor, LocVotacao codLocal, Especialidade codEsp, Funcionario codFun, TipoBeneficio codTbf, Usuarios codUsu, String tipo) {
        this.id = id;
        this.dataAgenda = dataAgenda;
        this.horaAgenda = horaAgenda;
        this.vagas = vagas;
        this.usadas = usadas;
        this.valor = valor;
        this.codLocal = codLocal;
        this.codEsp = codEsp;
        this.codFun = codFun;
        this.codTbf = codTbf;
        this.codUsu = codUsu;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataAgenda() {
        return dataAgenda;
    }

    public void setDataAgenda(Calendar dataAgenda) {
        this.dataAgenda = dataAgenda;
    }

    public String getHoraAgenda() {
        return horaAgenda;
    }

    public void setHoraAgenda(String horaAgenda) {
        this.horaAgenda = horaAgenda;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public int getUsadas() {
        return usadas;
    }

    public void setUsadas(int usadas) {
        this.usadas = usadas;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocVotacao getCodLocal() {
        return codLocal;
    }

    public void setCodLocal(LocVotacao codLocal) {
        this.codLocal = codLocal;
    }

    public Especialidade getCodEsp() {
        return codEsp;
    }

    public void setCodEsp(Especialidade codEsp) {
        this.codEsp = codEsp;
    }

    public Funcionario getCodFun() {
        return codFun;
    }

    public void setCodFun(Funcionario codFun) {
        this.codFun = codFun;
    }

    public TipoBeneficio getCodTbf() {
        return codTbf;
    }

    public void setCodTbf(TipoBeneficio codTbf) {
        this.codTbf = codTbf;
    }

    public Usuarios getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(Usuarios codUsu) {
        this.codUsu = codUsu;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
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
        final Agenda other = (Agenda) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agenda{" + "id=" + id + ", dataAgenda=" + dataAgenda + ", horaAgenda=" + horaAgenda + ", vagas=" + vagas + ", usadas=" + usadas + ", valor=" + valor + ", codLocal=" + codLocal + ", codEsp=" + codEsp + ", codFun=" + codFun + ", codTbf=" + codTbf + ", codUsu=" + codUsu + ", tipo=" + tipo + '}';
    }

    
    
    
}

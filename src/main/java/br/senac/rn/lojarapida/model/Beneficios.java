
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
public class Beneficios implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar entrada;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar saida;
    private int numsocio;
    @ManyToOne
    private Socio CodSocio;
    private String dados;
    @ManyToOne
    private TipoBeneficio CodTipoBef;
    @ManyToOne
    private Situacao CodSituacao;
    @ManyToOne
    private Usuarios CodUsuario;
    @ManyToOne
    private Turma CodTurma;
    @ManyToOne
    private Especialidade CodEspecialidade;
    @ManyToOne
    private Funcionario CodFuncionario;
    
    
    public Beneficios() {
    }

    public Beneficios(int id, Calendar entrada, Calendar saida, int numsocio, Socio CodSocio, String dados, TipoBeneficio CodTipoBef, Situacao CodSituacao, Usuarios CodUsuario, Turma CodTurma, Especialidade CodEspecialidade, Funcionario CodFuncionario) {
        this.id = id;
        this.entrada = entrada;
        this.saida = saida;
        this.numsocio = numsocio;
        this.CodSocio = CodSocio;
        this.dados = dados;
        this.CodTipoBef = CodTipoBef;
        this.CodSituacao = CodSituacao;
        this.CodUsuario = CodUsuario;
        this.CodTurma = CodTurma;
        this.CodEspecialidade = CodEspecialidade;
        this.CodFuncionario = CodFuncionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getEntrada() {
        return entrada;
    }

    public void setEntrada(Calendar entrada) {
        this.entrada = entrada;
    }

    public Calendar getSaida() {
        return saida;
    }

    public void setSaida(Calendar saida) {
        this.saida = saida;
    }

    public int getNumsocio() {
        return numsocio;
    }

    public void setNumsocio(int numsocio) {
        this.numsocio = numsocio;
    }

    public Socio getCodSocio() {
        return CodSocio;
    }

    public void setCodSocio(Socio CodSocio) {
        this.CodSocio = CodSocio;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public TipoBeneficio getCodTipoBef() {
        return CodTipoBef;
    }

    public void setCodTipoBef(TipoBeneficio CodTipoBef) {
        this.CodTipoBef = CodTipoBef;
    }

    public Situacao getCodSituacao() {
        return CodSituacao;
    }

    public void setCodSituacao(Situacao CodSituacao) {
        this.CodSituacao = CodSituacao;
    }

    public Usuarios getCodUsuario() {
        return CodUsuario;
    }

    public void setCodUsuario(Usuarios CodUsuario) {
        this.CodUsuario = CodUsuario;
    }

    public Turma getCodTurma() {
        return CodTurma;
    }

    public void setCodTurma(Turma CodTurma) {
        this.CodTurma = CodTurma;
    }

    public Especialidade getCodEspecialidade() {
        return CodEspecialidade;
    }

    public void setCodEspecialidade(Especialidade CodEspecialidade) {
        this.CodEspecialidade = CodEspecialidade;
    }

    public Funcionario getCodFuncionario() {
        return CodFuncionario;
    }

    public void setCodFuncionario(Funcionario CodFuncionario) {
        this.CodFuncionario = CodFuncionario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
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
        final Beneficios other = (Beneficios) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beneficios{" + "id=" + id + ", entrada=" + entrada + ", saida=" + saida + ", numsocio=" + numsocio + ", CodSocio=" + CodSocio + ", dados=" + dados + ", CodTipoBef=" + CodTipoBef + ", CodSituacao=" + CodSituacao + ", CodUsuario=" + CodUsuario + ", CodTurma=" + CodTurma + ", CodEspecialidade=" + CodEspecialidade + ", CodFuncionario=" + CodFuncionario + '}';
    }

    
   
    
}

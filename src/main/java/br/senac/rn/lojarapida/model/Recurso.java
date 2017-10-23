
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
public class Recurso implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int controle;
    private int ano;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataEntrada;
    private float valor;
    private String tipo;
    private String descricao;
    private String forma;
    private int outroUsuario;
    private String status;
    @ManyToOne
    private TipoRecurso codTipoRec;
    @ManyToOne
    private Usuarios codusu;
    @ManyToOne
    private Especialidade codEsp;
    @ManyToOne
    private Funcionario codFun;
    @ManyToOne
    private Beneficios codBef;
    @ManyToOne
    private Agenda codAge;
    private float ValorFim;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataFim;
    private int parcela;

    public Recurso() {
    }

    public Recurso(int id, int controle, int ano, Calendar dataEntrada, float valor, String tipo, String descricao, String forma, int outroUsuario, String status, TipoRecurso codTipoRec, Usuarios codusu, Especialidade codEsp, Funcionario codFun, Beneficios codBef, Agenda codAge, float ValorFim, Calendar dataFim, int parcela) {
        this.id = id;
        this.controle = controle;
        this.ano = ano;
        this.dataEntrada = dataEntrada;
        this.valor = valor;
        this.tipo = tipo;
        this.descricao = descricao;
        this.forma = forma;
        this.outroUsuario = outroUsuario;
        this.status = status;
        this.codTipoRec = codTipoRec;
        this.codusu = codusu;
        this.codEsp = codEsp;
        this.codFun = codFun;
        this.codBef = codBef;
        this.codAge = codAge;
        this.ValorFim = ValorFim;
        this.dataFim = dataFim;
        this.parcela = parcela;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getControle() {
        return controle;
    }

    public void setControle(int controle) {
        this.controle = controle;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Calendar dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getOutroUsuario() {
        return outroUsuario;
    }

    public void setOutroUsuario(int outroUsuario) {
        this.outroUsuario = outroUsuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TipoRecurso getCodTipoRec() {
        return codTipoRec;
    }

    public void setCodTipoRec(TipoRecurso codTipoRec) {
        this.codTipoRec = codTipoRec;
    }

    public Usuarios getCodusu() {
        return codusu;
    }

    public void setCodusu(Usuarios codusu) {
        this.codusu = codusu;
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

    public Beneficios getCodBef() {
        return codBef;
    }

    public void setCodBef(Beneficios codBef) {
        this.codBef = codBef;
    }

    public Agenda getCodAge() {
        return codAge;
    }

    public void setCodAge(Agenda codAge) {
        this.codAge = codAge;
    }

    public float getValorFim() {
        return ValorFim;
    }

    public void setValorFim(float ValorFim) {
        this.ValorFim = ValorFim;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id;
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
        final Recurso other = (Recurso) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Recurso{" + "id=" + id + ", controle=" + controle + ", ano=" + ano + ", dataEntrada=" + dataEntrada + ", valor=" + valor + ", tipo=" + tipo + ", descricao=" + descricao + ", forma=" + forma + ", outroUsuario=" + outroUsuario + ", status=" + status + ", codTipoRec=" + codTipoRec + ", codusu=" + codusu + ", codEsp=" + codEsp + ", codFun=" + codFun + ", codBef=" + codBef + ", codAge=" + codAge + ", ValorFim=" + ValorFim + ", dataFim=" + dataFim + ", parcela=" + parcela + '}';
    }
    
    
    
    
    
}

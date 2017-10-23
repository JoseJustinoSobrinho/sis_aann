
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
public class Despesa implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int controle;
    private int ano;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataFim;
    private float valor;
    private String tipo;
    private String descricao;
    private String forma;
    private int outroUsuario;
    private String status;
    @ManyToOne
    private TipoDespesa codTipoDesp;
    @ManyToOne
    private Usuarios codusu;
    private float ValorInicial;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataInicial;
    private int parcela;

    public Despesa() {
    }

    public Despesa(int id, int controle, int ano, Calendar dataFim, float valor, String tipo, String descricao, String forma, int outroUsuario, String status, TipoDespesa codTipoDesp, Usuarios codusu, float ValorInicial, Calendar dataInicial, int parcela) {
        this.id = id;
        this.controle = controle;
        this.ano = ano;
        this.dataFim = dataFim;
        this.valor = valor;
        this.tipo = tipo;
        this.descricao = descricao;
        this.forma = forma;
        this.outroUsuario = outroUsuario;
        this.status = status;
        this.codTipoDesp = codTipoDesp;
        this.codusu = codusu;
        this.ValorInicial = ValorInicial;
        this.dataInicial = dataInicial;
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

    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
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

    public TipoDespesa getCodTipoDesp() {
        return codTipoDesp;
    }

    public void setCodTipoDesp(TipoDespesa codTipoDesp) {
        this.codTipoDesp = codTipoDesp;
    }

    public Usuarios getCodusu() {
        return codusu;
    }

    public void setCodusu(Usuarios codusu) {
        this.codusu = codusu;
    }

    public float getValorInicial() {
        return ValorInicial;
    }

    public void setValorInicial(float ValorInicial) {
        this.ValorInicial = ValorInicial;
    }

    public Calendar getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
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
        final Despesa other = (Despesa) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Despesa{" + "id=" + id + ", controle=" + controle + ", ano=" + ano + ", dataFim=" + dataFim + ", valor=" + valor + ", tipo=" + tipo + ", descricao=" + descricao + ", forma=" + forma + ", outroUsuario=" + outroUsuario + ", status=" + status + ", codTipoDesp=" + codTipoDesp + ", codusu=" + codusu + ", ValorInicial=" + ValorInicial + ", dataInicial=" + dataInicial + ", parcela=" + parcela + '}';
    }

    
        
    
}

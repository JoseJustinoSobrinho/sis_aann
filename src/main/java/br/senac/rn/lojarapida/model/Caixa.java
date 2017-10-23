
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
public class Caixa implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataFim;
    private int controle;
    private int ano;
    private String tipo;
    private String descricao;    
    private float ativo;
    private float passivo;
    private float total;   
    private String forma;
    private int outroDado;
    private String status;
    private String cpf_cnpj;
    private String c_d;
    private int codMov;
    @ManyToOne
    private Reserva codReserva;
    @ManyToOne
    private Recurso codRecurso;
    @ManyToOne
    private Despesa codDespesa;
    @ManyToOne
    private Usuarios codUsuario;
    @ManyToOne
    private PreReserva codPreReserva;
    private String dados;
    private int parcela;
    private float valorAnt;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAnt;
    
    public Caixa() {
    }

    public Caixa(int id, Calendar dataFim, int controle, int ano, String tipo, String descricao, float ativo, float passivo, float total, String forma, int outroDado, String status, String cpf_cnpj, String c_d, int codMov, Reserva codReserva, Recurso codRecurso, Despesa codDespesa, Usuarios codUsuario, PreReserva codPreReserva, String dados, int parcela, float valorAnt, Calendar dataAnt) {
        this.id = id;
        this.dataFim = dataFim;
        this.controle = controle;
        this.ano = ano;
        this.tipo = tipo;
        this.descricao = descricao;
        this.ativo = ativo;
        this.passivo = passivo;
        this.total = total;
        this.forma = forma;
        this.outroDado = outroDado;
        this.status = status;
        this.cpf_cnpj = cpf_cnpj;
        this.c_d = c_d;
        this.codMov = codMov;
        this.codReserva = codReserva;
        this.codRecurso = codRecurso;
        this.codDespesa = codDespesa;
        this.codUsuario = codUsuario;
        this.codPreReserva = codPreReserva;
        this.dados = dados;
        this.parcela = parcela;
        this.valorAnt = valorAnt;
        this.dataAnt = dataAnt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
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

    public float getAtivo() {
        return ativo;
    }

    public void setAtivo(float ativo) {
        this.ativo = ativo;
    }

    public float getPassivo() {
        return passivo;
    }

    public void setPassivo(float passivo) {
        this.passivo = passivo;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getOutroDado() {
        return outroDado;
    }

    public void setOutroDado(int outroDado) {
        this.outroDado = outroDado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getC_d() {
        return c_d;
    }

    public void setC_d(String c_d) {
        this.c_d = c_d;
    }

    public int getCodMov() {
        return codMov;
    }

    public void setCodMov(int codMov) {
        this.codMov = codMov;
    }

    public Reserva getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(Reserva codReserva) {
        this.codReserva = codReserva;
    }

    public Recurso getCodRecurso() {
        return codRecurso;
    }

    public void setCodRecurso(Recurso codRecurso) {
        this.codRecurso = codRecurso;
    }

    public Despesa getCodDespesa() {
        return codDespesa;
    }

    public void setCodDespesa(Despesa codDespesa) {
        this.codDespesa = codDespesa;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public PreReserva getCodPreReserva() {
        return codPreReserva;
    }

    public void setCodPreReserva(PreReserva codPreReserva) {
        this.codPreReserva = codPreReserva;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public float getValorAnt() {
        return valorAnt;
    }

    public void setValorAnt(float valorAnt) {
        this.valorAnt = valorAnt;
    }

    public Calendar getDataAnt() {
        return dataAnt;
    }

    public void setDataAnt(Calendar dataAnt) {
        this.dataAnt = dataAnt;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Caixa other = (Caixa) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Caixa{" + "id=" + id + ", dataFim=" + dataFim + ", controle=" + controle + ", ano=" + ano + ", tipo=" + tipo + ", descricao=" + descricao + ", ativo=" + ativo + ", passivo=" + passivo + ", total=" + total + ", forma=" + forma + ", outroDado=" + outroDado + ", status=" + status + ", cpf_cnpj=" + cpf_cnpj + ", c_d=" + c_d + ", codMov=" + codMov + ", codReserva=" + codReserva + ", codRecurso=" + codRecurso + ", codDespesa=" + codDespesa + ", codUsuario=" + codUsuario + ", codPreReserva=" + codPreReserva + ", dados=" + dados + ", parcela=" + parcela + ", valorAnt=" + valorAnt + ", dataAnt=" + dataAnt + '}';
    }

    
    
    
    
}

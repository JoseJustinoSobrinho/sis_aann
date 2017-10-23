
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
public class MarcacaoMensageiro implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataMarcacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataPagamento;
    private String sim_nao;
    @ManyToOne
    private Beneficios codBeneficio;
    private int numSocio;
    @ManyToOne
    private Socio codSocio;
    @ManyToOne
    private Usuarios codFuncionario;
    @ManyToOne
    private Usuarios codMensageiro;
    private float valor;
    private float pagou;
    
    public MarcacaoMensageiro() {
    }

    public MarcacaoMensageiro(int id, Calendar dataMarcacao, Calendar dataPagamento, String sim_nao, Beneficios codBeneficio, int numSocio, Socio codSocio, Usuarios codFuncionario, Usuarios codMensageiro, float valor, float pagou) {
        this.id = id;
        this.dataMarcacao = dataMarcacao;
        this.dataPagamento = dataPagamento;
        this.sim_nao = sim_nao;
        this.codBeneficio = codBeneficio;
        this.numSocio = numSocio;
        this.codSocio = codSocio;
        this.codFuncionario = codFuncionario;
        this.codMensageiro = codMensageiro;
        this.valor = valor;
        this.pagou = pagou;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataMarcacao() {
        return dataMarcacao;
    }

    public void setDataMarcacao(Calendar dataMarcacao) {
        this.dataMarcacao = dataMarcacao;
    }

    public Calendar getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Calendar dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getSim_nao() {
        return sim_nao;
    }

    public void setSim_nao(String sim_nao) {
        this.sim_nao = sim_nao;
    }

    public Beneficios getCodBeneficio() {
        return codBeneficio;
    }

    public void setCodBeneficio(Beneficios codBeneficio) {
        this.codBeneficio = codBeneficio;
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

    public Usuarios getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Usuarios codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public Usuarios getCodMensageiro() {
        return codMensageiro;
    }

    public void setCodMensageiro(Usuarios codMensageiro) {
        this.codMensageiro = codMensageiro;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getPagou() {
        return pagou;
    }

    public void setPagou(float pagou) {
        this.pagou = pagou;
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
        final MarcacaoMensageiro other = (MarcacaoMensageiro) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MarcacaoMensageiro{" + "id=" + id + ", dataMarcacao=" + dataMarcacao + ", dataPagamento=" + dataPagamento + ", sim_nao=" + sim_nao + ", codBeneficio=" + codBeneficio + ", numSocio=" + numSocio + ", codSocio=" + codSocio + ", codFuncionario=" + codFuncionario + ", codMensageiro=" + codMensageiro + ", valor=" + valor + ", pagou=" + pagou + '}';
    }
    
    
}

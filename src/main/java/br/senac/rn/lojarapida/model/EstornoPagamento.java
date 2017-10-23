
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
public class EstornoPagamento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataEntrada;
    @ManyToOne
    private Funcionario codFun;
    @ManyToOne
    private Pagamento codPag;
    private float valorIn;
    private float multaIn;
    private float descontoIn;
    private float totalIn;
    private String ass_MenIn;
    @ManyToOne
    private Funcionario funIn;
    @ManyToOne
    private Usuarios usuIn;
    @ManyToOne
    private MesesAnos mesIn;
    private int numSocioIn;
    @ManyToOne
    private Socio socioIn;    
    @ManyToOne
    private Status statusIn;
    @ManyToOne
    private Categoria catIn;
    
    private float valorFim;
    private float multaFim;
    private float descontoFim;
    private float totalFim;
    private String ass_MenFim;
    @ManyToOne
    private Funcionario funFim;
    @ManyToOne
    private Usuarios usuFim;
    @ManyToOne
    private MesesAnos mesFim;
    private int numSocioFim;
    @ManyToOne
    private Socio socioFim;    
    @ManyToOne
    private Status statusFim;
    @ManyToOne
    private Categoria catFim;
    
    private String obs;
    
        
    public EstornoPagamento() {
    }

    public EstornoPagamento(int id, Calendar dataEntrada, Funcionario codFun, Pagamento codPag, float valorIn, float multaIn, float descontoIn, float totalIn, String ass_MenIn, Funcionario funIn, Usuarios usuIn, MesesAnos mesIn, int numSocioIn, Socio socioIn, Status statusIn, Categoria catIn, float valorFim, float multaFim, float descontoFim, float totalFim, String ass_MenFim, Funcionario funFim, Usuarios usuFim, MesesAnos mesFim, int numSocioFim, Socio socioFim, Status statusFim, Categoria catFim, String obs) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.codFun = codFun;
        this.codPag = codPag;
        this.valorIn = valorIn;
        this.multaIn = multaIn;
        this.descontoIn = descontoIn;
        this.totalIn = totalIn;
        this.ass_MenIn = ass_MenIn;
        this.funIn = funIn;
        this.usuIn = usuIn;
        this.mesIn = mesIn;
        this.numSocioIn = numSocioIn;
        this.socioIn = socioIn;
        this.statusIn = statusIn;
        this.catIn = catIn;
        this.valorFim = valorFim;
        this.multaFim = multaFim;
        this.descontoFim = descontoFim;
        this.totalFim = totalFim;
        this.ass_MenFim = ass_MenFim;
        this.funFim = funFim;
        this.usuFim = usuFim;
        this.mesFim = mesFim;
        this.numSocioFim = numSocioFim;
        this.socioFim = socioFim;
        this.statusFim = statusFim;
        this.catFim = catFim;
        this.obs = obs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Calendar dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Funcionario getCodFun() {
        return codFun;
    }

    public void setCodFun(Funcionario codFun) {
        this.codFun = codFun;
    }

    public Pagamento getCodPag() {
        return codPag;
    }

    public void setCodPag(Pagamento codPag) {
        this.codPag = codPag;
    }

    public float getValorIn() {
        return valorIn;
    }

    public void setValorIn(float valorIn) {
        this.valorIn = valorIn;
    }

    public float getMultaIn() {
        return multaIn;
    }

    public void setMultaIn(float multaIn) {
        this.multaIn = multaIn;
    }

    public float getDescontoIn() {
        return descontoIn;
    }

    public void setDescontoIn(float descontoIn) {
        this.descontoIn = descontoIn;
    }

    public float getTotalIn() {
        return totalIn;
    }

    public void setTotalIn(float totalIn) {
        this.totalIn = totalIn;
    }

    public String getAss_MenIn() {
        return ass_MenIn;
    }

    public void setAss_MenIn(String ass_MenIn) {
        this.ass_MenIn = ass_MenIn;
    }

    public Funcionario getFunIn() {
        return funIn;
    }

    public void setFunIn(Funcionario funIn) {
        this.funIn = funIn;
    }

    public Usuarios getUsuIn() {
        return usuIn;
    }

    public void setUsuIn(Usuarios usuIn) {
        this.usuIn = usuIn;
    }

    public MesesAnos getMesIn() {
        return mesIn;
    }

    public void setMesIn(MesesAnos mesIn) {
        this.mesIn = mesIn;
    }

    public int getNumSocioIn() {
        return numSocioIn;
    }

    public void setNumSocioIn(int numSocioIn) {
        this.numSocioIn = numSocioIn;
    }

    public Socio getSocioIn() {
        return socioIn;
    }

    public void setSocioIn(Socio socioIn) {
        this.socioIn = socioIn;
    }

    public Status getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(Status statusIn) {
        this.statusIn = statusIn;
    }

    public Categoria getCatIn() {
        return catIn;
    }

    public void setCatIn(Categoria catIn) {
        this.catIn = catIn;
    }

    public float getValorFim() {
        return valorFim;
    }

    public void setValorFim(float valorFim) {
        this.valorFim = valorFim;
    }

    public float getMultaFim() {
        return multaFim;
    }

    public void setMultaFim(float multaFim) {
        this.multaFim = multaFim;
    }

    public float getDescontoFim() {
        return descontoFim;
    }

    public void setDescontoFim(float descontoFim) {
        this.descontoFim = descontoFim;
    }

    public float getTotalFim() {
        return totalFim;
    }

    public void setTotalFim(float totalFim) {
        this.totalFim = totalFim;
    }

    public String getAss_MenFim() {
        return ass_MenFim;
    }

    public void setAss_MenFim(String ass_MenFim) {
        this.ass_MenFim = ass_MenFim;
    }

    public Funcionario getFunFim() {
        return funFim;
    }

    public void setFunFim(Funcionario funFim) {
        this.funFim = funFim;
    }

    public Usuarios getUsuFim() {
        return usuFim;
    }

    public void setUsuFim(Usuarios usuFim) {
        this.usuFim = usuFim;
    }

    public MesesAnos getMesFim() {
        return mesFim;
    }

    public void setMesFim(MesesAnos mesFim) {
        this.mesFim = mesFim;
    }

    public int getNumSocioFim() {
        return numSocioFim;
    }

    public void setNumSocioFim(int numSocioFim) {
        this.numSocioFim = numSocioFim;
    }

    public Socio getSocioFim() {
        return socioFim;
    }

    public void setSocioFim(Socio socioFim) {
        this.socioFim = socioFim;
    }

    public Status getStatusFim() {
        return statusFim;
    }

    public void setStatusFim(Status statusFim) {
        this.statusFim = statusFim;
    }

    public Categoria getCatFim() {
        return catFim;
    }

    public void setCatFim(Categoria catFim) {
        this.catFim = catFim;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.id;
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
        final EstornoPagamento other = (EstornoPagamento) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EstornoPagamento{" + "id=" + id + ", dataEntrada=" + dataEntrada + ", codFun=" + codFun + ", codPag=" + codPag + ", valorIn=" + valorIn + ", multaIn=" + multaIn + ", descontoIn=" + descontoIn + ", totalIn=" + totalIn + ", ass_MenIn=" + ass_MenIn + ", funIn=" + funIn + ", usuIn=" + usuIn + ", mesIn=" + mesIn + ", numSocioIn=" + numSocioIn + ", socioIn=" + socioIn + ", statusIn=" + statusIn + ", catIn=" + catIn + ", valorFim=" + valorFim + ", multaFim=" + multaFim + ", descontoFim=" + descontoFim + ", totalFim=" + totalFim + ", ass_MenFim=" + ass_MenFim + ", funFim=" + funFim + ", usuFim=" + usuFim + ", mesFim=" + mesFim + ", numSocioFim=" + numSocioFim + ", socioFim=" + socioFim + ", statusFim=" + statusFim + ", catFim=" + catFim + ", obs=" + obs + '}';
    }

    
    
}

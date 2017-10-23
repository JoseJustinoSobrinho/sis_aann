
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
public class Declaracoes implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int controle;
    private int ano;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataEntrada;
    private String obs;
    private String nomeMenor_Obito;
    @Temporal(TemporalType.DATE)
    private Calendar dataMenor;
    private String paiMenor;
    private String maeMenor;
    private String rgMenor;
    private String cpfMenor;
    @ManyToOne
    private Cidade naturalMenor;
    private int numSocio;
    @ManyToOne
    private TipoDeclaracao tipoDeclaracao;
    @ManyToOne
    private Socio socio;
    @ManyToOne
    private Usuarios usuario;
    
    public Declaracoes() {
    }

    public Declaracoes(int id, int controle, int ano, Calendar dataEntrada, String obs, String nomeMenor_Obito, Calendar dataMenor, String paiMenor, String maeMenor, String rgMenor, String cpfMenor, Cidade naturalMenor, int numSocio, TipoDeclaracao tipoDeclaracao, Socio socio, Usuarios usuario) {
        this.id = id;
        this.controle = controle;
        this.ano = ano;
        this.dataEntrada = dataEntrada;
        this.obs = obs;
        this.nomeMenor_Obito = nomeMenor_Obito;
        this.dataMenor = dataMenor;
        this.paiMenor = paiMenor;
        this.maeMenor = maeMenor;
        this.rgMenor = rgMenor;
        this.cpfMenor = cpfMenor;
        this.naturalMenor = naturalMenor;
        this.numSocio = numSocio;
        this.tipoDeclaracao = tipoDeclaracao;
        this.socio = socio;
        this.usuario = usuario;
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

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getNomeMenor_Obito() {
        return nomeMenor_Obito;
    }

    public void setNomeMenor_Obito(String nomeMenor_Obito) {
        this.nomeMenor_Obito = nomeMenor_Obito;
    }

    public Calendar getDataMenor() {
        return dataMenor;
    }

    public void setDataMenor(Calendar dataMenor) {
        this.dataMenor = dataMenor;
    }

    public String getPaiMenor() {
        return paiMenor;
    }

    public void setPaiMenor(String paiMenor) {
        this.paiMenor = paiMenor;
    }

    public String getMaeMenor() {
        return maeMenor;
    }

    public void setMaeMenor(String maeMenor) {
        this.maeMenor = maeMenor;
    }

    public String getRgMenor() {
        return rgMenor;
    }

    public void setRgMenor(String rgMenor) {
        this.rgMenor = rgMenor;
    }

    public String getCpfMenor() {
        return cpfMenor;
    }

    public void setCpfMenor(String cpfMenor) {
        this.cpfMenor = cpfMenor;
    }

    public Cidade getNaturalMenor() {
        return naturalMenor;
    }

    public void setNaturalMenor(Cidade naturalMenor) {
        this.naturalMenor = naturalMenor;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public TipoDeclaracao getTipoDeclaracao() {
        return tipoDeclaracao;
    }

    public void setTipoDeclaracao(TipoDeclaracao tipoDeclaracao) {
        this.tipoDeclaracao = tipoDeclaracao;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Declaracoes other = (Declaracoes) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Declaracoes{" + "id=" + id + ", controle=" + controle + ", ano=" + ano + ", dataEntrada=" + dataEntrada + ", obs=" + obs + ", nomeMenor_Obito=" + nomeMenor_Obito + ", dataMenor=" + dataMenor + ", paiMenor=" + paiMenor + ", maeMenor=" + maeMenor + ", rgMenor=" + rgMenor + ", cpfMenor=" + cpfMenor + ", naturalMenor=" + naturalMenor + ", numSocio=" + numSocio + ", tipoDeclaracao=" + tipoDeclaracao + ", socio=" + socio + ", usuario=" + usuario + '}';
    }

   
    
    
    
    
}

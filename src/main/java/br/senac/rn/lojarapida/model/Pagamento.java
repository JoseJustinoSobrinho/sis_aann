
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
public class Pagamento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int controle;
    private int ano;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataEntrada;
    private float valor;
    private float desconto;
    private float multa;
    private float total;
    private String forma;
    @ManyToOne
    private Usuarios cota;
    @ManyToOne
    private MesesAnos mesCod;
    private int numSocio;
    @ManyToOne
    private Socio socio;
    @ManyToOne
    private Status status;
    @ManyToOne
    private Categoria categoria;
    private String ass_men;
    @ManyToOne
    private Usuarios usuario;

    public Pagamento() {
    }

    public Pagamento(int id, int controle, int ano, Calendar dataEntrada, float valor, float desconto, float multa, float total, String forma, Usuarios cota, MesesAnos mesCod, int numSocio, Socio socio, Status status, Categoria categoria, String ass_men, Usuarios usuario) {
        this.id = id;
        this.controle = controle;
        this.ano = ano;
        this.dataEntrada = dataEntrada;
        this.valor = valor;
        this.desconto = desconto;
        this.multa = multa;
        this.total = total;
        this.forma = forma;
        this.cota = cota;
        this.mesCod = mesCod;
        this.numSocio = numSocio;
        this.socio = socio;
        this.status = status;
        this.categoria = categoria;
        this.ass_men = ass_men;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
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

    public Usuarios getCota() {
        return cota;
    }

    public void setCota(Usuarios cota) {
        this.cota = cota;
    }

    public MesesAnos getMesCod() {
        return mesCod;
    }

    public void setMesCod(MesesAnos mesCod) {
        this.mesCod = mesCod;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getAss_men() {
        return ass_men;
    }

    public void setAss_men(String ass_men) {
        this.ass_men = ass_men;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        final Pagamento other = (Pagamento) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "id=" + id + ", controle=" + controle + ", ano=" + ano + ", dataEntrada=" + dataEntrada + ", valor=" + valor + ", desconto=" + desconto + ", multa=" + multa + ", total=" + total + ", forma=" + forma + ", cota=" + cota + ", mesCod=" + mesCod + ", numSocio=" + numSocio + ", socio=" + socio + ", status=" + status + ", categoria=" + categoria + ", ass_men=" + ass_men + ", usuario=" + usuario + '}';
    }
    
    
    
}

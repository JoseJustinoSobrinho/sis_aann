
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
public class PreReserva implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar entrada;
    private int controle;
    private int ano;
    private int tipo;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar inEvento;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fimEvento;
    private float valor;
    private float desconto;
    private float total;
    private String forma;
    private int numsocio;
    @ManyToOne
    private Socio socio;
    @ManyToOne
    private Usuarios usuario;
    @ManyToOne
    private Espaco espaco;
    private String obs;
    
    public PreReserva() {
    }

    public PreReserva(int id, Calendar entrada, int controle, int ano, int tipo, Calendar inEvento, Calendar fimEvento, float valor, float desconto, float total, String forma, int numsocio, Socio socio, Usuarios usuario, Espaco espaco, String obs) {
        this.id = id;
        this.entrada = entrada;
        this.controle = controle;
        this.ano = ano;
        this.tipo = tipo;
        this.inEvento = inEvento;
        this.fimEvento = fimEvento;
        this.valor = valor;
        this.desconto = desconto;
        this.total = total;
        this.forma = forma;
        this.numsocio = numsocio;
        this.socio = socio;
        this.usuario = usuario;
        this.espaco = espaco;
        this.obs = obs;
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Calendar getInEvento() {
        return inEvento;
    }

    public void setInEvento(Calendar inEvento) {
        this.inEvento = inEvento;
    }

    public Calendar getFimEvento() {
        return fimEvento;
    }

    public void setFimEvento(Calendar fimEvento) {
        this.fimEvento = fimEvento;
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

    public int getNumsocio() {
        return numsocio;
    }

    public void setNumsocio(int numsocio) {
        this.numsocio = numsocio;
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

    public Espaco getEspaco() {
        return espaco;
    }

    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
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
        final PreReserva other = (PreReserva) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PreReserva{" + "id=" + id + ", entrada=" + entrada + ", controle=" + controle + ", ano=" + ano + ", tipo=" + tipo + ", inEvento=" + inEvento + ", fimEvento=" + fimEvento + ", valor=" + valor + ", desconto=" + desconto + ", total=" + total + ", forma=" + forma + ", numsocio=" + numsocio + ", socio=" + socio + ", usuario=" + usuario + ", espaco=" + espaco + ", obs=" + obs + '}';
    }

    
    
   
    
}

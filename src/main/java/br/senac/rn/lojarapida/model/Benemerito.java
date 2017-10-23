
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Benemerito implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;   
    private String fixo;
    private String oi;
    private String claro;
    private String tim;
    private String vivo;
    private String outroTele;
    private String watts;
    @Column(unique = true)
    private String email;
    private String mesPago;
    private String outroFim;
    @ManyToOne
    private DataMensageiro datMansageiro;
    @ManyToOne
    private DataMensageiro datTurno;
    private String pendencia;
    private String carteira;
    @ManyToOne
    private Status status;
    @ManyToOne
    private Categoria categoria;
    @ManyToOne
    private Mensageiro mensageiro;
    @ManyToMany
    private List<Grupo> grupo;
    private String lembrete;
    private String obs;    
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar cadastro;
    @ManyToOne
    private Usuarios usuario;

    public Benemerito() {
    }

    public Benemerito(int id, String nome, String fixo, String oi, String claro, String tim, String vivo, String outroTele, String watts, String email, String mesPago, String outroFim, DataMensageiro datMansageiro, DataMensageiro datTurno, String pendencia, String carteira, Status status, Categoria categoria, Mensageiro mensageiro, List<Grupo> grupo, String lembrete, String obs, Calendar cadastro, Usuarios usuario) {
        this.id = id;
        this.nome = nome;
        this.fixo = fixo;
        this.oi = oi;
        this.claro = claro;
        this.tim = tim;
        this.vivo = vivo;
        this.outroTele = outroTele;
        this.watts = watts;
        this.email = email;
        this.mesPago = mesPago;
        this.outroFim = outroFim;
        this.datMansageiro = datMansageiro;
        this.datTurno = datTurno;
        this.pendencia = pendencia;
        this.carteira = carteira;
        this.status = status;
        this.categoria = categoria;
        this.mensageiro = mensageiro;
        this.grupo = grupo;
        this.lembrete = lembrete;
        this.obs = obs;
        this.cadastro = cadastro;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFixo() {
        return fixo;
    }

    public void setFixo(String fixo) {
        this.fixo = fixo;
    }

    public String getOi() {
        return oi;
    }

    public void setOi(String oi) {
        this.oi = oi;
    }

    public String getClaro() {
        return claro;
    }

    public void setClaro(String claro) {
        this.claro = claro;
    }

    public String getTim() {
        return tim;
    }

    public void setTim(String tim) {
        this.tim = tim;
    }

    public String getVivo() {
        return vivo;
    }

    public void setVivo(String vivo) {
        this.vivo = vivo;
    }

    public String getOutroTele() {
        return outroTele;
    }

    public void setOutroTele(String outroTele) {
        this.outroTele = outroTele;
    }

    public String getWatts() {
        return watts;
    }

    public void setWatts(String watts) {
        this.watts = watts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMesPago() {
        return mesPago;
    }

    public void setMesPago(String mesPago) {
        this.mesPago = mesPago;
    }

    public String getOutroFim() {
        return outroFim;
    }

    public void setOutroFim(String outroFim) {
        this.outroFim = outroFim;
    }

    public DataMensageiro getDatMansageiro() {
        return datMansageiro;
    }

    public void setDatMansageiro(DataMensageiro datMansageiro) {
        this.datMansageiro = datMansageiro;
    }

    public DataMensageiro getDatTurno() {
        return datTurno;
    }

    public void setDatTurno(DataMensageiro datTurno) {
        this.datTurno = datTurno;
    }

    public String getPendencia() {
        return pendencia;
    }

    public void setPendencia(String pendencia) {
        this.pendencia = pendencia;
    }

    public String getCarteira() {
        return carteira;
    }

    public void setCarteira(String carteira) {
        this.carteira = carteira;
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

    public Mensageiro getMensageiro() {
        return mensageiro;
    }

    public void setMensageiro(Mensageiro mensageiro) {
        this.mensageiro = mensageiro;
    }

    public List<Grupo> getGrupo() {
        return grupo;
    }

    public void setGrupo(List<Grupo> grupo) {
        this.grupo = grupo;
    }

    public String getLembrete() {
        return lembrete;
    }

    public void setLembrete(String lembrete) {
        this.lembrete = lembrete;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Calendar getCadastro() {
        return cadastro;
    }

    public void setCadastro(Calendar cadastro) {
        this.cadastro = cadastro;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
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
        final Benemerito other = (Benemerito) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Benemerito{" + "id=" + id + ", nome=" + nome + ", fixo=" + fixo + ", oi=" + oi + ", claro=" + claro + ", tim=" + tim + ", vivo=" + vivo + ", outroTele=" + outroTele + ", watts=" + watts + ", email=" + email + ", mesPago=" + mesPago + ", outroFim=" + outroFim + ", datMansageiro=" + datMansageiro + ", datTurno=" + datTurno + ", pendencia=" + pendencia + ", carteira=" + carteira + ", status=" + status + ", categoria=" + categoria + ", mensageiro=" + mensageiro + ", grupo=" + grupo + ", lembrete=" + lembrete + ", obs=" + obs + ", cadastro=" + cadastro + ", usuario=" + usuario + '}';
    }


    
   
    
    
    
}

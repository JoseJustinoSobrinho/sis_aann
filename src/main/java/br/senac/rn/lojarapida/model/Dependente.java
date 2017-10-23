
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
public class Dependente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @ManyToOne
    private Sexo sexo;
    @Temporal(TemporalType.DATE)
    private Calendar datNasc;
    private int idade;
    @ManyToOne
    private Cidade natural;
    @Column(unique = true)
    private String cpf;
    @Column(unique = true)
    private String rg;
    @ManyToOne
    private Expedidor expedidor;
    private String pai;
    private String mae; 
    private String fixo;
    private String oi;
    private String claro;
    private String tim;
    private String vivo;
    private String outroTele;
    private String watts;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String cartaoSus;
    @ManyToMany
    private List<Profissao> profissao;
    private String titulo;
    private String zona;
    private String secao;    
    private String mesPago;
    private String outroFim;
    private String pendencia;
    private String carteira;
    private String prontuario;    
    @ManyToOne
    private Cep cep;
    @ManyToOne
    private Complemento complemento;
    private int casa;
    private String casaB;
    @ManyToOne
    private Status status;
    @ManyToOne
    private Categoria categoria;
    @ManyToOne
    private Escolaridade escolaridade;
    @ManyToMany
    private List<Grupo> grupo;
    @ManyToOne
    private LocVotacao locVotacao; 
    @ManyToOne
    private Socio socioContri_Beneme;
    @ManyToOne
    private Usuarios usuario;
    private String obs;    
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar cadastro;

    public Dependente() {
    }

    public Dependente(int id, String nome, Sexo sexo, Calendar datNasc, int idade, Cidade natural, String cpf, String rg, Expedidor expedidor, String pai, String mae, String fixo, String oi, String claro, String tim, String vivo, String outroTele, String watts, String email, String cartaoSus, List<Profissao> profissao, String titulo, String zona, String secao, String mesPago, String outroFim, String pendencia, String carteira, String prontuario, Cep cep, Complemento complemento, int casa, String casaB, Status status, Categoria categoria, Escolaridade escolaridade, List<Grupo> grupo, LocVotacao locVotacao, Socio socioContri_Beneme, Usuarios usuario, String obs, Calendar cadastro) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.datNasc = datNasc;
        this.idade = idade;
        this.natural = natural;
        this.cpf = cpf;
        this.rg = rg;
        this.expedidor = expedidor;
        this.pai = pai;
        this.mae = mae;
        this.fixo = fixo;
        this.oi = oi;
        this.claro = claro;
        this.tim = tim;
        this.vivo = vivo;
        this.outroTele = outroTele;
        this.watts = watts;
        this.email = email;
        this.cartaoSus = cartaoSus;
        this.profissao = profissao;
        this.titulo = titulo;
        this.zona = zona;
        this.secao = secao;
        this.mesPago = mesPago;
        this.outroFim = outroFim;
        this.pendencia = pendencia;
        this.carteira = carteira;
        this.prontuario = prontuario;
        this.cep = cep;
        this.complemento = complemento;
        this.casa = casa;
        this.casaB = casaB;
        this.status = status;
        this.categoria = categoria;
        this.escolaridade = escolaridade;
        this.grupo = grupo;
        this.locVotacao = locVotacao;
        this.socioContri_Beneme = socioContri_Beneme;
        this.usuario = usuario;
        this.obs = obs;
        this.cadastro = cadastro;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Calendar getDatNasc() {
        return datNasc;
    }

    public void setDatNasc(Calendar datNasc) {
        this.datNasc = datNasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cidade getNatural() {
        return natural;
    }

    public void setNatural(Cidade natural) {
        this.natural = natural;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Expedidor getExpedidor() {
        return expedidor;
    }

    public void setExpedidor(Expedidor expedidor) {
        this.expedidor = expedidor;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
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

    public String getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(String cartaoSus) {
        this.cartaoSus = cartaoSus;
    }

    public List<Profissao> getProfissao() {
        return profissao;
    }

    public void setProfissao(List<Profissao> profissao) {
        this.profissao = profissao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
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

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    public Complemento getComplemento() {
        return complemento;
    }

    public void setComplemento(Complemento complemento) {
        this.complemento = complemento;
    }

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }

    public String getCasaB() {
        return casaB;
    }

    public void setCasaB(String casaB) {
        this.casaB = casaB;
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

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public List<Grupo> getGrupo() {
        return grupo;
    }

    public void setGrupo(List<Grupo> grupo) {
        this.grupo = grupo;
    }

    public LocVotacao getLocVotacao() {
        return locVotacao;
    }

    public void setLocVotacao(LocVotacao locVotacao) {
        this.locVotacao = locVotacao;
    }

    public Socio getSocioContri_Beneme() {
        return socioContri_Beneme;
    }

    public void setSocioContri_Beneme(Socio socioContri_Beneme) {
        this.socioContri_Beneme = socioContri_Beneme;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
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

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Dependente other = (Dependente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dependente{" + "id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", datNasc=" + datNasc + ", idade=" + idade + ", natural=" + natural + ", cpf=" + cpf + ", rg=" + rg + ", expedidor=" + expedidor + ", pai=" + pai + ", mae=" + mae + ", fixo=" + fixo + ", oi=" + oi + ", claro=" + claro + ", tim=" + tim + ", vivo=" + vivo + ", outroTele=" + outroTele + ", watts=" + watts + ", email=" + email + ", cartaoSus=" + cartaoSus + ", profissao=" + profissao + ", titulo=" + titulo + ", zona=" + zona + ", secao=" + secao + ", mesPago=" + mesPago + ", outroFim=" + outroFim + ", pendencia=" + pendencia + ", carteira=" + carteira + ", prontuario=" + prontuario + ", cep=" + cep + ", complemento=" + complemento + ", casa=" + casa + ", casaB=" + casaB + ", status=" + status + ", categoria=" + categoria + ", escolaridade=" + escolaridade + ", grupo=" + grupo + ", locVotacao=" + locVotacao + ", socioContri_Beneme=" + socioContri_Beneme + ", usuario=" + usuario + ", obs=" + obs + ", cadastro=" + cadastro + '}';
    }
    
    
    
}

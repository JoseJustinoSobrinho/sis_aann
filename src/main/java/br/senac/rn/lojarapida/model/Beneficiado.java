
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
public class Beneficiado implements Serializable{
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
    private Cidade codNatural;
    @Column(unique = true)
    private String cpf;
    @Column(unique = true)
    private String rg;
    @ManyToOne
    private Expedidor codExp;
    private String pai;
    private String mae; 
    @ManyToOne
    private EstadoCivil CodEstCivil;
    private String conjuge;
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
    @ManyToOne
    private Profissao codProfPrincipal;
    @ManyToMany
    private List<Profissao> profissao;
    private String titulo;
    private String zona;
    private String secao;    
    private String outroFim;; 
    private String pendencia;
    private String carteira;
    private String prontuario;    
    @ManyToOne
    private Cep CodCep;
    @ManyToOne
    private Complemento CodComplemento;
    private int casa;
    private String casaB;
    @ManyToOne
    private Status CodStatus;
    @ManyToOne
    private Categoria CodCategoria;
    @ManyToOne
    private Escolaridade CodEscolaridade;
    @ManyToMany
    private List<Grupo> grupo;
    @ManyToOne
    private LocVotacao CodLocVotacao;              
    private String obs;    
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar cadastro;
    @ManyToOne
    private Usuarios CodUsuario;

    public Beneficiado() {
    }

    public Beneficiado(int id, String nome, Sexo sexo, Calendar datNasc, int idade, Cidade codNatural, String cpf, String rg, Expedidor codExp, String pai, String mae, EstadoCivil CodEstCivil, String conjuge, String fixo, String oi, String claro, String tim, String vivo, String outroTele, String watts, String email, String cartaoSus, Profissao codProfPrincipal, List<Profissao> profissao, String titulo, String zona, String secao, String outroFim, String pendencia, String carteira, String prontuario, Cep CodCep, Complemento CodComplemento, int casa, String casaB, Status CodStatus, Categoria CodCategoria, Escolaridade CodEscolaridade, List<Grupo> grupo, LocVotacao CodLocVotacao, String obs, Calendar cadastro, Usuarios CodUsuario) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.datNasc = datNasc;
        this.idade = idade;
        this.codNatural = codNatural;
        this.cpf = cpf;
        this.rg = rg;
        this.codExp = codExp;
        this.pai = pai;
        this.mae = mae;
        this.CodEstCivil = CodEstCivil;
        this.conjuge = conjuge;
        this.fixo = fixo;
        this.oi = oi;
        this.claro = claro;
        this.tim = tim;
        this.vivo = vivo;
        this.outroTele = outroTele;
        this.watts = watts;
        this.email = email;
        this.cartaoSus = cartaoSus;
        this.codProfPrincipal = codProfPrincipal;
        this.profissao = profissao;
        this.titulo = titulo;
        this.zona = zona;
        this.secao = secao;
        this.outroFim = outroFim;
        this.pendencia = pendencia;
        this.carteira = carteira;
        this.prontuario = prontuario;
        this.CodCep = CodCep;
        this.CodComplemento = CodComplemento;
        this.casa = casa;
        this.casaB = casaB;
        this.CodStatus = CodStatus;
        this.CodCategoria = CodCategoria;
        this.CodEscolaridade = CodEscolaridade;
        this.grupo = grupo;
        this.CodLocVotacao = CodLocVotacao;
        this.obs = obs;
        this.cadastro = cadastro;
        this.CodUsuario = CodUsuario;
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

    public Cidade getCodNatural() {
        return codNatural;
    }

    public void setCodNatural(Cidade codNatural) {
        this.codNatural = codNatural;
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

    public Expedidor getCodExp() {
        return codExp;
    }

    public void setCodExp(Expedidor codExp) {
        this.codExp = codExp;
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

    public EstadoCivil getCodEstCivil() {
        return CodEstCivil;
    }

    public void setCodEstCivil(EstadoCivil CodEstCivil) {
        this.CodEstCivil = CodEstCivil;
    }

    public String getConjuge() {
        return conjuge;
    }

    public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
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

    public Profissao getCodProfPrincipal() {
        return codProfPrincipal;
    }

    public void setCodProfPrincipal(Profissao codProfPrincipal) {
        this.codProfPrincipal = codProfPrincipal;
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

    public Cep getCodCep() {
        return CodCep;
    }

    public void setCodCep(Cep CodCep) {
        this.CodCep = CodCep;
    }

    public Complemento getCodComplemento() {
        return CodComplemento;
    }

    public void setCodComplemento(Complemento CodComplemento) {
        this.CodComplemento = CodComplemento;
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

    public Status getCodStatus() {
        return CodStatus;
    }

    public void setCodStatus(Status CodStatus) {
        this.CodStatus = CodStatus;
    }

    public Categoria getCodCategoria() {
        return CodCategoria;
    }

    public void setCodCategoria(Categoria CodCategoria) {
        this.CodCategoria = CodCategoria;
    }

    public Escolaridade getCodEscolaridade() {
        return CodEscolaridade;
    }

    public void setCodEscolaridade(Escolaridade CodEscolaridade) {
        this.CodEscolaridade = CodEscolaridade;
    }

    public List<Grupo> getGrupo() {
        return grupo;
    }

    public void setGrupo(List<Grupo> grupo) {
        this.grupo = grupo;
    }

    public LocVotacao getCodLocVotacao() {
        return CodLocVotacao;
    }

    public void setCodLocVotacao(LocVotacao CodLocVotacao) {
        this.CodLocVotacao = CodLocVotacao;
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

    public Usuarios getCodUsuario() {
        return CodUsuario;
    }

    public void setCodUsuario(Usuarios CodUsuario) {
        this.CodUsuario = CodUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.id;
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
        final Beneficiado other = (Beneficiado) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beneficiado{" + "id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", datNasc=" + datNasc + ", idade=" + idade + ", codNatural=" + codNatural + ", cpf=" + cpf + ", rg=" + rg + ", codExp=" + codExp + ", pai=" + pai + ", mae=" + mae + ", CodEstCivil=" + CodEstCivil + ", conjuge=" + conjuge + ", fixo=" + fixo + ", oi=" + oi + ", claro=" + claro + ", tim=" + tim + ", vivo=" + vivo + ", outroTele=" + outroTele + ", watts=" + watts + ", email=" + email + ", cartaoSus=" + cartaoSus + ", codProfPrincipal=" + codProfPrincipal + ", profissao=" + profissao + ", titulo=" + titulo + ", zona=" + zona + ", secao=" + secao + ", outroFim=" + outroFim + ", pendencia=" + pendencia + ", carteira=" + carteira + ", prontuario=" + prontuario + ", CodCep=" + CodCep + ", CodComplemento=" + CodComplemento + ", casa=" + casa + ", casaB=" + casaB + ", CodStatus=" + CodStatus + ", CodCategoria=" + CodCategoria + ", CodEscolaridade=" + CodEscolaridade + ", grupo=" + grupo + ", CodLocVotacao=" + CodLocVotacao + ", obs=" + obs + ", cadastro=" + cadastro + ", CodUsuario=" + CodUsuario + '}';
    }
 
}

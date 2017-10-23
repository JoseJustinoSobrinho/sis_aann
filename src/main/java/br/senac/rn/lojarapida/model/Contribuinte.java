
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
public class Contribuinte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome; 
    @ManyToOne
    private Sexo sexo;
    @Temporal(TemporalType.DATE)
    private Calendar datNasc = Calendar.getInstance();
    private int idade;
    @ManyToOne
    private Cidade codNatural;
    //@Column(unique = true)
    private String cpf;
    //@Column(unique = true)
    private String rg;
    @ManyToOne
    private Expedidor codExpedidor;
    private String pai;
    private String mae; 
    @ManyToOne
    private EstadoCivil codEstadoCivil;
    private String conjuge;
    private String fixo;
    private String oi;
    private String claro;
    private String tim;
    private String vivo;
    private String outroTele;
    private String watts;
    //@Column(unique = true)  // como colocar campo único zero ou null
    private String email;
    //@Column(unique = true) // como colocar campo único zero ou null
    private String cartaoSus;
    @ManyToOne
    private Profissao codProfissaoPrinc;
    @ManyToMany
    private List<Profissao> codProfissao;  /// este tem de ja inserir quando fizer o cadastro
    private String titulo;
    private String zona;
    private String secao;    
    private String mesPago;
    private String outroFim;  /// melhor criar outro campo FK
    @ManyToOne
    private DataMensageiro dataMensageiro;  // corrigir data mensageiro
    @ManyToOne
    private Turno turno;
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
    @ManyToOne
    private Mensageiro mensageiro;
    @ManyToMany
    private List<Grupo> grupo;  //  
    @ManyToOne
    private LocVotacao locVotacao;    
    private String lembrete;
    private String obs;    
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar cadastro;

    public Contribuinte() {
    }

    public Contribuinte(int id, String nome, Sexo sexo, Calendar datNasc, int idade, Cidade codNatural, String cpf, String rg, Expedidor codExpedidor, String pai, String mae, EstadoCivil codEstadoCivil, String conjuge, String fixo, String oi, String claro, String tim, String vivo, String outroTele, String watts, String email, String cartaoSus, Profissao codProfissaoPrinc, List<Profissao> codProfissao, String titulo, String zona, String secao, String mesPago, String outroFim, DataMensageiro dataMensageiro, Turno turno, String pendencia, String carteira, String prontuario, Cep cep, Complemento complemento, int casa, String casaB, Status status, Categoria categoria, Escolaridade escolaridade, Mensageiro mensageiro, List<Grupo> grupo, LocVotacao locVotacao, String lembrete, String obs, Calendar cadastro) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.datNasc = datNasc;
        this.idade = idade;
        this.codNatural = codNatural;
        this.cpf = cpf;
        this.rg = rg;
        this.codExpedidor = codExpedidor;
        this.pai = pai;
        this.mae = mae;
        this.codEstadoCivil = codEstadoCivil;
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
        this.codProfissaoPrinc = codProfissaoPrinc;
        this.codProfissao = codProfissao;
        this.titulo = titulo;
        this.zona = zona;
        this.secao = secao;
        this.mesPago = mesPago;
        this.outroFim = outroFim;
        this.dataMensageiro = dataMensageiro;
        this.turno = turno;
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
        this.mensageiro = mensageiro;
        this.grupo = grupo;
        this.locVotacao = locVotacao;
        this.lembrete = lembrete;
        this.obs = obs;
        this.cadastro = cadastro;
    }

    public Contribuinte(String nome, Sexo sexo, Calendar datNasc, int idade, Cidade codNatural, String cpf, String rg, Expedidor codExpedidor, String pai, String mae, EstadoCivil codEstadoCivil, String conjuge, String fixo, String oi, String claro, String tim, String vivo, String outroTele, String watts, String email, String cartaoSus, Profissao codProfissaoPrinc, List<Profissao> codProfissao, String titulo, String zona, String secao, String mesPago, String outroFim, DataMensageiro dataMensageiro, Turno turno, String pendencia, String carteira, String prontuario, Cep cep, Complemento complemento, int casa, String casaB, Status status, Categoria categoria, Escolaridade escolaridade, Mensageiro mensageiro, List<Grupo> grupo, LocVotacao locVotacao, String lembrete, String obs, Calendar cadastro) {
        this.nome = nome;
        this.sexo = sexo;
        this.datNasc = datNasc;
        this.idade = idade;
        this.codNatural = codNatural;
        this.cpf = cpf;
        this.rg = rg;
        this.codExpedidor = codExpedidor;
        this.pai = pai;
        this.mae = mae;
        this.codEstadoCivil = codEstadoCivil;
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
        this.codProfissaoPrinc = codProfissaoPrinc;
        this.codProfissao = codProfissao;////
        this.titulo = titulo;
        this.zona = zona;
        this.secao = secao;
        this.mesPago = mesPago;
        this.outroFim = outroFim;
        this.dataMensageiro = dataMensageiro;
        this.turno = turno;
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
        this.mensageiro = mensageiro;
        this.grupo = grupo;
        this.locVotacao = locVotacao;
        this.lembrete = lembrete;
        this.obs = obs;
        this.cadastro = cadastro;
    }
// esta abaixo
    public Contribuinte(String nome, Sexo sexo, int idade, Cidade codNatural, String cpf, String rg, Expedidor codExpedidor, String pai, String mae, EstadoCivil codEstadoCivil, String conjuge, String fixo, String oi, String claro, String tim, String vivo, String outroTele, String watts, String email, String cartaoSus, Profissao codProfissaoPrinc, String titulo, String zona, String secao, String mesPago, String outroFim, DataMensageiro dataMensageiro, Turno turno, String pendencia, String carteira, String prontuario, Cep cep, Complemento complemento, int casa, String casaB, Status status, Categoria categoria, Escolaridade escolaridade, Mensageiro mensageiro, LocVotacao locVotacao, String lembrete, String obs) {
        this.nome = nome;
        this.sexo = sexo;
//        this.datNasc = datNasc;
        this.idade = idade;
        this.codNatural = codNatural;
        this.cpf = cpf;
        this.rg = rg;
        this.codExpedidor = codExpedidor;
        this.pai = pai;
        this.mae = mae;
        this.codEstadoCivil = codEstadoCivil;
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
        
        this.titulo = titulo;
        this.zona = zona;
        this.secao = secao;
        this.mesPago = mesPago;
        this.outroFim = outroFim;
        this.dataMensageiro = dataMensageiro;
        this.turno = turno;
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
        this.mensageiro = mensageiro;
        this.locVotacao = locVotacao;
        this.lembrete = lembrete;
        this.obs = obs;
        this.codProfissaoPrinc = codProfissaoPrinc;
        //profisso
//        this.cadastro = cadastro;
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
        final Contribuinte other = (Contribuinte) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contribuinte{" + "id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", datNasc=" + datNasc + ", idade=" + idade + ", codNatural=" + codNatural + ", cpf=" + cpf + ", rg=" + rg + ", codExpedidor=" + codExpedidor + ", pai=" + pai + ", mae=" + mae + ", codEstadoCivil=" + codEstadoCivil + ", conjuge=" + conjuge + ", fixo=" + fixo + ", oi=" + oi + ", claro=" + claro + ", tim=" + tim + ", vivo=" + vivo + ", outroTele=" + outroTele + ", watts=" + watts + ", email=" + email + ", cartaoSus=" + cartaoSus + ", codProfissaoPrinc=" + codProfissaoPrinc + ", codProfissao=" + codProfissao + ", titulo=" + titulo + ", zona=" + zona + ", secao=" + secao + ", mesPago=" + mesPago + ", outroFim=" + outroFim + ", dataMensageiro=" + dataMensageiro + ", turno=" + turno + ", pendencia=" + pendencia + ", carteira=" + carteira + ", prontuario=" + prontuario + ", cep=" + cep + ", complemento=" + complemento + ", casa=" + casa + ", casaB=" + casaB + ", status=" + status + ", categoria=" + categoria + ", escolaridade=" + escolaridade + ", mensageiro=" + mensageiro + ", grupo=" + grupo + ", locVotacao=" + locVotacao + ", lembrete=" + lembrete + ", obs=" + obs + ", cadastro=" + cadastro + '}';
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

    public Expedidor getCodExpedidor() {
        return codExpedidor;
    }

    public void setCodExpedidor(Expedidor codExpedidor) {
        this.codExpedidor = codExpedidor;
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

    public EstadoCivil getCodEstadoCivil() {
        return codEstadoCivil;
    }

    public void setCodEstadoCivil(EstadoCivil codEstadoCivil) {
        this.codEstadoCivil = codEstadoCivil;
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

    public Profissao getCodProfissaoPrinc() {
        return codProfissaoPrinc;
    }

    public void setCodProfissaoPrinc(Profissao codProfissaoPrinc) {
        this.codProfissaoPrinc = codProfissaoPrinc;
    }

    public List<Profissao> getCodProfissao() {
        return codProfissao;
    }

    public void setCodProfissao(List<Profissao> codProfissao) {
        this.codProfissao = codProfissao;
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

    public DataMensageiro getDataMensageiro() {
        return dataMensageiro;
    }

    public void setDataMensageiro(DataMensageiro dataMensageiro) {
        this.dataMensageiro = dataMensageiro;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
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

    public LocVotacao getLocVotacao() {
        return locVotacao;
    }

    public void setLocVotacao(LocVotacao locVotacao) {
        this.locVotacao = locVotacao;
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

    
    

    
    
}

package br.senac.rn.lojarapida.controller;

import br.senac.rn.lojarapida.dao.CategoriaDAO;
import br.senac.rn.lojarapida.dao.CepDAO;
import br.senac.rn.lojarapida.dao.CidadeDAO;
import br.senac.rn.lojarapida.dao.ContribuinteDAO;
import br.senac.rn.lojarapida.dao.DataMensageiroDAO;
import br.senac.rn.lojarapida.dao.EscolaridadeDAO;
import br.senac.rn.lojarapida.dao.EstadoCivilDAO;
import br.senac.rn.lojarapida.dao.ExpedidorDAO;
import br.senac.rn.lojarapida.dao.GrupoDAO;
import br.senac.rn.lojarapida.dao.LocVotacaoDAO;
import br.senac.rn.lojarapida.dao.LogradouroDAO;
import br.senac.rn.lojarapida.dao.MensageiroDAO;
import br.senac.rn.lojarapida.dao.ProfissaoDAO;
import br.senac.rn.lojarapida.dao.SexoDAO;
import br.senac.rn.lojarapida.dao.TurnoDAO;
import br.senac.rn.lojarapida.model.Categoria;
import br.senac.rn.lojarapida.model.Cep;
import br.senac.rn.lojarapida.model.Cidade;
import br.senac.rn.lojarapida.model.Contribuinte;
import br.senac.rn.lojarapida.model.DataMensageiro;
import br.senac.rn.lojarapida.model.Escolaridade;
import br.senac.rn.lojarapida.model.EstadoCivil;
import br.senac.rn.lojarapida.model.Expedidor;
import br.senac.rn.lojarapida.model.Grupo;
import br.senac.rn.lojarapida.model.LocVotacao;
import br.senac.rn.lojarapida.model.Logradouro;
import br.senac.rn.lojarapida.model.Mensageiro;
import br.senac.rn.lojarapida.model.Profissao;
import br.senac.rn.lojarapida.model.Sexo;
import br.senac.rn.lojarapida.model.Turno;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "contribuinteBean")
public class ContribuinteBean {
    
    private Contribuinte contribuinte = new Contribuinte();
    private Sexo sexo = new Sexo();
    private Grupo grupo = new Grupo();
    private Cidade cidade = new Cidade();
    private Expedidor codExped = new Expedidor();
    private Profissao profissao = new Profissao();
    private Escolaridade escolaridade = new Escolaridade();
    private EstadoCivil codEstadoCivil = new EstadoCivil(); 
    private LocVotacao locVotacao = new LocVotacao();
    private Categoria categoria = new Categoria();
    private Mensageiro mensageiro = new Mensageiro();
    private DataMensageiro datas = new DataMensageiro();
    private Turno turno = new Turno();
    private Cep cep = new Cep();
    
//    public void cadastrarTudo() {
//        ContribuinteDAO dao = new ContribuinteDAO();     
//            dao.insert(this.contribuinte);       
//        this.contribuinte = new Contribuinte();
//    }
//     public void inser() {
//        ContribuinteDAO dao = new ContribuinteDAO();
//        contribuinte.setSexo(sexo);
////        contribuinte.setGrupo(List<Grupo> grupo); 
//        contribuinte.setCodNatural(cidade); 
//        contribuinte.setCodExpedidor(codExped);
//        contribuinte.setCodProfissaoPrinc(profissao);
//        contribuinte.setEscolaridade(escolaridade);
//        contribuinte.setCodEstadoCivil(estadoCivil);
//        contribuinte.setLocVotacao(locVotacao);
//        contribuinte.setCategoria(categoria);
//        contribuinte.setMensageiro(mensageiro);
//        contribuinte.setDataMansageiro(datas);
//        contribuinte.setTurno(turno);
//        
//        System.out.println(contribuinte);
//        dao.insert(contribuinte);
//        limparForm();
//    }
//    
//    private void limparForm() {
//        contribuinte = new Contribuinte();
//        grupo = new Grupo();
//        cidade = new Cidade();
//        codExped = new Expedidor();
//        profissao = new Profissao();
//   
//    }
    
    
//     public void cadastrar() {
//        ContribuinteDAO dao = new ContribuinteDAO();
//        contribuinte.setContribuinte(contribuinte);
//        System.out.println(contribuinte);
//        dao.insert(contribuinte);
//        limparForm();
//    }
//      
//    private void limparForm() {
//        contribuinte = new Contribuinte();
//        contribuinte = new Contribuinte();
//        contribuinte = new Contribuinte();
//    }
//    
     public void salvar() {
        ContribuinteDAO dao = new ContribuinteDAO();
           dao.insert(this.contribuinte);       
           this.contribuinte = new Contribuinte();
    }
     
   
       
    public void editar(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }
    
    public void excluir(Contribuinte contribuinte) {
        ContribuinteDAO dao = new ContribuinteDAO();
        dao.delete(contribuinte);
    }

    public List<Categoria> getCategorias() {   // ver se dar pra ajeitar
        CategoriaDAO dao = new CategoriaDAO();
        return dao.selectAll();
    }
    
    public List<Sexo> getSexos() {   //
        SexoDAO dao = new SexoDAO();
        return dao.selectAll();
    }    
     
    public List<Grupo> getGrupos() {   //
        GrupoDAO dao = new GrupoDAO();
        return dao.selectAll();
    }
    
    public List<Cidade> getCidades() {   //
        CidadeDAO dao = new CidadeDAO();
        return dao.selectAll();
    }
    
    public List<Profissao> getProfissoes() {   //
        ProfissaoDAO dao = new ProfissaoDAO();
        return dao.selectAll();
    }
    
    public List<Expedidor> getExpedidores() {   //
        ExpedidorDAO dao = new ExpedidorDAO();
        return dao.selectAll();
    }
    
     public List<EstadoCivil> getEstadoCivis() {   //
        EstadoCivilDAO dao = new EstadoCivilDAO();
        return dao.selectAll();
    }
     
      public List<LocVotacao> getLocVotacoes() {   //
        LocVotacaoDAO dao = new LocVotacaoDAO();
        return dao.selectAll();
    }
     
      public List<Escolaridade> getEscolaridades() {   //
        EscolaridadeDAO dao = new EscolaridadeDAO();
        return dao.selectAll();
    }
            
     public List<Mensageiro> getMensageiros() {   //
        MensageiroDAO dao = new MensageiroDAO();
        return dao.selectAll();
    }
     
     public List<DataMensageiro> getDataMensageiros() {   //
        DataMensageiroDAO dao = new DataMensageiroDAO();
        return dao.selectAll();
    }
     
     public List<Turno> getTurnos() {   //
        TurnoDAO dao = new TurnoDAO();
        return dao.selectAll();
    }
      
    public List<Contribuinte> getContribuintes() {
        ContribuinteDAO dao = new ContribuinteDAO();
        return dao.selectAll();
    }
    
    public List<Logradouro> getLogradouros() {
        LogradouroDAO dao = new LogradouroDAO();
        return dao.selectAll();
    }
   
     public List<Cep> getCeps() {
        CepDAO dao = new CepDAO();
        return dao.selectAll();
    }

    public Contribuinte getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Expedidor getCodExped() {
        return codExped;
    }

    public void setCodExped(Expedidor codExped) {
        this.codExped = codExped;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public EstadoCivil getCodEstadoCivil() {
        return codEstadoCivil;
    }

    public void setCodEstadoCivil(EstadoCivil codEstadoCivil) {
        this.codEstadoCivil = codEstadoCivil;
    }

    public LocVotacao getLocVotacao() {
        return locVotacao;
    }

    public void setLocVotacao(LocVotacao locVotacao) {
        this.locVotacao = locVotacao;
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

    public DataMensageiro getDatas() {
        return datas;
    }

    public void setDatas(DataMensageiro datas) {
        this.datas = datas;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }
     
    
  
    
    
}
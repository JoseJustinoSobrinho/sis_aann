package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.LocVotacaoDAO;
import br.senac.rn.lojarapida.model.LocVotacao;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "locVotacaoConverter", forClass = LocVotacao.class)
public class LocVotacaoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringLocVotacao) {
        if (stringLocVotacao != null) {
            int id = Integer.parseInt(stringLocVotacao);
            LocVotacaoDAO dao = new LocVotacaoDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectLocVotacao) {
        if (objectLocVotacao != null) {
            LocVotacao locVotacao = (LocVotacao) objectLocVotacao;
            return String.valueOf(locVotacao.getId());
        }
        return null;
    }
    
}
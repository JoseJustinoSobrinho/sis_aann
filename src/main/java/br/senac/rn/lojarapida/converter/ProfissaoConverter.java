package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.ProfissaoDAO;
import br.senac.rn.lojarapida.model.Profissao;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "profissaoConverter", forClass = Profissao.class)
public class ProfissaoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringProfissao) {
        if (stringProfissao != null) {
            int id = Integer.parseInt(stringProfissao);
            ProfissaoDAO dao = new ProfissaoDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectProfissao) {
        if (objectProfissao != null) {
            Profissao profissao = (Profissao) objectProfissao;
            return String.valueOf(profissao.getId());
        }
        return null;
    }
    
}
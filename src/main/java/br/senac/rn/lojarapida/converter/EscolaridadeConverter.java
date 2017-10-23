package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.EscolaridadeDAO;
import br.senac.rn.lojarapida.model.Escolaridade;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "escolaridadeConverter", forClass = Escolaridade.class)
public class EscolaridadeConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringEscolaridade) {
        if (stringEscolaridade != null) {
            int id = Integer.parseInt(stringEscolaridade);
            EscolaridadeDAO dao = new EscolaridadeDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectEscolaridade) {
        if (objectEscolaridade != null) {
            Escolaridade escolaridade = (Escolaridade) objectEscolaridade;
            return String.valueOf(escolaridade.getId());
        }
        return null;
    }
    
}
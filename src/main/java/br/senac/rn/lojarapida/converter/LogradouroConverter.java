package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.LogradouroDAO;
import br.senac.rn.lojarapida.model.Logradouro;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "logradouroConverter", forClass = Logradouro.class)
public class LogradouroConverter implements Converter {
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringLogradouro) {
        if (stringLogradouro != null) {
            int id = Integer.parseInt(stringLogradouro);
            LogradouroDAO dao = new LogradouroDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectLogradouro) {
        if (objectLogradouro != null) {
            Logradouro logradouro = (Logradouro) objectLogradouro;
            return String.valueOf(logradouro.getId());
        }
        return null;
    }
    
}
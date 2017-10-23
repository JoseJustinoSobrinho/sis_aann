package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.EstadoCivilDAO;
import br.senac.rn.lojarapida.model.EstadoCivil;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "estadoCivilConverter", forClass = EstadoCivil.class)
public class EstadoCivilConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringEstadoCivil) {
        if (stringEstadoCivil != null) {
            int id = Integer.parseInt(stringEstadoCivil);
            EstadoCivilDAO dao = new EstadoCivilDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectEstadoCivil) {
        if (objectEstadoCivil != null) {
            EstadoCivil estadoCivil = (EstadoCivil) objectEstadoCivil;
            return String.valueOf(estadoCivil.getId());
        }
        return null;
    }
    
}
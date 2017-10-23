package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.ContribuinteDAO;
import br.senac.rn.lojarapida.model.Contribuinte;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "contribuinteConverter", forClass = Contribuinte.class)
public class ContribuinteConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringContribuinte) {
        if (stringContribuinte != null) {
            int id = Integer.parseInt(stringContribuinte);
            ContribuinteDAO dao = new ContribuinteDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectContribuinte) {
        if (objectContribuinte != null) {
            Contribuinte contribuinte = (Contribuinte) objectContribuinte;
            return String.valueOf(contribuinte.getId());
        }
        return null;
    }
    
}
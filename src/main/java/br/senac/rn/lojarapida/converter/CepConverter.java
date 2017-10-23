package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.CepDAO;
import br.senac.rn.lojarapida.model.Cep;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "cepConverter", forClass = Cep.class)
public class CepConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringCep) {
        if (stringCep != null) {
            int id = Integer.parseInt(stringCep);
            CepDAO dao = new CepDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectCep) {
        if (objectCep != null) {
            Cep cep = (Cep) objectCep;
            return String.valueOf(cep.getId());
        }
        return null;
    }
    
}
package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.ComplementoDAO;
import br.senac.rn.lojarapida.model.Complemento;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "complementoConverter", forClass = Complemento.class)
public class ComplementoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringComplemento) {
        if (stringComplemento != null) {
            int id = Integer.parseInt(stringComplemento);
            ComplementoDAO dao = new ComplementoDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectComplemento) {
        if (objectComplemento != null) {
            Complemento complemento = (Complemento) objectComplemento;
            return String.valueOf(complemento.getId());
        }
        return null;
    }
    
}
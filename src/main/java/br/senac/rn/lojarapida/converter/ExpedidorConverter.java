package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.ExpedidorDAO;
import br.senac.rn.lojarapida.model.Expedidor;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "expedidorConverter", forClass = Expedidor.class)
public class ExpedidorConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringExpedidor) {
        if (stringExpedidor != null) {
            int id = Integer.parseInt(stringExpedidor);
            ExpedidorDAO dao = new ExpedidorDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectExpedidor) {
        if (objectExpedidor != null) {
            Expedidor expedidor = (Expedidor) objectExpedidor;
            return String.valueOf(expedidor.getId());
        }
        return null;
    }
    
}
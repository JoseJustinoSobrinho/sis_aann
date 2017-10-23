package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.StatusDAO;
import br.senac.rn.lojarapida.model.Status;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "statusConverter", forClass = Status.class)
public class StatusConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringStatus) {
        if (stringStatus != null) {
            int id = Integer.parseInt(stringStatus);
            StatusDAO dao = new StatusDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectStatus) {
        if (objectStatus != null) {
            Status status = (Status) objectStatus;
            return String.valueOf(status.getId());
        }
        return null;
    }
    
}
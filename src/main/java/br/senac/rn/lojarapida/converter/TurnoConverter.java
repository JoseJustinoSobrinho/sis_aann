package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.TurnoDAO;
import br.senac.rn.lojarapida.model.Turno;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "turnoConverter", forClass = Turno.class)
public class TurnoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringTurno) {
        if (stringTurno != null) {
            int id = Integer.parseInt(stringTurno);
            TurnoDAO dao = new TurnoDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectTurno) {
        if (objectTurno != null) {
            Turno turno = (Turno) objectTurno;
            return String.valueOf(turno.getId());
        }
        return null;
    }
    
}
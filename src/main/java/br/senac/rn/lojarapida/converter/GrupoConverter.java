package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.GrupoDAO;
import br.senac.rn.lojarapida.model.Grupo;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "grupoConverter", forClass = Grupo.class)
public class GrupoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringGrupo) {
        if (stringGrupo != null) {
            int id = Integer.parseInt(stringGrupo);
            GrupoDAO dao = new GrupoDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectGrupo) {
        if (objectGrupo != null) {
            Grupo grupo = (Grupo) objectGrupo;
            return String.valueOf(grupo.getId());
        }
        return null;
    }
    
}
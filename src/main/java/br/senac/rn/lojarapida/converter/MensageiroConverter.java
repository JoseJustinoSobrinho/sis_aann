package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.MensageiroDAO;
import br.senac.rn.lojarapida.model.Mensageiro;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "mensageiroConverter", forClass = Mensageiro.class)
public class MensageiroConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringMensageiro) {
        if (stringMensageiro != null) {
            int id = Integer.parseInt(stringMensageiro);
            MensageiroDAO dao = new MensageiroDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectMensageiro) {
        if (objectMensageiro != null) {
            Mensageiro mensageiro = (Mensageiro) objectMensageiro;
            return String.valueOf(mensageiro.getId());
        }
        return null;
    }
    
}
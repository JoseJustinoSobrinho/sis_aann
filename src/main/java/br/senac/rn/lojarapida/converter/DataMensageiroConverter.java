package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.DataMensageiroDAO;
import br.senac.rn.lojarapida.model.DataMensageiro;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "dataMensageiroConverter", forClass = DataMensageiro.class)
public class DataMensageiroConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringDataMensageiro) {
        if (stringDataMensageiro != null) {
            int id = Integer.parseInt(stringDataMensageiro);
            DataMensageiroDAO dao = new DataMensageiroDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectDataMensageiro) {
        if (objectDataMensageiro != null) {
            DataMensageiro dataMensageiro = (DataMensageiro) objectDataMensageiro;
            return String.valueOf(dataMensageiro.getId());
        }
        return null;
    }
    
}
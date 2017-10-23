
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TipoLogradouro implements Serializable{    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String TipoLog; 
    @ManyToOne
    private Usuarios usuario;

    public TipoLogradouro() {
    }

    public TipoLogradouro(int id, String TipoLog, Usuarios usuario) {
        this.id = id;
        this.TipoLog = TipoLog;
        this.usuario = usuario;
    }

    
    public TipoLogradouro(String TipoLog, Usuarios usuario) {
        this.TipoLog = TipoLog;
        this.usuario = usuario;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoLog() {
        return TipoLog;
    }

    public void setTipoLog(String TipoLog) {
        this.TipoLog = TipoLog;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoLogradouro other = (TipoLogradouro) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TipoLogradouro{" + "id=" + id + ", TipoLog=" + TipoLog + ", usuario=" + usuario + '}';
    }

    
    
}

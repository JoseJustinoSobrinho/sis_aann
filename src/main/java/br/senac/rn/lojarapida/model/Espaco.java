
package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Espaco implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String espaco;
    private float valor;
    private float valorPre;

    public Espaco() {
    }

    public Espaco(int id, String espaco, float valor, float valorPre) {
        this.id = id;
        this.espaco = espaco;
        this.valor = valor;
        this.valorPre = valorPre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspaco() {
        return espaco;
    }

    public void setEspaco(String espaco) {
        this.espaco = espaco;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValorPre() {
        return valorPre;
    }

    public void setValorPre(float valorPre) {
        this.valorPre = valorPre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.id;
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
        final Espaco other = (Espaco) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Espaco{" + "id=" + id + ", espaco=" + espaco + ", valor=" + valor + ", valorPre=" + valorPre + '}';
    }

   
    
}

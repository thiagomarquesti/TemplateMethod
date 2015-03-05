package br.com.atual.exemplo1;

import br.com.atual.classesbase.IBean;
import br.com.atual.classesbase.Entidade;

/**
 * Created by Ton on 04/03/2015.
 */
public class Cliente extends Entidade implements IBean {

    private Integer numeroCliente;

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
}

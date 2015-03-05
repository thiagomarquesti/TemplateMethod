package br.com.atual.aluno;

import br.com.atual.classesbase.Entidade;
import br.com.atual.classesbase.IBean;

/**
 *
 * @author Thiago Marques
 */
public class Aluno extends Entidade implements IBean{
    
    private Integer ra;

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }
    
}

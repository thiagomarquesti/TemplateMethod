package br.com.atual.exemplo1;

import br.com.atual.classesbase.Dao;
import br.com.atual.classesbase.IBean;

/**
 * Created by Ton on 04/03/2015.
 */
public class DaoPessoaFisica extends Dao {

    @Override
    protected Boolean valida(IBean entidade) {

        System.out.println(" executou em pessoa fisica");

        PessoaFisica pf = (PessoaFisica) entidade;

        if (pf.getId() != null && pf.getCpf() != null) {
            return true;
        }

        return false;
    }
}

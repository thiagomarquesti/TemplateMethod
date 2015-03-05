/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atual.aluno;

import br.com.atual.classesbase.Dao;
import br.com.atual.classesbase.IBean;

/**
 *
 * @author Thiago Marques
 */
public class DaoAluno extends Dao {

    @Override
    protected Boolean valida(IBean entidade) {
        Aluno aluno = (Aluno)entidade;
        return aluno.getRa() != null;
    }
    
}

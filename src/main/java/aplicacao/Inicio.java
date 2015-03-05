package aplicacao;

import br.com.atual.aluno.Aluno;
import br.com.atual.aluno.DaoAluno;
import br.com.atual.exemplo1.Cliente;
import br.com.atual.exemplo1.DaoCliente;
import br.com.atual.exemplo1.DaoPessoaFisica;
import br.com.atual.exemplo1.PessoaFisica;

/**
 * Created by Ton on 04/03/2015.
 */
public class Inicio {


    public static void main(String[] args) {
        System.out.println("Teste salvando");

        DaoPessoaFisica dao = new DaoPessoaFisica();
        PessoaFisica pf = new PessoaFisica();
        pf.setId(0);
        pf.setNome("Ana");
        pf.setCpf("04251217985");
        dao.salvar(pf);


        DaoCliente daoCliente = new DaoCliente();
        Cliente cliente = new Cliente();
        cliente.setId(0);
        cliente.setNome("Cliente legal");
        cliente.setNumeroCliente(123);

        daoCliente.salvar(cliente);
        
        DaoAluno daoAluno = new DaoAluno();
        Aluno aluno = new Aluno();
        aluno.setId(1);
        aluno.setNome("Aluno novo");
        //aluno.setRa(13070025);        
        daoAluno.salvar(aluno);
    }

}

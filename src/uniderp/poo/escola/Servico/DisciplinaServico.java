package uniderp.poo.escola.Servico;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.Disciplina;
import uniderp.poo.escola.Repositorio.DisciplinaRepositorio;


public class DisciplinaServico extends BaseGenericaServico<DisciplinaRepositorio, Disciplina>{

        public DisciplinaServico(){
        this.repo = new DisciplinaRepositorio();
    }
    @Override
    public Disciplina Inserir(Disciplina tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public Disciplina Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Disciplina> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Disciplina Atualizar(Disciplina tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Disciplina Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }    
}

package uniderp.poo.escola.FakeDB;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.Aluno;
import uniderp.poo.escola.Dominio.NotaTrabalho;
import uniderp.poo.escola.Dominio.RendimentoEscolar;
import uniderp.poo.escola.Dominio.Turma;

public class RendimentoEscolarFakeDB extends BaseGenericaFakeDB<RendimentoEscolar>{

    private AlunoFakeDB alunoDB;
    private NotaTrabalhoFakeDB trabsDB;
    private TurmaFakeDB turmaDB;

    public RendimentoEscolarFakeDB(AlunoFakeDB alunoDB) {
        this.alunoDB = alunoDB;
    }

    public RendimentoEscolarFakeDB(TurmaFakeDB turmaDB) {
        this.turmaDB = turmaDB;
    }
    
        public RendimentoEscolarFakeDB(NotaTrabalhoFakeDB trabsDB) {
        this.trabsDB = trabsDB;
    }

    @Override
    protected void CarregarDados() {

        ArrayList<Aluno> alunos = alunoDB.getTabela();

        ArrayList<Turma> turmas = turmaDB.getTabela();

        ArrayList<NotaTrabalho> trabs = trabsDB.getTabela();
           
        this.tabela = new ArrayList<RendimentoEscolar>();

        this.tabela.add(new RendimentoEscolar(alunos.get(0), turmas.get(0), 6.0, 6.0, trabs.get(0), 6.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(0), turmas.get(0), 7.0, 6.0, trabs.get(1), 7.0, 6.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(0), turmas.get(0), 8.0, 6.0, trabs.get(2), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(0), turmas.get(0), 9.0, 6.0, trabs.get(3), 9.0, 8.0));


        this.tabela.add(new RendimentoEscolar(alunos.get(1), turmas.get(1), 6.0, 7.0, trabs.get(4), 5.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(1), turmas.get(1), 7.0, 6.0, trabs.get(5), 8.0, 7.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(1), turmas.get(1), 8.0, 6.0, trabs.get(6), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(1), turmas.get(1), 9.0, 6.0, trabs.get(7), 10.0, 8.5));


        this.tabela.add(new RendimentoEscolar(alunos.get(2), turmas.get(2), 6.0, 8.0, trabs.get(8), 4.0, 5.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(2), turmas.get(2), 7.0, 6.0, trabs.get(9), 2.0, 5.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(2), turmas.get(2), 8.0, 6.0, trabs.get(10), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(2), turmas.get(2), 9.0, 6.0, trabs.get(11), 7.0, 7.5));

        
        this.tabela.add(new RendimentoEscolar(alunos.get(3), turmas.get(3), 6.0, 9.0, trabs.get(12), 10.0, 8.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(3), turmas.get(3), 7.0, 6.0, trabs.get(13), 6.0, 6.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(3), turmas.get(3), 8.0, 6.0, trabs.get(14), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(3), turmas.get(3), 9.0, 6.0, trabs.get(15), 10.0, 8.5));
        

    }

    
    public RendimentoEscolarFakeDB(){

        super();
    }
}
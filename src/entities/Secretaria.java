package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Secretaria {
    List<Aluno> alunos = new ArrayList<>();

    public boolean checarMatricula(Integer matricula) {
        Aluno aluno = alunos.stream().filter
                (x -> Objects.equals(x.getMatricula(), matricula))
                .findFirst().orElse(null);
        return aluno != null;
    }

    public void matricular(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno matriculado!");
    }

    public void remover(Integer matricula, Aluno aluno) {
        if(checarMatricula(matricula)) {
            alunos.remove(aluno);
            System.out.println("Aluno removido!");
        }
        else
            System.out.println("Não existe aluno com essa matricula.");
    }

    public void listarAlunos() {
        for(Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void ativarMatricula(Integer matricula, Aluno aluno) {
        if(checarMatricula(matricula)) {
            aluno.setMatriculaPaga(true);
            System.out.println("Matricula ativada!");
        }
    }
}

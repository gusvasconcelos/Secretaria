package entities;

public class Aluno {
    private Integer matricula;
    private String nome;;
    private String curso;
    private boolean matriculaPaga = false;

    public Aluno() {}

    public Aluno(Integer matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isMatriculaPaga() {
        return matriculaPaga;
    }

    public void setMatriculaPaga(boolean matriculaPaga) {
        this.matriculaPaga = matriculaPaga;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                nome +
                ", Matricula: " +
                matricula +
                ", Curso: " +
                curso +
                ", Matricula paga: " +
                matriculaPaga;
    }
}

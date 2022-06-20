package application;

import entities.Aluno;
import entities.Secretaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Secretaria secretaria = new Secretaria();
        Aluno aluno = new Aluno();

        int operacao;
        do {
            menu();
            operacao = sc.nextInt();
            sc.nextLine();

            switch (operacao) {
                case 1 -> {
                    System.out.print("Matricula: ");
                    int matricula = sc.nextInt();
                    sc.nextLine();
                    while(secretaria.checarMatricula(matricula)) {
                        System.out.println("Matricula já registrada.");
                        System.out.print("Matricula: ");
                        matricula = sc.nextInt();
                        sc.nextLine();
                    }
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Curso: ");
                    String curso = sc.nextLine();

                    aluno = new Aluno(matricula, nome, curso);
                    secretaria.matricular(aluno);
                    }
                case 2 -> {
                    System.out.print("Matricula: ");
                    int matricula = sc.nextInt();
                    secretaria.remover(matricula, aluno);
                }
                case 3 -> secretaria.listarAlunos();
                case 4 -> {
                    System.out.print("Matricula: ");
                    int matricula = sc.nextInt();
                    secretaria.ativarMatricula(matricula, aluno);
                }
                default -> System.out.println("Operação inválida!");
            }

        } while(operacao != 0);

        sc.close();
    }
    public static void menu() {
        System.out.println();
        System.out.println("Faculdade Gus Vasconcelos");
        System.out.println();
        System.out.println("Digite:");
        System.out.println("1- Para matricular aluno.");
        System.out.println("2- Para remover aluno.");
        System.out.println("3- Para listar alunos.");
        System.out.println("4- Para ativar matricula.");
        System.out.println("0- Para sair.");
        System.out.print("> ");
    }
}

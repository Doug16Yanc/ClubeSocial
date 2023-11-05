package applications;

import domain.Candidato;

import java.util.Scanner;
import java.util.ArrayList;

public class Program {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Candidato> candidatos;
    public static void main(String[] args) {

        candidatos = new ArrayList<>();

        menu();

    }
    private static void menu()
    {
        System.out.println("Bem-vindo ao nosso sistema de clube social:\n");
        System.out.println("Lembre-se, a primeira regra do clube social é - Não fale sobre o clube social.\n");
        System.out.println("Selecione sua opção:\n");
        System.out.println("| 1 - Fazer lista de candidatos:\n ");
    }
}
package view;

import controller.SubStringController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SubStringController sc = new SubStringController();

        System.out.println("Informe uma string: ");
        String input = in.next();

        int fim = input.length();
        int inicio = fim - 1;

        String resInvertida = sc.FuncSubString(input, inicio, fim);
        System.out.println(resInvertida);
    }
}

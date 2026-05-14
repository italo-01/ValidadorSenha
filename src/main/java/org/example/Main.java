package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Senha senha = new Senha();

        System.out.println("-".repeat(30));
        System.out.println("Cadastro de senha");
        System.out.println("-".repeat(30));

        String resultado = "";
        while (!resultado.equals("Senha cadastrada com sucesso!")) {
            System.out.println("Cadastre uma senha \nUtilize letra maiuscula\nUtilize " +
                    "caractere especial (@, #, $, %, &, *)");
            String res = user.nextLine();

            resultado = senha.validarSenha(res);
            System.out.println(resultado);
        }
    }
}

package org.example;

public class Senha {
    public String validarSenha(String mensagem) {
        boolean maiuscula = false;
        // boolean especial = false;
        for (char c : mensagem.toCharArray()) {
            if (Character.isUpperCase(c)) {
                maiuscula = true;
                break;
            }
        }
        if (maiuscula) {
            String especiais = "!@#$%&";
            for (char c : mensagem.toCharArray()) {
                if (especiais.contains(String.valueOf(c))) {
                    return "Senha cadastrada com sucesso!!";

                }
            }
        }
        return "\nA senha esta fraca!! cadastre novamente";
    }
}
package com.github.vtrvieira.helpdesk.models;

import java.util.Scanner;

public class Usuario implements Comportamento {
    private String user;
    private String senha;

    public Usuario(String user, String senha) {
        this.user = user;
        this.senha = senha;
    }

    public String getUser() {
        return user;
    }

    @Override
    public boolean autenticar() { // Alterando para boolean
        for (int i = 2; i >= 0; i--) {
            var sc = new Scanner(System.in);
            System.out.println("==================");
            System.out.println("Faça login: ");
            System.out.print("USER: ");
            var userAuth = sc.nextLine();
            System.out.print("SENHA: ");
            var passAuth = sc.nextLine();
            System.out.println("==================");

            if (userAuth.equals(user) && passAuth.equals(senha)) {
                System.out.println("Bem-vind@, " + user + "!");
                return true; // Retornando true caso o login for autenticado
            } else {
                System.out.println("Acesso negado. Restam " + i + " tentativas.");
            }
        }
        return false; // Retornando falso caso não haja autenticação no login
    }
}

package com.github.vtrvieira.helpdesk.main;

import com.github.vtrvieira.helpdesk.models.ChamadoHardware;
import com.github.vtrvieira.helpdesk.models.ChamadoSoftware;
import com.github.vtrvieira.helpdesk.models.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Sistema de cadastramento de usuário:");
        System.out.println("====================================");
        System.out.print("Usuário: ");
        var usuario = sc.nextLine();
        System.out.print("Senha: ");
        var senha = sc.nextLine();
        var user = new Usuario(usuario, senha);
        System.out.println("Cadastro realizado!");
        if (!user.autenticar()){ // Adicionando uma condicional para caso não haja autenticação, o sistema encerrar
            System.out.println("Você excedeu o limite de tentativas.");
            return;
        }

        System.out.print("Diga o tipo do seu chamado (Hardware / Software): ");
        var tipoChamado = sc.nextLine();

        if (tipoChamado.equals("Hardware")) {
            var solicitante = user.getUser();
            System.out.println("Solicitante: " + solicitante);
            System.out.print("Título do chamado: ");
            var tituloChamado = sc.nextLine();
            System.out.print("Qual a mensagem de erro? ");
            var mensagemErro = sc.nextLine();
            System.out.print("Descreva seu problema: ");
            var descricao = sc.nextLine();

            var chamadoHardware = new ChamadoHardware(solicitante, tituloChamado, descricao, mensagemErro);
            chamadoHardware.ficha();

        } else if (tipoChamado.equals("Software")) {
            var solicitante = user.getUser();
            System.out.println("Solicitante: " + solicitante);
            System.out.print("Título do chamado: ");
            var tituloChamado = sc.nextLine();
            System.out.print("Qual o programa que está com problemas? ");
            var softwareErro = sc.nextLine();
            System.out.print("Descreva seu problema: ");
            var descricao = sc.nextLine();

            var chamadoSoftware = new ChamadoSoftware(solicitante, tituloChamado, descricao, softwareErro);
            chamadoSoftware.ficha();
        }

    }
}

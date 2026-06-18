package com.github.vtrvieira.helpdesk.models;

public abstract class Chamado {
    private String solicitante;
    private String titulo;
    private String descricao;
    private String tipoChamado;

    public Chamado(String solicitante, String titulo, String descricao) {
        this.solicitante = solicitante;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public void ficha() {
        System.out.println("\nFICHA TÉCNICA: ");
        System.out.println("\nSolicitante: " + solicitante);
        System.out.println("Título do chamado > " + titulo);
        System.out.println("Descrição do problema: " + descricao);
    }
}

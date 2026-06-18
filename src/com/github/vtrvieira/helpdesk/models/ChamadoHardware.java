package com.github.vtrvieira.helpdesk.models;

public class ChamadoHardware extends Chamado{
    private String mensagemErro;

    public ChamadoHardware(String solicitante, String titulo, String descricao, String mensagemErro) {
        super(solicitante, titulo, descricao);
        this.mensagemErro = mensagemErro;
    }

    @Override
    public void ficha() {
        super.ficha();
        System.out.println("Mensagem de erro: " + mensagemErro);
    }
}

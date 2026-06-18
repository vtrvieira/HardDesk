package com.github.vtrvieira.helpdesk.models;

public class ChamadoSoftware extends Chamado{
    private String software;

    public ChamadoSoftware(String solicitante, String titulo, String descricao, String software) {
        super(solicitante, titulo, descricao);
        this.software = software;
    }

    @Override
    public void ficha() {
        super.ficha();
        System.out.println("Software problemático: " + software);
    }
}

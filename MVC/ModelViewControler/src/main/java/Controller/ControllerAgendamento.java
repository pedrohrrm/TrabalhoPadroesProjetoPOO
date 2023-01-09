/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.ViewAgendamento;

/**
 *
 * @author pedro
 */
public class ControllerAgendamento {
    private final ViewAgendamento view;
    public ControllerAgendamento(ViewAgendamento view){
        this.view = view;
    }
 public void agendamentoFeito(){
    this.view.mensagem("Agendamento concluído");
 }
}

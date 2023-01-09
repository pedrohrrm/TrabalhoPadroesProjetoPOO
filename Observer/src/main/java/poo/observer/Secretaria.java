/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.observer;

/**
 *
 * @author pedro
 */
public class Secretaria implements PacienteNaRecepcaoObservador {

    @Override
    public void aguardando(ChegadaDoPaciente evento) {
        System.out.println("A secretária faz:");
        System.out.println("Receber pagamento da consulta");
        System.out.println("Avisar Médico");
    }

}

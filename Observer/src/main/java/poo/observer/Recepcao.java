package poo.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author pedro
 */
public class Recepcao {

    private List<PacienteNaRecepcaoObservador> observadores = new ArrayList<>();

    public void incluirObservadores(PacienteNaRecepcaoObservador observer) {
        observadores.add(observer);
    }

    public void monitorar() {
        Scanner dadoEntrada = new Scanner(System.in);

        String dado = "";

        while (!"encerrar".equalsIgnoreCase(dado)) {
            System.out.print("Há alguém aguardando a consulta?");
            dado = dadoEntrada.nextLine();

            if ("sim".equalsIgnoreCase(dado)) {
                ChegadaDoPaciente evento = new ChegadaDoPaciente(new Date());

                observadores.stream().forEach(p -> p.aguardando(evento));
                
            } else {
                System.out.println("Consulta com outro médico!");
            }
        }

        dadoEntrada.close();
    }
}

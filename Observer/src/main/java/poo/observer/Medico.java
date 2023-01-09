package poo.observer;

/**
 *
 * @author pedro
 */
public class Medico implements PacienteNaRecepcaoObservador {

    @Override
    public void aguardando(ChegadaDoPaciente evento) {
        System.out.println("O médico faz:");
        System.out.println("Agradece a secretária");
        System.out.println("Pede para o paciente entrar");
    }
   
    
}

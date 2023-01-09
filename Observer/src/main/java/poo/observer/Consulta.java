package poo.observer;

/**
 *
 * @author pedro
 */
public class Consulta {

    public static void main(String[] args) {
        Secretaria secretaria = new Secretaria();
        Medico medico = new Medico();
        Recepcao recepcao = new Recepcao();

        recepcao.incluirObservadores(secretaria);
        recepcao.incluirObservadores(medico);
        recepcao.monitorar();

    }

}

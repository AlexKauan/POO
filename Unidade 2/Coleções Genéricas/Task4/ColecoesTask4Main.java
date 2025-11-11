import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class ColecoesTask4Main {
    public static void main(String[] args) {
        final int totalAtendimentos = 20;
        Queue<PacienteAtendimento> filaPrioritaria = new ArrayDeque<>();
        Queue<PacienteAtendimento> filaComum = new ArrayDeque<>();
        Random random = new Random();

        int gerados = 0;
        int concluidos = 0;
        int minuto = 0;
        int minutosRestantesConsulta = 0;
        PacienteAtendimento emAtendimento = null;

        while (concluidos < totalAtendimentos) {
            if (gerados < totalAtendimentos && minuto % 4 == 0) {
                PacienteAtendimento paciente = PacienteAtendimento.gerar(random);
                if (paciente.ehPrioritario()) {
                    filaPrioritaria.add(paciente);
                } else {
                    filaComum.add(paciente);
                }
                gerados++;
                System.out.println("Minuto " + minuto + ": chegada " + paciente);
            }

            if (emAtendimento != null && minutosRestantesConsulta == 0) {
                System.out.println("Minuto " + minuto + ": alta " + emAtendimento);
                emAtendimento = null;
                concluidos++;
            }

            if (emAtendimento == null) {
                PacienteAtendimento proximo = !filaPrioritaria.isEmpty()
                        ? filaPrioritaria.poll()
                        : filaComum.poll();
                if (proximo != null) {
                    emAtendimento = proximo;
                    minutosRestantesConsulta = 5;
                    System.out.println("Minuto " + minuto + ": iniciou atendimento " + proximo);
                }
            }

            if (emAtendimento != null) {
                minutosRestantesConsulta--;
            }

            minuto++;
        }

        System.out.println("Dia encerrado em " + minuto + " minutos.");
    }
}


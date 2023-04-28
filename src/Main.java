import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Evento> listaEventos = new ArrayList<>();

        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("Data de Nascimento (formato: AAAA-MM-DD): ");
            LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());

            System.out.print("Data de Agendamento (formato: AAAA-MM-DD): ");
            LocalDate dataAgendamento = LocalDate.parse(scanner.nextLine());

            System.out.print("Período (M - Manhã / T - Tarde / N - Noite): ");
            String periodoStr = scanner.nextLine().toUpperCase();
            periodo periodo = periodo.valueOf(periodoStr);

            Evento evento = new Evento(nome, cpf, telefone, dataNascimento, dataAgendamento, periodo);

            listaEventos.add(evento);

            System.out.print("Deseja adicionar outro evento? (S/N) ");
            String resposta = scanner.nextLine().toUpperCase();
            if (resposta.equals("N")) {
                break;
            }
        }

        for (Evento evento : listaEventos) {
            System.out.println(evento.getNome() + " - " + evento.getCpf() + " - " + evento.getTelefone() + " - " + evento.getDataNascimento() + " - " + evento.getDataAgendamento() + " - " + evento.getPeriodo());
        }
    }
}

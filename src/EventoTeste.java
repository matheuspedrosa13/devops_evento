import java.time.LocalDate;

public class EventoTeste {
    public static void main(String[] args) {
        Evento evento = new Evento("João Silva", "12345678901", "(11) 1234-5678", LocalDate.of(1990, 1, 1), LocalDate.of(2023, 5, 1), Periodo.NOITE);

        System.out.println(evento);
    }

}

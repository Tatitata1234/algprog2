package test;

import contatos.Agenda;
import contatos.Contato;
import contatos.TipoContato;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AgendaTest {
    @Test
    public void deveAdicionarOContatoNaAgenda() {
        // Arrange
        Contato c1 = new Contato("Ana Beatriz", "51981272833", "anabeatriz@gmail.com", TipoContato.PESSOAL);
        Contato c2 = new Contato("Beatriz", "51987654321", "beatriz.profissional@gmail.com", TipoContato.PROFISSIONAL);
        Agenda agenda = new Agenda();
        int valorEsperado = 2;

        // Act
        assertTrue(agenda.adicionarContato(c1));
        assertTrue(agenda.adicionarContato(c2));

        // Assert
        assertEquals(agenda.getNumeroElementos(), valorEsperado);

    }
}

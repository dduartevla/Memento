import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogoTest {

    Jogo jogo;
    @BeforeEach
    void setUp(){
        jogo = new Jogo();
    }

    @Test
    void deveIniciarJogoCorretamente(){
        EstadoJogo estadoInicial = new EstadoJogo("Área Incial", 100, 100, 1);
        jogo.iniciarJogo(estadoInicial);
        jogo.salvarJogo(estadoInicial);
        assertEquals("Localização: " + "Área Incial" + "\n" +
                        "Pontos de Vida: " + 100 + "\n" +
                        "Pontos de Mana: " + 100 + "\n" +
                        "Nível: " + 1
                ,jogo.carregarJogo(0).toString() );
    }

    @Test
    void deveRetornarErroNaInicializacao(){
        try{
            jogo.iniciarJogo(null);
            fail();

        } catch (IllegalArgumentException e){
            assertEquals("Estado inicial é nulo!", e.getMessage());
        }
    }

    @Test
    void deveSalvarJogoCorretamente(){
        EstadoJogo estadoInicial = new EstadoJogo("Área Incial", 100, 100, 1);
        jogo.iniciarJogo(estadoInicial);
        jogo.salvarJogo(new EstadoJogo("Floresta", 80, 75, 2));
        assertEquals("Localização: " + "Floresta" + "\n" +
                        "Pontos de Vida: " + 80 + "\n" +
                        "Pontos de Mana: " + 75 + "\n" +
                        "Nível: " + 2
                ,jogo.carregarJogo(1).toString() );
    }

    @Test
    void deveRetornarErroAoSalvarJogo(){
        try{
            EstadoJogo estadoInicial = new EstadoJogo("Área Incial", 100, 100, 1);
            jogo.iniciarJogo(estadoInicial);
            jogo.salvarJogo(null);
            fail();

        } catch (IllegalArgumentException e){
            assertEquals("Estado é nulo!", e.getMessage());
        }
    }

    @Test
    void deveRetornarErroAoCarregarJogo(){
        try{
            EstadoJogo estadoInicial = new EstadoJogo("Área Incial", 100, 100, 1);
            jogo.iniciarJogo(estadoInicial);
            jogo.carregarJogo(2);
            fail();

        } catch (IllegalArgumentException e){
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
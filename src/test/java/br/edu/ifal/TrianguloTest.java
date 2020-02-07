package br.edu.ifal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * TrianguloTest
 */
public class TrianguloTest {

    Triangulo T1;
    Triangulo T2;
    Triangulo T3;
    Triangulo T4;
    Triangulo T5;
    Triangulo T6;
    Triangulo T7;
    Triangulo T8;
    Triangulo T9;
    Triangulo T10;
    Triangulo T11;
    Triangulo T12;
    Triangulo T13;
    Triangulo T14;
    Triangulo T15;
    Triangulo T16;
    Triangulo T17;
    Triangulo T18;
    Triangulo T19;
    Triangulo T20;
    Triangulo T21;
    Triangulo T22;
    Triangulo T23;



    @Before
    public void inicializacao() {
        T1 = new Triangulo(0, 0, 0);
        T2 = new Triangulo(0, 6, 8);
        T3 = new Triangulo(6, 0, 8);
        T4 = new Triangulo(6, 8, 0);
        T5 = new Triangulo(0, 0, 4);
        T6 = new Triangulo(0, 4, 0);
        T7 = new Triangulo(4, 0, 0);
        T8 = new Triangulo(0, 5, 5);
        T9 = new Triangulo(5, 0, 5);
        T10 = new Triangulo(5, 5, 0);
        T11 = new Triangulo(10, 8, 2);
        T12 = new Triangulo(10, 8, 2);
        T13 = new Triangulo(8, 10, 2);
        T14 = new Triangulo(-1, -1, -1);
        T15 = new Triangulo(-1, 6, 1);
        T16 = new Triangulo(6, -1, 1);
        T17 = new Triangulo(6, 1, -1);
        T18 = new Triangulo(2, 2, 2);
        T19 = new Triangulo(6, 6, 1);
        T20 = new Triangulo(6, 4, 6);
        T21 = new Triangulo(2, 3, 3);
        T22 = new Triangulo(2, 4, 5);
        T23 = new Triangulo(4, 3 ,8);
    }

    @Test
    public void deveRetornarIlegalParaTodosOsLadosIguaisAZero() {
        String valorRetornado = T1.getTipo(T1);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoOLadoAForIgualAZero() {

        String valorRetornado = T2.getTipo(T2);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoOLadoBForIgualAZero() {
        String valorRetornado = T3.getTipo(T3);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoOLadoCForIgualAZero() {

        String valorRetornado = T4.getTipo(T4);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoLadoAJuntoComLadoBForemIguaisAZero() {

        String valorRetornado = T5.getTipo(T5);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoLadoAJuntoComLadoCForemIguaisAZero() {

        String valorRetornado = T6.getTipo(T6);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoLadoBJuntoComLadoCForemIguaisAZero() {

        String valorRetornado = T7.getTipo(T7);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoUmTrianguloIsoscelesTiverOLadoAIgualAZero() {

        String valorRetornado = T8.getTipo(T8);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoUmTrianguloIsoscelesTiverOLadoBIgualAZero() {

        String valorRetornado = T9.getTipo(T9);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoUmTrianguloIsoscelesTiverOLadoCIgualAZero() {

        String valorRetornado = T10.getTipo(T10);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoASubtracaoDoLadoAComOLadoCForIgualAoValorDoLadoB() {

        String valorRetornado = T11.getTipo(T11);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoASubtracaoDoLadoAComOLadoBForIgualAoValorDoLadoC() {

        String valorRetornado = T12.getTipo(T12);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoASubtracaoDoLadoBComOLadoCForIgualAoValorDoLadoA() {

        String valorRetornado = T13.getTipo(T13);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

 @Test
    public void deveRetornarIlegalQuandoTodosOsLadosForemIguaisNegativos() {

        String valorRetornado = T14.getTipo(T14);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoOLadoAForNegativo() {

        String valorRetornado = T15.getTipo(T15);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoOLadoBForNegativo() {

        String valorRetornado = T16.getTipo(T16);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoOLadoCForNegativo() {

        String valorRetornado = T17.getTipo(T17);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarEquilateroParaTodosOsLadosIguais() {

        String valorRetornado = T18.getTipo(T18);
        String valorEsperado = "Equilatero";
        assertEquals(valorEsperado, valorRetornado);

    }

    @Test
    public void deveRetornarIsoscelesQuandoOLadoAForIgualAoLadoB() {

        String valorRetornado = T19.getTipo(T19);
        String valorEsperado = "Isosceles";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIsoscelesQuandoOLadoAForIgualAoLadoC() {

        String valorRetornado = T20.getTipo(T20);
        String valorEsperado = "Isosceles";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIsoscelesQuandoOLadoBForIgualAoLadoC() {

        String valorRetornado = T21.getTipo(T21);
        String valorEsperado = "Isosceles";
        assertEquals(valorEsperado, valorRetornado);

    }

    @Test
    public void deveRetornarEscalenoParaTodosOsLadosDiferentes() {

        String valorRetornado = T22.getTipo(T22);
        String valorEsperado = "Escaleno";
        assertEquals(valorEsperado, valorRetornado);
    }
    @Test
    public void deveRetornarIlegalSempreQueUmLadoForMenorQueASubtracaoDosOutrosDois(){
        
        String validadeRetornada =  T23.getTipo(T23);
        String validadeEsperada = "Ilegal";
        assertEquals(validadeEsperada, validadeRetornada);
    }


}
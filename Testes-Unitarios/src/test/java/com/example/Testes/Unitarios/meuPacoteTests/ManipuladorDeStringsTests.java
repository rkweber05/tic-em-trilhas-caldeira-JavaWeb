package com.example.Testes.Unitarios.meuPacoteTests;

import com.example.Testes.Unitarios.meuPacote.ManipuladorDeStrings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManipuladorDeStringsTests {

    @Test
    void recortaTextoQuandoTamanhoForMenorQueZeroJogaExcecao(){
        // configuração
        ManipuladorDeStrings manipuladorDeStrings = new ManipuladorDeStrings();
        String texto = "A dona aranha subiu pela parede";
        int tamanho = -1;

        //execução
        Assertions.assertThrows(RuntimeException.class,() -> manipuladorDeStrings.recortaTexto(texto, tamanho));
    }

    @Test
    void recortaTextoRetornaProprioTextoQuandoTamanhoForMenorQueTamanhoDoTexto(){
        // configuração
        ManipuladorDeStrings manipuladorDeStrings = new ManipuladorDeStrings();
        String texto = "A dona aranha subiu pela parede";
        int tamanho = 60;

        // execução
        Assertions.assertEquals("A dona aranha subiu pela parede", manipuladorDeStrings.recortaTexto(texto, tamanho));
    }

    @Test
    void recortaTextoRetornaTextoRecortadoComReticenciasCasoTamanhoSejaValido(){
        // configuração
        ManipuladorDeStrings manipuladorDeStrings = new ManipuladorDeStrings();
        String texto = "A dona aranha subiu pela parede";
        int tamanho = 13;

        // execução
        Assertions.assertEquals("A dona aranha...", manipuladorDeStrings.recortaTexto(texto,tamanho));
    }
}

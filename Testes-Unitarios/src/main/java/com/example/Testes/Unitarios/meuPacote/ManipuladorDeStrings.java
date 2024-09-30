package com.example.Testes.Unitarios.meuPacote;

public class ManipuladorDeStrings {
    public String recortaTexto(String texto, int tamanho){
        if (tamanho < 0) throw new RuntimeException("O tamanho não pode ser menor que zero.");
        if (tamanho > texto.length()) return texto;

        String resultado = texto.substring(0, tamanho);
        resultado = resultado + "...";

        return resultado;
    }
}

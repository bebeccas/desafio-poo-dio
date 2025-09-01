package br.com.dio.desafio.dominio.util;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;

import java.util.Collection;
import java.util.stream.Collectors;

public class util {

    public static String formatarConteudos(Collection<Conteudo> conteudos) {
        return conteudos.stream()
                .map(c -> {
                    String base = "\n [ " + c.getTitulo() + "] \n Descrição: " + c.getDescricao();
                    if (c instanceof Curso) {
                        Curso curso = (Curso) c;
                        base += " - Carga horária: " + curso.getCargaHoraria() + "H";
                    }
                    return base;
                })
                .collect(Collectors.joining(" \n "));
    }
}
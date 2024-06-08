package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo implements Content{

    private LocalDate data;

    public Mentoria(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double getCargaHoraria() {
        return 0; // Mentorias don't have a workload in this example
    }
}

package br.com.triersistemas.patolino;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public abstract class Pessoa {
    private String nome;
    protected String documento;

    public Pessoa() {
        List<String> nomes = new ArrayList<String>();
        nomes.add("Alexson");
        nomes.add("Ana");
        nomes.add("Murilo");
        nomes.add("Matias");
        nomes.add("Vinicius");
        nomes.add("Vinicius");
        nomes.add("Guilherme");
        nomes.add("João Paulo");
        nomes.add("Julio");
        nomes.add("Gabriel");
        nomes.add("Edward");

        var rd = new SplittableRandom();
        this.nome = nomes.get(rd.nextInt(0, nomes.size()));
    }
    public String getNome() {
        return nome;
    }
    public abstract String getDocumento();
}


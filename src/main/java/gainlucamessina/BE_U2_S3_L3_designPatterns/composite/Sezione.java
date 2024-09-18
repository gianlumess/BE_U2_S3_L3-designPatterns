package gainlucamessina.BE_U2_S3_L3_designPatterns.composite;

import java.util.List;

public class Sezione implements ComponentLibro{
    private List<ComponentLibro> componenti; //uso questo attributo perché la sezione può contenere altre sezioni o pagine
    private String titoloSezione;

    public Sezione(List<ComponentLibro> componenti, String titoloSezione) {
        this.componenti = componenti;
        this.titoloSezione = titoloSezione;
    }

    @Override
    public int getNumeroPagine() {
        return this.componenti.stream().mapToInt(ComponentLibro::getNumeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println(this.titoloSezione);
        this.componenti.forEach(ComponentLibro::stampa);
    }
}

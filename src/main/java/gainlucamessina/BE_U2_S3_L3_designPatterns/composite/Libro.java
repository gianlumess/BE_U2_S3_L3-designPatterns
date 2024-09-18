package gainlucamessina.BE_U2_S3_L3_designPatterns.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class Libro implements ComponentLibro{
    private String titolo;
    private List<Sezione>capitoli;
    private List<String> autori;
    private double prezzo;



    @Override
    public int getNumeroPagine() {
        return this.capitoli.stream().mapToInt(Sezione::getNumeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println("TITOLO LIBRO: "+this.titolo);
        this.capitoli.forEach(Sezione::stampa);
    }
}

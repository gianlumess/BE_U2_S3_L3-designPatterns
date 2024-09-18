package gainlucamessina.BE_U2_S3_L3_designPatterns.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pagina implements ComponentLibro{
    private int numeroPagina;
    private String testo;



    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("NUMERO PAGINA: "+numeroPagina);
        System.out.println(this.testo);
    }
}

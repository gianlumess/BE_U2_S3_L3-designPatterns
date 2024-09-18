package gainlucamessina.BE_U2_S3_L3_designPatterns.composite;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Locale;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("************************** ESERCIZIO 2 (COMPOSITE) **************************");
        Faker faker=new Faker(Locale.ITALY);
        Pagina pagina1=new Pagina(1,faker.harryPotter().quote());
        Pagina pagina2=new Pagina(2,faker.harryPotter().quote());
        Pagina pagina3=new Pagina(3,faker.harryPotter().quote());
        Pagina pagina4=new Pagina(4,faker.harryPotter().quote());
        Pagina pagina5=new Pagina(5,faker.harryPotter().quote());
        Pagina pagina6=new Pagina(6,faker.harryPotter().quote());

        Sezione sottoCapitolo1= new Sezione(Arrays.asList(pagina1,pagina2),"sottocapitolo 1");
        Sezione sottoCapitolo2= new Sezione(Arrays.asList(pagina3,pagina4),"sottocapitolo 2");
        Sezione sottoCapitolo3= new Sezione(Arrays.asList(pagina5,pagina6),"sottocapitolo 3");

        Sezione capitolo1=new Sezione(Arrays.asList(sottoCapitolo1),"Capitolo 1");
        Sezione capitolo2=new Sezione(Arrays.asList(sottoCapitolo2,sottoCapitolo3),"Capitolo 2");

        Libro libro=new Libro(faker.harryPotter().book(), Arrays.asList(capitolo1,capitolo2),Arrays.asList("J.K. Rowling",faker.harryPotter().character()),16.00);
        libro.stampa();
        System.out.println("NUMERO TOTALE PAGINE :"+libro.getNumeroPagine());
        System.out.println("AUTORI: "+libro.getAutori());

    }
}

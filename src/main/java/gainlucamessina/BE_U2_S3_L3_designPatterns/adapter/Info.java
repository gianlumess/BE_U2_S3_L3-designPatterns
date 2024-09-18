package gainlucamessina.BE_U2_S3_L3_designPatterns.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Info {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;


}

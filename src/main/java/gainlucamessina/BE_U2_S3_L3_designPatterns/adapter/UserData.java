package gainlucamessina.BE_U2_S3_L3_designPatterns.adapter;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds){
        nomeCompleto=ds.getNomeCompleto();
        eta= ds.getEta();
    }
}

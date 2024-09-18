package gainlucamessina.BE_U2_S3_L3_designPatterns.adapter;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }


    @Override
    public String getNomeCompleto() {
        return info.getNome()+" "+info.getCognome();
    }

    @Override
    public int getEta() {
        return calcoloEta(info.getDataDiNascita());
    }

    private int calcoloEta(LocalDate dataDiNascita){
        return Period.between(dataDiNascita,LocalDate.now()).getYears();
    }
}

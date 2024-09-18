package gainlucamessina.BE_U2_S3_L3_designPatterns.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info info=new Info("Gianluca","Messina", LocalDate.of(2001,2,8));

        InfoAdapter adapter=new InfoAdapter(info);

        UserData userData=new UserData();
        userData.getData(adapter);

        System.out.println("OGGETTO INFO: "+ info);
        System.out.println("OGGETTO USERDATA: "+userData);
    }
}

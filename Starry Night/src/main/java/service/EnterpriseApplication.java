//--- Imports ---//
import org.springframework.boot.SpringApplicaiton;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

//--- Summary ---//
//This method runs our application.


//--- Application ---//
@SpringBootApplication
@EnablingCaching
public class EnterpriseApplication {
    public static void main(String[] args) {
        SpringApplication.run(EnterpriseApplication.class, args);
    }
}
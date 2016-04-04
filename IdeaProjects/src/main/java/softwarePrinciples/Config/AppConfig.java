package softwarePrinciples.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import softwarePrinciples.DIP.Employees;
import softwarePrinciples.OCP.serviceProvider;
import softwarePrinciples.OCP.serviceProviderImplem;
import softwarePrinciples.DIP.OffLoaders;
import softwarePrinciples.SRP.studentObeyImplem;
import softwarePrinciples.SRP.studentsObey;
import softwarePrinciples.SRP.violate.student;
import softwarePrinciples.SRP.violate.studentImplem;

@Configuration
public class AppConfig {
    @Bean(name="emp")
    public Employees work() {return new OffLoaders();}

    @Bean(name="ser")
    public serviceProvider buyAirtime(){return new serviceProviderImplem();}
    @Bean(name="ser")
    public serviceProvider buyData(){return new serviceProviderImplem();}

    @Bean(name="ser")
    public serviceProvider services(){return new serviceProviderImplem();}

    @Bean(name="obey")
    public studentsObey displayNameOfStudent(){return new studentObeyImplem();}

    @Bean(name="stud")
    public student displayStudentName(){return new studentImplem();}
    @Bean(name="stud")
    public student displayStudentUsername(){return new studentImplem();}

    }

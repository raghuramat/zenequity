import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.jdbi.DBIFactory;
import controllers.HelloWorldController;
import model.dl.MySqlDL;
import org.skife.jdbi.v2.DBI;

/**
 * Created by raghuramat on 02/01/17.
 */
public class MainService extends Service<MainConfiguration> {

    public static void main(String[] args) throws Exception {
        new MainService().run(args);
    }

    @Override
    public void initialize(Bootstrap<MainConfiguration> bootstrap) {

    }

    @Override
    public void run(MainConfiguration mainConfiguration, Environment environment) throws Exception
    {
        try
        {
            environment.addResource(new HelloWorldController());
        }
        catch(Exception exc)
        {
            throw exc;
        }


      final DBIFactory factory = new DBIFactory();
      final DBI jdbi = factory.build(environment, mainConfiguration.getDatabaseConfiguration(), "mysql");
       final MySqlDL dao = jdbi.onDemand(MySqlDL.class);

       //  environment.addResource(new IndoorMapping(dao));


    }
}

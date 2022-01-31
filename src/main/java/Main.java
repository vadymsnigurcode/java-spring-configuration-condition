import org.apache.catalina.LifecycleException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
//        TomcatLauncher tl = new TomcatLauncher();
//        tl.launch();

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(DefaultConfig.class);

        DataSource ds = ctx.getBean(DataSource.class);
        try (Connection connection = ds.getConnection()) {
            System.out.println("========= connection.isValid(5000) = " + connection.isValid(5000));

        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}

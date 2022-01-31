//package com.example.configurationsample;
//
//import org.apache.catalina.LifecycleException;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.sql.SQLException;
//
//
//
////@SpringBootApplication
//public class ConfigurationSampleApplication {
//
//    @Configuration
////    @Import(DefaultConfig.class)
//    public static class DefaultAppConfig {
////        @Bean
////        public TomcatLauncher tomcatLauncher() {
////            return new TomcatLauncher();
////        }
//
//    }
//
//    public static void main(String[] args) throws SQLException, LifecycleException {
////        TomcatLauncher tl = new TomcatLauncher();
////        tl.launch();
//
////        //SpringApplication.run(ConfigurationSampleApplication.class, args);
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DefaultAppConfig.class);
////        DataSource ds = ctx.getBean(DataSource.class);
////        try (Connection connection = ds.getConnection()) {
////            System.out.println("========= connection.isValid(5000) = " + connection.isValid(5000));
////
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
//    }
//
//}

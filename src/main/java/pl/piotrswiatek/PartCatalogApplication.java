package pl.piotrswiatek;

import org.hibernate.SessionFactory;
import org.hibernate.ejb.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PartCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartCatalogApplication.class, args);
	}
//	@Bean
//	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf){
//		return hemf.getSessionFactory();
//	}
}

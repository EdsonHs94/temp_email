package pe.edu.sistemas.microservices.accounts;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;


/**
 * Clase que hace un llamado a la DATA de Scritps
 * 
 * */
@Configuration
@ComponentScan
@EntityScan("pe.edu.sistemas.microservices.accounts")
@EnableJpaRepositories("pe.edu.sistemas.microservices.accounts")
@PropertySource("classpath:db-config.properties")
public class AccountsConfiguration {

	protected Logger logger;

	
	public AccountsConfiguration() {
		logger = Logger.getLogger(getClass().getName());
	}

	/**
	 * Con este metodo se comunica, con la Base de Datos, defino los atributos
	 * los cuales voy a trabajar
	 * */
	@Bean
	public DriverManagerDataSource dataSource() {
		logger.info("dataSource() invoked");


		DriverManagerDataSource dataSource = new DriverManagerDataSource();		
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/pasarelabd1");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        
		logger.info("dataSource = " + dataSource);
		
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		List<Map<String, Object>> accounts = jdbcTemplate.queryForList("SELECT code FROM USUARIO");
		logger.info("System has " + accounts.size() + " accounts");

		
		return dataSource;
	}
}

package pe.unjfsc.daw.examen.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestConnection {

	private static final Logger MOLOG = LoggerFactory.getLogger(TestConnection.class);

	private static ApplicationContext moContext;

	private static String[] configDatabase = {

			"classpath:/batch/config/job01-database.xml"

	};

	public static void main(String[] args) {
		MOLOG.info("[DAW]=====[ Start TestConnection ]=====");

		moContext = new ClassPathXmlApplicationContext(configDatabase);
		MOLOG.info("[DAW] ClassPathXmlDatabase {}", moContext);
		
		Connection connection = null;
		
		var xd = (DriverManagerDataSource) moContext.getBean("dataSource");
		
		try {
			System.out.print(xd.getConnection().toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

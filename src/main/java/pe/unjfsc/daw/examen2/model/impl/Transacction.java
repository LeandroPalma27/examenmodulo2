package pe.unjfsc.daw.examen2.model.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import pe.unjfsc.daw.examen.model.TestConnection;
import pe.unjfsc.daw.examen2.entity.CEPeajeDTOSalida;

public class Transacction {
	
	private static final Logger MOLOG = LoggerFactory.getLogger(TestConnection.class);

	private static ApplicationContext moContext;

	private static String[] configDatabase = {

			"classpath:/batch/config/job01-database.xml"

	};

	public void guardarDatos(List<CEPeajeDTOSalida> datos) {
		moContext = new ClassPathXmlApplicationContext(configDatabase);
		MOLOG.info("[DAW] ClassPathXmlDatabase {}", moContext);
		Connection connection = null;
		var manager = (DriverManagerDataSource) moContext.getBean("dataSource");
		String SQL = "";
		
		try {
			connection = manager.getConnection();
			for (var dato: datos) {
				var pst = connection.prepareStatement(SQL);
				pst.setInt(0, 1);
				pst.execute();
				pst.close();
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}

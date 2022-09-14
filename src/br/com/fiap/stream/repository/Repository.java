package br.com.fiap.stream.repository;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Classe repository
 * 
 * Todo repos�t�rio dever� extender esta classe, pois todo reposit�rio dever�
 * saber se conectar ao banco de dados conforme par�metros do arquivo
 * application.properties
 * 
 * @author Francis
 *
 */
public abstract class Repository {

	Connection connection;

	/**
	 * Construtor padr�o
	 */
	public Repository() {
		super();
		getConnection();
	}

	/**
	 * Consegue uma conex�o com o banco de dados
	 * 
	 * @see ConnectionFactory#getInstance()
	 * 
	 * @return
	 */
	public Connection getConnection() {
		try {

			this.connection = ConnectionFactory.getInstance().getConnection();
			return this.connection;
		} catch (SQLException e) {
			System.out.println("Erro nos par�metros da conex�o com o banco de dados :" + e.getMessage());
		}
		return null;
	}

	/**
	 * Fecha a conex�o com o banco de dados
	 */
	public void closeConnection() {

		try {
			// se a conex�o n�o estiver fechada, feche-a
			if (!this.connection.isClosed()) {
				this.connection.close();
			}
		} catch (SQLException ex) {
			System.out.println("Erro ao encerrar conex�o:" + " \n" + ex.getMessage());
		}
	}

}

package Entities;

import java.sql.Connection;

public class FornecedorDAO {
	
	public static boolean inserir(Fornecedor fornecedor) {
			Connection con = ConnectionFactory.getConnection();
			return true;
	}
}

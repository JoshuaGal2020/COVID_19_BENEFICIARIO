package ayuda.joshua.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import ayuda.joshua.Conexion.ConexionBd;
import ayuda.joshua.entidades.persona;


public class ClsBeneficiario {


	ConexionBd claseConectar = new ConexionBd();
    Connection conectar = claseConectar.RetornarConexion();
    
    public boolean ObtenerBeneficiario(persona persons){
    	
    	boolean SIbeneficiario = false;
    	try {
			CallableStatement statement = conectar.prepareCall("call SP_S_BENEFICIARIO(?)");
			statement.setString("PDui", persons.getDui());
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				SIbeneficiario = true;
			}
		} catch (Exception e) {
			System.out.println("OCURRIO UN ERROR BANDA EN CLSOB" + e);
		}
    	return SIbeneficiario;
    }
    
    public String MostrarBeneficiario(persona persons) {
    	
    	String fullname = "";
    	try {
			CallableStatement statement = conectar.prepareCall("call SP_S_BENEFICIARIO(?)");
			statement.setString("PDui", persons.getDui());
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				fullname = result.getString("Fullname");
			}
		} catch (Exception e) {
			System.out.println("OCURRIO UN ERROR BANDA EN CLSMB" + e);
		}
    	return fullname;
    }


}

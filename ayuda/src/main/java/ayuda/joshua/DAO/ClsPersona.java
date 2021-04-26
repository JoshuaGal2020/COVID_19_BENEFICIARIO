package ayuda.joshua.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import ayuda.joshua.Conexion.ConexionBd;
import ayuda.joshua.entidades.persona;

public class ClsPersona {
	ConexionBd claseConectar = new ConexionBd();
    Connection conectar = claseConectar.RetornarConexion();
    
	public boolean LoguinPersona(String Usuario, String Pass) {

        ArrayList<persona> ListadoUSUARIOPASS = new ArrayList<>();
        ArrayList<persona> ListarContra = new ArrayList<>();

        try {
            CallableStatement Statement = conectar.prepareCall("call SP_S_LOGINS(?,?)");
            Statement.setString("PUsuario", Usuario);
            Statement.setString("PContra", Pass);
            ResultSet resultadoConsulta = Statement.executeQuery();
            while (resultadoConsulta.next()) {

                persona person = new persona();
                person.setUsuario(resultadoConsulta.getString("Usuario"));
                person.setPass(resultadoConsulta.getString("Pass"));
                ListadoUSUARIOPASS.add(person);
            }

            String usuario2 = null;
            String contra2 = null;
            for (var iterar : ListadoUSUARIOPASS) {

            	usuario2 = iterar.getUsuario();
            	contra2 = iterar.getPass();
            }

            CallableStatement st2 = conectar.prepareCall("call SP_S_CRIPSPERSONA(?)");
            st2.setString("PPass", Pass);
            ResultSet rs2 = st2.executeQuery();
            while (rs2.next()) {
                persona percrip = new persona();
                percrip.setPass(rs2.getNString("crip"));
                ListarContra.add(percrip);
            }

            String passcrip = null;
            for (var iterar : ListarContra) {

                passcrip = iterar.getPass();
                Pass = passcrip;
            }

            if (usuario2 != null && contra2 != null) {
                if (usuario2.equals(Usuario) && contra2.equals(Pass)) {
                    return true;
                }
            }
            conectar.close();

        } catch (Exception e) {
            System.out.println("ERROR CLSP" + e);
        }
        return false;
    }

}

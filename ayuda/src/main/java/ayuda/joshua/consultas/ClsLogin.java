package ayuda.joshua.consultas;

import ayuda.joshua.DAO.ClsPersona;

public class ClsLogin {

	public int AccesoLogin(String Usuario, String Contrasenia) {
		int Acc = 0;

		ClsPersona clsPersons = new ClsPersona();
		var validar = clsPersons.LoguinPersona(Usuario, Contrasenia);
		if (validar == true) {
			Acc = 1;
		}
		return Acc;
	}

}

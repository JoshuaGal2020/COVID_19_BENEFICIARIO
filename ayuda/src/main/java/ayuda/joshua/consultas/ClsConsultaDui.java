package ayuda.joshua.consultas;

import ayuda.joshua.DAO.ClsBeneficiario;
import ayuda.joshua.entidades.persona;

public class ClsConsultaDui {
	

	public int EsBeneficiario(persona persons) {			
		int Es = 0;		
		ClsBeneficiario clsBeneficiario = new ClsBeneficiario();
		var benefi = clsBeneficiario.ObtenerBeneficiario(persons);	
		if(benefi == true) {
			Es = 1;
		}		
		return Es;
	}

}

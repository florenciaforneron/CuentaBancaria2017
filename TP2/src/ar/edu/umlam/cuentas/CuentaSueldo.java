package ar.edu.umlam.cuentas;

public class CuentaSueldo extends Cuenta {
	
	
	public CuentaSueldo (Double saldo){
	super(saldo);
		

	}

	 
	public void extraccion(Integer montoAExtraer) {
	if(saldo >= montoAExtraer){
	saldo=saldo-montoAExtraer;
	} 
	}

}


package ar.edu.umlam.cuentas;


	public class CuentaCorriente extends Cuenta {
		
		private Double montoADescubierto=2000.00;
		
	public CuentaCorriente(Double saldo){
	super (saldo);
	}
	
	
	public void extraccion(Double montoAExtraer) {
		if(saldo>=montoAExtraer){
			saldo=saldo-montoAExtraer;
			}
		else{
				if(saldo+montoADescubierto>montoAExtraer){
				Double montoDeudor;
				montoDeudor=(montoADescubierto+saldo-montoAExtraer)*0.95;
					if(saldo+montoDeudor+montoADescubierto>montoAExtraer){
						saldo=montoDeudor*-1;
					
					}
					else{System.out.println("Usted No cuenta con el Suficiente monto para girar");}
				}
				else{System.out.println("Usted No cuenta con el Suficiente monto para girar");}
			}
	}
			
		
		

} 

package ar.edu.umlam.cuentas;

public class CuentaAhorro extends Cuenta {

private Integer contador=0;

public CuentaAhorro (Double saldo){
super(saldo);

}

 
public void extraccion(Double montoAExtraer) {
if(contador==4){
	if(saldo>=(montoAExtraer+6)){
	saldo=saldo-montoAExtraer-6;
	contador=0;
	}
	else{System.out.println("Monto Insuficiente Para Extraer");}
	}
else{ 
	if(saldo>=montoAExtraer){
	saldo=saldo-montoAExtraer;
	contador++;
	}
	else{System.out.println("Monto Insuficiente Para Extraer");}
}
}


}

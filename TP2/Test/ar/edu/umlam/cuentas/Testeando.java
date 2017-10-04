package ar.edu.umlam.cuentas;

import org.junit.Test;

import junit.framework.Assert;

public class Testeando {
	
	@Test
	public void TesteoCuentaSueldo(){
		CuentaSueldo Cuenta1=new CuentaSueldo(5000.00);
		Double VariableObtenida=Cuenta1.getSueldo();
		Double VariableComparativa=5000.00;
		Assert.assertEquals(VariableObtenida, VariableComparativa);
		Cuenta1.extraccion(2500);
		Double VariableObtenida2=Cuenta1.getSueldo();
		Double VariableComparativa2=2500.00;
				
	}
	
	@Test
	public void TesteoCuentaAhorro(){
		CuentaAhorro Cuenta2=new CuentaAhorro(5000.00);
		Cuenta2.extraccion(100.00);
		Cuenta2.extraccion(100.00);
		Cuenta2.extraccion(100.00);
		Cuenta2.extraccion(100.00);
		Cuenta2.extraccion(100.00);
		Cuenta2.extraccion(100.00);
		Cuenta2.extraccion(100.00);
		Cuenta2.extraccion(100.00);
		Cuenta2.extraccion(100.00);
		Cuenta2.extraccion(100.00);
		Cuenta2.extraccion(100.00);
		Cuenta2.extraccion(100.00);
		
		System.out.println("La cuenta 2 tiene un saldo de" + Cuenta2.getSueldo());
	}
	
	@Test
	public void TesteoCuentaCorriente(){
		CuentaCorriente cuenta3 = new CuentaCorriente (2500.00);
		cuenta3.extraccion(2600.00);
		System.out.println("La cuenta 3 tiene un saldo de" + cuenta3.getSueldo());
		
		
	}
}

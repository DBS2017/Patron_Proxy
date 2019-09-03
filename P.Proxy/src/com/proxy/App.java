package com.proxy;

import com.proxy1.inter.ICuenta;
import com.proxy.inter.impl.CuentaBancoBImpl;
import com.proxy.model.Cuenta;
import com.proxy.proxy01.CuentaProxy;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "zsalcedo", 100);
		
		ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);
		
	}

}

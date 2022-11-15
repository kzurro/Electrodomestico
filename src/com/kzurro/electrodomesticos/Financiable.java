package com.kzurro.electrodomesticos;

public interface Financiable {
	
	 int DEFAULT_MESES_FINANCIACION = 3;
	 
	 default double getCuantiaCuota() {
		 return  getPrecioFactura() / DEFAULT_MESES_FINANCIACION;
	 }
	 
	 static Double priceToDouble(Financiable financiable) {
		    return new Double(financiable.getPrecioFactura());
		  }
	 
	 float getPrecioFactura();

}

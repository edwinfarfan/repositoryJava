package com.pe.collections;

public class SumadorGeneric <T1 extends Integer, T2 extends Integer> {
	
	 private T1 numero1;  
	  private T2 numero2;  
	  
	  public SumadorGeneric(T1 numero1, T2 numero2) {  
	    this.numero1 = numero1;  
	    this.numero2 = numero2;  
	  }  
	  
	  public Integer resultadoSuma() {  
	    return (numero1 + numero2);  
	  }  

	  
	  
}

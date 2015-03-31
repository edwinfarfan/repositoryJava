package com.pe.collections;

public class MySimpleGenerics {

	public static void main(String[] args) {
		SimpleGeneric<String> sgs = new SimpleGeneric<String>("this is a simple generic");
        sgs.printType();
        
        SimpleGeneric<Boolean> sgb = new SimpleGeneric<Boolean>(Boolean.TRUE);
        sgb.printType();

	}

}


class SimpleGeneric<T>{
    
    //declaration of object type T
    private T objReff = null;
     
    //constructor to accept type parameter T
    public SimpleGeneric(T param){
        this.objReff = param;
    }
     
    public T getObjReff(){
        return this.objReff;
    }
     
    //this method prints the holding parameter type
    public void printType(){
        System.out.println("Type: "+objReff.getClass().getName());
    }
}

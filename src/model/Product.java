package model;
/*
*this class contains the information of the products
*/
public class Product{
	//atributtes
	private String name;
	private String code;
	private double waterAmount;
	private int quantityUnits;
	/*
	*Product Constructor 
	*@param name is the name of the product 
	*@param code is the code of the product 
	*@param waterAmaunt is the water amount of the product 
	*@param quantityUnits is the units of the product 
	*/
	public Product(String name, String code,double waterAmount,int quantityUnits){
		this.name=name;
		this.code=code;
		this.waterAmount=waterAmount;
		this.quantityUnits=quantityUnits;
	}
	
	/*
	*Gets the name of the product 
	*@return the name of the product 
	*/
	public String getName(){
		return name;
	}
	
	/*
	*Sets the name of the product 
	*@param name the name of the product  
	*/
	public void setName(String name){
		this.name=name;
	}


	/*
	*Gets the code of the product 
	*@return the code of the product  
	*/
	public String getCode(){
		return code;
	}
	
	/*
	*Sets the code of the product 
	*@param code  the code product 
	*/
	public void setCode(String code){
		this.code=code;
	}
	
	/*
	*Gets the water amount of the product 
	*@return the water amount of the product
	*/
	public double getWaterAmount(){
		return waterAmount;
	}
	
	/*
	*Sets the water amount of the product 
	*@param waterAmount the water amount of the product 
	*/
	public void setWaterAmount(double waterAmount){
		this.waterAmount=waterAmount;
	}

	/*
	*Gets the units of the product 
	*@return the units of the product 
	*/
	public int getQuantityUnits(){
		return quantityUnits;
	}
	/**
	*Sets the units of the products
	*@param waterAmount the units of the products  
	*/
	public void setQuantityUnits(int quantityUnits){
		this.quantityUnits=quantityUnits;
	}

	/*
	*This method gives the product's information
	*@return the information of the company's product
	*/
	public String toString(){
		String msg ="";
       
		msg+="Nombre del Producto: "+name+"\n";
		msg+="Codigo del Producto: "+code+"\n";
		msg+="Cantidad de agua gastada: "+waterAmount+"\n";
		msg+="Cantidad de unidades disponibles: "+quantityUnits+"\n";
		return msg;
	}
}
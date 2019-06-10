package model;
public class FoodCompany extends ManufacturingCompany{
	//constants
	private final static String PERISHABLE = "perecedero";
	
	//atributtes
	private double roomTemperature;
	private double grams;
	private boolean isPerishable;
	
	/*
	*FoodCompany's constructor
	*@param name is the Company's name
	*@param nit is the Company's  nit
	*@param addreess is the Company's addreess
	*@param phone is the Company's phone
	*@param employees is the number of employees in the Company
	*@param valueAssets is the value in pesos of the Company
	*@param constituionDate is the date of incorporation of the Company
	*@param legalRepresentative is the legal name of the Company
	@param type is the type of the company
	@param roomTemperature is the temperature of the food's room
	@param grams is the grams of each food
	*/
	public FoodCompany(String name,String nit,String addreess,String phone,int employees,double valueAssets,String constitucionDate,String legalRepresentative,char type,double roomTemperature,double grams, boolean isPerishable){
		super(name,nit,addreess,phone,employees,valueAssets,constitucionDate,legalRepresentative,type);
		this.roomTemperature = roomTemperature;
		this.grams = grams;
		this.isPerishable = isPerishable;
	}
	
	/*
	*Gets the roomTemperature
	*@return the roomTemperature
	*/
	public double getRoomTemperature(){
		return roomTemperature;
	}
	
	/*
	*Sets the roomTemperature
	*@param roomTemperature is the temperature of the room
	*/
	public void setRoomTemperature(double roomTemperature){
		this.roomTemperature = roomTemperature;
	}
	
	/*
	*Gets the grams
	*@return the grams of food
	*/
	public double getGrams(){
		return grams;
	}
	
	/*
	*Sets the grams
	*@param grams is the grams of each food
	*/
	public void setGrams(double grams){
		this.grams = grams;
	}
	
	public boolean getIsPerichable(){
		return isPerishable;
	}
	
	public void setIsPerchable(boolean isPerishable){
		this.isPerishable = isPerishable;
	}
	
	/*
	*this method gives the FoodCompany's information
	*@return the report of the FoodCompany
	*/
	public String toString(){
		String msg = "";

		msg += super.toString();
		msg += "La temperatura de la sala en la que se encuentra el alimento es de: "+roomTemperature+"\n";
		msg += "Los gramos del alimento son: "+grams+"\n";
		if(isPerishable){
			msg += "El alimento es perecedero.";
		}
		else{
			msg = "El alimento no es perecedero.";
		}
		return msg;
	}
}
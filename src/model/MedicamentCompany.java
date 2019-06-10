package model;
/*
*this class contains the information of the Medicamet Company (Invima)
*/
public class MedicamentCompany extends ManufacturingCompany implements Consuption{
	//constants
	public static final char MANUFACTURE_EXPORT = 'A';
	public final static char MANUFACTURE_SELL = 'B';
	public final static char IMPORT_SELL = 'C';
	
	//atributtes
	private String sanitaryRegistration;
	private String status;
	private String expiration;
	private char modality;
	
	/*
	*MedicamentCompany's constructor
	*@param name is the Company's name
	*@param nit is the Company's  nit
	*@param addreess is the Company's addreess
	*@param phone is the Company's phone
	*@param employees is the number of employees in the Company
	*@param valueAssets is the value in pesos of the Company
	*@param constituionDate is the date of incorporation of the Company
	*@param legalRepresentative is the legal name of the Company
	@param type is the type of the company
	*@param sanitaryRegistration health registration of the invima company 
	*@param status  status of the medicament 
	*@param expiration expiration of the medicament 
	*@param modality type of the modality the medicament
	*/
	public MedicamentCompany(String name,String nit,String addreess,String phone,int employees,double valueAssets,String constitucionDate,String legalRepresentative,char type,String sanitaryRegistration,String status,String expiration,char modality){
	super(name,nit,addreess,phone,employees,valueAssets,constitucionDate,legalRepresentative,type);
	this.sanitaryRegistration=sanitaryRegistration;
	this.status=status;
	this.expiration=expiration;
	this.modality=modality;
	}
	
	/*
	*Gets the health registration 
	*@return the health registration of the invima  
	*/
	public String getSanitaryRegistration(){
		return sanitaryRegistration;
	}
	
	/*
	*Sets the health registration
	*@param sanitaryResgistration the health registratio of the invima company 
	*/
	public void setSanitaryRegistration(String sanitaryRegistration){
		this.sanitaryRegistration=sanitaryRegistration;
	}

	/*
	*Gets the status of the medicament 
	*@return the estatus of the medicament 
	*/
	public String getStatus(){
		return status;
	}
	
	/*
	*Sets the status of the medicament 
	*@param status  the status of the medicament 
	*/
	public void setStatus(String status){
		this.status=status;
	}
	
	/*
	*Gets the expiration of the medicament 
	*@return the expiration of the medicament 
	*/
	public String getExpiration(){
		return expiration;
	}
	
	/*
	*Sets the expiration of the medicament 
	*@param expiration  the expiration of the medicament  
	*/
	public void setExpiration(String expiration){
		this.expiration=expiration;
	}
	
	/*
	*Gets type of the modality the medicament 
	*@return the type of the modality yhe medicament 
	*/
	public char getModality(){
		return modality;
	}
	
	/*
	*Sets the type of the modality the medicamet  
	*@param modality the type of the medicament 
	*/
	public void setModality(char modality){
		this.modality=modality;
	}
	
	/*
	*this method calculates the amount of trees thar the company must plant
	*@return  number of trees that the company has to plant 
	*/

	public double calculatedConsuption(){
		int tressToSow=0;
		int liters =0;
		for (int i =0;i<getProducts().size();i++){
			liters += super.getProducts().get(i).getWaterAmount();
		}
		if (liters >= 1  &&  liters < 141){
			tressToSow = 6;
		}
		else if (liters >= 141 && liters <=800){
			tressToSow = 25;
		}
		else if (liters >800){
			tressToSow = 200;
		}
		return tressToSow;
	}
	
	/*
	*this method gives the MedicamentCompany's information
	*@return the report of the MedicamentCompany
	*/
	public String toString(){
		String msg = "";

		msg += super.toString();
		msg +="Numero del registro sanitario: "+sanitaryRegistration+"\n";
		msg +="El estado es: "+status+"\n";
		msg +="La Expiracion es: "+expiration+"\n";
		msg +="La modalidad es: "+modality+"\n";
		return msg;
	}
}
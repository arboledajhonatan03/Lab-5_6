package model;
//This class contains the information of the LegalPersonality
public abstract class LegalPersonality{
	//atributes
	private  String name;
	private  String nit;
	private  String addreess;
	private  String phone;
	private  int employees;
	private  double valueAssets;
	private  String constitutionDate;
	private  String legalRepresentative;
	
	/**
	*LegalPersonality constructor
	*@param name is the LegalPersonality's name
	*@param nit is the LegalPersonality's  nit
	*@param addreess is the LegalPersonality's addreess
	*@param phone is the LegalPersonality's phone
	*@param employees is the number of employees in the LegalPersonality
	*@param valueAssets is the value in pesos of the LegalPersonality
	*@param constitucionDate is the date of incorporation of the LegalPersonality
	*@param legalRepresentative is the legal name of the LegalPersonality
	*/
	public LegalPersonality(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitutionDate,String legalRepresentative){
		this.name=name;
		this.nit=nit;
		this.addreess=addreess;
		this.phone=phone;
		this.employees=employees;
		this.valueAssets=valueAssets;
		this.constitutionDate=constitutionDate;
		this.legalRepresentative=legalRepresentative;
	}
	
	/**
	*Gets the name
	*@return the name
	*/
	public String getName(){
		return name;
	}
	
	/**
	*Sets the name 
	*@param name the name 
	*/
	public void setName(String name){
		this.name=name;
	}

	/**
	*Gets the nit
	*@return the nit 
	*/
	public String getNit(){
		return nit;
	}
	
	/**
	*Sets the nit 
	*@param nit the nit 
	*/
	public void setNit(String nit){
		this.nit = nit;
	}
	
	/**
	*Gets the Address
	*@return the address
	*/
	public String getAddreess(){
		return addreess;
	}
	
	/**
	*Sets the Addreess
	*@param addreess the Addreess
	*/
	public void setAddreess(String addreess){
		this.addreess=addreess;
	}
	
	/**
	*Gets the Phone 
	*@return the phone                                                                          
	*/
	public String getPhone(){
		return phone;
	}
	
	/**
	*Sets phone
	*@param phone the phone
	*/
	public void setPhone(String phone){
		this.phone=phone;
	}
	
	/**
	*Gets the employee
	*@return the employees
	*/
	public int getEmployees(){
		return employees;
	}
	
	/**
	*Sets the employees
	*@param employees the employees
	*/
	public void setEmployees(int employees){
		this.employees=employees;
	}
	
	/**
	*Gets ValueAseets
	*@return the valueAseets
	*/
	public double getValueAseets(){
		return valueAssets;
	}
	
	/**
	*Sets the valueAseets
	*@param valueAseets the valueAseets
	*/
	public void setValueAseets(double valueAseets){
		this.valueAssets=valueAssets;
	}
	
	/**
	*Gets the ConstitucionDate
	*@return the constitucionDate
	*/
	public String getConstitutionDate(){
		return constitutionDate;
	}
	
	/**
	*Sets the ConstitucionDate
	*@param constitucionDate the constitucionDate 
	*/
	public void setConstitutionDate(String constitucionDate){
		this.constitutionDate=constitutionDate;
	}
	
	/**
	*Gets the LegatRepresentative
	*@return legalRepresentative
	*/
	public String getLegalRepresentative(){
		return legalRepresentative;
	}
	
	/**
	*Sets the legalRepresentative
	*@param legalRepresentative the legalRepresentative
	*/
	public void setLegalRepresentative(String legalRepresentative){
		this.legalRepresentative=legalRepresentative;
	}
}
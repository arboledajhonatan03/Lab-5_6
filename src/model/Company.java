package model;
/**
*This class contains the information of the Company 
*/
public abstract class Company extends LegalPersonality{
	//constants
	public final static char FARM_HUNT_SILVI_FISH ='A';
	public final static char MINE_EXPLO_QUARR ='B';
	public final static char INDUSTRY_MANUFAC = 'C';
	public final static char ELECTRY_GAS_STEAM= 'D';
	public final static char BUILDING = 'E';
	public final static char COMMERSE_HIGHER_LESS = 'F';
	public final static char TRANSP_STORAGE_COMMU = 'G';
	public final static char STATEFINAN_SAFE_ESTATE = 'H';
	public final static char SOCIAL_COMUNALS = 'I';
	
	//Attributes

	private char type;
	
	/**
	*Company's constructor
	*@param name is the LegalPersonality's name
	*@param nit is the LegalPersonality's  nit
	*@param addreess is the LegalPersonality's addreess
	*@param phone is the LegalPersonality's phone
	*@param employees is the number of employees in the LegalPersonality
	*@param valueAssets is the value in pesos of the LegalPersonality
	*@param constitucionDate is the date of incorporation of the LegalPersonality
	*@param legalRepresentative is the legal name of the LegalPersonality
	@param type is the type of the company
	*/
	public Company(String name,String nit,String addreess,String phone,int employees,double valueAssets,String constitucionDate,String legalRepresentative,char type){
	super(name,nit,addreess,phone,employees,valueAssets,constitucionDate,legalRepresentative);
	this.type=type;
	}
	
	/**
	*Gets of the type company
	*@return type of the company 
	*/
	public char getType(){
		return type;
	}
	/**
	*Sets of the type company
	*@param type is the type of the company 
	*/
	public void setType(char type){
		this.type=type;
	}
}
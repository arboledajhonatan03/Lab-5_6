package model;
/**
*This class contains the information of the EducationCompany 
*/
public class EducationCompany extends ServiceCompany implements Tax{
	//constants
	public static final String HIGHSCHOOL = "Bachillerato";
	public final static String UNIVERSITY = "Universidad";

	//Attributes 
	private String numRegistry;
	private int acreeditedYears;
	private int positionSaber11;
	private int positionSaberPro;
	private String rectorName;
	private String educationSector;
	private int strataOneandTwo;
	private int qualityTotal;
	
	/**
	*EducationCompany's constructor
	*@param name is the ServiceCompany's name
	*@param nit is the ServiceCompany's  nit
	*@param addreess is the ServiceCompany's addreess
	*@param phone is the ServiceCompany's phone
	*@param employees is the number of employees in the ServiceCompany
	*@param valueAssets is the value in pesos of the ServiceCompany
	*@param constitucionDate is the date of incorporation of the ServiceCompany
	*@param legalRepresentative is the legal name of the ServiceCompany
	@param type is the type of the ServiceCompany
	*/
	public EducationCompany(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,char type,String numRegistry,int acreeditedYears,int positionSaber11,int positionSaberPro,String rectorName,String educationSector,int strataOneandTwo,int qualityTotal){
		super (name,nit,addreess,phone,employees,valueAseets,constitucionDate,legalRepresentative,type);
		this.numRegistry=numRegistry;
		this.acreeditedYears=acreeditedYears;
		this.positionSaber11=positionSaber11;
		this.positionSaberPro=positionSaberPro;
		this.rectorName=rectorName;
		this.educationSector=educationSector;
		this.strataOneandTwo=strataOneandTwo;
		this.qualityTotal=qualityTotal;
	}
	
	/**
	*Gets aproval registration number 
	*@return the numRegistry aproval 
	*/
	public String getNumRegistry(){
		return numRegistry;
	}
	/**
	*Sets aproval registration number 
	*@param numRegistry yhe numRegistry aproval
	*/
	public void setNumRegistry(String numRegistry){
		this.numRegistry=numRegistry;
	}
	/**
	*Gets  years of high quality
	*@return acreeditedYears of the education company 
	*/
	public int getAcreeditedYears(){
		return acreeditedYears;
	}
	/**
	*Sets years of high quality 
	*@param acreeditedYears of the education company 
	*/
	public void setAcreeditedYears(int acreeditedYears){
		this.acreeditedYears=acreeditedYears;
	}
	/**
	*Gets national position test know 11
	*@return positionSaber11 of the education company 
	*/
	public int getPositionSaber11(){
		return positionSaber11;
	}
	/**
	*Sets national position test know 11
	*@param positionSaber11 of the education company 
	*/
	public void setPositionSaber11(int positionSaber11){
		this.positionSaber11=positionSaber11;
	}
	/**
	*Gets national stand test know pro 11
	*@return positionSaberPro of the education company
	*/
	public int getPositionSaberPro(){
		return positionSaberPro;
	}
	/**
	*Sets national stand test know pro 11
	*@param positionSaberPro of the education company
	*/
	public void setPositionSaberPro(int positionSaberPro){
		this.positionSaberPro=positionSaberPro;
	}
	/**
	*Gets name of the rector company
	*@return the name of the rector name 
	*/
	public String getRectorName(){
		return rectorName;
	}
	/**
	*Sets name of the rector company
	*@param rectorName the name of the rector company 
	*/
	public void setRectorName(String rectorName){
		this.rectorName=rectorName;
	}
	/**
	*Gets education sector 
	*@return education sector 
	*/
	public String getEducationSector(){
		return educationSector;

	}
	/**
	*sets education sector 
	*@param educationSector the education sector 
	*/

	public void setEducationSector(String educationSector){
		this.educationSector=educationSector;
	}
	/**
	*Gets active students stratum one and two
	*@return strataOneandTwo of the students 
	*/
	public int getStrataOneandTwo(){
		return strataOneandTwo;
	}
	/**
	*Sets active students stratum one and two
	*@param strataOneandTwo of the active estudents 
	*/

	public void setStrataOneandTwo(int strataOneandTwo){
		this.strataOneandTwo=strataOneandTwo;
	}
	/**
	*Gets total number of active students 
	*@return qualityTotal of the estudents 
	*/
	public int getQualityTotal(){
		return qualityTotal;
	}
	/**
	*Sets total number of active students 
	*@param qualityToltal of the estudents
	*/
	public void setQualityTotal(int qualityTotal){
		this.qualityTotal=qualityTotal;
	}
	
	/**
	*This method calculates the pro culture tax
	*@return tax pro culture
	*/

	public double calculateProCulture(){
		double porcentProCulture=0.0;

		porcentProCulture += 20 -(strataOneandTwo/100);

		if (porcentProCulture < 0 ){
			porcentProCulture = 0.0;
		}
		return porcentProCulture;
	}
	
	/*
	*This metod gives the EducationCompany's information
	*@return the information of the company
	*/
	public String toString(){
		String msg ="";

		msg+=super.toString()+"\n";
		msg+="Numero del registro: "+numRegistry+"\n";
		msg+="Numero de años acreditados de alta calidad ante el MEN: "+acreeditedYears+"\n";
		msg+="Puesto nacional en la pruebas saber 11: "+positionSaber11+"\n";
		msg+="Puesto nacional en las pruebas saber pro: "+positionSaberPro+"\n";
		msg+="Nombre del rector: "+rectorName+"\n";
		msg+="Sector educativo: "+educationSector+"\n";
		msg+="Cantidad de estudiantes activos estrato 1 y 2: "+strataOneandTwo+"\n";
		msg+="Cantidad total de estudiantes: "+qualityTotal+"\n";

		return msg;
	}
}
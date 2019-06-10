package model;
import java.util.ArrayList;
/*
*this class contains the information of the TechnologyCompany
*/
public class TechnologyCompany extends ServiceCompany implements Consuption {
	//constants
	public static final String CONSULTANCY ="Consultoria";
	public final static String TRAINING = "Capacitacion";
	public static final String DEVELOP_SOFTW = "Desarrollo de Software";
	public static final String INFRASTRUC_SERVIC = "Infraestructura como servicio";
	public static final String SOFTWARE = "Software";
	public static final String PLATAFORM = "Plataforma";
	
	//atributtes
	private String typeOfService;
	private int kiloWatts;
	
	//Relations 
	private ArrayList<String> services;
	
	/**
	*TechnologyCompany's constructor
	*@param name is the ServiceCompany's name
	*@param nit is the ServiceCompany's  nit
	*@param addreess is the ServiceCompany's addreess
	*@param phone is the ServiceCompany's phone
	*@param employees is the number of employees in the ServiceCompany
	*@param valueAssets is the value in pesos of the ServiceCompany
	*@param constitucionDate is the date of incorporation of the ServiceCompany
	*@param legalRepresentative is the legal name of the ServiceCompany
	@param type is the type of the ServiceCompany
	*@param typeOfService type of the service the technologyCompany
	*@param kiloWatts kilowatts consumed of the technologyCompany
	*/
	public TechnologyCompany(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitutionDate,String legalRepresentative,char type,String typeOfService,int kiloWatts){
		super (name,nit,addreess,phone,employees,valueAseets,constitutionDate,legalRepresentative,type);
		this.typeOfService = typeOfService;
		this.kiloWatts = kiloWatts;
		services =new ArrayList<String>();
		services.add(CONSULTANCY);
		services.add(TRAINING);
		services.add(DEVELOP_SOFTW);
		services.add(INFRASTRUC_SERVIC);  
		services.add(SOFTWARE);
		services.add(PLATAFORM);
	}
	
	/**
	*Gets the type of the service the technology 
	*@return the type of service 
	*/

	public String getTypeOfService(){
		return typeOfService;
	}
	
	/**
	*Sets the type of the service the technology 
	*@param typeOfService the type of the service 
	*/
	public void setTypeOfService(String typeOfService){
		this.typeOfService=typeOfService;
	}
	/**
	*Gets the kilowatts consumed of the technology company 
	*@return the kilowatts 
	*/

	public int getKiloWatts(){
		return kiloWatts;
	}
	
	/**
	*Sets the  type of the service the technology 
	*@param kilowatts  the  type of the service 
	*/
	public void setKiloWatts(int kiloWatts){
		this.kiloWatts=kiloWatts;
	}
	
	/**
	*this method calculates the amount of trees thar the company should plant
	*@return  number of trees that the company has to plant 
	*/
	public double calculatedConsuption(){
	int tressToSow=0;

	if (kiloWatts >=1 && kiloWatts <= 1000){
		tressToSow = 8;
	}
	else if (kiloWatts >=1001 && kiloWatts <=3000){
		tressToSow = 35;
	}
	else if (kiloWatts > 3000){
		tressToSow=500;
	}
	return tressToSow;
	}
	
	/**
	*This method gives the TechnologyCompany's information
	*@return the information of the Technology  company
	*/
	public String toString(){

		String msg ="";
		msg += super.toString()+"\n";
		msg +="El tipo de servicio es: "+typeOfService+"\n";
		msg +="La cantidad de kiloWatts registrada es: "+kiloWatts+"\n";
		msg +="Cantidad de arboles que deben plantar: "+calculatedConsuption()+"\n";

	   return msg;
	}
}
package model;
/*
*this class contains the information of the Public Service Company 
*/
public class PublicService extends ServiceCompany implements Tax{
	//constants
	public static final String SEWERAGE = "Alcantarillado";
	public final static String ENERGY = "Energia";
	public static final String AQUEDUCT = "Acueducto";
	
	//atributtes
	private String typeOfService;
    private int subscribersActual;
    private int subscribersOneandTwo;
	
	/**
	*PublicService's constructor 
	*@param name the name of the Public service company
	*@param nit the nit of the Public service company
	*@param addreess the address of the Public service company
	*@param phone the phone of the Public service  company 
	*@param employees total employees of the Public service company 
	*@param valueAseets value in pesos of the assets
	*@param constitucionDate date of incorporation of the Public service company 
	*@param legalRepresentative legal name of the Public service company 
	*@param type type of the Public service company 
	*@param typeOfService the type of the service 
	*@param subscriberActual number of current subscribers
	*@param subscribersOneandTwo number of subscribers year 1 and 2
	*/ 
	public PublicService(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitutionDate,String legalRepresentative,char type,String typeOfService, int subscribersActual,int subscribersOneandTwo){
		super (name,nit,addreess,phone,employees,valueAseets,constitutionDate,legalRepresentative,type);
    	this.typeOfService=typeOfService;
    	this.subscribersActual=subscribersActual;
    	this.subscribersOneandTwo=subscribersOneandTwo;
	}
	
	/*
	*Gets the type of the service 
	*@return the type service 
	*/
    public String getTypeOfService(){
    	return typeOfService;
    }
	
	/*
	*Sets the type of the service 
	*@param typeOfService the type service 
	*/
    public void setTypeOfService(String typeOfService){
    	this.typeOfService=typeOfService;
    }
	
	/*
	*Gets the number of current subscribers 
	*@return the number subscribers 
	*/
    public int getSubscribersActual(){
    	return subscribersActual;
    }
	
    /*
	*Sets the number of current subscribers 
	*@param subscribersActual  the number subscribers 
	*/
    public void setSubscribersActual(int subscribersActual){
    	this.subscribersActual=subscribersActual;
    }

	/*
	*Gets the number of subscribers year 1 and 2
	*@return number of subscribers year 1 and 2
	*/
		public int getSubscribersOneandTwo(){
    	return subscribersOneandTwo;
    }
	
	/*
	*Sets the number of subscribers year 1 and 2
	*@param subscribersOneandTwo number of subscribers year 1 and 2
	*/
    public void setSubscribersOneandTwo(int subscribersOneandTwo){
    	this.subscribersOneandTwo=subscribersOneandTwo;
    }
	
	/**
	*This method calculates the pro culture tax
	*@return tax pro culture
	*/
    public double calculateProCulture(){
    	double porcenProCulture=0.0;

    	porcenProCulture += 40 - (subscribersActual/100);
     	if (porcenProCulture<0){
    		porcenProCulture = 0.0;
    	}
    	return porcenProCulture;
    }
	
	/*
	*This method gives the Public Service  company
	*@return the report of the Public Service company
	*/
    public String toString(){
        String msg = "";

        msg+=super.toString();
        msg+="Tipo de Servicio: "+typeOfService+"\n";
        msg+="Suscriptores Actuales: "+subscribersActual+"\n";
        msg+="Suscriptores de estrato 1 y 2: "+subscribersOneandTwo+"\n";
        return msg;
    }
}
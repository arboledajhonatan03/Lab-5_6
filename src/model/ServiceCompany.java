package model;
/*
*this class contains the information of the ServiceCompany
*/
public abstract class ServiceCompany extends Company{
	/*
	*ServiceCompany's constructor
	*@param name is the Company's name
	*@param nit is the Company's  nit
	*@param addreess is the Company's addreess
	*@param phone is the Company's phone
	*@param employees is the number of employees in the Company
	*@param valueAssets is the value in pesos of the Company
	*@param constitucionDate is the date of incorporation of the Company
	*@param legalRepresentative is the legal name of the Company
	@param type is the type of the company
	*/
	public ServiceCompany(String name,String nit,String addreess,String phone,int employees,double valueAssets,String constitucionDate,String legalRepresentative,char type){
	super(name,nit,addreess,phone,employees,valueAssets,constitucionDate,legalRepresentative,type);
	}
}
package model;
import java.util.ArrayList;
/*
*this class contains the information of the ManufacturingCompany 
*/
public abstract class ManufacturingCompany extends Company{
	//relation
	private ArrayList<Product> products;
	
	/*
	*ManufacturingCompany's constructor
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
	public ManufacturingCompany(String name,String nit,String addreess,String phone,int employees,double valueAssets,String constitucionDate,String legalRepresentative,char type){
	super(name,nit,addreess,phone,employees,valueAssets,constitucionDate,legalRepresentative,type);
	products = new ArrayList<Product>();
	}
	/*
	*Gets the products
	*@return the products
	*/
	public ArrayList<Product> getProducts(){
		return products;
	}
	
	/*
	*Sets the products
	*@param products  the products 
	*/
	public void setProducts(ArrayList<Product> products){
		this.products=products;
	}
	
	/*
	*the imformation of the products
	*@return the information of the products
	*/
	public String getInformation(){

		String msg = "";
		for(int i = 0; i < products.size();i++){
			msg += products.get(i).toString();
		}
		return msg;
	}
}
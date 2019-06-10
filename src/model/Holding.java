package model;
import java.util.ArrayList;
//This class contains the informations of the Holding
public class Holding{
	
	//Relation
	private ArrayList<Company> companies;
	
	//Holding constructor
	public Holding(){
		companies = new ArrayList<Company>();
	}
	
	/*
	*This method add a Company
	*@param newCompany  is the Company to add
	*/
	public void addCompany(Company  newCompany){
		companies.add(newCompany);
	}
	
	/*
	*To return the report of the companys <br>
	*post: the resport is generated<br>
	*@return the report of the companys 
	*/
	public String showCompanies(){
		String msg="";

		for(int i=0;i<companies.size();i++){
			msg+= companies.get(i).toString()+"\n";
		}
		return msg;
	}
	
	/**
	*This method to give the names of the manufacturing companies <br>
	*@return names of manufacturing companies 
	*/
	public String showNameManufacturing(){
		String msg = "";

		for(int i = 0; i<companies.size();i++){
			if (companies.get(i) instanceof ManufacturingCompany){
			msg+=  companies.get(i).getName()+"\n";
			}
		}
		return msg;
	}
	
	public ArrayList<Product> verific (String name){
	ArrayList <Product> msg =null;
    for (int i =0;i<companies.size() ;i++){
		if (companies.get(i) instanceof ManufacturingCompany ){
			if( companies.get(i).getName().equals(name)){      	
				msg = ((ManufacturingCompany)companies.get(i)).getProducts();
			}
		}
	}
	return msg;
}
}
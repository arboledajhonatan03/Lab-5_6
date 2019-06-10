/* 
*Name: Jhonatan Steven Arboleda Velez
*ID: A00358993
*Institution: Icesi University
*Teacher: Camilo Barrios 
*Final Lab
*/

package ui;
import model.*;
import java.util.Scanner;
/*
*This class contains information from the main 
*/
public class Main{
	private Holding user;
	private Scanner reader;
	
	public Main(){
		reader = new Scanner(System.in);
	}
	
	public static void main (String[] args){
    	Main m = new Main();
    	m.menu();
    	m.showMenu();
    }
    public void menu(){
    	welcome();
    }
    
    public void welcome(){
		System.out.println("____________________________________________________________________________");
		System.out.println("[                                 Holding                                   ]");
		System.out.println("____________________________________________________________________________");
    }
	
	public void showOptions(){
		System.out.println("____________________________________________________________________________");
		System.out.println("Hi, please type the option that you wanna ejecute: ");
		System.out.println("1. Add a company.");
		System.out.println("");
		System.out.println("2. See the information of the companies.");
		System.out.println("");
		System.out.println("3. Add products.");
		System.out.println("");
		System.out.println("4. Exit the program");
	}
	
	public void showMenu(){
		int userInput=0;
		while (userInput < 4){
			showOptions();
			userInput = reader.nextInt();
			reader.nextLine();
			if(userInput==1){
				System.out.println("Nombre de la empresa:");
				String name = reader.nextLine();
				System.out.println("Nit de la empresa:");
				String nit =reader.nextLine();
				System.out.println("Direccion de la empresa");
				String addreess = reader.nextLine();
				System.out.println("Telefono de la empresa:");
				String phone =reader.nextLine();
				System.out.println("Numero de empleados");
				int employees = reader.nextInt();
				reader.nextLine();
				System.out.println("Valor en pesos de los activos");
				double valueAseets = reader.nextDouble();
				reader.nextLine();
				System.out.println("Fecha de Consitucion");
				String constitutionDate = reader.nextLine();
				System.out.println("Nombre del representante legal:");
				String legalRepresentative = reader.nextLine();
				
				System.out.println("Que tipo de Organizacion es:");
				System.out.println("A. Agricultura,Caza,Silvicultura,Pezca");
				System.out.println("B. Explotacion de minas y canteras.");
				System.out.println("C. Industria Manufacturera ");
				System.out.println("D. Electricidad,gas y vapor ");
				System.out.println("E. Construccion");
				System.out.println("F. Comercio al por mayor y al por menor");
				System.out.println("G. Transporte, almacenamiento y comunicaciones");
				System.out.println("H. Est.F/Cieros ,Seguros,B.Inmuebles ");
				System.out.println("I. Comunales Sociales");
				char type =reader.nextLine().charAt(0);
				char typeofservice =' ';
				if (type == 'A' ){
					typeofservice = Company.FARM_HUNT_SILVI_FISH;
				}
				else if (type == 'B'){
					typeofservice=Company.MINE_EXPLO_QUARR;
				}
				else if (type== 'C'){
					typeofservice=Company.INDUSTRY_MANUFAC;
				}
				else if (type == 'D'){
					typeofservice=Company.ELECTRY_GAS_STEAM;
				}
				else if (type == 'E'){
					typeofservice=Company.BUILDING;
				}
				else if (type== 'F'){
					typeofservice=Company.COMMERSE_HIGHER_LESS;
				}
				else if (type == 'G'){
					typeofservice=Company.TRANSP_STORAGE_COMMU;
				}
				else if (type == 'H'){
					typeofservice=Company.STATEFINAN_SAFE_ESTATE;
				}
				else if (type == 'I'){
					typeofservice=Company.SOCIAL_COMUNALS;
				}
				
				System.out.println("Que tipo de empresa desea agregar");
				System.out.println("1.Empresa de educacion");
				System.out.println("2.Empresa de Servicios Publicos ");
				System.out.println("3.Empresa de tecnologia");
				System.out.println("4.Empresa de Medicamentos");
				System.out.println("5.Empresa de Alimentos ");
				int valor= reader.nextInt();
				reader.nextLine();
				
				if (valor== 1){
					System.out.println("Digite el numero de registro de aprobacion ante el MEN");
					String numRegistry = reader.nextLine();
					System.out.println("Digite el numero de años acreditados como entidad de alta calidad:");
					int acreeditedYears = reader.nextInt();
					reader.nextLine();
					System.out.println("Digite el puesto nacional Segun examenes saber11");
					int positionSaber11 = reader.nextInt();
					reader.nextLine();
					System.out.println("Digite el puesto nacional Segun examenes saberPro");
					int  positionSaberPro = reader.nextInt();
					reader.nextLine();
					System.out.println("Nombre del rector");
					String rectorName = reader.nextLine();
					System.out.println("Seleccione el sector educativo:");
					System.out.println("1.Bachillerato");
					System.out.println("2.Universidad");
					int estatustype = reader.nextInt();
					reader.nextLine();
					String estatus = "";
					if (estatustype == 1){
						estatus= EducationCompany.HIGHSCHOOL;
					}
					else if (estatustype == 2){
						estatus = EducationCompany.UNIVERSITY;
					}
					System.out.println("Cantidad de estudiantes activos estrato 1 y 2 ");
					int strataOneandTwo = reader.nextInt();
					reader.nextLine();
					System.out.println("Cantidad total de estudiantes activos");
					int qualityTotal = reader.nextInt();
					reader.nextLine();
					System.out.println("Se ha registrado correctamente la empresa");
					EducationCompany educations = new EducationCompany(name,nit,addreess,phone,employees,valueAseets,constitutionDate,legalRepresentative,typeofservice,numRegistry,acreeditedYears,positionSaber11,positionSaberPro,rectorName,estatus,strataOneandTwo,qualityTotal);

					user.addCompany(educations);
				}
				
				else if (valor==2){
					System.out.println("Por favor seleccione el tipo de servicio que prestan:");
					System.out.println("1.Alcantarillado");
					System.out.println("2.Energia");
					System.out.println("3.Acueducto");
					int typeSer =reader.nextInt();
					reader.nextLine();
					String typeOfService="";
					if (typeSer ==1){
						typeOfService=PublicService.SEWERAGE;
					}
					else if (typeSer== 2){
						typeOfService=PublicService.ENERGY;
					}
					else if (typeSer ==3){
						typeOfService=PublicService.AQUEDUCT;
					}
					System.out.println("Cantidad total de suscriptores");
					int subscribersActual = reader.nextInt();
					reader.nextLine();
					System.out.println("Cantidand de suscriptores de estarto 1 y 2");
					int subscribersOneandTwo= reader.nextInt();
					reader.nextLine();
					PublicService services = new PublicService(name,nit,addreess,phone,employees,valueAseets,constitutionDate,legalRepresentative,typeofservice,typeOfService,subscribersActual,subscribersOneandTwo);
					user.addCompany(services);
				}
				else if (valor==3){
					
					System.out.println("Seleccione el tipo de servicio:");
					System.out.println("1.Consultoria");
					System.out.println("2.Capacitacion");
					System.out.println("3.Desarrollo de Software");
					System.out.println("4.Infraestructura como servicio.");
					System.out.println("5.Software como servicio.");
					System.out.println("6.Plataforma como servicio");
					int typeService = reader.nextInt();
					reader.nextLine();
					String typeOfService="";
					
					if (typeService== 1 ){
						typeOfService= TechnologyCompany.CONSULTANCY;
					}
					else if (typeService ==2){
						typeOfService=TechnologyCompany.TRAINING;
					}
					else if (typeService == 3){
						typeOfService= TechnologyCompany.DEVELOP_SOFTW;
					}
					else if (typeService== 4){
						typeOfService= TechnologyCompany.INFRASTRUC_SERVIC;
					}
					else if (typeService == 5){
						typeOfService=TechnologyCompany.SOFTWARE;
					}
					else if (typeService == 6){
						typeOfService= TechnologyCompany.PLATAFORM;
					}
				
					System.out.println("Cantidad de energia Consumida en kiloWatts");
					int kiloWatts = reader.nextInt();
					reader.nextLine();
					TechnologyCompany tecnologia = new TechnologyCompany(name,nit,addreess,phone,employees,valueAseets,constitutionDate,legalRepresentative,typeofservice,typeOfService,kiloWatts);
					user.addCompany(tecnologia);
				}
				else if (valor==4){
					System.out.println("Seleccione el tipo de modalidad  ");
					System.out.println("1.Exportacion Manufacturada");
					System.out.println("2.Venta Manufacturada");
					System.out.println("3.Venta Importada");
					int modaliti = reader.nextInt();
					reader.nextLine();
					char ma = ' ';
					if (modaliti == 1){
						ma = MedicamentCompany.MANUFACTURE_EXPORT;
					}
					else if (modaliti == 2){
						ma = MedicamentCompany.MANUFACTURE_SELL;
					}
					else if (modaliti == 3){
						ma = MedicamentCompany.IMPORT_SELL;
					}
					System.out.println("Digite el registro sanitario ");
					String sanitaryRegistration = reader.nextLine();
					System.out.println("Estado del medicamento");
					String status = reader.nextLine();
					System.out.println("Vencimiento");
					String expiration = reader.nextLine();

					MedicamentCompany medicament = new MedicamentCompany(name,nit,addreess,phone,employees,valueAseets,constitutionDate,legalRepresentative,typeofservice,sanitaryRegistration,status,expiration,ma);
					user.addCompany(medicament);      	
				}
				else if(valor==5){
					System.out.println("Cual es la temperatura del salon del alimento: ");
					double roomTemperature = reader.nextDouble();
					reader.nextLine();
					System.out.println("Cuantos gramos tiene el alimento: ");
					double grams = reader.nextDouble();
					reader.nextLine();
					System.out.println("¿El alimento es perecedero?");
					System.out.println("1. Si");
					System.out.println("2. No");
					int decision = reader.nextInt();
					reader.nextLine();
					boolean isPerishable = false;
					FoodCompany food = new FoodCompany(name,nit,addreess,phone,employees,valueAseets,constitutionDate,legalRepresentative,typeofservice,roomTemperature,grams,isPerishable);
					user.addCompany(food);
				}
			}
			else if (userInput == 2){
				System.out.println(user.showCompanies());
			}
			
			else if (userInput == 3){

				System.out.println("A que empresa de manufactura le desea agregar productos ?");
				System.out.println(user.showNameManufacturing()+"\n");
				String company = reader.nextLine();
				user.verific(company);
				System.out.println("Cuantos productos desea agregar: ");
				int cantProduct= reader.nextInt();
				reader.nextLine();
				for (int i = 0; i<cantProduct;i++){
					System.out.println("Product "+(i+1)+":");
					System.out.println("Digite el nombre del producto:");
					String name =reader.nextLine();
					System.out.println("digite el codigo del producto:");
					String code = reader.nextLine();
					System.out.println("Digite la cantidad de agua:");
					double water = reader.nextDouble();
					reader.nextLine();
					System.out.println("Numero de unidades del producto:");
					int quantityUnits = reader.nextInt();
					reader.nextLine();
					
					Product p = new Product(name,code,water,quantityUnits);
					if(user.verific(company) != null){
					 user.verific(company).add(p);
					} 
				}
			}
		}
	}
}
package rest_client_sb;


import WebServiceClient.WSSection;
import entity.Section;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

public class REST_Client_SB {
    
    private static WSSection clientSection = new WSSection();
    private static Scanner userInput = new Scanner(System.in);
    private static List<Section> sectionList = new ArrayList<>();
    private static Section section = new Section();
    private static String uInput = "";
    
    
    public static void findAllSections () {
        
        GenericType<List<Section>> gType = new GenericType<List<Section>>() {};
        Response response = clientSection.findAll_XML(Response.class);
        sectionList = response.readEntity(gType);
        
    }
    
    public static void findSectionById(String id) {
        
        GenericType<Section> gType = new GenericType<Section>() {};
        Response response = clientSection.find_XML(Response.class, id);
        section = response.readEntity(gType);
    }
    
    public static void findSectionByName(String name) {
        
        Section s = new Section();
        s.setName(name);
        GenericType<List<Section>> gType = new GenericType<List<Section>>() {};
        Response response = clientSection.findByEntity_XML(Response.class, s);
        sectionList = response.readEntity(gType);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("WELCOME TO THIS JAVA SE APPLICATION!\n");
        while(!uInput.equals("0")) {
            
            System.out.print("Select a choice from the menu below :)\n" + 
                    "1. Show all sections\n" + 
                    "2. Search for a specific section\n" + 
                    "3. Create a section\n" + 
                    "4. Update a section\n" + 
                    "5. Remove a section\n" + 
                    "0. Exit the application\n");
            
            uInput = userInput.next();
            
            switch(uInput){
                
                case "1" : 
                    findAllSections();
                    System.out.println("---------LIST OF SECTIONS---------\n");
                    for(Section s : sectionList) {
                        System.out.println(s);
                    }
                    System.out.println("---------END---------\n");
                    
                    break;
                    
                case "2" : 
                    System.out.print("Select an option\n" + 
                            "1.Search with an id\n" + 
                            "2.Search with a name\n");
                    String uInput2 = userInput.next();
                    switch(uInput2) {
                        
                        case "1" : 
                            System.out.println("Enter id : ");
                            String uInput21 = userInput.next();
                            findSectionById(uInput21);
                            System.out.println("---------RESULTS---------\n");
                            System.out.println(section);
                            System.out.println("---------END---------\n");
                            
                            break;
                        
                        case "2" : 
                            System.out.println("Enter name : ");
                            String uInput22 = userInput.next();
                            findSectionByName(uInput22);
                            System.out.println("---------RESULTS---------\n");
                            System.out.println(sectionList);
                            System.out.println("---------END---------\n");
                            
                            break;
                            
                        default:
                            System.out.print("In option 2 default case.");
                    }
                    
                    break;
                
                case "0" : 
                    System.out.print("Closing the application...\nGoodbye!\n");
                    break;
                    
                default :
                    System.out.print("in Default case");
            }
        
        
        }
    }
    
}

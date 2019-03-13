package rest_client_sb;


import WebServiceClient.WSPerson;
import WebServiceClient.WSSection;
import entity.Person;
import entity.Section;
import java.util.List;
import java.util.Scanner;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

public class REST_Client_SB {
    
    private static WSSection clientSection = new WSSection();
    private static WSPerson clientPerson = new WSPerson();
    private static Scanner userInput = new Scanner(System.in);
    private static String uInput = "";
    private static Section section = new Section();
    private static Person teacher = new Person();
    
    
    public static List<Section> findAllSections () {
        
        GenericType<List<Section>> gType = new GenericType<List<Section>>() {};
        Response response = clientSection.findAll_XML(Response.class);
        List<Section> sectionList = response.readEntity(gType);
        
        return sectionList;
        
    }
    
    public static Section findSectionById(String id) {
        
        GenericType<Section> gType = new GenericType<Section>() {};
        Response response = clientSection.find_XML(Response.class, id);
        Section section = response.readEntity(gType);
        
        return section;
    }
    
    public static List<Section> findSectionByName(String name) {
        
        Section s = new Section();
        s.setName(name);
        GenericType<List<Section>> gType = new GenericType<List<Section>>() {};
        Response response = clientSection.findByEntity_XML(Response.class, s);
        List<Section> sectionList = response.readEntity(gType);
        
        return sectionList;
    }
    
    public static Person findPersonById(String id) {
        
        GenericType<Person> gType = new GenericType<Person>() {};
        Response response = clientPerson.find_XML(Response.class, id);
        Person person = response.readEntity(gType);
        
        return person;
    }
    
    public static List<Person> findTeacherList() {
        
        GenericType<List<Person>> gType = new GenericType<List<Person>>() {};
        Response response = clientPerson.findTeacherList_XML(Response.class, true);
        List<Person> personList = response.readEntity(gType);
        
        return personList;
        
    }
    
    public static void create (Section s) {
        clientSection.create_XML(s);
    }
    
    public static void update (Section s) {
        clientSection.edit_XML(s, s.getSectionId().toString());
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("WELCOME TO THIS JAVA SE APPLICATION!\n");
        while(!uInput.equals("0")) {
            
            System.out.print("Select a choice from the menu below :)\n" + 
                    "1. Show all sections\n" + 
                    "2. Search a specific section\n" + 
                    "3. Create a section\n" + 
                    "4. Update a section\n" + 
                    "5. Remove a section\n" + 
                    "0. Exit the application\n");
            
            uInput = userInput.nextLine();
            
            switch(uInput){
                
                case "1" : 
                    System.out.println("---------LIST OF SECTIONS---------\n");
                    for(Section s : findAllSections()) {
                        System.out.println(s);
                    }
                    System.out.println("---------END---------\n");
                    
                    break;
                    
                case "2" : 
                    System.out.print("Select an option\n" + 
                            "1.Search with an id\n" + 
                            "2.Search with a name\n");
                    String uInput2 = userInput.nextLine();
                    switch(uInput2) {
                        
                        case "1" : 
                            System.out.println("Enter id : ");
                            String uInput21 = userInput.nextLine();
                            System.out.println("---------RESULTS---------\n");
                            System.out.println(findSectionById(uInput21));
                            System.out.println("---------END---------\n");
                            
                            break;
                        
                        case "2" : 
                            System.out.println("Enter name : ");
                            String uInput22 = userInput.nextLine();
                            System.out.println("---------RESULTS---------\n");
                            for(Section s : findSectionByName(uInput22)) {
                                System.out.println(s);
                            }
                            System.out.println("---------END---------\n");
                            
                            break;
                            
                        default:
                            System.out.print("In option 2 default case.");
                    }
                    
                    break;
                
                case "3" : 
                    section = new Section();
                    
                    System.out.print("Name of section : ");
                    String uInput3 = userInput.nextLine();
                    section.setName(uInput3);
                    
                    System.out.print("Teacher responsible for this section (id) : (type tList for a list of teachers)\n");
                    uInput3 = userInput.nextLine();
                    while("tList".equals(uInput3)) {
                        System.out.println("---------LIST OF TEACHERS---------\n");
                        for(Person p : findTeacherList()) {
                            System.out.println(p);
                        }
                        System.out.println("---------END---------\n");
                        System.out.print("Teacher responsible for this section (id) : ");
                        uInput3 = userInput.nextLine();
                    }
                    teacher = findPersonById(uInput3);
                    section.setTeacher(teacher);
                    
                    System.out.print("Description of section : ");
                    uInput3 = userInput.nextLine();
                    section.setDescription(uInput3);
                    
                    create(section);
                    
                    System.out.print("Section " + section.getName() + " was successfully added to the database!");
                                    
                    break;
                    
                case "4" : 
                    System.out.print("choose a section to update (id) : (type sList to see a list of all sections)\n");
                    String uInput4 = userInput.nextLine();
                    while("sList".equals(uInput4)){
                        System.out.println("---------LIST OF SECTIONS---------\n");
                        for(Section s : findAllSections()) {
                            System.out.println(s);
                        }
                        System.out.println("---------END---------\n");
                        System.out.print("choose a section to update (id) : ");
                        uInput4 = userInput.nextLine();
                    }
                    
                    section = findSectionById(uInput4);
                    
                    System.out.println("This is your section : \n" + 
                            "1. Name : " + section.getName() + "\n" + 
                            "2. Teacher : " + section.getTeacher()  + 
                            "3. Description : " + section.getDescription() + "\n" + 
                            "Which field do you want to change ? : ");
                    uInput4 = userInput.nextLine();
                    switch(uInput4) {
                        case "1" :
                            System.out.print("Enter a new name : ");
                            String uInput41 = userInput.nextLine();
                            section.setName(uInput41);
                            
                            break;
                        
                        case "2" :
                            System.out.print("Choose a new teacher (id) : (type tList to show a list of teachers)");
                            String uInput42 = userInput.nextLine();
                            while("tList".equals(uInput42)) {
                                System.out.println("---------LIST OF TEACHERS---------\n");
                                for(Person p : findTeacherList()) {
                                    System.out.println(p);
                                }
                                System.out.println("---------END---------\n");
                                System.out.print("Teacher responsible for this section (id) : ");
                                uInput42 = userInput.nextLine();
                            }
                            teacher = findPersonById(uInput42);
                            section.setTeacher(teacher);
                            
                            break;
                        
                        case "3" : 
                            System.out.print("Enter a new description : ");
                            String uInput43 = userInput.nextLine();
                            section.setDescription(uInput43);
                            
                            break;
                            
                        default : 
                            System.out.print("In uInput4 default case");
                    }
                    
                    update(section);
                    
                    
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

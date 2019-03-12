package rest_client_sb;

import WebServiceClient.WSSection;
import entity.Section;
import java.util.List;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

public class REST_Client_SB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WSSection client = new WSSection();
        GenericType<Section> gType = new GenericType<Section>() {
        };

        Response response = client.find_XML(Response.class, "6");
        Section section = response.readEntity(gType);
        
        System.out.println(section);
    }
    
}

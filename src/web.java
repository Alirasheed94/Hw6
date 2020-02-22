import java.util.ArrayList; 
import java.util.List; 
  
  
public class web implements Internet 
{ 
    private Internet internet = new connect(); 
    private static List<String> bannedSites; 
      
    static
    { 
        bannedSites = new ArrayList<String>(); 
        bannedSites.add("yahoo.com"); 
        bannedSites.add("wikipedia.com"); 
        bannedSites.add("facebook.com"); 
        bannedSites.add("twitter.com"); 
    } 
      
  
    public void connectTo(String serverhost) throws Exception 
    { 
        if(bannedSites.contains(serverhost.toLowerCase())) 
        { 
            throw new Exception("Access Denied"); 
        } 
          
        internet.connectTo(serverhost); 
    } 
  
} 
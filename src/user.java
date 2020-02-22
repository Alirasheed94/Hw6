public class user 
{ 
    public static void main (String[] args) 
    { 
        Internet internet = new web(); 
        try
        { 
            internet.connectTo("google.com"); 
            internet.connectTo("linkedin.com");
            internet.connectTo("yahoo.com"); 
        } 
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
    } 
} 
import java.io.File;
public class filec{
    public static void main(String[] args){
        
        try{
            File obj=new File("File4.txt");
            if(obj.createNewFile()){
                System.out.println("File created successfully");
            }
            
        }
        catch(Exception e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }
}
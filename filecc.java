import java.io.File;
public class filecc{
    public static void main(String[] args){
        
        try{
            File obj=new File("File5.txt");
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
import java.io.File;

public class Main {

    public static void main(String[] args){
        File file = new File("");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}
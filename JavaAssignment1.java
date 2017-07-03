import java.io.*;
import java.util.*;

public class JavaAssignment1 {

        static void findFilesPath(String pattern,String dir){
                File directory = new File(dir);
                File[] fList = directory.listFiles();
                if(fList != null){
                for (File file : fList) {
                        if (file.isFile() && (file.getName().matches(pattern))){
                                System.out.println(file.getAbsolutePath());
                        } else if (file.isDirectory()) {
                                findFilesPath(pattern,file.getAbsolutePath());
                        }
                }
                }
        }
        public static void main(String[] args) {
                Scanner  sc=new Scanner(System.in);
                while(true ){
                        System.out.println("enter the regular expression to find the files or enter exit to exit:");
                        String ex=sc.next();
                        if(ex.equals("exit")){
                                System.exit(0);
                                sc.close();
                        }
                        findFilesPath(ex,"/home");      
                }
        } 
}


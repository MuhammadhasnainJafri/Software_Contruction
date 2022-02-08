package main.java.student;

import java.io.*;


class FileHandling {

    public static void writeFile() {
        try{
            System.out.println("=====================WRITE FILE================");
            String str = "Muhammad Hasnain 19-arid-1254";
                FileWriter fw= new FileWriter("E:/file.txt");
                for (int i = 0; i < str.length(); i++)
                    fw.write(str.charAt(i));
      
                System.out.println("Successfully written");
      
                // close the file
                fw.close();
            
            
        }catch (IOException e)
        {
            System.out.println(e);
        }
    }

    public static void readFile() {
        System.out.println("=====================READ FILE================");

        try{
        int ch;
        FileReader fr = null;
        try {
            fr = new FileReader("E:/file.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }
        while ((ch = fr.read()) != -1)
            System.out.print((char) ch);
        fr.close();
    }catch(IOException e) {
        System.out.println(e);
    }
    }

    public static void main(String[] args) throws IOException {
        writeFile();
        readFile();
    }
}

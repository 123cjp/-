package File;

import java.io.File;
import java.io.IOException;

/**
 * @author 陈建平
 */
public class FileCreat {
    public static void main(String[] args) {

    }

    public void c1() throws Exception{
        String filepath = "E:\\JavaSeRevise\\news1.txt";
        File file = new File(filepath);
        file.createNewFile();
    }
    public void c2(){
        File file = new File("e:\\JavaSeRevise");
        String filename = "new2.txt";
        File file1 = new File(file, filename);
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void c3(){

    }
}


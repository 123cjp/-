package File;

import java.io.File;

/**
 * @author 陈建平
 */
public class FileInfrmation {
    public static void main(String[] args) {

    }

    public void info(){
        File file = new File("E:\\JavaSeRevise\\news1.txt");
        System.out.println(file.getName() + "文件名字" );
        System.out.println(file.getAbsoluteFile() + "文件绝对路径");
        System.out.println(file.getParent() + "文件父级目录");
        System.out.println(file.length()  + "文件大小");
    }
}

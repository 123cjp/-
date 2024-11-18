package File;

import java.io.File;

/**
 * @author 陈建平
 */
public class FIleDirectory {
    public static void main(String[] args) {

    }
    public void m1(){
        String path = "E:\\new1.txt";
        File file = new File(path);
        if(file.exists()){
            if(file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("不纯在");
        }
    }
    public void m2(){
        String path = "E:\\new1.txt";
        File file = new File(path);
        if(file.exists()){
            System.out.println("已存在");
        }else {
            System.out.println("不纯在");
            if(file.mkdir()){
                System.out.println("成功");
            }else {
                System. out.println("失败z");
            }
        }
    }

}

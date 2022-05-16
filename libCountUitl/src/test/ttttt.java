package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ttttt {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\wlx\\IdeaProjects\\untitled\\src\\test\\HelloWorld.java";

            File file = new File(filePath);
            Long filelength = file.length(); // 获取文件长度
            byte[] filecontent = new byte[filelength.intValue()];
            try {
                FileInputStream in =new FileInputStream(file);
                in .read(filecontent);
                in .close();
            } catch(FileNotFoundException e) {
                e.printStackTrace();
            } catch(IOException e) {
                e.printStackTrace();
            }

//        String[] fileContentArr = new String(filecontent).split("\r\n");
            String[] fileContentArr = new String(filecontent).split("hello world");

        String str = Arrays.toString(fileContentArr);
        System.out.println(str);



    }
}

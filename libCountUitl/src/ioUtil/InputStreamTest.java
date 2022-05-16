package ioUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import static java.lang.System.in;

public class InputStreamTest {
    //获取当前文件的内容
    public static String[] readToString(String filePath) {
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

        String[] fileContentArr = new String(filecontent).split("\r\n");
//        String[] fileContentArr = new String(filecontent).split("goodbye world");

        return fileContentArr; // 返回文件内容,默认编码
    }

//    返回文件的导包内容
    public static String newReadToString(String filePath) {
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

        String[] fileContentArr = new String(filecontent).split("\r\n");
//        String[] fileContentArr = new String(filecontent).split("goodbye world");
        String str = Arrays.toString(fileContentArr);
        int i = str.indexOf("public");
        String s = str.substring(0,i);

        return s;
    }
}


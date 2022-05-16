package ioUtil;

import java.util.Arrays;
import java.util.List;

public class FolderContextUtil {
    //获取文件夹下所有文件的内容
    public static String FolderContext(String FolderPath) {
        //获取文件夹下所有文件的路径
        List<String> folderPath = FolderPathUtil.getFilePath(FolderPath);
        //循环遍历文件内容，然后拼接
        StringBuffer fileContentArr = new StringBuffer();
        for (String str:folderPath) {
            fileContentArr.append(Arrays.toString(InputStreamTest.readToString(str)));
        }
        return fileContentArr.toString();
    }

    //获取文件夹下所有文件的导包内容
    public static String newFolderContext(String FolderPath) {
        //获取文件夹下所有文件的路径
        List<String> folderPath = FolderPathUtil.getFilePath(FolderPath);
        //循环遍历文件内容，然后拼接
        StringBuffer stringBuffer = new StringBuffer();
        for (String str:folderPath) {
            stringBuffer.append(InputStreamTest.newReadToString(str));
        }
        return stringBuffer.toString();
    }
}

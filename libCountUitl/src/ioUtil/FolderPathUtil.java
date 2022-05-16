package ioUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FolderPathUtil {
    // 获取文件夹下所有文件的路径
    public static List<String> getFilePath(String folderPath) {
        File folder = new File(folderPath);
        List<String> filePathList = new ArrayList<>();
        String rootPath;
        if (folder.exists()) {
            String[] fileNameList = folder.list();
            String str = Arrays.toString(fileNameList);
            if (null != fileNameList && fileNameList.length > 0 ) {
                if (folder.getPath().endsWith(File.separator)) {
                    rootPath = folder.getPath();
                } else {
                    rootPath = folder.getPath() + File.separator;
                }
                for (String fileName : fileNameList) {
                    filePathList.add(rootPath + fileName);
                }
            }
        }
        return filePathList;
    }

}

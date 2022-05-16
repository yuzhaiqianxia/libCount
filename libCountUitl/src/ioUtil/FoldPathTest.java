package ioUtil;

import java.util.Arrays;
import java.util.List;

//获取文件夹下所有文件路径测试
public class FoldPathTest {
    public static void main(String[] args) {
        List<String> foldPath = FolderPathUtil.getFilePath("C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\actions");
        System.out.println(foldPath);
    }
}

package ioUtil;

import java.util.Arrays;
import java.util.List;

public class FolderContextTest {
    public static void main(String[] args) {
        //    获取文件夹下所有文件内容测试
//        System.out.println( FolderContextUtil.FolderContext("C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\actions"));
//        System.out.println( FolderContextUtil.newFolderContext("C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\actions"));
        String str = FolderContextUtil.newFolderContext("C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\actions") ;
        String[] strlist = str.split(";");
//        System.out.println(Arrays.toString(strlist));
        List<String> list = Arrays.asList(strlist);
        System.out.println(list);
    }
}

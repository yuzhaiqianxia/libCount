package ioUtil;

public class SplitUtil {
//    传入java文件的内容，返回list，list元素是导入的jar包名
    public static String[] getLibNameAsList(String str){
//        截取public之前的内容
        int i = str.indexOf("public");
//        根据;分割，生成list
        String[] ss = str.split(";");
        return ss;
    }

    public static String[] newGetLibNameAsList(String str){
//        判断是否有public
        while (str.contains("public")){
            //        截取public之前的内容
            int i = str.indexOf("public");
            str.substring(0,i);
        }
//        截取public之前的内容
        int i = str.indexOf("public");
//        根据;分割，生成list
        String[] ss = str.split(";");
        return ss;
    }
}

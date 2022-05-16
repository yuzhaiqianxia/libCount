package ioUtil;

import java.util.Arrays;

//获取单个文件内容测试，同时在此文件中某个字符串出现次数
public class Test {
    public static void main(String[] args) {
        String fileContentArr = Arrays.toString(InputStreamTest.readToString("C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\service\\spring\\HrAnalysisAnnualServiceImp.java"));
        int i = fileContentArr.indexOf("public");
        String str = fileContentArr.substring(0, i);
//        System.out.println(str);
//        String[] ss = str.split("\\r\\n\\b|;");
        String[] ss = str.split(";");
//        System.out.println(Arrays.toString(ss));
        for (String str1:ss
             ) {
            System.out.println(str1.trim()+"213");
        }
//        System.out.println(ss.length);
//        System.out.println(fileContentArr);
//        DerepeatAndCount.show(fileContentArr,"import");
//        System.out.println(InputStreamTest.readToString("C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\actions\\HrAnalysisAnnualAction.java"));
    }
}

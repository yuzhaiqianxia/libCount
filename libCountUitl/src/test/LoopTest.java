package test;

import ioUtil.InputStreamTest;

import java.util.Arrays;

public class LoopTest {
    public static void main(String[] args) {
        String fileContentArr = Arrays.toString(InputStreamTest.readToString("C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\actions\\HrAnalysisAnnualAction.java"));
        StringBuffer stringBuffer = new StringBuffer();
        int i = fileContentArr.indexOf("import");

        while (fileContentArr.contains("import")){
            fileContentArr.substring(0,fileContentArr.indexOf("import"));
        }
        System.out.println(fileContentArr);
    }
}

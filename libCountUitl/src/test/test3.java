package test;

import ioUtil.InputStreamTest;

public class test3 implements Comparable{
    public static void main(String[] args) {
        String string = InputStreamTest.newReadToString("C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\service\\spring\\HrAnalysisAnnualServiceImp.java");
        System.out.println(string);

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

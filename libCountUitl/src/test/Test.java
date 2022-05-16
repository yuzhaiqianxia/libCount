package test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Test {
    Number n;
    public static void main(String[] args) {
//        String tostring = "5.0E8";
//        BigDecimal bd = new BigDecimal(tostring);
//        System.out.println(tostring);
//        System.out.println(new String(bd.toPlainString()));
//        System.out.println(new BigDecimal(tostring).toPlainString());
//        Double d = new Double("1234567890.12");
//        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");//格式化设置
//        System.out.println(decimalFormat.format(d));
//        System.out.println(d);

        Double d = 100000000000000D;
        double adf = 100000;
        System.out.println(d);
        System.out.println(d);
        System.out.println(d.toString());
        String s = new DecimalFormat("#,##0.00").format(d);
        System.out.println(s);

        BigDecimal bd = new BigDecimal(1000000000);
        boolean b = String.class.isInstance(bd.toPlainString());
        boolean a = String.class.isInstance((bd));
        System.out.println(b);
        System.out.println(a);
        System.out.println(bd);
        // 打印当前日期
        System.out.println();
    }
}

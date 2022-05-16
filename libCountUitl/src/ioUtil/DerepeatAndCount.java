package ioUtil;

import java.util.*;

public class DerepeatAndCount {
    //统计字符str2在字符str1中出现的次数
    public static int show(String str1,String str2) {
        String s1 = str1;
        String s2 = str2;
        // 获取原始字符串的长度
        int oldCount = s1.length();
        // 将 str2 替换为空之后字符串的长度
        int newCount = s1.replace(s2, "").length();
        // 获取统计的字符串str2的长度，出现的次数除以要统计字符串str2的长度就是str2出现的次数
//        System.out.println((oldCount - newCount) / s2.length());
        int count = (oldCount - newCount) / s2.length(); //str2出现的次数
        System.out.println(str2+"出现的次数："+count);
        return count;
    }

    public static int newShow(String str1,String str2) {
        String s1 = str1;
        String s2 = str2;
        // 获取原始字符串的长度
        int oldCount = s1.length();
        // 将 str2 替换为空之后字符串的长度
        int newCount = s1.replace(s2, "").length();
        // 获取统计的字符串str2的长度，出现的次数除以要统计字符串str2的长度就是str2出现的次数
//        System.out.println((oldCount - newCount) / s2.length());
        int count = (oldCount - newCount) / s2.length(); //str2出现的次数
        System.out.println(str2+"出现的次数："+count);
        return count;
    }


//	   统计List集合中每个元素出现的次数,同时舍弃不要的包名
    public static Map<String,Integer> frequencyOfListElements(List<String> items ) {
        if (items == null || items.size() == 0) {
            return null;
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String temp : items) {
            String replace = temp.replace(",", "").replace(" ", "").replace("import", "");
            if(replace.startsWith("com.landray.kmss") || replace.startsWith("java.")
                    || replace.startsWith("org.springframework.util") || replace.startsWith("javax.")
            || replace.startsWith("com.sunbor.web.tag") ||  replace.startsWith("org.apache.commons")){
                continue;
            }
            Integer count = map.get(replace);
            map.put(replace, (count == null) ? 1 : count + 1);
        }
        return map;
    }

//    map按照value从大到小排序
    public static Map sortByComparator(Map unsortMap){
        List list = new LinkedList(unsortMap.entrySet());
// System.out.println("list:"+list);
        Collections.sort(list, new Comparator()
        {
            @Override
            public int compare(Object o1, Object o2)
            {
                return ((Comparable) ((Map.Entry) (o2)).getValue())
                        .compareTo(((Map.Entry) (o1)).getValue());
            }
        });
        Map sortedMap = new LinkedHashMap();

        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry)it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;

    }

}

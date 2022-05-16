package ioUtil;

import java.util.*;

public class FinalTest {

    public static void main(String[] args) {
        String path1 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\forms";
        String path2 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\actions";
        String path3 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\ApplicationResources.properties";
        String path4 = "C:\\develop\\git-ekp-v16\\hr-ratify\\src";
        String str = FolderContextUtil.newFolderContext(path1) ;
        String[] strlist = str.split(";");
        List<String> list = Arrays.asList(strlist);
//        System.out.println(list);

//        统计List集合中每个元素出现的次数，同时舍弃不要的包名
        Map<String, Integer> map = DerepeatAndCount.frequencyOfListElements(list);


//        System.out.println(map);

//        map按照value从大到小排序
        Map map1 = DerepeatAndCount.sortByComparator(map);
//        System.out.println(map1);

//        遍历输出
        Set<String> s = map1.keySet();
        for (String key : s) {
            if (!key.contains("package")&&!key.contains("/")){
                System.out.println(key+":"+map.get(key));
            }
        }
    }

}
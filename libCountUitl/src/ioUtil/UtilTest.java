package ioUtil;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UtilTest {
    public static Map<String,Integer> mix(Map<String,Integer> map1, Map<String,Integer> map2) {
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                map2.put(key, map1.get(key) + map2.get(key));
            } else {
                map2.put(key, map1.get(key));
            }
        }
        return map2;
    }

    public static void hrAnalysis(){
        String hrAnalysisActions = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\actions";
        String hrAnalysisService = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\service\\spring";
        String hrAnalysisUtil = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\util";
        String str1 = FolderContextUtil.newFolderContext(hrAnalysisActions) ;
        String str2 = FolderContextUtil.newFolderContext(hrAnalysisService) ;
        String str3 = FolderContextUtil.newFolderContext(hrAnalysisUtil) ;
        String str = str1+str2+str3;
        String[] strlist = str.split(";");
        List<String> list = Arrays.asList(strlist);
        Map<String, Integer> map = DerepeatAndCount.frequencyOfListElements(list);
        Map map1 = DerepeatAndCount.sortByComparator(map);
        Set<String> s = map1.keySet();
        for (String key : s) {
            if (!key.contains("package")&&!key.contains("/")){
                System.out.println(key+":"+map.get(key));
            }
        }
    }

    public static void newAnalysis(){
        String hrAnalysisActions = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\actions";
        String hrAnalysisService = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\service\\spring";
        String hrAnalysisUtil = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\analysis\\util";

        String str1 = FolderContextUtil.newFolderContext(hrAnalysisActions) ;
        String str2 = FolderContextUtil.newFolderContext(hrAnalysisService) ;
        String str3 = FolderContextUtil.newFolderContext(hrAnalysisUtil) ;

        String[] strlist1 = str1.split(";");
        List<String> list1 = Arrays.asList(strlist1);
        String[] strlist2 = str2.split(";");
        List<String> list2 = Arrays.asList(strlist2);
        String[] strlist3 = str3.split(";");
        List<String> list3 = Arrays.asList(strlist3);

//        统计List集合中每个元素出现的次数，同时舍弃不要的包名
        Map<String, Integer> map1 = DerepeatAndCount.frequencyOfListElements(list1);
        Map<String, Integer> map2 = DerepeatAndCount.frequencyOfListElements(list2);
        Map<String, Integer> map3 = DerepeatAndCount.frequencyOfListElements(list3);
        //把map相加，key相同则value相加
        Map<String, Integer> conutMap = new HashMap<>();
        List<Map> mapList = new ArrayList<>();
        mapList.add(map1);
        mapList.add(map2);
        mapList.add(map3);
        for (Map m: mapList
        ) {
            conutMap = UtilTest.mix(conutMap,m);
        }
//        map按照value从大到小排序
        Map rankMap = DerepeatAndCount.sortByComparator(conutMap);


        //        遍历输出
        Set<String> s0 = rankMap.keySet();
        for (String key : s0) {
            if (!key.contains("package")&&!key.contains("/")){
                System.out.println(key+":"+conutMap.get(key));
            }
        }

    }

    public static void okr(){
        String path1 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\actions";
        String path2 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\constant";
        String path3 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\convertor";
        String path4 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\dao\\hibernate";
        String path5 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\forms";
        String path6 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\model";
        String path7 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\service\\spring";
        String path8 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\transfer";
        String path9 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\util";
        String path10 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\validator";
        String str1 = FolderContextUtil.newFolderContext(path10) ;
        String str2 = FolderContextUtil.newFolderContext(path2) ;
        String str3 = FolderContextUtil.newFolderContext(path3) ;
        String str4 = FolderContextUtil.newFolderContext(path4) ;
        String str5 = FolderContextUtil.newFolderContext(path5) ;
        String str6 = FolderContextUtil.newFolderContext(path6) ;
        String str7 = FolderContextUtil.newFolderContext(path7) ;
        String str8 = FolderContextUtil.newFolderContext(path8) ;
        String str9 = FolderContextUtil.newFolderContext(path9) ;
        String str10 = FolderContextUtil.newFolderContext(path10) ;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1);
        stringBuilder.append(str2);
        stringBuilder.append(str3);
        stringBuilder.append(str4);
        stringBuilder.append(str5);
        stringBuilder.append(str6);
        stringBuilder.append(str7);
        stringBuilder.append(str8);
        stringBuilder.append(str9);
        stringBuilder.append(str10);
//        String[] strlist = str.split(";");
        String[] strlist = stringBuilder.toString().split(";");
        List<String> list = Arrays.asList(strlist);
        Map<String, Integer> map = DerepeatAndCount.frequencyOfListElements(list);
        Map map1 = DerepeatAndCount.sortByComparator(map);
        Set<String> s = map1.keySet();
        for (String key : s) {
            if (!key.contains("package")&&!key.contains("/")){
                System.out.println(key+":"+map.get(key));
            }
        }
    }

    public static void newOkr(){
        String path1 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\actions";
        String path2 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\constant";
        String path3 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\convertor";
        String path4 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\dao\\hibernate";
//        String path5 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\forms";
//        String path6 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\model";
        String path7 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\service\\spring";
        String path8 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\transfer";
        String path9 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\util";
        String path10 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\okr\\validator";

        String str1 = FolderContextUtil.newFolderContext(path10) ;
        String str2 = FolderContextUtil.newFolderContext(path2) ;
        String str3 = FolderContextUtil.newFolderContext(path3) ;
        String str4 = FolderContextUtil.newFolderContext(path4) ;
//        String str5 = FolderContextUtil.newFolderContext(path5) ;
//        String str6 = FolderContextUtil.newFolderContext(path6) ;
        String str7 = FolderContextUtil.newFolderContext(path7) ;
        String str8 = FolderContextUtil.newFolderContext(path8) ;
        String str9 = FolderContextUtil.newFolderContext(path9) ;
        String str10 = FolderContextUtil.newFolderContext(path10) ;

        String[] strlist1 = str1.split(";");
        List<String> list1 = Arrays.asList(strlist1);

        String[] strlist2 = str2.split(";");
        List<String> list2 = Arrays.asList(strlist2);

        String[] strlist3 = str3.split(";");
        List<String> list3 = Arrays.asList(strlist3);

        String[] strlist4 = str4.split(";");
        List<String> list4 = Arrays.asList(strlist4);

//        String[] strlist5 = str5.split(";");
//        List<String> list5 = Arrays.asList(strlist5);

//        String[] strlist6 = str6.split(";");
//        List<String> list6 = Arrays.asList(strlist6);

        String[] strlist7 = str7.split(";");
        List<String> list7 = Arrays.asList(strlist7);

        String[] strlist8 = str8.split(";");
        List<String> list8 = Arrays.asList(strlist8);

        String[] strlist9 = str9.split(";");
        List<String> list9 = Arrays.asList(strlist9);

        String[] strlist10 = str10.split(";");
        List<String> list10 = Arrays.asList(strlist10);

//        统计List集合中每个元素出现的次数，同时舍弃不要的包名
        Map<String, Integer> map1 = DerepeatAndCount.frequencyOfListElements(list1);
        Map<String, Integer> map2 = DerepeatAndCount.frequencyOfListElements(list2);
        Map<String, Integer> map3 = DerepeatAndCount.frequencyOfListElements(list3);
        Map<String, Integer> map4 = DerepeatAndCount.frequencyOfListElements(list4);
//        Map<String, Integer> map5 = DerepeatAndCount.frequencyOfListElements(list5);
//        Map<String, Integer> map6 = DerepeatAndCount.frequencyOfListElements(list6);
        Map<String, Integer> map7 = DerepeatAndCount.frequencyOfListElements(list7);
        Map<String, Integer> map8 = DerepeatAndCount.frequencyOfListElements(list8);
        Map<String, Integer> map9 = DerepeatAndCount.frequencyOfListElements(list9);
        Map<String, Integer> map10 = DerepeatAndCount.frequencyOfListElements(list10);
        //把map相加，key相同则value相加
        Map<String, Integer> conutMap = new HashMap<>();
        List<Map> mapList = new ArrayList<>();
        mapList.add(map1);
        mapList.add(map2);
        mapList.add(map3);
        mapList.add(map4);
//        mapList.add(map5);
//        mapList.add(map6);
        mapList.add(map7);
        mapList.add(map8);
        mapList.add(map9);
        mapList.add(map10);
        for (Map m: mapList
        ) {
            conutMap = UtilTest.mix(conutMap,m);
        }
//        map按照value从大到小排序
        Map rankMap = DerepeatAndCount.sortByComparator(conutMap);


        //        遍历输出
        Set<String> s0 = rankMap.keySet();
        for (String key : s0) {
            if (!key.contains("package")&&!key.contains("/")){
                System.out.println(key+":"+conutMap.get(key));
            }
        }
    }

    public static void ratify(){
        String path1 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\ratify\\actions";
        String path2 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\ratify\\dao\\hibernate";
        String path3 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\ratify\\service\\spring";
        String path4 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\ratify\\subordinate";
        String path5 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\ratify\\transfer";
        String path6 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\ratify\\util";
        String path7 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\ratify\\validator";

        String str1 = FolderContextUtil.newFolderContext(path1) ;
        String str2 = FolderContextUtil.newFolderContext(path2) ;
        String str3 = FolderContextUtil.newFolderContext(path3) ;
        String str4 = FolderContextUtil.newFolderContext(path4) ;
        String str5 = FolderContextUtil.newFolderContext(path5) ;
        String str6 = FolderContextUtil.newFolderContext(path6) ;
        String str7 = FolderContextUtil.newFolderContext(path7) ;

        String[] strlist1 = str1.split(";");
        List<String> list1 = Arrays.asList(strlist1);

        String[] strlist2 = str2.split(";");
        List<String> list2 = Arrays.asList(strlist2);

        String[] strlist3 = str3.split(";");
        List<String> list3 = Arrays.asList(strlist3);

        String[] strlist4 = str4.split(";");
        List<String> list4 = Arrays.asList(strlist4);

        String[] strlist5 = str5.split(";");
        List<String> list5 = Arrays.asList(strlist5);

        String[] strlist6 = str6.split(";");
        List<String> list6 = Arrays.asList(strlist6);

        String[] strlist7 = str7.split(";");
        List<String> list7 = Arrays.asList(strlist7);



//        统计List集合中每个元素出现的次数，同时舍弃不要的包名
        Map<String, Integer> map1 = DerepeatAndCount.frequencyOfListElements(list1);
        Map<String, Integer> map2 = DerepeatAndCount.frequencyOfListElements(list2);
        Map<String, Integer> map3 = DerepeatAndCount.frequencyOfListElements(list3);
        Map<String, Integer> map4 = DerepeatAndCount.frequencyOfListElements(list4);
        Map<String, Integer> map5 = DerepeatAndCount.frequencyOfListElements(list5);
        Map<String, Integer> map6 = DerepeatAndCount.frequencyOfListElements(list6);
        Map<String, Integer> map7 = DerepeatAndCount.frequencyOfListElements(list7);

        //把map相加，key相同则value相加
        Map<String, Integer> conutMap = new HashMap<>();
        List<Map> mapList = new ArrayList<>();
        mapList.add(map1);
        mapList.add(map2);
        mapList.add(map3);
        mapList.add(map4);
        mapList.add(map5);
        mapList.add(map6);
        mapList.add(map7);

        for (Map m: mapList
        ) {
            conutMap = UtilTest.mix(conutMap,m);
        }

        conutMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(item->{

            if (!item.getKey().contains("package")&&!item.getKey().contains("/")){
                System.out.println(item.getKey()+":"+item.getValue());
            }
        });
//        map按照value从大到小排序
//        Map rankMap = DerepeatAndCount.sortByComparator(conutMap);
//
//
//        //        遍历输出
//        Set<String> s0 = rankMap.keySet();
//        for (String key : s0) {
//            if (!key.contains("package")&&!key.contains("/")){
//                System.out.println(key+":"+conutMap.get(key));
//            }
//        }
    }

    public static void organization(){
        String path1 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\organization\\actions";
        String path2 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\organization\\constant";
        String path3 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\organization\\dao\\hibernate";
        String path4 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\organization\\interfaces";
        String path5 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\organization\\mobile";
        String path6 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\organization\\oms";
        String path7 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\organization\\service\\spring";
        String path8 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\organization\\transfer";
        String path9 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\organization\\util";
        String path10 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\organization\\validator";

        String str1 = FolderContextUtil.newFolderContext(path1) ;
        String str2 = FolderContextUtil.newFolderContext(path2) ;
        String str3 = FolderContextUtil.newFolderContext(path3) ;
        String str4 = FolderContextUtil.newFolderContext(path4) ;
        String str5 = FolderContextUtil.newFolderContext(path5) ;
        String str6 = FolderContextUtil.newFolderContext(path6) ;
        String str7 = FolderContextUtil.newFolderContext(path7) ;
        String str8 = FolderContextUtil.newFolderContext(path8) ;
        String str9 = FolderContextUtil.newFolderContext(path9) ;
        String str10 = FolderContextUtil.newFolderContext(path10) ;

        String[] strlist1 = str1.split(";");
        List<String> list1 = Arrays.asList(strlist1);

        String[] strlist2 = str2.split(";");
        List<String> list2 = Arrays.asList(strlist2);

        String[] strlist3 = str3.split(";");
        List<String> list3 = Arrays.asList(strlist3);

        String[] strlist4 = str4.split(";");
        List<String> list4 = Arrays.asList(strlist4);

        String[] strlist5 = str5.split(";");
        List<String> list5 = Arrays.asList(strlist5);

        String[] strlist6 = str6.split(";");
        List<String> list6 = Arrays.asList(strlist6);

        String[] strlist7 = str7.split(";");
        List<String> list7 = Arrays.asList(strlist7);

        String[] strlist8 = str8.split(";");
        List<String> list8 = Arrays.asList(strlist8);

        String[] strlist9 = str9.split(";");
        List<String> list9 = Arrays.asList(strlist9);

        String[] strlist10 = str10.split(";");
        List<String> list10 = Arrays.asList(strlist10);

//        统计List集合中每个元素出现的次数，同时舍弃不要的包名
        Map<String, Integer> map1 = DerepeatAndCount.frequencyOfListElements(list1);
        Map<String, Integer> map2 = DerepeatAndCount.frequencyOfListElements(list2);
        Map<String, Integer> map3 = DerepeatAndCount.frequencyOfListElements(list3);
        Map<String, Integer> map4 = DerepeatAndCount.frequencyOfListElements(list4);
        Map<String, Integer> map5 = DerepeatAndCount.frequencyOfListElements(list5);
        Map<String, Integer> map6 = DerepeatAndCount.frequencyOfListElements(list6);
        Map<String, Integer> map7 = DerepeatAndCount.frequencyOfListElements(list7);
        Map<String, Integer> map8 = DerepeatAndCount.frequencyOfListElements(list8);
        Map<String, Integer> map9 = DerepeatAndCount.frequencyOfListElements(list9);
        Map<String, Integer> map10 = DerepeatAndCount.frequencyOfListElements(list10);
        //把map相加，key相同则value相加
        Map<String, Integer> conutMap = new HashMap<>();
        List<Map> mapList = new ArrayList<>();
        mapList.add(map1);
        mapList.add(map2);
        mapList.add(map3);
        mapList.add(map4);
        mapList.add(map5);
        mapList.add(map6);
        mapList.add(map7);
        mapList.add(map8);
        mapList.add(map9);
        mapList.add(map10);
        for (Map m: mapList
        ) {
            conutMap = UtilTest.mix(conutMap,m);
        }
        conutMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(item->{

            if (!item.getKey().contains("package")&&!item.getKey().contains("/")){
                System.out.println(item.getKey()+":"+item.getValue());
            }
        });
//        map按照value从大到小排序
//        Map rankMap = DerepeatAndCount.sortByComparator(conutMap);
//
//
//        //        遍历输出
//        Set<String> s0 = rankMap.keySet();
//        for (String key : s0) {
//            if (!key.contains("package")&&!key.contains("/")){
//                System.out.println(key+":"+conutMap.get(key));
//            }
//        }
    }

    public static void recruit(){
        String path1 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\recruit\\actions";
        String path2 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\recruit\\context";
        String path3 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\recruit\\dto";
        String path4 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\recruit\\lbpm";
        String path5 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\recruit\\service\\spring";
        String path6 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\recruit\\util";

        String str1 = FolderContextUtil.newFolderContext(path1) ;
        String str2 = FolderContextUtil.newFolderContext(path2) ;
        String str3 = FolderContextUtil.newFolderContext(path3) ;
        String str4 = FolderContextUtil.newFolderContext(path4) ;
        String str5 = FolderContextUtil.newFolderContext(path5) ;
        String str6 = FolderContextUtil.newFolderContext(path6) ;


        String[] strlist1 = str1.split(";");
        List<String> list1 = Arrays.asList(strlist1);

        String[] strlist2 = str2.split(";");
        List<String> list2 = Arrays.asList(strlist2);

        String[] strlist3 = str3.split(";");
        List<String> list3 = Arrays.asList(strlist3);

        String[] strlist4 = str4.split(";");
        List<String> list4 = Arrays.asList(strlist4);

        String[] strlist5 = str5.split(";");
        List<String> list5 = Arrays.asList(strlist5);

        String[] strlist6 = str6.split(";");
        List<String> list6 = Arrays.asList(strlist6);



//        统计List集合中每个元素出现的次数，同时舍弃不要的包名
        Map<String, Integer> map1 = DerepeatAndCount.frequencyOfListElements(list1);
        Map<String, Integer> map2 = DerepeatAndCount.frequencyOfListElements(list2);
        Map<String, Integer> map3 = DerepeatAndCount.frequencyOfListElements(list3);
        Map<String, Integer> map4 = DerepeatAndCount.frequencyOfListElements(list4);
        Map<String, Integer> map5 = DerepeatAndCount.frequencyOfListElements(list5);
        Map<String, Integer> map6 = DerepeatAndCount.frequencyOfListElements(list6);

        //把map相加，key相同则value相加
        Map<String, Integer> conutMap = new HashMap<>();
        List<Map> mapList = new ArrayList<>();
        mapList.add(map1);
        mapList.add(map2);
        mapList.add(map3);
        mapList.add(map4);
        mapList.add(map5);
        mapList.add(map6);

        for (Map m: mapList
        ) {
            conutMap = UtilTest.mix(conutMap,m);
        }
//        map按照value从大到小排序
        Map rankMap = DerepeatAndCount.sortByComparator(conutMap);


        //        遍历输出
        Set<String> s0 = rankMap.keySet();
        for (String key : s0) {
            if (!key.contains("package")&&!key.contains("/")){
                System.out.println(key+":"+conutMap.get(key));
            }
        }
    }

    public static void salary(){
        String path1 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\salary\\actions";
        String path2 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\salary\\commands\\strategy";
        String path3 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\salary\\forms";
        String path4 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\salary\\service\\spring";
        String path5 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\salary\\transfer";
        String path6 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\salary\\util";


        String str1 = FolderContextUtil.newFolderContext(path1) ;
        String str2 = FolderContextUtil.newFolderContext(path2) ;
        String str3 = FolderContextUtil.newFolderContext(path3) ;
        String str4 = FolderContextUtil.newFolderContext(path4) ;
        String str5 = FolderContextUtil.newFolderContext(path5) ;
        String str6 = FolderContextUtil.newFolderContext(path6) ;


        String[] strlist1 = str1.split(";");
        List<String> list1 = Arrays.asList(strlist1);

        String[] strlist2 = str2.split(";");
        List<String> list2 = Arrays.asList(strlist2);

        String[] strlist3 = str3.split(";");
        List<String> list3 = Arrays.asList(strlist3);

        String[] strlist4 = str4.split(";");
        List<String> list4 = Arrays.asList(strlist4);

        String[] strlist5 = str5.split(";");
        List<String> list5 = Arrays.asList(strlist5);

        String[] strlist6 = str6.split(";");
        List<String> list6 = Arrays.asList(strlist6);



//        统计List集合中每个元素出现的次数，同时舍弃不要的包名
        Map<String, Integer> map1 = DerepeatAndCount.frequencyOfListElements(list1);
        Map<String, Integer> map2 = DerepeatAndCount.frequencyOfListElements(list2);
        Map<String, Integer> map3 = DerepeatAndCount.frequencyOfListElements(list3);
        Map<String, Integer> map4 = DerepeatAndCount.frequencyOfListElements(list4);
        Map<String, Integer> map5 = DerepeatAndCount.frequencyOfListElements(list5);
        Map<String, Integer> map6 = DerepeatAndCount.frequencyOfListElements(list6);

        //把map相加，key相同则value相加
        Map<String, Integer> conutMap = new HashMap<>();
        List<Map> mapList = new ArrayList<>();
        mapList.add(map1);
        mapList.add(map2);
        mapList.add(map3);
        mapList.add(map4);
        mapList.add(map5);
        mapList.add(map6);

        for (Map m: mapList
        ) {
            conutMap = UtilTest.mix(conutMap,m);
        }

        conutMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(item->{

            if (!item.getKey().contains("package")&&!item.getKey().contains("/")){
                System.out.println(item.getKey()+":"+item.getValue());
            }
        });
//        map按照value从大到小排序
//        Map rankMap = DerepeatAndCount.sortByComparator(conutMap);
//
//
//        //        遍历输出
//        Set<String> s0 = rankMap.keySet();
//        for (String key : s0) {
//            if (!key.contains("package")&&!key.contains("/")){
//                System.out.println(key+":"+conutMap.get(key));
//            }
//        }
    }

    public static void staff(){
        String path1 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\staff\\actions";
        String path2 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\staff\\dao\\hibernate";
        String path3 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\staff\\event";
        String path4 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\staff\\forms";
        String path5 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\staff\\service\\spring";
        String path6 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\staff\\service\\robot";
        String path7 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\staff\\service\\tag";
        String path8 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\staff\\subordinate";
        String path9 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\staff\\transfer";
        String path10 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\staff\\util";
        String path11 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\hr\\staff\\webservice";

        String str1 = FolderContextUtil.newFolderContext(path1) ;
        String str2 = FolderContextUtil.newFolderContext(path2) ;
        String str3 = FolderContextUtil.newFolderContext(path3) ;
        String str4 = FolderContextUtil.newFolderContext(path4) ;
        String str5 = FolderContextUtil.newFolderContext(path5) ;
        String str6 = FolderContextUtil.newFolderContext(path6) ;
        String str7 = FolderContextUtil.newFolderContext(path7) ;
        String str8 = FolderContextUtil.newFolderContext(path8) ;
        String str9 = FolderContextUtil.newFolderContext(path9) ;
        String str10 = FolderContextUtil.newFolderContext(path10) ;
        String str11 = FolderContextUtil.newFolderContext(path11) ;

        String[] strlist1 = str1.split(";");
        List<String> list1 = Arrays.asList(strlist1);

        String[] strlist2 = str2.split(";");
        List<String> list2 = Arrays.asList(strlist2);

        String[] strlist3 = str3.split(";");
        List<String> list3 = Arrays.asList(strlist3);

        String[] strlist4 = str4.split(";");
        List<String> list4 = Arrays.asList(strlist4);

        String[] strlist5 = str5.split(";");
        List<String> list5 = Arrays.asList(strlist5);

        String[] strlist6 = str6.split(";");
        List<String> list6 = Arrays.asList(strlist6);

        String[] strlist7 = str7.split(";");
        List<String> list7 = Arrays.asList(strlist7);

        String[] strlist8 = str8.split(";");
        List<String> list8 = Arrays.asList(strlist8);

        String[] strlist9 = str9.split(";");
        List<String> list9 = Arrays.asList(strlist9);

        String[] strlist10 = str10.split(";");
        List<String> list10 = Arrays.asList(strlist10);

        String[] strlist11 = str11.split(";");
        List<String> list11 = Arrays.asList(strlist11);

//        统计List集合中每个元素出现的次数，同时舍弃不要的包名
        Map<String, Integer> map1 = DerepeatAndCount.frequencyOfListElements(list1);
        Map<String, Integer> map2 = DerepeatAndCount.frequencyOfListElements(list2);
        Map<String, Integer> map3 = DerepeatAndCount.frequencyOfListElements(list3);
        Map<String, Integer> map4 = DerepeatAndCount.frequencyOfListElements(list4);
        Map<String, Integer> map5 = DerepeatAndCount.frequencyOfListElements(list5);
        Map<String, Integer> map6 = DerepeatAndCount.frequencyOfListElements(list6);
        Map<String, Integer> map7 = DerepeatAndCount.frequencyOfListElements(list7);
        Map<String, Integer> map8 = DerepeatAndCount.frequencyOfListElements(list8);
        Map<String, Integer> map9 = DerepeatAndCount.frequencyOfListElements(list9);
        Map<String, Integer> map10 = DerepeatAndCount.frequencyOfListElements(list10);
        Map<String, Integer> map11 = DerepeatAndCount.frequencyOfListElements(list11);
        //把map相加，key相同则value相加
        Map<String, Integer> conutMap = new HashMap<>();
        List<Map> mapList = new ArrayList<>();
        mapList.add(map1);
        mapList.add(map2);
        mapList.add(map3);
        mapList.add(map4);
        mapList.add(map5);
        mapList.add(map6);
        mapList.add(map7);
        mapList.add(map8);
        mapList.add(map9);
        mapList.add(map10);
        mapList.add(map11);
        for (Map m: mapList
        ) {
            conutMap = UtilTest.mix(conutMap,m);
        }

        conutMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(item->{

            if (!item.getKey().contains("package")&&!item.getKey().contains("/")){
                System.out.println(item.getKey()+":"+item.getValue());
            }
        });
//
////        map按照value从大到小排序
//        Map rankMap = DerepeatAndCount.sortByComparator(conutMap);
//

        //        遍历输出
//        Set<String> s0 = rankMap.keySet();
//        for (String key : s0) {
//            if (!key.contains("package")&&!key.contains("/")){
//                System.out.println(key+":"+conutMap.get(key));
//            }
//        }
    }

//    排班管理
    public static void time(){
        String path1 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\sys\\time\\actions";
        String path2 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\sys\\time\\dao\\hibernate";
        String path3 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\sys\\time\\forms";
        String path4 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\sys\\time\\handover";
        String path5 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\sys\\time\\interfaces";
        String path6 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\sys\\time\\service\\spring";
        String path7 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\sys\\time\\service\\rule";
        String path8 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\sys\\time\\service\\business";
        String path9 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\sys\\time\\transfer";
        String path10 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\sys\\time\\util";

        String str1 = FolderContextUtil.newFolderContext(path1) ;
        String str2 = FolderContextUtil.newFolderContext(path2) ;
        String str3 = FolderContextUtil.newFolderContext(path3) ;
        String str4 = FolderContextUtil.newFolderContext(path4) ;
        String str5 = FolderContextUtil.newFolderContext(path5) ;
        String str6 = FolderContextUtil.newFolderContext(path6) ;
        String str7 = FolderContextUtil.newFolderContext(path7) ;
        String str8 = FolderContextUtil.newFolderContext(path8) ;
        String str9 = FolderContextUtil.newFolderContext(path9) ;
        String str10 = FolderContextUtil.newFolderContext(path10) ;

        String[] strlist1 = str1.split(";");
        List<String> list1 = Arrays.asList(strlist1);

        String[] strlist2 = str2.split(";");
        List<String> list2 = Arrays.asList(strlist2);

        String[] strlist3 = str3.split(";");
        List<String> list3 = Arrays.asList(strlist3);

        String[] strlist4 = str4.split(";");
        List<String> list4 = Arrays.asList(strlist4);

        String[] strlist5 = str5.split(";");
        List<String> list5 = Arrays.asList(strlist5);

        String[] strlist6 = str6.split(";");
        List<String> list6 = Arrays.asList(strlist6);

        String[] strlist7 = str7.split(";");
        List<String> list7 = Arrays.asList(strlist7);

        String[] strlist8 = str8.split(";");
        List<String> list8 = Arrays.asList(strlist8);

        String[] strlist9 = str9.split(";");
        List<String> list9 = Arrays.asList(strlist9);

        String[] strlist10 = str10.split(";");
        List<String> list10 = Arrays.asList(strlist10);

//        统计List集合中每个元素出现的次数，同时舍弃不要的包名
        Map<String, Integer> map1 = DerepeatAndCount.frequencyOfListElements(list1);
        Map<String, Integer> map2 = DerepeatAndCount.frequencyOfListElements(list2);
        Map<String, Integer> map3 = DerepeatAndCount.frequencyOfListElements(list3);
        Map<String, Integer> map4 = DerepeatAndCount.frequencyOfListElements(list4);
        Map<String, Integer> map5 = DerepeatAndCount.frequencyOfListElements(list5);
        Map<String, Integer> map6 = DerepeatAndCount.frequencyOfListElements(list6);
        Map<String, Integer> map7 = DerepeatAndCount.frequencyOfListElements(list7);
        Map<String, Integer> map8 = DerepeatAndCount.frequencyOfListElements(list8);
        Map<String, Integer> map9 = DerepeatAndCount.frequencyOfListElements(list9);
        Map<String, Integer> map10 = DerepeatAndCount.frequencyOfListElements(list10);
        //把map相加，key相同则value相加
        Map<String, Integer> conutMap = new HashMap<>();
        List<Map> mapList = new ArrayList<>();
        mapList.add(map1);
        mapList.add(map2);
        mapList.add(map3);
        mapList.add(map4);
        mapList.add(map5);
        mapList.add(map6);
        mapList.add(map7);
        mapList.add(map8);
        mapList.add(map9);
        mapList.add(map10);
        for (Map m: mapList
        ) {
            conutMap = UtilTest.mix(conutMap,m);
        }
        conutMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(item->{

            if (!item.getKey().contains("package")&&!item.getKey().contains("/")){
                System.out.println(item.getKey()+":"+item.getValue());
            }
        });
//        map按照value从大到小排序
//        Map rankMap = DerepeatAndCount.sortByComparator(conutMap);
//
//
//        //        遍历输出
//        Set<String> s0 = rankMap.keySet();
//        for (String key : s0) {
//            if (!key.contains("package")&&!key.contains("/")){
//                System.out.println(key+":"+conutMap.get(key));
//            }
//        }
    }

//    test
    public static void test(){
        String path1 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\km\\resource\\actions";
        String path2 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\km\\resource\\handover";
        String path3 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\km\\resource\\service\\spring";
        String path4 = "";
        String path5 = "";
        String path6 = "";
        String path7 = "";
        String path8 = "";
        String path9 = "";
        String path10 = "";
        String path11 = "";
        String path12 = "";


    String str1 = FolderContextUtil.newFolderContext(path1) ;
    String str2 = FolderContextUtil.newFolderContext(path2) ;
    String str3 = FolderContextUtil.newFolderContext(path3) ;
    String str4 = FolderContextUtil.newFolderContext(path4) ;
    String str5 = FolderContextUtil.newFolderContext(path5) ;
    String str6 = FolderContextUtil.newFolderContext(path6) ;
    String str7 = FolderContextUtil.newFolderContext(path7) ;
    String str8 = FolderContextUtil.newFolderContext(path8) ;
    String str9 = FolderContextUtil.newFolderContext(path9) ;
    String str10 = FolderContextUtil.newFolderContext(path10) ;
    String str11 = FolderContextUtil.newFolderContext(path11) ;
    String str12 = FolderContextUtil.newFolderContext(path12) ;


    String[] strlist1 = str1.split(";");
    List<String> list1 = Arrays.asList(strlist1);

    String[] strlist2 = str2.split(";");
    List<String> list2 = Arrays.asList(strlist2);

    String[] strlist3 = str3.split(";");
    List<String> list3 = Arrays.asList(strlist3);

    String[] strlist4 = str4.split(";");
    List<String> list4 = Arrays.asList(strlist4);

    String[] strlist5 = str5.split(";");
    List<String> list5 = Arrays.asList(strlist5);

    String[] strlist6 = str6.split(";");
    List<String> list6 = Arrays.asList(strlist6);

    String[] strlist7 = str7.split(";");
    List<String> list7 = Arrays.asList(strlist7);

    String[] strlist8 = str8.split(";");
    List<String> list8 = Arrays.asList(strlist8);

    String[] strlist9 = str9.split(";");
    List<String> list9 = Arrays.asList(strlist9);

    String[] strlist10 = str10.split(";");
    List<String> list10 = Arrays.asList(strlist10);

        String[] strlist11 = str11.split(";");
        List<String> list11 = Arrays.asList(strlist11);

        String[] strlist12 = str12.split(";");
        List<String> list12 = Arrays.asList(strlist12);



//        统计List集合中每个元素出现的次数，同时舍弃不要的包名
    Map<String, Integer> map1 = DerepeatAndCount.frequencyOfListElements(list1);
    Map<String, Integer> map2 = DerepeatAndCount.frequencyOfListElements(list2);
    Map<String, Integer> map3 = DerepeatAndCount.frequencyOfListElements(list3);
    Map<String, Integer> map4 = DerepeatAndCount.frequencyOfListElements(list4);
    Map<String, Integer> map5 = DerepeatAndCount.frequencyOfListElements(list5);
    Map<String, Integer> map6 = DerepeatAndCount.frequencyOfListElements(list6);
    Map<String, Integer> map7 = DerepeatAndCount.frequencyOfListElements(list7);
    Map<String, Integer> map8 = DerepeatAndCount.frequencyOfListElements(list8);
    Map<String, Integer> map9 = DerepeatAndCount.frequencyOfListElements(list9);
    Map<String, Integer> map10 = DerepeatAndCount.frequencyOfListElements(list10);
    Map<String, Integer> map11 = DerepeatAndCount.frequencyOfListElements(list11);
    Map<String, Integer> map12 = DerepeatAndCount.frequencyOfListElements(list12);
    //把map相加，key相同则value相加
    Map<String, Integer> conutMap = new HashMap<>();
    List<Map> mapList = new ArrayList<>();
    mapList.add(map1);
    mapList.add(map2);
    mapList.add(map3);
    mapList.add(map4);
    mapList.add(map5);
    mapList.add(map6);
    mapList.add(map7);
    mapList.add(map8);
    mapList.add(map9);
    mapList.add(map10);
    mapList.add(map11);
    mapList.add(map12);

    for (Map m: mapList
    ) {
        conutMap = UtilTest.mix(conutMap,m);
    }
    conutMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(item->{

        if (!item.getKey().contains("package")&&!item.getKey().contains("/")){
            System.out.println(item.getKey()+":"+item.getValue());
        }
    });
//        map按照value从大到小排序
//        Map rankMap = DerepeatAndCount.sortByComparator(conutMap);
//
//
//        //        遍历输出
//        Set<String> s0 = rankMap.keySet();
//        for (String key : s0) {
//            if (!key.contains("package")&&!key.contains("/")){
//                System.out.println(key+":"+conutMap.get(key));
//            }
//        }
}

//    车辆管理carmng
    public static void carmng(){
        String path1 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\km\\carmng\\actions";
        String path2 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\km\\carmng\\context";
        String path3 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\km\\carmng\\dao\\hibernate";
        String path4 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\km\\carmng\\service\\spring";
        String path5 = "C:\\develop\\git-ekp-v16\\ekp_v16\\src\\com\\landray\\kmss\\km\\carmng\\transfer";


    String str1 = FolderContextUtil.newFolderContext(path1) ;
    String str2 = FolderContextUtil.newFolderContext(path2) ;
    String str3 = FolderContextUtil.newFolderContext(path3) ;
    String str4 = FolderContextUtil.newFolderContext(path4) ;
    String str5 = FolderContextUtil.newFolderContext(path5) ;


    String[] strlist1 = str1.split(";");
    List<String> list1 = Arrays.asList(strlist1);

    String[] strlist2 = str2.split(";");
    List<String> list2 = Arrays.asList(strlist2);

    String[] strlist3 = str3.split(";");
    List<String> list3 = Arrays.asList(strlist3);

    String[] strlist4 = str4.split(";");
    List<String> list4 = Arrays.asList(strlist4);

    String[] strlist5 = str5.split(";");
    List<String> list5 = Arrays.asList(strlist5);



//        统计List集合中每个元素出现的次数，同时舍弃不要的包名
    Map<String, Integer> map1 = DerepeatAndCount.frequencyOfListElements(list1);
    Map<String, Integer> map2 = DerepeatAndCount.frequencyOfListElements(list2);
    Map<String, Integer> map3 = DerepeatAndCount.frequencyOfListElements(list3);
    Map<String, Integer> map4 = DerepeatAndCount.frequencyOfListElements(list4);
    Map<String, Integer> map5 = DerepeatAndCount.frequencyOfListElements(list5);

    //把map相加，key相同则value相加
    Map<String, Integer> conutMap = new HashMap<>();
    List<Map> mapList = new ArrayList<>();
    mapList.add(map1);
    mapList.add(map2);
    mapList.add(map3);
    mapList.add(map4);
    mapList.add(map5);

    for (Map m: mapList
    ) {
        conutMap = UtilTest.mix(conutMap,m);
    }
    conutMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(item->{

        if (!item.getKey().contains("package")&&!item.getKey().contains("/")){
            System.out.println(item.getKey()+":"+item.getValue());
        }
    });
//        map按照value从大到小排序
//        Map rankMap = DerepeatAndCount.sortByComparator(conutMap);
//
//
//        //        遍历输出
//        Set<String> s0 = rankMap.keySet();
//        for (String key : s0) {
//            if (!key.contains("package")&&!key.contains("/")){
//                System.out.println(key+":"+conutMap.get(key));
//            }
//        }
    }
    public static void main(String[] args) {
//        hrAnalysis();
//        System.out.println("---");
//        newAnalysis();
//        newOkr();
//        organization();//人事组织架构
//        ratify();//人事流程
//        recruit();//招聘管理
//        salary();
//        staff();
//        time();
//        attend();
        test();
    }
}

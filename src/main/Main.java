package main;

import java.util.*;

/**
 * Hello World!
 *
 * @author Xusen
 * @create 2018/8/24
 * @since 1.0.0
 */
public class Main extends Thread{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("徐");
        list.add("徐");
        list.add("森");
        list.add("森");
        list.add("xu");
        list.add("xu");
        list.add("sen");
        list.add("sen");
        System.out.println(deleteAppoint(list));
    }

    /**
     * List集合如何去重
     */
    private static String deletRepeatList(List<String> list){
        //定义一个新的集合放置去重后的数据
        List newList = new ArrayList();
        //使用Set数据不重复的机制处理
        Set set = new HashSet();
        set.addAll(list);
        newList.addAll(set);
        return newList.toString();
    }

    /**
     * List集合如何删除指定元素
     */
    private static String deleteAppoint(List<String> list){
        //使用List中的迭代器Iterator
        Iterator<String> it = list.iterator();
        //使用while方式遍历,先判断是否还有数据，然后判断其中的数据是否符合条件
        while (it.hasNext()){
            String str = it.next();
            if("xu".equals(str)){
                it.remove();
            }
        }
        return list.toString();
    }

    /**
     * List集合如何排序
     */
    private static void sortList(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(8);
        list.add(4);
        list.add(5);
        //正序排(从小到大)
        Collections.sort(list);
        System.out.println(list.toString());
        //倒叙排(从大到小)
        Collections.reverse(list);
        System.out.println(list.toString());
    }

    @Override
    public void run() {
        super.run();
    }
}

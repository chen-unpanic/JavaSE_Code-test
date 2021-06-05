import java.util.ArrayList;

public class xx136_1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        System.out.println(al);
        // remove删除指定元素，返回删除是否成功
        /*System.out.println(al.remove("a"));
        System.out.println(al);
        System.out.println(al.remove("e"));
        System.out.println(al);
*/
        //remove(index)删除指定处元素，返回被删除的元素
       /* System.out.println(al.remove(1));
        System.out.println(al);*/

        //set(index,element)修改指定索引处的元素，返回被修改的元素
        /*System.out.println(al.set(1,"我爱编程"));
        System.out.println(al);*/

        //get返回指定处元素值
        /*System.out.println(al.get(2));
        System.out.println(al);*/

        //返回元素个数
        System.out.println(al.size());
        System.out.println(al);
    }
}

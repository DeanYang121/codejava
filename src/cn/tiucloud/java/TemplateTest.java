package cn.tiucloud.java;

import cn.tiucloud.bean.Customer;

import java.util.ArrayList;

/**
 * @author dean
 * @create 2018/11/9 - 19:32
 * IEDA 中代码模板的位置，editor--》live template/postfix templates
 * 1.常用的模板
 * psvm
 * sout
 */
public class TemplateTest {
    //模板六：prsf 生成private static final  没有这个命令 alt +enter 依赖添加
    //变形 psf
    //变形 psfi
    //变形 psfs
    private static final Customer CUST = new Customer();
    public static final int NUM = 1;
    public static final int NUM2 = 1;
    public static final String Nation ="China";


    public static void main(String[] args) {
        System.out.println("hello");
        //sout变形：soutp/soutm/soutv/xxx.sout
        //模板三：fori
        String[] arr = new String[]{"Tom", "Jerray", "lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            //模板三变形：iter
            for (String s : arr) {
                System.out.println(s);
            }
            //模板三变形：itar
            for (int j = 0; j < arr.length; j++) {
                String s = arr[j];
                System.out.println(s);
            }
        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(456);
        for (Object o : list) {

        }
        //变形 list.fori 从头到尾遍历
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形 list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        //模板五：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn / xxx.null
        if (list == null) {

        }
        if (list != null) {

        }

    }

}

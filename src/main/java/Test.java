import util.MD5Util;

/**
 * @author liuwei
 * @date 2018/1/3
 */
public class Test {
    public static void main(String[] args){
        System.out.println(MD5Util.sign("xxxx", "123"));
        System.out.println(MD5Util.verify("xxxx", "848cb286559d2ad04227afd83c6bbe6a", "123"));
    }
}

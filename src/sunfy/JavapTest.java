package sunfy;

/**
 * @Author： sunfy
 * @Date: Created in 11:18 2019-7-26
 */
public class JavapTest {

    public int test(){
        int a = 1;
        int b = 2;
        int c = (a+b)*4;
        return c;
    }

    public static void main(String[] args) {
        JavapTest javapTest = new JavapTest();
        javapTest.test();
        System.out.println("测试通过");
    }
}

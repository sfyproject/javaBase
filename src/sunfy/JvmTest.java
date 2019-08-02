package sunfy;

import java.util.ArrayList;

/**
 * @Author： sunfy
 * @Date: Created in 10:39 2019-7-26
 */
public class JvmTest {

    byte[] bate = new byte[1024*1000]; // 100KB

    public static void main(String[] args) throws InterruptedException {
        ArrayList<JvmTest> jvmTests = new ArrayList<>();
        while (true){
            jvmTests.add(new JvmTest());
            Thread.sleep(50);
        }
    }
}

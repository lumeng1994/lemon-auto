import org.testng.annotations.Test;

public class TestCaseC {

    /**
     * 是根据ascii来执行的 谁的ascii小就先执行谁
     * 方法名1~4顺序执行(字母也是)，不是代码从上到下执行
     * case和case最好不要相互依赖
     */
    @Test
    public void testCase2(){
        System.out.println("testCase2");
    }
    @Test
    public void testCase1(){
        System.out.println("testCase1");
    }
    @Test
    public void testCase4(){
        System.out.println("testCase4");
    }
}

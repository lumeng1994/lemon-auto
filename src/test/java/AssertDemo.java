import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
    String str = "true";
    String str1 = "false";
    String str3 = "true";
    String str4 = "";
    String str5 = null;

    /**
     * 相等
     */
    @Test
    public void test(){
        Assert.assertEquals(str,str1,"实际值 true != 期望值 false");
//        Assert.assertEquals(str,str3,"实际值 true == 期望值 ");
    }

    public void test1(){
        if(str.equals(str3)){
            System.out.println("正确 ~");
        }else{
            System.out.println("错误~");
        }
    }

    /**
     * 不相等
     */
    @Test
    public void test3(){
//        Assert.assertNotEquals(str,str1,"不等~");
        Assert.assertNotEquals(str,str3,"相等~");
    }

    @Test
    public void test4(){
    Assert.assertNotNull(str5);
    }
    @Test
    public void test5(){
    Assert.assertNull(str5);
    }

}

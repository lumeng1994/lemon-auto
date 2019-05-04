import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestDemo {

    //注释执行顺序

    @AfterSuite
    public void test6(){
        System.out.println("这是一个afterSuite");
    }
    @BeforeSuite
    public void test7(){
        System.out.println("这是一个beforeSuite");
    }
    @BeforeClass
    public void test8(){
        System.out.println("这是一个beforeClass");
    }
    @AfterClass
    public void test9(){
        System.out.println("这是一个AfterClass");
    }
    @BeforeTest
    public void test1(){
        System.out.println("这是一个beforeTest");
    }

    @BeforeMethod
    public void test2(){
        System.out.println("这是一个beforeMethod");
    }

    @Test
    public void test3(){
        System.out.println("这是一个test");
    }

    @AfterMethod
    public void test4(){
        System.out.println("这是一个afterMethod");
    }

    @AfterTest
    public void test5(){
        System.out.println("这个是一个afterTest");
    }
}

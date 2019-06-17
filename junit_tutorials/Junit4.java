package com.iquantex.omsv2.junit_tutorials;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @Author liko
 * @Date 2019/6/13
 * @Version 1.0
 * @Description Junit4
 */
public class Junit4 {

    /**
     * @BeforClass -> 测试类启动时执行一次
     *  - 方法必须是静态的
     */
    @BeforeClass
    public static void setUp() {
        System.out.println("@BeforeClass - setUp");
    }

    /**
     * @Test(expected = ArithmeticException.class) 异常测试
     *  - 预期代码中会抛出的异常
     */
    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1 / 0;
    }

    /**
     * @Ignore 忽略测试
     *  - 不执行这个测试方法
     */
    @Ignore("ignore method not ready to run.")
    @Test
    public void ignore() {
        throw new RuntimeException("Method will not be executed!");
    }

    /**
     * @Test(timeout = 1000) 耗时测试
     *  - 如果一个单元测试运行的时间超过了一个指定的毫秒数，那么测试将终止并且标记为失败的测试
     */
    @Test(timeout = 1000)
    public void infinity() {
        while (true);
    }

    /**
     * @AfterClass -> 测试类执行完时执行一次ß
     *  - 方法必须是静态的
     */
    @AfterClass
    public static void destory()  {
        System.out.println("@AfterClass - destory");
    }
}


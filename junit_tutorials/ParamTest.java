package com.iquantex.omsv2.junit_tutorials;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @Author liko
 * @Date 2019/6/14
 * @Version 1.0
 * @Description ParamTest
 */

/**
 * 参数化测试: 给单元测试传多个参数值。
 *  - @RunWith
 *  - @Parameterized
 */
@RunWith(value = Parameterized.class)
public class ParamTest {

    private int number;

    public ParamTest(int number) {
        this.number = number;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 1 }, { 2 }, { 3 }, { 4 } };
        return Arrays.asList(data);
    }

    @Test
    public void pushTest() {
        System.out.println("Parameterized Number is : " + number);
    }

}

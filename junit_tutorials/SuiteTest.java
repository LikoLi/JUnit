package com.iquantex.omsv2.junit_tutorials;

import com.iquantex.omsv2.junit_tutorials.Junit4SuiteTest1;
import com.iquantex.omsv2.junit_tutorials.Junit4SuiteTest2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @Author liko
 * @Date 2019/6/13
 * @Version 1.0
 * @Description SuiteTest
 */

/**
 * 套件测试
 *  - 套件测试就是把几个单元测试组合成一个模块，然后运行
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        Junit4SuiteTest1.class,
        Junit4SuiteTest2.class
})
public class SuiteTest {
    // TODO: 这个类里面好像不能写测试方法, 检查一下
}




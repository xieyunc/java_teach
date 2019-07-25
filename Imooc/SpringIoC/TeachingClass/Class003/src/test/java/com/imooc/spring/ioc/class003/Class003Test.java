package com.imooc.spring.ioc.class003;

import com.imooc.spring.ioc.class003.car.Audi;
import com.imooc.spring.ioc.class003.car.Buick;
import com.imooc.spring.ioc.class003.human.Human;
import com.imooc.spring.ioc.class003.human.LiSi;
import com.imooc.spring.ioc.class003.human.ZhangSan;
import org.junit.Before;
import org.junit.Test;

public class Class003Test {

/*
    public static void main(String[] args) {
        ZhangSan zs = new ZhangSan(new Audi());
        zs.goHome();

        System.out.println("----------------------");

        LiSi ls = new LiSi(new Buick());
        ls.goHome();
    }
*/
private IoCContainer ioCContainer = new IoCContainer();

    @Before
    public void before() {
        ioCContainer.setBeans(Audi.class, "audi");
        ioCContainer.setBeans(Buick.class,"buick");

        ioCContainer.setBeans(ZhangSan.class,"zhangsan","audi");
        ioCContainer.setBeans(LiSi.class, "lisi", "buick");
    }

    @Test
    public void test() {
        Human zhangsan = (Human) ioCContainer.getBean("zhangsan");
        zhangsan.goHome();

        System.out.println("------------------------");

        Human lisi = (Human) ioCContainer.getBean("lisi");
        lisi.goHome();

        System.out.println("++++++++++++++++++++++++");
    }

    @Test
    public void test2() {
        ZhangSan zs = new ZhangSan(new Audi());
        zs.goHome();

        System.out.println("=====================");

        LiSi ls = new LiSi(new Buick());
        ls.goHome();
    }
}

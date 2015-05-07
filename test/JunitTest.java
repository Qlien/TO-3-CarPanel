/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import carpanel.CarPanel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Michał
 */
public class JunitTest {
    
    CarPanel cp;

    public JunitTest() {
        cp = new CarPanel();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test1() {
        System.out.print("Speed:" + cp.display_Speed(0, 0) + " Distance:" + cp.getS() + " Time:" + cp.getT());
        System.out.println(", WARN: " + cp.isWARN());
    }

    @Test
    public void test2() {
        System.out.print("Speed:" + cp.display_Speed(120, 1) + " Distance:" + cp.getS() + " Time:" + cp.getT());
        System.out.println(", WARN: " + cp.isWARN());
    }

    @Test
    public void test3() {
        System.out.print("Speed:" + cp.display_Speed(Double.MAX_VALUE, 1) + " Distance:" + cp.getS() + " Time:" + cp.getT());
        System.out.println(", WARN: " + cp.isWARN());
    }

    @Test
    public void test4() {
        System.out.print("Speed:" + cp.display_Speed(1, 0.01) + " Distance:" + cp.getS() + " Time:" + cp.getT());
        System.out.println(", WARN: " + cp.isWARN());
    }

    @Test
    public void test5() {
        System.out.print("Speed:" + cp.display_Speed(120.1,1) + " Distance:" + cp.getS() + " Time:" + cp.getT());
        System.out.println(", WARN: " + cp.isWARN());
    }

    @Test
    public void test6() {
        System.out.print("Speed:" + cp.display_Speed(Double.MIN_VALUE,2) + " Distance:" + cp.getS() + " Time:" + cp.getT());
        System.out.println(", WARN: " + cp.isWARN());
    }

    @Test
    public void test7() {
        System.out.print("Speed:" + cp.display_Speed(-0.1d,0.02) + " Distance:" + cp.getS() + " Time:" + cp.getT());
        System.out.println(", WARN: " + cp.isWARN());
    }

    @Test
    public void test8() {
        System.out.print("Speed:" + cp.display_Speed(2d, Double.MIN_VALUE) + " Distance:" + cp.getS() + " Time:" + cp.getT());
        System.out.println(", WARN: " + cp.isWARN());
    }

    @Test
    public void test9() {
        System.out.print("Speed:" + cp.display_Speed(-10d, -0.1) + " Distance:" + cp.getS() + " Time:" + cp.getT());
        System.out.println(", WARN: " + cp.isWARN());
    }

    @Test
    public void test10() {
        System.out.print("Speed:" + cp.display_Speed(120, 1.01) + " Distance:" + cp.getS() + " Time:" + cp.getT());
        System.out.println(", WARN: " + cp.isWARN());
    }

    @Test
    public void test11() {
        System.out.print("Speed:" + cp.display_Speed(2, Double.MAX_VALUE) + " Distance:" + cp.getS() + " Time:" + cp.getT());
        System.out.println(", WARN: " + cp.isWARN());
    }

    @Test
    public void test12() {
        System.out.print("Speed:" + cp.display_Speed(2 * Double.MIN_VALUE, 2) + " Distance:" + cp.getS() + " Time:" + cp.getT());
        System.out.println(", WARN: " + cp.isWARN());
    }

    @Test
    public void test13() {
        System.out.print("Speed:" + cp.display_Speed(-0.02, 2) + " Distance:" + cp.getS() + " Time:" + cp.getT());
        System.out.println(", WARN: " + cp.isWARN());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.kata.FizzBuzz.Tests;

import com.cifpcarballeira.kata.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM102
 */
public class TestsFizzBuzz {
    
    public TestsFizzBuzz() {
    }
    
    @Test
    public void test1devuelve1(){
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(1);
        assertEquals("1",result);
    }
    @Test
    public void test1devuelve2(){
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(2);
        assertEquals("2",result);
    }
    
     public void test1devuelveFizz(){
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(3);
        assertEquals("3",result);
    }
}

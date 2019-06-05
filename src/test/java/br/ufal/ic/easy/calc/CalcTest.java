package br.ufal.ic.easy.calc;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class CalcTest {

    private Calc calc;

    @Before
    public void setUp() {
        this.calc = new Calc();
    }

    @Test
    public void sumZeroAndZeroTest() {
        Assert.assertEquals(0, calc.sum(0, 0));
    }

    @Test
    public void sumTwoAndTwoTest() {
        Assert.assertEquals(4, calc.sum(2, 2));
    }

    @Test
    public void sumZeroAndOneTest() {
        Assert.assertEquals(1, calc.sum(0, 1));
    }

    @Test
    public void sumOneAndZeroTest() {
        Assert.assertEquals(2, calc.sum(1, 0));
    }
}

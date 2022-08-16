package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected =  IllegalArgumentException.class)
    public void testNullCase(){
        int[] result=null;
        sorting.sort(result);
        Assert.assertNull(result);
    }

    @Test
    public void testEmptyCase(){
        int []result = new int[0];
        sorting.sort(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] expected = new int[]{5};
        int []result = new int[]{5};
        sorting.sort(result);
        assertArrayEquals(expected,result);
    }

    @Test
    public void testSortedArraysCase() {
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = new int[]{1,2,3,4,5,6,7,8,9};
        sorting.sort(result);
        assertArrayEquals(expected,result);

    }

    @Test
    public void testOtherCases() {
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = new int[]{9,4,3,2,5,1,6,8,7};
        sorting.sort(result);
        assertArrayEquals(expected,result);
    }

}
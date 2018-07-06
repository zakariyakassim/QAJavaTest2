package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Testing {

    Main main = new Main();

    @Test
    public void testdoubleChar(){
        assertEquals("zzaakkaarriiyyaa",main.doubleChar("zakariya"));

    }

    @Test
    public void testGetSandwich(){
        assertEquals("jam",main.getSandwich("breadjambread"));
        assertEquals("jam",main.getSandwich("xxbreadjambreadyy"));
        assertEquals("",main.getSandwich("xxbreadyy"));
        assertEquals("honey",main.getSandwich("xxbreadhoneybreadyy"));

      //  System.out.println( main.getSandwich("xgtggfrxbreadhoneybreadyy"));


    }

    @Test
    public void testEvenlySpaced(){

        assertEquals(true,main.evenlySpaced(10,6,8));
        assertEquals(false,main.evenlySpaced(10,7,8));


    }

    @Test
    public void testEndsly(){

        assertEquals(true, main.endsly("oddly"));
        assertEquals(false,main.endsly("oddy"));

    }

    @Test
    public void testStringClean(){

        assertEquals("zakriy",main.stringClean("zzaakkaarriiyyaa"));


    }

    @Test
    public void testNTwice(){

        assertEquals("Choate",main.nTwice("Chocolate", 3));





    }


    @Test
    public void testSuperBlock(){

     //   assertEquals(3,main.superBlock("abbCCCddBBBxx"));





    }


}

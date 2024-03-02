package com.jewel.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    void simpletest(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(3,listMock.size());
    }

    @Test
    void simpletest2(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(1).thenReturn(2);
        assertEquals(1,listMock.size());
        assertEquals(2,listMock.size());

    }

    @Test
    void simpletest3(){  //parameters
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("some value").thenReturn("some other value");
        assertEquals("some value",listMock.get(0));
        assertEquals("some other value",listMock.get(0));
    }

    @Test
    void simpletest4(){  //generic parameter
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("some other value");

        assertEquals("some other value",listMock.get(0));
        assertEquals("some other value",listMock.get(10));
    }
}

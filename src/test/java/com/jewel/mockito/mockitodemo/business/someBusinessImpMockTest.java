package com.jewel.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class someBusinessImpMockTest {
    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private someBusinessImp businessImp;

    @Test
    void findGreatestOfAlldataBasicSenerio(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{23,232,3});

        assertEquals(232,businessImp.findTheGreatestOfAllData());
    }

    @Test
    void findGreatestOfAlldataBasicSenerioForOneElement(){

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1});

        assertEquals(1,businessImp.findTheGreatestOfAllData());
    }

    @Test
    void findGreatestOfAlldataBasicSenerioForEmpty(){

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});

        assertEquals(Integer.MIN_VALUE,businessImp.findTheGreatestOfAllData());
    }
}
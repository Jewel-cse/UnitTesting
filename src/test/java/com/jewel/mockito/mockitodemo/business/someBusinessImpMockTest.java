package com.jewel.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class someBusinessImpMockTest {
    DataService dataServicemock = mock(DataService.class);
    @Test
    void findGreatestOfAlldataBasicSenerio(){

        when(dataServicemock.retrieveAllData()).thenReturn(new int[]{23,232,3});

        someBusinessImp businessImp = new someBusinessImp(dataServicemock);
        int result = businessImp.findTheGreatestOfAllData();
        assertEquals(232,result);
    }

    @Test
    void findGreatestOfAlldataBasicSenerioForOneElement(){

        when(dataServicemock.retrieveAllData()).thenReturn(new int[]{1});

        someBusinessImp businessImp = new someBusinessImp(dataServicemock);
        int result = businessImp.findTheGreatestOfAllData();
        assertEquals(1,result);
    }
}
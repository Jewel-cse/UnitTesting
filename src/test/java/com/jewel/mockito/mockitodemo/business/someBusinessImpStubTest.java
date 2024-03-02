package com.jewel.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class someBusinessImpStubTest {
    @Test
    void findGreatestOfAlldataBasicSenerio(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        someBusinessImp businessImp = new someBusinessImp(dataServiceStub);
        int result = businessImp.findTheGreatestOfAllData();
        assertEquals(44,result);
    }
}
class DataServiceStub implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[]{2,2,3,44};
    }
}
//interface change hole implementation change korte hobe

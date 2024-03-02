package com.jewel.mockito.mockitodemo.business;

public class someBusinessImp {
    private DataService dataService;

    public someBusinessImp(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findTheGreatestOfAllData(){
        int[] data = dataService.retrieveAllData();

        int greatest = Integer.MIN_VALUE;
        for(int value:data){
            if(value>greatest)
                greatest = value;
        }
        return greatest;
    }
}
interface DataService{
    int[] retrieveAllData();
}

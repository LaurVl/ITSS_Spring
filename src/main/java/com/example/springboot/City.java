package com.example.springboot;

import java.util.List;

public class City {
    
    private List<String> sectorsName;
    private Integer banksNo;
    ArrayList<String> transportationTypes = new ArrayList<String>();

    public List<String> getSectorsName() {
        return sectorsName;
    }

    public void setSectorsName(List<String> sectorsName) {
        this.sectorsName = sectorsName;
    }

    public Integer getBanksNo() {
        return banksNo;
    }

    public void setBanks_no(Integer banksNo) {

        this.banksNo = banksNo;
    }
}

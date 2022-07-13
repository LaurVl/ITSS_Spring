package com.example.springboot;

import java.util.List;

public class City {
    
    private List<String> sectors_name;
    private Integer banks_no;


    public List<String> getSectors_name() {
        return sectors_name;
    }

    public void setSectors_name(List<String> sectors_name) {
        this.sectors_name = sectors_name;
    }

    public Integer getBanks_no() {
        return banks_no;
    }

    public void setBanks_no(Integer banks_no) {

        this.banks_no = banks_no;
    }
}

package com.gferrell.gt1

class FacilityType {

    String code;
    String description;

    static constraints = {
        code blank:false, size: 4..16, unique:true
        description blank:false, size: 1..128
    }
}

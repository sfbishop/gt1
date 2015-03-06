package com.gferrell.gt1

class Organization {

    String name
    String description
    static hasMany = [facilities:Facility]

    static constraints = {
        name blank:false, size: 1..32, unique:true
        description blank:false, size: 1..64
    }
}

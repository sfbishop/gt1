package com.gferrell.gt1

class Address {

    String streetNameNumber
    String city
    String postalCode
    String country

    static constraints = {
        streetNameNumber blank:false, size: 1..32
        city blank:false, size: 1..32
        postalCode blank:false, size: 1..32
        country blank:false, size: 1..32
    }
}

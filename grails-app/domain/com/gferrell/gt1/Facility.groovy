package com.gferrell.gt1

class Facility {

    String name
    String description
    Address address
    FacilityType facilityType
    static belongsTo = [organization: Organization]

    static constraints = {
        name blank:false, size: 1..32, unique:true
        description size: 0..64
        address blank:false, unique: true
        facilityType blank:false
    }
}

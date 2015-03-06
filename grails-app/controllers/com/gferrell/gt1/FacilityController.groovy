package com.gferrell.gt1

class FacilityController {

    static scaffold = Facility

    FacilityService facilityService

    def actionMethod() {
        facilityService.serviceMethod()
        redirect(action: "index")
    }
}

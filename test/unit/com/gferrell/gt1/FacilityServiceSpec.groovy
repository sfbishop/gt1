package com.gferrell.gt1

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(FacilityService)
class FacilityServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        given: "test given"
        println "first given"

        when: "test when"
        println "first when"

        then: "test then"
        println "first then"
    }
}

import com.gferrell.gt1.FacilityType

class BootStrap {

    def init = { servletContext ->
        environments {
            development {
                def ft1 = new FacilityType()
                ft1.code = "FT1"
                ft1.description = "Type 1."
                ft1.save(failOnError: true, flush: true)

                def ft2 = new FacilityType()
                ft2.code = "FT2"
                ft2.description = "Type 2."
                ft2.save(failOnError: true, flush: true)

                def ft3 = new FacilityType()
                ft3.code = "FT3"
                ft3.description = "Type 3."
                ft3.save(failOnError: true, flush: true)

                def ft4 = new FacilityType()
                ft4.code = "FT4"
                ft4.description = "Type 4."
                ft4.save(failOnError: true, flush: true)

                def ft5 = new FacilityType()
                ft5.code = "FT5"
                ft5.description = "Type 5."
                ft5.save(failOnError: true, flush: true)

                // comment
            }

            test {

            }

            production {

            }
        }
    }
    def destroy = {
    }
}

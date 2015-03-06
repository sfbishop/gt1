import com.gferrell.gt1.FacilityType

class BootStrap {

    def init = { servletContext ->
        environments {
            development {
                def ftFarm = new FacilityType()
                ftFarm.code = "FACT1"
                ftFarm.description = "Type 1."
                ftFarm.save(failOnError: true, flush: true)

                def ftPackingPlant = new FacilityType()
                ftPackingPlant.code = "FACT2"
                ftPackingPlant.description = "Type 2."
                ftPackingPlant.save(failOnError: true, flush: true)

                def ftWarehouse = new FacilityType()
                ftWarehouse.code = "FACT3"
                ftWarehouse.description = "Type 3."
                ftWarehouse.save(failOnError: true, flush: true)
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

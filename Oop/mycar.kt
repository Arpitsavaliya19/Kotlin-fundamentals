/* here the error my calss because of the we delcare the car class as an abstract class so we don't able to create an
 object of the car class here*/


class mycar() : car(brand = "BMW") {
    init {
        // newcar()         // this throws an error because we create this method with private method

    }

    override fun startdriving() {   // if we inherit an abstract class we must override the method which we implement
        println("going to home")
    }
}

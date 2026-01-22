fun main() {

    /* here the class is as an abstract class so object is not created

     for creating or use the abstract class we need to write the object below ex: shows that how to use object
     and what is the anonymous class is*/


    /* if we create the object of an abstract class so we need to implement all the abstract method of the class
    after that we need to modify the class for our requirments*/



    //   here object key word is uses for where ever you implement the anonymous class then (object :)  should be use,
    //   without using the object:  the anonymous class is not implemented
    //   by using the anonymouse class we don't need  to write blueprint of classes
    val age = 19
    val mobile : Long = 4358878527

    val person = object : example_of_anonymous_class("arpit",age,mobile){
        override fun running() {
            println("going for running")
        }

        override fun walking() {
            println("going for walk")
        }
    }

    person.walking()
    person.running()

}
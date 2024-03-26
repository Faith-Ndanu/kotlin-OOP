//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val person = Human("faith", 22, 67.7)
    println(person.weight)
    person.eat(4.0)
    println(person.weight)
    person.speak("faith")
    println(person.age)
    person.birthday()
    println(person.age)

    val user = User("faith", "munyao", "079865433", "faithndanumunyao@gmail.com", "faypat")
    println(user.firstName)
    println(user.lastName)
    println(user.email)
    println(user.password)
    println(user.phoneNumber)
}


//  Question1
class Human(var name:String,var age:Int,var weight:Double){
    //eat
   fun eat(foodWeight:Double) {
    println("I am eating $foodWeight kgs of food")
    weight += foodWeight
}
    //prints out string passed to it-speak(speech:String)
    fun speak(speech:String){
        println(speech)
    }
    //increases the human age by 1
    fun birthday(){
        age+=1

        println(age)
    }
}
//Question2
data class User(
    var firstName:String,
    var lastName:String,
    var phoneNumber:String,
    var email:String,
    var password:String,
)

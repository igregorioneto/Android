package codelabs

fun main() {
    birthdayGreeting()
    var greeting = birthdayGreetingWithReturn()
    println(greeting)
    greeting = birthdayGreetingWithReturnWithParameters("Rover", 5)
    println(greeting)
    greeting = birthdayGreetingWithReturnWithParameters(age = 13, name = "João")
    println(greeting)
    greeting = birthdayGreetingWithReturnWithDefaultArgument(age = 13)
    println(greeting)
    println()
    mostrarMensagens()
    println()
    corrigirErroCompilacao()
    println()
    modelosDeString()
    println()
    concatenacaoString()
    println()
    formatandoMensagem()
    println()
    email()
    println()
    email2()
    println()
    pedometro()
    println()
    timeStemp()
    println()
    cityAnkara()
    cityTokyo()
    cityCapeTown()
    cityGuatemalaCity()
}

// Unit é implícito
fun birthdayGreeting(): Unit {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

fun birthdayGreetingWithReturn(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreetingWithReturnWithParameters(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreetingWithReturnWithDefaultArgument(name: String = "Rover", age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

// 01 Mostrar mensagens
fun mostrarMensagens() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

// 02 Corrigir erro de compilação
fun corrigirErroCompilacao() {
    //println("New chat message from a friend'}
    println("New chat message from a friend")
}

// 03 Modelos de string
fun modelosDeString() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

// 04 Concatenação de String
fun concatenacaoString() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

// 05 Formatando mensagem
fun formatandoMensagem() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "${baseSalary + bonusAmount}"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

// Email

fun email() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

fun email2() {
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId.\n"
}

fun pedometro() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

fun timeStemp() {
    var timeSpentToday = 300
    var timeSpentYesterday = 250
    println(moreTimeStemp(timeSpentToday, timeSpentYesterday))

    timeSpentToday = 300
    timeSpentYesterday = 300
    println(moreTimeStemp(timeSpentToday, timeSpentYesterday))

    timeSpentToday = 200
    timeSpentYesterday = 220
    println(moreTimeStemp(timeSpentToday, timeSpentYesterday))
}

fun moreTimeStemp(today: Int, yesterday: Int): Boolean {
    return today > yesterday
}

fun cityAnkara() {
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()
}

fun cityTokyo() {
    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()
}

fun cityCapeTown() {
    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()
}

fun cityGuatemalaCity() {
    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
}

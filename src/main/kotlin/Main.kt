fun main(args: Array<String>) {

    for (i in 1..3){
        println(i)
    }

    for (i in 6 downTo 0 step 2)
        println(i)


    val language = arrayOf("Mony","Shelby","Katara")

    for (item in language.indices)
        println(item)

    for (item1 in language)
        println(item1)

    val welcomeKotlin = "Welcome Kotlin"

    for (text in welcomeKotlin)
        println(text)

    println(welcomeKotlin.uppercase())
    println(welcomeKotlin.lowercase())


    var sum = 0 ;
    for (i in 1..5){
        sum += i
    }
    println("sum is : ${sum}")

    var sum1 = 0;
    //start from but end till 5
    for (i1 in 1 until 5){
        sum1 += i1
    }
    println(sum1)



}
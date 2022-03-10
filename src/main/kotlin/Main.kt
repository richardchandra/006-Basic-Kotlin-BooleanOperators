fun main(args: Array<String>) {
    //Boolean operations
    //To combine logical operators
    //Logical operators: AND, OR, NOT
    val a = 10
    val b = 10
    val c = 100
    val d = 200

    //AND operator
    println((a==b) && (c==d))

    //OR operator
    println((a==b) || (c==d))

    //NOT operator
    println(!(a==b))

    //If there are more parameter
    println((a==b)&&(c==d)||(a==b))
    //It means ((a==b)&&(c==d))||(a==b)
}
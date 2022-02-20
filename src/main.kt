fun main() {
    printName("virginia")
    var result = getRemainder(7, 4)
    println(result)
    var sum=getSum(2,4,8,6)
    println(sum)
    printfun("swimming")

}






fun printName(name: String){
    println("Hello" + " " + name)
}
fun getRemainder(num1:Int,num2:Int):Int{
    var modulus=num1 % num2
    return modulus
}
fun getSum(a:Int,b:Int,c:Int,d:Int):Int{
var sum=a+b+c+d
    return sum

}
fun printfun(fact:String){
    println("I enjoy" +" " + fact)
}

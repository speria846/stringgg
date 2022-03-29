
fun main() {
 array()
 countries()
 sub()
 var s = names(arrayOf("secia","serd","dell"))
 println(s.contentToString())
}
fun array(){
 var x =arrayOf("speria","sper","tanya","win")
 println(x.contentToString())
}
fun countries(){
 var cities=arrayOf("harare","mumbai","dodoma","jakarta")
 cities.sortedArray().forEach { x->
  println(x.capitalize())
 }
}
fun sub(){
 var numbers= arrayOf(32,17,4,213,45,45,45,90,31,3,73,11,158,62)
 var sum= numbers[1]+numbers[4]
 println(sum)
 println(numbers.indexOf(158))
 var x =numbers.sortedArray()
 println(x.contentToString())
}
fun names(name:Array<String>):Array<String>{
 return name
}
fun add(){
var x=arrayOf(34,22)
println(sum)
}

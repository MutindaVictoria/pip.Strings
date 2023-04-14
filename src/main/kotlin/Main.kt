import java.util.*

fun main() {
   statement("I value family")
    println(isPalindrome("mum"))
    println(isPalindrome("flo"))
println(isAnagram("Silent","listen"))
Statements("went to school")
}
//Write a function to reverse a given string in Kotlin.
fun statement(words:String){
    var Sentence=words.reversed()
    println(Sentence)
}
//Write a function to check if a given string is a palindrome or not in Kotlin.
//fun checkLine(name:String){
//var Check ="mum"

fun isPalindrome(str: String): Boolean {
    var i = 0
    var j = str.length - 1
    while (i < j) {
        if (str[i] != str[j]) {
            return false
        }
        i++
        j--
    }
    return true
}
//Write a function to check if two given strings are
// anagrams of each other in Kotlin.
fun isAnagram(str1:String,str2:String):Boolean{
    if (str1.length!=str2.length){
        return false
    }
    val strArray1=str1.toCharArray()
    val strArray2=str2.toCharArray()

    Arrays.sort(strArray1)
    Arrays.sort(strArray2)

    val sortedstr1=String(strArray1)
    val sortedstr2=String(strArray2)

    return sortedstr1==sortedstr2
}
//Write a function to remove all the spaces from a given string in Kotlin.
fun Statements(names:String){
    var sentence = "T    his is b  ett     er."
sentence = sentence.replace("\\s".toRegex(), "")
println("After replacement: $sentence")
}
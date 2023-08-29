// val taxCalculator:(Double,Double)->Double={
//     price,taxtRatio->price*taxtRatio
// }

// short form is below

val taxCalculator={price:Double,taxtRatio:Double->price*taxtRatio}

fun main() {
    println(taxCalculator(3.4,5.6))
}
fun main() {


    val buy = 10001

    val saleLvl1 = 100
    val sale1 = 1000

    val saleLvl2 = 0.05
    val sale11 = 10_000

    if (buy <= sale1) {
        println(buy)
    } else if (buy > sale1 && buy <= sale11) {
        println(buy - saleLvl1)
    } else {
        println(buy - buy * saleLvl2)
    }
}
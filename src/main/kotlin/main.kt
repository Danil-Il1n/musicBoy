fun main() {

    val buy = 10000

    val regularClient = true
    val saleForClient = 0.01

    val saleLvl1 = 100
    val sale1 = 1000

    val saleLvl2 = 0.05
    val sale11 = 10_000

    if (buy <= sale1) {
        if (regularClient) println(buy * saleForClient) else println(buy)
    } else if (buy > sale1 && buy <= sale11) {
        if (regularClient) println(buy - buy * saleForClient - saleLvl1) else println(buy - saleLvl1)
    } else {
        if (regularClient) println(buy - buy * saleForClient - buy * saleLvl2) else println(buy - buy * saleLvl2)
    }
}
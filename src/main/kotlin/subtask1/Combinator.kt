package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val numPosters = array[0]
        val numColor = array[1]
        var numChoose: Int? = null

        for (i in 1..numColor) {
            if (cOtNpoM(numPosters, numColor, i)) {
                numChoose = i
                break
            }
        }
        return numChoose
    }

    private fun factorial(n: Int): Long = if (n < 2) 1 else n * factorial(n - 1)

    private fun cOtNpoM(c: Int, n: Int, m: Int): Boolean {
        return c.toLong() == factorial(n) / (factorial(m) * factorial(n - m))
    }
}

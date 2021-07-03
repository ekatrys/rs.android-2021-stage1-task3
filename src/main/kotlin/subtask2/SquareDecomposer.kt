package subtask2

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        val newNumber = number.toLong()
        val result = mutableListOf(newNumber)
        var remain = 0L

        while (!result.isNullOrEmpty()) {
            val current = result.last()
            result.indexOfLast {
                result.remove(it)
            }

            remain += square(current)
            for (i in current-1 downTo 0) {
                if (remain - square(i) >= 0){
                    remain -= square(i)
                    result.add(i)

                    if (remain == 0L){
                        result.sort()
                        return result.map{it.toInt()}.toTypedArray()
                    }
                }
            }
        }
        return null
    }
    fun square(x: Long) = x * x
}

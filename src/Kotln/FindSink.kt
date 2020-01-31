package Kotln

/*
Ex:
0   1   0   1
1   0   1   1
0   0   1   1
0   0   0   0
 */
fun main(args: Array<String>) {
    var arr: Array<Array<Int>> = arrayOf(
        arrayOf(0, 0, 1, 1),
        arrayOf(1, 0, 1, 0),
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 1, 1, 0)
    )
    var result = findSink(arr)
    if (result == -1) {
        println("No Sink")
    } else {
        println("Vertex: $result is a Sink")
    }

}

fun findSink(arr: Array<Array<Int>>): Int {
    var i: Int = 0
    var j: Int = 0

    var exist: Int = -1

    while (j < arr.size) {
        if (arr[i][j] == 0) {
            j++
        } else if (arr[i][j] == 1) {
            i++
        }
    }
    var vertex: Int = i
    var count: Int = 0

    for (k in 0 until arr.size) {
        if (arr[vertex][k] == 0) {
            count++
        }
    }

    if (count == arr.size) {
        exist = vertex
    }
    return exist
}


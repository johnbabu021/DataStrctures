
function swapNumbers(array) {

    let j = array.length - 1

    for (i = 0; i < array.length; i++) {
        if (array[i] == 6 && array[j] != 6 && i < j) {

            let temp = array[j]
            array[j] = array[i]
            array[i] = temp
            j--;

        }
        if (array[j] == 6 && array[i] == 6 && i < j) {
            j--
            let temp = array[j]
            array[j] = array[i]
            array[i] = temp

        }


    }
    console.log(array);
}
var array = [6, 1, 6, 8, 10, 4, 14, 6, 3, 9]
swapNumbers(array)


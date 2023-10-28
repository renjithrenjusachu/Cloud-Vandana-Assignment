//2 b.Perform sorting of an array in descending order

function sortDescending(arr) {
    for (let i = 0; i < arr.length; i++) {
        for (let j = i+1; j < arr.length; j++) {
            if (arr[i] < arr[j]) {
                const temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

const arrayToSort = [5, 2, 9, 1, 5, 6];
sortDescending(arrayToSort);
console.log(arrayToSort);

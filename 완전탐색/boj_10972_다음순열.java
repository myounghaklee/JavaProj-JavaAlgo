private static boolean nextPermutation(int[] arr) {
    int i = arr.length-1;
    while(i > 0 && arr[i-1] >= arr[i]) i--;
    if(i <= 0) return false;

    int j = arr.length-1;

    while(arr[j] <= arr[i-1]) j--;

    swap(arr, i-1, j);
    j = arr.length - 1;
    while(i < j) {
        swap(arr, i, j);
        i++;
        j--;
    }
    return true;
}

private static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
}
public class boj_10972_�������� {

}

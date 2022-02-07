# Binary Tree

비선형 자료구조이다. 선형자료의 대표적인 것으로는 stack , queue가 있다. 
**정렬된 배열 또는 리스트에 적합한 고속 탐색 방법이다.** 
이번에는 실질적으로 이진트리를 탐색하는 방법을 알아보도록 하겠다. 

🖛 데이터의 삽입이나 삭제가 빈번할 시에는 적합하지 않고 주로 고정된 데이터에 대한 탐섹에 적합하다.

따라서 이진 탐색의 시간 복잡도는 **O(log \*n\*)**이 된다.

Parent, Left, Right를 P, L, R로 표현하겠다.

## 전위 순회

P-> L -> R 순으로 탐색한다. 
위 그래프를 예를들면 1,2,4,8,9,5,10,11, 3,6,12,13,7,14,15 순으로 탐색한다



## 중위 순회 

L -> P -> R 순으로 탐색한다.
 8,4,9,2,10,5,11, 1,12,6,13, 3, 14,7,15

## 후위 순회

L -> R -> P 순으로 탐색한다.

8,9,4,10,11,5, 2,12,13,6,14,7,15,3,1 순으로 탐색한다 

```java
public class BinarySearch {
    static int[] arr = {1, 3, 5, 7, 8, 10, 20, 35, 99, 100};

    public static void main(String[] args) {
        System.out.println("1. 순환 호출을 이용한 이진 탐색");
        System.out.println(binarySearch1(5, 0, arr.length-1)); // 2

        System.out.println("\n2. 반복을 이용한 이진 탐색");
        System.out.println(binarySearch2(20, 0, arr.length-1)); // 6

    }

    // 재귀적 탐색
    static int binarySearch1(int key, int low, int high) {
        int mid;

        if(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) { // 탐색 성공 
                return mid;
            } else if(key < arr[mid]) {
                return binarySearch1(key ,low, mid-1); // 왼쪽 부분 탐색 
            } else {
                return binarySearch1(key, mid+1, high); // 오른쪽 부분 탐색 
            }
        }

        return -1; // 탐색 실패 
    }

    // 반복적 탐색
    static int binarySearch2(int key, int low, int high) {
        int mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) {
                return mid;
            } else if(key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // 탐색 실패 
    }

}
```
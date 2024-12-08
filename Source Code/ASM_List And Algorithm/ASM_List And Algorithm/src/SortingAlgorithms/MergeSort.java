package SortingAlgorithms;

public class MergeSort {
    public void sorting(int[] arr, int p, int q, int r){
        // tinh so luong phan tu cua cac mang ben trai va ben phai
        int n1 = q - p + 1; // middle - left + 1
        int n2 = r - q; // right - middle
        // tao mang trai
        int[] L = new int[n1]; // tao mang co dinh so luong phan tu
        // tao mang ben phai
        int[] R = new int[n2];
        // do phan tu vao mang trai phai do
        for (int i = 0; i < n1; i++){
            L[i] = arr[p+i];
            // L[0] = 1
            // L[1] = 2
        }
        for (int j = 0; j < n2; j++){
            R[j] = arr[q+1+j];
        }
        int i,j,k;
        i = 0; j = 0; k = p;
        while (i < n1 && j < n2){
            if (L[i] < R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while ( j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }
    public void merge(int[] arr, int left, int right){
        //left vi tri cua cac phan tu mang ben trai (tinh tu 0)
        //right vi tri cua cac phan tu mang phai (length - 1)
        if (left < right){
            int middle = (left + right) / 2; // vi tri de tach chia mang
            // De Quy(goi lai ham do trong chinh no)
            merge(arr, left, middle); // tinh mang ben trai
            merge(arr, middle + 1, right); // tinh mang ben phai
            // sau khi chia mang xong thi hop lai va sap xep
            sorting(arr, left, middle, right);
        }
    }
    public void showArray(int[] array){
        for (int i : array){
            System.out.println(i);
        }
    }
}

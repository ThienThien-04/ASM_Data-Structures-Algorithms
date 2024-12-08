public class ArrayBasic {

    public void showArray() {
        // tao 1 mang so
        // khai bao mang - biet luon so luong phan tu va ca gia tri cua phan tu do
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // khai bao mang - chi can biet so luong phan tu la bao nhieu(khong can biet ro gia tri cua tung phan tu trong mang la gi?)
        int[] myNumber = new int[4];
        // khi khai bao mang - luon luon khai bao kich thuoc cua mang(luon luon co dinh khong thay doi)
        // truy cap vao 1 phan tu trong mang(lay ra gia tri cua 1 phan tu trong Array)
        // cu phap : NameArray[index]
        int n = numbers[6];
        System.out.println("My number " + n);

        // 1 for ...
        int lengthArr = numbers.length; // so luong phan tu
        for (int i = 0; i < lengthArr; i++){
            System.out.println("value = " + numbers[i]);
        }
        // 2 forEach
        for (int j : numbers){
            System.out.println("gia tri j = " + j);
        }
        int k = 0;
        while (k < lengthArr){
            System.out.println(" phan tu k = " + numbers[k]);
            k++;
        }
        int l = 0;
        do {
            System.out.println("gia tri phan tu k = " + numbers[l]);
            l++;
        } while ( l < lengthArr);
    }
    public int maxNumberInArray(int[] numbers){
        int max = numbers[0]; // lay ra duoc phan tu dau tien(gia su no l phan tu max)
        for (int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
    public int minNumberInArray(int[] myArrNumbers){
        int min = myArrNumbers[0];
        for (int i = 1; i < myArrNumbers.length; i++){
            if (myArrNumbers[i] < min){
                min = myArrNumbers[i];
            }
        }
        return min;
    }
    private boolean checkingNumber(int number){
        if (number <= 1){
            return false;
        }
        if (number == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int sumNumber(int[] arrNumbers){
        int sum = 0;
        for (int number : arrNumbers){
            if (checkingNumber(number)){
                sum += number;
            }
        }
        return sum;
    }
    public int countNumber(int[] arrayNumbers){
        int count = 0 ;
        for (int number : arrayNumbers){
            if (checkingNumber(number)){
                count++;
            }
        }
        return count;
    }
    public double avgNumber(int[] arrayNumbers){
        return (double) sumNumber(arrayNumbers) / countNumber(arrayNumbers);
    }
}
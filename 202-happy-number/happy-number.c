bool isHappy(int n) {

    while (n != 1){
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }

        n = sum;
        
        if (n == 4)
            return false;
    }

    return true;
}

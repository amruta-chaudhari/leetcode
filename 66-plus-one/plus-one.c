/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* plusOne(int* digits, int digitsSize, int* returnSize) {
    bool flag = true;
    for (int i = 0; i < digitsSize; i++){
        if( digits[i] != 9){
            flag = false;
            break;
        }
    }
    *returnSize = digitsSize + (flag ? 1 : 0);
    
    int *result = (int*) malloc(*returnSize * sizeof(int));
    if (result == NULL) {
        return NULL; 
    }

    int carry = 1;
    for (int i = (digitsSize-1); i >= 0; i--) {
        int sum = digits[i] + carry;
        result[i + (*returnSize - digitsSize)] = sum % 10; 
        carry = sum / 10; 
    }
    
    if (carry) {
        result[0] = carry;
    }

    return result;
}
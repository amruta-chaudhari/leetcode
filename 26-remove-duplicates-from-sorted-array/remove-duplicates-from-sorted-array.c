int removeDuplicates(int* nums, int numsSize){

    int i = 0, j = 0;

    while (j < numsSize){
        if(nums[i] != nums[j]){
            i++;
            nums[i] = nums[j];
        }
        j++;
    }
    return i+1;
}
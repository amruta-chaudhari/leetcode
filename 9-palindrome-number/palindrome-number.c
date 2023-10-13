bool isPalindrome(int x){

    if(x<0) return false;

    int len = snprintf(NULL, 0, "%d", x);
    char *str = (char*) malloc(len+1);
    snprintf(str, len+1, "%d", x);

    bool flag = true;

    for (int i=0, j=(len-1); i < j; i++, j--){
        if( str[i] != str[j]){
            flag = false;
            break;
        }
    }
    free(str);
    return flag;
}
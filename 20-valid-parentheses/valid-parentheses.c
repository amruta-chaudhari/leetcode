bool isValid(char * s){
    int sLen = strlen(s);

    if(sLen % 2 != 0)    return false;

    char *stack = (char*) malloc(sizeof(int) * sLen);
    int top = -1;

    int i = 0;
    while (s[i] != '\0'){
        if ( s[i] == '(' || s[i] == '{' || s[i] == '[' ){
            top++;
            stack[top] = s[i];
            i++;
        } else {
            if (top == -1)  return false;

            if ( s[i] == ')' && stack[top] != '(')  return false;
            if ( s[i] == '}' && stack[top] != '{')  return false;
            if ( s[i] == ']' && stack[top] != '[')  return false;

            top--;
            i++;
        }
    }

    free(stack);
    return (top == -1);
}
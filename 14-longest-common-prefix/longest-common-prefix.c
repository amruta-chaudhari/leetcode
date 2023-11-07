char* longestCommonPrefix(char** strs, int strsSize) {

    if (strsSize == 0) return "";

    int minLength = strlen(strs[0]);
    for (int i = 1; i < strsSize; i++) {
        int len = strlen(strs[i]);
        if (len < minLength) {
            minLength = len;
        }
    }

    char* lcp = (char*)malloc(sizeof(char) * (minLength + 1));
    lcp[0] = '\0'; 

    for (int i = 0; i < minLength; i++) {
        char current = strs[0][i];
        for (int j = 1; j < strsSize; j++) {
            if (strs[j][i] != current) {
                lcp[i] = '\0'; 
                return lcp; 
            }
        }
        lcp[i] = current; 
    }

    lcp[minLength] = '\0'; 
    return lcp; 
}

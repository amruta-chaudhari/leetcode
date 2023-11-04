int lengthOfLongestSubstring(char * s){

    int n = strlen(s);
    int freq[256] = {0};
    int left = 0;        
    int right = 0;    
    int maxLength = 0;

    while (right < n) {
        if (freq[s[right]] == 0) {
            freq[s[right]]++; 
            right++;
            maxLength = (right - left > maxLength) ? (right - left) : maxLength;
        } else {
            freq[s[left]]--;
            left++;
        }
    }

    return maxLength;

}
int calPoints(char ** operations, int operationsSize){

    int *score = (int*) malloc(sizeof(int) * operationsSize);
    int j = 0, finalScore = 0;
    
    for(int i = 0; i < operationsSize; i++){

        if (strcmp(operations[i], "+") == 0){
            score[j] = score[j-1] + score[j-2];
            j++;
        } else if (strcmp(operations[i], "D") == 0){
            score[j] = score[j-1] * 2;
            j++;
        } else if (strcmp(operations[i], "C") == 0){
            score[j-1] = 0;
            j--;
        } else {
            score[j] = atoi(operations[i]);
            j++;
        }
    }

    for(int k = 0; k < j; k++){
        finalScore += score[k];
    }

    free(score);
    return finalScore;
}
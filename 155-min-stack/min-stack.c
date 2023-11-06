


typedef struct MinStack{
    int* stack;
    int* minStack;
    int top;
    int minTop;
} MinStack;


MinStack* minStackCreate() {
    MinStack* minStack = (MinStack*) malloc(sizeof(MinStack));
    minStack->stack = (int*) malloc(30000 * sizeof(int));
    minStack->minStack = (int*) malloc(30000 * sizeof(int));
    minStack->top = -1;
    minStack->minTop = -1;
    
    return minStack;
}

void minStackPush(MinStack* obj, int val) {
    obj->stack[++(obj->top)] = val;
    
    if (obj->minTop == -1 || val <= obj->minStack[obj->minTop]) {
        obj->minStack[++(obj->minTop)] = val;
    }
}

void minStackPop(MinStack* obj) {
    if (obj->stack[obj->top] == obj->minStack[obj->minTop]) {
        obj->minTop--;
    }
    obj->top--;
}

int minStackTop(MinStack* obj) {
    return obj->stack[obj->top];
}

int minStackGetMin(MinStack* obj) {
    return obj->minStack[obj->minTop];
}

void minStackFree(MinStack* obj) {
    free(obj->stack);
    free(obj->minStack);
    free(obj);
}

/**
 * Your MinStack struct will be instantiated and called as such:
 * MinStack* obj = minStackCreate();
 * minStackPush(obj, val);
 
 * minStackPop(obj);
 
 * int param_3 = minStackTop(obj);
 
 * int param_4 = minStackGetMin(obj);
 
 * minStackFree(obj);
*/
function Node(val){
    this.val = val;
    this.next = null;
    this.prev = null;
};


var MyLinkedList = function() {
    this.head = null;
    this.tail = null;
    this.len = 0;
};

/** 
 * @param {number} index
 * @return {number}
 */
MyLinkedList.prototype.get = function(index) {
    if (index < 0 || index >= this.len)
        return -1;

    var curr;
    
    if(index < (this.len/2)){
        curr = this.head;
        for(var i = 0; i < index; i++){
            curr = curr.next;
        }
    } else {
        curr = this.tail;
        for(var i = this.len - 1; i > index; i--){
            curr = curr.prev;
        }
    }
    return curr.val;
};

/** 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtHead = function(val) {
    var newNode = new Node(val);

    if(!this.head){
        this.head = newNode;
        this.tail = newNode
    } else {
        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;
    }
    this.len++;
};

/** 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtTail = function(val) {
    var newNode = new Node(val);

    if(!this.tail){
        this.head = newNode;
        this.tail = newNode
    } else {
        this.tail.next = newNode;
        newNode.prev = this.tail;
        this.tail = newNode;
    }
    this.len++;
};

/** 
 * @param {number} index 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtIndex = function(index, val) {

    if (index < 0 || index > this.len){
        return;
    } else if (index === 0) {
        this.addAtHead(val);
        return;
    } else if (index === this.len){
        this.addAtTail(val);
        return;
    } else {
        var newNode = new Node(val);
        var curr = this.head;

        for(var i = 0; i < index; i++){
            curr = curr.next;
        }

        newNode.next = curr;
        curr.prev.next = newNode;
        newNode.prev = curr.prev;
        curr.prev = newNode;

        this.len++;
    }
};

/** 
 * @param {number} index
 * @return {void}
 */
MyLinkedList.prototype.deleteAtIndex = function(index) {
    if (index < 0 || index > this.len){
        return;
    }

    if (index === 0){
        this.head = this.head.next;
        if (this.head) {
            this.head.prev = null;
        } else {
            this.tail = null;
        }
    } else if (index === (this.len - 1)){
        this.tail = this.tail.prev;
        if (this.tail) {
            this.tail.next = null;
        } else {
            this.head = null;
        }
    } else {
        var curr = this.head;
        for(var i = 0; i < index; i++){
            curr = curr.next;
        }
        
        if (!curr) return; 
        curr.prev.next = curr.next;
        
        if(curr.next){
            curr.next.prev = curr.prev;
        }
    }

    this.len--;
};

/** 
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = new MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(val)
 * obj.addAtTail(val)
 * obj.addAtIndex(index,val)
 * obj.deleteAtIndex(index)
 */
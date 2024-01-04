/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function(list1, list2) {
    
    let result = new ListNode();
    let res = result

    if (!list1){
        return list2;
    } else if (!list2){
        return list1;
    }

    while ( (list1&&list1.val || list1&&list1.val === 0 ) || 
            (list2&&list2.val || list2&&list2.val === 0 ) )
        {

        let curr = new ListNode();
        result.next = curr;

        if (!list1){
            curr.val = list2.val;
            list2 = list2.next;
        } else if (!list2){
            curr.val = list1.val;
            list1 = list1.next;
        } else{
            if (list1.val < list2.val){
                curr.val = list1.val;
                list1 = list1.next;
            } else {
                curr.val = list2.val;
                list2 = list2.next;
            }
        }
        result = result.next;
    }
    return res.next;
};
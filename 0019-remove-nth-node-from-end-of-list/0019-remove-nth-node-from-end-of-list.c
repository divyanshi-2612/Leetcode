/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) 
{
     


    struct ListNode* iter = head;
    int len = 0, i = 1;

    // Step 1: Find the length of the list
    while (iter != NULL) {
        iter = iter->next;
        len++;
    }

    // Step 2: If head is the node to be deleted
    if (len == n) {
        struct ListNode* newHead = head->next;
        free(head);  // free the old head
        return newHead;
    }

    // Step 3: Traverse to the (len - n)th node
    iter = head;
    while (i < len - n) {
        iter = iter->next;
        i++;
    }

    // Step 4: Delete the nth node from the end
    struct ListNode* temp = iter->next;
    iter->next = iter->next->next;
    free(temp);

    return head;
}


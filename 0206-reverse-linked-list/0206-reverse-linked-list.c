/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

    
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode *prev = NULL, *curr = head, *nex;

    while (curr) {
        nex = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nex;
    }

    return prev;
}
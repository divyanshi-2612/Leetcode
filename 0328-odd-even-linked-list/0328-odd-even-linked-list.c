/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* oddEvenList(struct ListNode* head) {
    
    if (head == NULL || head->next == NULL || head->next->next == NULL)
        return head;
    
    struct ListNode* odd = head;
    struct ListNode* even = head->next;
    struct ListNode* even_start = head->next;

    while (odd->next != NULL && even->next != NULL) {
        odd->next = even->next;
        odd = odd->next;

        even->next = odd->next;
        even = even->next;
    }

    odd->next = even_start;
    return head;
}


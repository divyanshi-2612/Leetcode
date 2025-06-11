/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) 
{
   struct ListNode *fast = head;
    struct ListNode *slow = head;

    // Traverse the list
    while (fast != NULL && fast->next != NULL) {
        fast = fast->next->next;  // Move fast by 2 steps
        slow = slow->next;        // Move slow by 1 step

        // If both pointers meet, cycle exists
        if (fast == slow)
            return true;
    }
    return false;
}
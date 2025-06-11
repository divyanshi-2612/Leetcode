/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) 
{
    
    struct ListNode *slow = head;
    struct ListNode *fast = head;

    // Step 1: Detect cycle
    while (fast != NULL && fast->next != NULL) 
    {
        slow = slow->next;
        fast = fast->next->next;

        if (slow == fast) 
        {
            // Step 2: Find start of cycle
            struct ListNode *start = head;
            while (start != slow) 
            {
                start = start->next;
                slow = slow->next;
            }
            return start;
        }
    }

    return NULL;
}

    

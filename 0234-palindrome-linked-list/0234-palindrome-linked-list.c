/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 
bool isPalindrome(struct ListNode* head) 
{
   
    struct ListNode *slow = head, *fast = head;
    int l = 0;

    if (head->next == NULL)
        return true;

    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
        l++;
    }

    int stack[l + 1];
    int top = -1;

    while (slow != NULL) {
        stack[++top] = slow->val;
        slow = slow->next;
    }

    slow = head;
    while (top != -1) {
        if (stack[top] != slow->val)
            return false;
        top--;
        slow = slow->next;
    }

    return true;
}


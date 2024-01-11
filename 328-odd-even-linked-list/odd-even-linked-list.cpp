/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* oddEvenList(ListNode* head) {
        ListNode* temp=head;
        ListNode* dummy1=new ListNode(-1);
        ListNode* dummy2=new ListNode(-2);
        ListNode* odd=dummy1;
        ListNode* even=dummy2;
        int c=1;
        if(head==NULL || head->next==NULL)
            return head;
        while(temp){
            if(c%2!=0){
                ListNode* num=new ListNode(temp->val);
                odd->next=num;
                odd=num;
            }
            else{
                 ListNode* num=new ListNode(temp->val);
                even->next=num;
                even=num;
            }
            temp=temp->next;
            c++;
        }
        odd->next=dummy2->next;
        return dummy1->next;
    }
};
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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* dummy=new ListNode(-1);
        ListNode* add=dummy;
        int carry=0,sum=0;
        while(l1!=NULL || l2!=NULL){
            sum=carry;
            if(l1!=NULL)
                sum=sum+l1->val;
            if(l2!=NULL)
                sum=sum+l2->val;
            ListNode* temp=new ListNode(sum%10);
            carry=sum/10;
            add->next=temp;
            add=temp;
            if(l1)
                l1=l1->next;
            if(l2)
                l2=l2->next;
        }
        if(carry>0){
            ListNode* temp=new ListNode(carry);
            add->next=temp;
            add=temp;
        }
        return dummy->next;
    }
};
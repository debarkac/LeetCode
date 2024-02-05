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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* temp=new ListNode(-1);
        ListNode* dummy=temp;
        while(list1 && list2){
            // if(list1->val==list2->val){
            //     list3->next=list2;
            //     list3=list3->next;
            //     list3->next=list1;
            //     list2=list2->next;
            //     list1=list1->next;
            // }
            if(list1->val<list2->val){
                temp->next=list1;
                list1=list1->next;
            }
            else {
                temp->next=list2;
                list2=list2->next;
            }
            temp=temp->next;
        }
        if(list1){
            temp->next=list1;
            //list1=list1->next;
        }
        if(list2){
            temp->next=list2;
            //list2=list2->next;
        }
        return dummy->next;
    }
};
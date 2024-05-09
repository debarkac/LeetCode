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
    ListNode* removeNodes(ListNode* head) {
      stack<ListNode*> s;
      ListNode* curr=head;
      while(curr){
        s.push(curr);
        curr=curr->next;
      }

      curr=s.top();
      s.pop();
      int max=curr->val;

      ListNode* result=new ListNode(curr->val);

      while(!s.empty()){
        curr=s.top();
        s.pop();
        if(curr->val<max)
            continue;
        else{
            ListNode* resultHead=new ListNode(curr->val);
            resultHead->next=result;
            result=resultHead;
            max=result->val;
        }
      }
      return result;

    }
};
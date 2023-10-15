class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        int input=0;
        if(s.length()==1)
            return false;
        for(int i=0;i<s.length();i++){
            char c=s[i];
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
                input++;
            }
            else{
                     if(st.empty())
                         return false;
                     else if(c==')' && st.top()!='(')
                         return false;
                     else if(c=='}' && st.top()!='{')
                         return false;
                     else if(c==']' && st.top()!='[')
                         return false;
                    // if(st.empty() || ((c==')') && st.top()!='(') || ((c=='}') && st.top()!='{') || ((c==']') && st.top()!='['))
                    // return false;
                st.pop();
                input--;
            } 
        }
        if(input==0)
        return true;
        else 
        return false;
    }
};



//                 if(st.empty()) || ((c==')') && st.top()!='(') || ((c=='}') && st.top()!='{') || ((c==']') && st.top()!='['))

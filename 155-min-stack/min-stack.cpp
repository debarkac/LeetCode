#include <bits/stdc++.h> 
class MinStack {
public:
    stack<long long> str;
	long long min=INT_MAX;
    MinStack() {
        
    }
    
    void push(int number) {
        long long num=number;
         if (str.empty()) {
                          str.push(num);
                          min = num;
                        }
						else{
                          if (num < min) {
                            str.push(2 * num - min);
                            min = num;
                          }
						  else
						  	str.push(num);
                        }
    }
    
    void pop() {
        if(str.size()==0)
        {}
				
			else{
				if(str.top()<min){
					min=(2*min-str.top());
				}
				str.pop();
			}
    }
    
    int top() {
        if(str.size()==0)
				return -1;
                        else {
                                if (str.top() < min)
                                        return min;
                                else
                                        return str.top();
                        }
                }
    
    
    int getMin() {
        if(str.size()==0)
				return -1;
			else{
				return min;
			}
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */
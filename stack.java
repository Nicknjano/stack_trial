/**
 * main - program to dish out plates in a cafeteria.
 * stack -> push,pop,top,size,isEmpty.
 */
public class stack {
    int top = -1;
    int n =100;
    int [] plate = new int[n];
    /**
     * function checks size of the array
     */
        public int size() {
            return top +1;
        }
    
        public boolean isEmpty() {
            if ( top<0 ) {
                return true;
            } else {
                return false;
            }
        }
    
        public Object top() {
            Object o =0;
            if (isEmpty())
                System.out.println("Stack is empty");
            else
                o = plate [top];
                return o;
        
        }
    
        public void push(Object o) {
            if (size()== n) {
                System.out.println("Stack is full");
            } else {
                top+=1;
                plate[top] = 0;
            }
        }
    
        public Object pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            }
                Object o = plate[top];
                plate [top] = (Integer) null;
                return o;  
        }
    
        public static void main(String[] args) {
           stack p = new stack();
           Object o = 1;
            p.size();
            p.isEmpty();
            p.top();
            p.push(o);
            
        }
    }
public class stack{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data) {
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int POP() {
            if(isEmpty()){
                System.out.println("Stack is Empty");
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        public static int peek() {
            if(isEmpty()){
                System.out.println("Stack is Empty");
            }
            int top=head.data;
            return head.data;
        }
    }

     public static void main(String[] args) {
        Stack s=new Stack();
        s.push(2);
        s.push(4);
        s.push(5);
        s.push(6);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.POP();
        }
    }
 }
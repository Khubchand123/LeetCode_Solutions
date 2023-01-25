//{ Driver Code Starts
import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        // your code here
        List<Integer> obj= new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            obj.add(temp.data);
            temp=temp.next;
        }
        int arr[] = new int[obj.size()];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<obj.size();i++){
            while(!stack.isEmpty() && obj.get(stack.peek())<obj.get(i)){
                arr[stack.pop()]=1;
            }
            stack.push(i);
        }
        temp=head;
        Node ans = new Node(0);
        Node temp1 =ans;
        for(int i:arr){
            if(i!=1){
                temp1.next = new Node(temp.data);
                temp1=temp1.next;
            }
            temp=temp.next;
        }
        return ans.next;
    }
}
  
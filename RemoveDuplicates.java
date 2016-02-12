/**
 *
 * @author yogeshdarji
 */
 
 //Function to remove duplicates
public class RemoveDuplicates {
    
    public static ListNode deleteDuplicates(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        
        
        ListNode prev = head;
        ListNode p = head.next;
        
        
        while(p!=null)
        {
            
            if(prev.val==p.val)  //Check for duplicates
            {
                prev.next=p.next;
                p=p.next;
            }
            
            else
            {
                prev = p;
                p = p.next;
            }
        }
        
        return head;
    }


    

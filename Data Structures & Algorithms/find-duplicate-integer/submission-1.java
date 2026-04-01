class Solution {
    public int findDuplicate(int[] nums) {
        int slow =0,fast =0;  //place the fast and slow pointer at the beginning of the array
        while(true)
{ 
    slow = nums[slow];
    fast = nums[nums[fast]];
    if(slow == fast){
        break;
    }
} 
 // the above code is the first step of the finding duplicate.Now we found out the first intersection of the linked list.
          // nums[slow] = nums[nums[fast]]; // we know that fast pointer of the array traverses twice as the slow pointer of the array
    int slow2 = 0;
    while(true){
    slow2 = nums[slow2];  
    slow = nums[slow];
    if(slow2 == slow){
        return slow;
    }
    }
   // here in the second iteration we have to use a slow2 pointer and slow pointer and return the slow pointer at the intersection.


    }
}

import java.util.ArrayList;

class Question2 {
    
    public static void removeSmallest(ArrayList<Integer> nums) {
        int indexnumber = 100;
        int smallest = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (i == 0) {
             smallest = nums.get(0);
            }else {
             if (nums.get(i) < smallest) {
             	 indexnumber = i;
                 smallest = nums.get(i);
                }
            }
        }
        nums.remove(indexnumber);
    }
  
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }
        
        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }
    
    
}
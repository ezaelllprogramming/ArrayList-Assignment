import java.util.ArrayList;

class Question3 {

    public static void removeConsecutives(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) == nums.get(i-1)) {
                nums.remove(i);
            }
        }
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) == nums.get(i-1)) {
                nums.remove(i);
            }
        }
        
    }
    
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(1);
        System.out.println("Our list before: " + nums);
        removeConsecutives(nums); 
        System.out.println("Our list after:  " + nums);
    }

    
}
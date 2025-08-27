// Finding a pair with sum = 5 (array sorted)

class Main {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    int target = 5;
    int left =0, right = nums.length - 1;
    while (left<right){
      int sum = nums[left] + nums[right];
      if (sum == target){
        System.out.println(nums[left] + "," + nums[right]);
      }
      if (sum < target) left++; else right--;
    }
  }
}

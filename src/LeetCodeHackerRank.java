import java.util.*;

public class LeetCodeHackerRank {

    public void main(){
        //        List<Integer> p = new ArrayList<>();
//        int[] array = {1};
        int[] array2 = {1,12,-5,-6,50,3};
//        System.out.println(printArray(intersection(array, array2)));

//        twoSum(array2, 8);

        System.out.println(findMaxAverage(array2, 4));
    }

    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 1) return nums[0];
        int leftEdge = 0;
        int rightEdge = k-1;

        double returnedTotal = Double.MIN_VALUE;
        int totalOperation=0;

        while(rightEdge<nums.length){
            if(leftEdge == 0){
                int i=leftEdge;
                while(i<k){
                    totalOperation += nums[i];
                    i++;
                }
                returnedTotal = totalOperation;
            }else{
                totalOperation = totalOperation - nums[leftEdge-1] + nums[rightEdge];
                if(returnedTotal < totalOperation){
                    returnedTotal = totalOperation;
                }
            }
            leftEdge++;
            rightEdge++;
        }

        return returnedTotal / k;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        int p1 = 0;
        int l = p1 + 1;
        int r = nums.length -1;

        Arrays.sort(nums);

        List<List<Integer>> returnedValue = new ArrayList<>();
        if(nums.length == 1 || nums.length == 2){
            if(r+1 == 1){
                if(nums[p1] == 0){
                    returnedValue.add(Arrays.asList(nums[p1]));
                }

                return returnedValue;
            }else{
                if(nums[p1] + nums[p1+1] == 0){
                    returnedValue.add(Arrays.asList(nums[p1]));
                }
                return returnedValue;
            }
        }

        Set<Integer> hasBeenThroughit = new HashSet<>();

        while(l<r){
            if(hasBeenThroughit.add(nums[p1])){
                while(l<r){
                    int total = nums[p1]+nums[l]+nums[r];
                    if(total == 0){
                        returnedValue.add(Arrays.asList(nums[p1],nums[l],nums[r]));
                        r--;
                        l++;
                        while(nums[r] == nums[r+1] && nums[l] == nums[l-1] && l<r){
                            r--;
                            l++;
                        }
                    }else if(total > 0){
                        r--;
                    }else{
                        l++;
                    }

                }
            }
            p1++;
            l = p1 + 1;
            r = nums.length -1;
        }
        return returnedValue;
    }

    private int[] twoSum(int[] numbers, int target) {
        int p1 =0;
        int p2 =1;
        while(p1 != numbers.length -1 ){
            int calculate = numbers[p1] + numbers[p2];
            if(calculate == target){
                int [] returnValue = new int[2];
                returnValue[0] = p1;
                returnValue[1] = p2;
                return returnValue;
            }

            if(p2 == numbers.length - 1){
                p1++;
                p2 = p1+1;
            }else{
                p2++;
            }

            if(calculate > target){
                p1++;
            }

        }
        return new int[0];
    }

    private static int maxProfit(int[] prices) {
        int left = 0;
        int right = left + 1;
        int currProfit = 0;

        while(right < prices.length && left < prices.length){
            if(left == right) right++;
            if(right < prices.length && left < prices.length){
                if (prices[left] < prices[right]) {
                    int calProfit = prices[right] - prices[left];
                    currProfit = calProfit > currProfit ? calProfit : currProfit;
                    right++;
                } else {
                    // right++;
                    left++;
                }
            }
        }
        return currProfit;
    }

    private static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        };

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

    private static String printArray(int[] arr) {
        String output = "";
        for (int i=0; i<arr.length; i++) {
            output = output+" "+Integer.toString(arr[i]);
        }
        return output;
    }
}

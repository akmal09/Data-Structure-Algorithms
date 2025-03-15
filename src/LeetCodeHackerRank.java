public class LeetCodeHackerRank {

    public void main(){
        //        List<Integer> p = new ArrayList<>();
//        int[] array = {1};
        int[] array2 = {1,2,3,4,4,9,56,90};
//        System.out.println(printArray(intersection(array, array2)));

        twoSum(array2, 8);
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
}

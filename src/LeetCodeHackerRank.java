import java.util.*;

import DataStructure.TreeNode;
import DataStructure.LinkedList.ListNode;

public class LeetCodeHackerRank {

    public void main(){
        //        List<Integer> p = new ArrayList<>();
//        int[] array = {1};
        // int[] array2 = {1,12,-5,-6,50,3};
//        System.out.println(printArray(intersection(array, array2)));

//        twoSum(array2, 8);

        // System.out.println(findMaxAverage(array2, 4));

        // ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        // System.out.println();
        // System.out.println();
        // ListNode mergedList = swapPairs(list1);
        // System.out.println(mergedList.printList());
        TreeNode root = new TreeNode(50);
        root.insert(root, 30);
        root.insert(root, 70);
        root.insert(root, 20);
        root.insert(root, 40);
        root.insert(root, 60);
        root.insert(root, 80);

        TreeNode deleteNode = processDeletePredecessor(root);

        deleteNode.print();

    }


    private TreeNode processDeletePredecessor(TreeNode root) {
        return deleteNode(root, 50);
    }

    
    public TreeNode deleteNode(TreeNode node, int val) {
        if(node== null){
            return node;
        }

        if(node.getVal() == val){
            TreeNode deepNode = findDeepestNode(node, val);

            // TreeNode tempNode = node;
            node.setLeft(removeDeepNode(node.getLeft(), deepNode.getVal()));
            node.setVal(deepNode.getVal());
            return node;
        }else{
            if(val > node.getVal()){
                node.setRight(deleteNode(node.getRight(), val));
            }else{
                node.setLeft(deleteNode(node.getLeft(), val));
            }
        }

        return node;
        
    }

    private TreeNode removeDeepNode(TreeNode node, int val){

        if(node == null){
            return node;
        }
        if(node.getVal() == val){
            return null;
        }else{
            if(node.getRight() != null){
                node.setRight(removeDeepNode(node.getRight(), val));
            }

            if(node.getLeft() != null){
                node.setLeft(removeDeepNode(node.getLeft(), val));
            }
        }
        return node;
    }

    private TreeNode findDeepestNode(TreeNode node, int val){

        if(node == null){
            return null;
        }

        if(node.getLeft() == null && node.getRight() == null){
            return node;
        }else{
            if(node.getLeft() != null){
                return findDeepestNode(node.getLeft(), val);
            }else{
                return findDeepestNode(node.getRight(), val);
            }
        }
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        if(head.next != null){
            System.out.println(head.printList());
            if(head.next.next != null){
                head.next.next = swapPairs(head.next.next);
                int temp = head.val;
                head.val = head.next.val;
                head.next.val = temp;
                return head;
            }else{
                ListNode temp = head;
                ListNode tempNextNode = head.next.next;
                head = head.next;
                head.next = temp;
                head.next.next = tempNextNode;
                System.out.println(head.printList());
                return head;
            }
        }
        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val < list2.val){
            System.out.print("(" + list1.next.printList() + ",");
            System.out.println(" " + list2.printList() + ")");
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else{
            String param1 = Objects.isNull(list1) ? "null" : list1.printList();
            String param2 = Objects.isNull(list2.next) ? "null" : list2.next.printList();
            System.out.print("(" + param1 + ",");
            System.out.println(" " + param2+ ")");
            list2.next = mergeTwoLists(list1, list2.next);  
            return list2;
        }
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

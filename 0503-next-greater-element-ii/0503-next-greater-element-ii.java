class Solution 
{
    public int[] nextGreaterElements(int[] nums) 
    {
       
int n = nums.length;
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        // Traverse 2*n - 1 times to simulate the circular array
        for (int i = 2 * n - 1; i >= 0; i--) {
            int current = nums[i % n];

            // Pop elements from the stack that are less than or equal to current
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            // If within first pass (i < n), store result
            if (i < n) {
                result[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            // Push current element onto the stack
            stack.push(current);
        }

        return result;
  


    }
}
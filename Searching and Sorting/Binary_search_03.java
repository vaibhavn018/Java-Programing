
class Binary_search_03 {
    public static int search(int[] nums, int target) {
        if (nums[peak(nums)] == target) {
            return peak(nums);
        } else if (nums[peak(nums)] < target) {
            return find(nums, target, peak(nums) + 1, nums.length - 1);
        } else {
            return find(nums, target, 0, peak(nums) - 1);
        }

    }

    public static int peak(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return e;
    }

    public static int find(int[] nums, int target, int s, int e) {
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 7, 9, 7, 4, 1 };
        // int a = search(nums, 1);
        // System.out.println(a);
        int b = peak(nums);
        System.out.println(b);
    }

}
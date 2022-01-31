import javax.management.MBeanAttributeInfo;

public class Binary_search_02 {
    public static int findElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAss = (arr[start] < arr[end]);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAss) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int findNum1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }

        }

        return start;

    }

    public static int findNum2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }

        }

        return end;

    }

    public static int findPeak1(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return arr[mid];
            } else if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;

            } else if (arr[mid] < arr[mid - 1]) {
                e = mid - 1;

            }

        }
        return -1;

    }

    public static int findPeak2(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    public static int findPeakElement(int[] nums, int target) {
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

        if (nums[s] == target) {
            return s;
        } else if (nums[s] > target) {
            return search(nums, target, s, e);
        } else {
            return search(nums, target, s, e);
        }

    }

    public static int search(int[] arr, int target, int s, int e) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 8, 9, 21, 43, 65 };
        // int a = findElement(arr, 65);
        // System.out.println(a);
        int b = findNum1(arr, 25);
        System.out.println(b);
        int c = findNum2(arr, 25);
        System.out.println(c);
        int[] arr2 = { 1, 2, 4, 6, 7, 8, 4, 1 };
        int d = findPeak1(arr2);
        System.out.println(d);
        int e = findPeak2(arr2);
        System.out.println(e);
        int f = findPeakElement(arr2, 3);
        System.out.println(f);

    }
}

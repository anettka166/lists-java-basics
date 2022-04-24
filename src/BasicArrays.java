import java.util.Arrays;

public class BasicArrays {
    public static void main(String[] args) {

        System.out.println("------------1----------");

        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));

        System.out.println("------------2----------");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

            System.out.println("------------3----------");

            int[] nums1 = new int[5];

            nums1[0] = 100;
            nums1[1] = 101;
            nums1[2] = 102;
            nums1[3] = 103;
            nums1[4] = 104;
            System.out.println(Arrays.toString(nums1));

            int[] nums2 = new int[nums1.length+1];
            nums2[0] = nums1[0];
            nums2[1] = nums1[1];
            nums2[2] = nums1[2];
            nums2[3] = nums1[3];
            nums2[4] = nums1[4];
            nums2[5] = 105;
            System.out.println(Arrays.toString(nums2));

        System.out.println("------------4----------");



        }
    }



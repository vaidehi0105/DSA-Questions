import java.util.HashSet;

public class duplicate_in_array
{
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.contains(nums[i]))
            {
                count+=1;
            }
            else
            {
                map.add(nums[i]);
            }
        }
        if(count>0)
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args)
    {
        int nums1[]={1,2,3,1};
        System.out.println(containsDuplicate(nums1));
        int nums2[]={1,2,3,4};
        System.out.println(containsDuplicate(nums2));
    }
}

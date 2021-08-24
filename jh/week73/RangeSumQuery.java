package hello.hellospring.controller;

public class RangeSumQuery {

    int[] tree;
    int n;
    int[] temp;
    public RangeSumQuery(int[] nums) {
//        this.nums = nums;
        this.temp = nums;
        if(nums.length >0) {
            n=nums.length;
            tree = new int[n*2];
            buildTree(nums);
        }
    }

    private void buildTree(int[] nums) {
        for(int i=n, j=0; i<2*n; i++, j++) {
            System.out.println("tree["+i+"] : "+nums[j]);
            tree[i] = nums[j];
        }

        for(int i=n-1; i > 0; --i) {
            tree[i] = (tree[i*2]+tree[i*2+1]);
            System.out.println("TO-BE : tree["+i+"] : "+(tree[i*2]+tree[i*2+1]));
        }
    }
    public void update(int pos, int val) {
        temp[pos] = val;
        tree = new int[n*2];
        buildTree(temp);
    }
/*
    public void update(int index, int val) {
        System.out.println("UPDATE=====================");
        System.out.println("AS-IS : nums["+index+"] : "+nums[index]);
        nums[index] = val;
        System.out.println("TO-BE : nums["+index+"] : "+nums[index]);
    }

    public int sumRange(int left, int right) {
        System.out.println("Sum Range==================");
        int sum = 0;
        // right가 배열의 총 합보다 많아질 경우
        right = Math.min(nums.length, right);

        // left가 right보다 작은 경우만
        if(left <= right) {
            for (int i = left; i <= right; i++) {
                sum += nums[i];
            }
            System.out.println("Result : " + sum);

            return sum;
        } else {
            return 0;
        }
    }*/

    public static void main(String[] args) {
        RangeSumQuery rs = new RangeSumQuery(new int[]{1,2,3,4,5,6});
        rs.update(1,7);
    }
}


class One {
    public static void main(String[ ] args) {
        int testCase, baseNumber;
        int Solution = 0;
        
        testCase = 1;
        baseNumber = 10;
        for(int i = 1; i < 301;i++) {
            Solution += makeReverseNumber(i*i,baseNumber);
        }
        System.out.printf("총 갯수 : %d",Solution);
        
    }
    
    public static int makeReverseNumber(int a, int b) {
        int tmp, rev;
        tmp = a;
        rev = 0;
        while(tmp > 0) {
            rev = (rev * b + (tmp%b));
            tmp = tmp / b;
        }
        
        if(rev == a){
            System.out.printf("Rev : %d, Ori : %d \n",rev,a);
            System.out.println("");
        }
            
        return rev == a ? 1 : 0;
    }
}

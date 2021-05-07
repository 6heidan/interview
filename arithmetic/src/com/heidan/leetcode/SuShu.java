package com.heidan.leetcode;

//统计n以内的素数个数
//素数：只能被1和它本身整除的自然数，0、1除外
public class SuShu {
    public static void main(String[] args) {
        System.out.println(bf(100));
        System.out.println(eratosthenes(100));

    }

    public static int bf(int n){
        int count = 0;
        for (int i=2;i<n;i++){
            count += isPrime(i) ? 1 : 0;
        }
        return count;
    }

    private static boolean isPrime(int x) {
        for (int i=2;i*i<=x;i++){ //  i*i<=x  等同于  i<根号x
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * 解法2:埃氏筛
     * 解法2：埃氏筛
     * 利用合数的概念(非素数)，素数*n必然是合数，因此可以从2开始遍历，将所有的合数做上标记
     * 将合数标记为true, j=i*i从2*i优化而来,系数2会随着遍历递增(j+=i, 相当于递增了系数2)，每一个合数
     * 都会有两个比本身要小的因子(0,1除外), 2 * i必然会遍历到这两个因子
     * 当2递增到大于根号n时，其实后面的已经无需再判断(或者只需判断后面一段)，而2到根号n.实际上在i递增
     * 的过程中已经计算过了，i 实际上就相当于根号n
     * 例如: n= 25会计算以下
     * 2 *4=8
     * 3 *4=12
     * 但实际_上8和12已经标记过,在n= 17时已经计算了3*4, 2*4
     */
    //素数   非素数（合数）    埃筛法
    public static int eratosthenes(int n){
        boolean[] isPrime = new boolean[n];//默认全是false，false代表素数
        int count = 0;
        for (int i=2;i<n;i++){
            if (!isPrime[i]){
                count++;
                for (int j=i*i;j<n;j+=i){//j就是合数的标记位    i*i是对2*i的优化
                    isPrime[j] = true;
                }
            }
        }
        return count;
    }
}

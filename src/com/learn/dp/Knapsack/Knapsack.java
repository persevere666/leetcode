package com.learn.dp.Knapsack;
/*
 * 背包问题：有 N 件物品和一个容量是 V的背包，第 i 件物品的体积是 vi，价值是 wi
 */
public class Knapsack {
    /*
     * 0/1 背包问题：每件物品只能使用一次
     * 状态转移方程：对于每个物品i，我们有两种选择：不放入背包，或者放入背包。如果不放入背包，那么f[i][j] = f[i-1][j]；
     * 如果放入背包，前提是背包的容量j大于等于物品i的体积v[i]，那么f[i][j] = max(f[i-1][j], f[i-1][j-v[i]] + w[i])。
     * 选择这两种情况的最大值作为f[i][j]的值。
     */
    //二维dp解法：
    public int _0_1_knapsack_1(int N, int V, int[][] vw){
        int f[][] = new int[N+1][V+1];
        for(int i=0; i<=N; i++){
            
        }
        //
        return 0;
    }
    //
    public int _0_1_knapsack_2(int N, int V, int[][] vw){
        //
        return 0;
    }
    
}

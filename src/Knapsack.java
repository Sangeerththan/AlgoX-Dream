class Knapsack {


     private static int knapSack(int W, int[] wt, int[] val, int n)
    {
        if (n == 0 || W == 0)
            return 0;

        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);

        else
            return Math.max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1),
                    knapSack(W, wt, val, n - 1));
    }

    public static void main(String[] args)
    {
        int[] val = new int[] { 110, 10, 10, 33};
        int[] wt = new int[] { 10, 20, 30 ,12};
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}

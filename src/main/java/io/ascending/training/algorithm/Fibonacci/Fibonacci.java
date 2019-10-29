package io.ascending.training.algorithm.Fibonacci;

public class Fibonacci {
    public int FibRecursion(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        return FibRecursion(n - 1) + FibRecursion(n - 2);
    }

    public int FibRecursionFaster(int n, int[] mem) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        if (mem[n] != 0) {
            return mem[n];
        }

        int tmp = FibRecursionFaster(n - 1, mem) + FibRecursionFaster(n - 2, mem);
        mem[n] = tmp;

        return tmp;
    }

    public int FibIteration(int n) {
        int res[] = new int[n + 1];
        res[0] = res[1] = 1;
        for (int i = 2; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println("FibRecursion : " + fib.FibRecursion(6));
        System.out.println("FibRecursionFaster : " + fib.FibRecursionFaster(6, new int[7]));
        System.out.println("FibIteration : " + fib.FibIteration(6));

    }
}

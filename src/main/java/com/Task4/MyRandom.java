package com.Task4;

 class  MyRandom {
     //каждый следующий элемент x[n + 1] = 1 (a x[n] + c) % m, для корректных значений a, c, и m.
    long seed,a,c,m;

    public MyRandom(long seed, long a , long c, long m){
        this.seed = seed;
        this.a = a;
        this.c = c;
        this.m = m;
    }
    public long rand(){
        long value = (a*seed + c) % m;
        seed =value;
        return value;
    }
}

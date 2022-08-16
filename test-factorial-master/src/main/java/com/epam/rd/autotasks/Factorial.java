package com.epam.rd.autotasks;


public class Factorial {
    public String factorial(String n) throws IllegalArgumentException {
        if (n==null) throw new IllegalArgumentException();
        for (int i=0; i<n.length(); i++) {
            if ((n.charAt(i) >= '0') && (n.charAt(i) <= '9')) {
            } else {
                throw new IllegalArgumentException();
            }
        }
        int num=Integer.valueOf(n);
        int res=1;
        for (int i = 1; i <= num; i++) {
            res*=i;
        }
        String result = Integer.toString(res);
        return result;
    }

}

package com.company;

public class MyBubleSort {

    private int []  number=new int[]{5,7,2,6,9,11,0,4,14,25,64,3};


    public void sort()
    {
        for (int i=0;i<number.length-1;i++)
        {
            for (int j=i+1;j<number.length;j++)
            {
                if(number[i]>number[j])
                {
                    int t=number[i];
                    number[i]=number[j];
                    number[j]=t;
                }
            }
        }
    }

    public void print()
    {
        for (int e:number)
        {
            System.out.println(e);
        }
    }

}

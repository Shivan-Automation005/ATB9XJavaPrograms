package com.dikondwarshivani.Task.ArrayPrograms;

public class FrequencyEveryElementArray
{
    public static void main(String[] args) {
        int a[]=new int[] {2,4,6,2,6,3,7,6};
        int visitedArr[] =new int[a.length];
        int visited=-1;
        for(int i=0;i<a.length;i++){

            int count=1;
            for(int j=i+1;j< a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    visitedArr[j]=visited;
                }
            }
            if (visitedArr[i]!=visited){
                visitedArr[i]=count;
            }
        }
        for (int i=0;i<visitedArr.length;i++){
            if (visitedArr[i]!=visited){
                System.out.println("Frequency of"+a[i]+":"+visitedArr[i]);
            }
        }
    }
}

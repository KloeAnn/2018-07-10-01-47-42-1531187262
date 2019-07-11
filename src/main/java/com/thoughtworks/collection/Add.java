package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {

            int res=0;
            for(int i=leftBorder;i<=rightBorder;i++){
                if(i%2==0)res+=i;
            }
            return res;

    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int res=0;
        for(int i=0;i<=arrayList.length;i++){
            res+=arrayList[i]*3+2
        }
        return res;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        Integer[] arrayRes ;
        for(int i=0;i<=arrayList.length;i++){
            i%2==0?arrayRes.push(arrayList)
        }

    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}

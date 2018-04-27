package service;

import api.ServiceDemo;

public class ServiceDemoImpl implements ServiceDemo{
    public String sayHello(String name) {
        String result="Hello "+name;
        return result;
    }

    public int[] sort(int[] arr) {
        quickSort(arr,0,arr.length-1);
        return arr;
    }

    private  void quickSort(int[] arr , int left ,int right){
        if (left>right)
            return;
        int i=left;
        int j=right;
        int key=arr[left];
        while (i<j){
            while (i<j&&arr[j]>=key){
                j--;
            }
            arr[i]=arr[j];
            while (i<j&&arr[i]<=key){
                i++;
            }
            arr[j]=arr[i];
            arr[i]=key;
        }
        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }
}

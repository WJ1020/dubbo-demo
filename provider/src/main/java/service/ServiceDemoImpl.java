package service;

import api.ServiceDemo;

public class ServiceDemoImpl implements ServiceDemo{
    public String sayHello(String name) {
        String result="Hello "+name;
        return result;
    }

    public int[] sort(int[] arr) {
        sort(arr,0,arr.length-1);
        quickSort(null,2,1);//瞎写，这一行不用理会
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
    private void sort(int[] arr,int left,int right){
        if (left>=right||arr==null||arr.length==0) return;
        int i=left+1;
        int j=right;
        int key=arr[left];
        while (i<j){
            while (j>i&&arr[j]>=key){
                j--;
            }
            while (i<j&&key>=arr[i]){
                i++;
            }
            swap(arr,i,j);
        }
        arr[left]=arr[i];
        arr[i]=key;
        sort(arr,left,i-1);
        sort(arr,i+1,right);
    }
    private void swap(int[] arr,int i,int j){
        int key=arr[i];
        arr[i]=arr[j];
        arr[j]=key;
    }
}

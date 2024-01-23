package org.example;

public class Main {

    private int [] myArray;
    private int num_elements;

    public Main(){
        myArray = new int[10];
    }

    public int size(){
            return num_elements;
    }

    public void add(int num){
        if(num_elements == myArray.length){
            grow();
        }
        myArray[num_elements] = num;
        num_elements++;
    }



    private void grow(){
        //create an array with extra slots
        //loop through and copy info into new array
        //replace old array with new array
        int [] newArray = new int[num_elements+num_elements];

        for(int i = 0; i < myArray.length; i++){
            newArray[i] = myArray[i];
        }
        myArray = newArray;
    }

    }

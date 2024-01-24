package org.example;

public class Main {

    private static final int MAX_EXPANSION = 100000;

    private static final int MAX_INITIAL_CAPACITY = 10;
    private int [] data;
    private int num_elements;
    private int capacity;

    public Main(int[] myArray, int num_elements, int cap, int expansionFactor) {
        this.data = myArray;
        this.num_elements = num_elements;
        this.capacity = cap;
        this.expansionFactor = expansionFactor;
    }

    public Main(int capacity){
        this.capacity = capacity;
        data = new int[capacity];
        if (capacity <= MAX_INITIAL_CAPACITY && capacity > 0){
            this.capacity = capacity;
        }else if(capacity > MAX_INITIAL_CAPACITY){
            this.capacity = MAX_INITIAL_CAPACITY;
        }
    }

    public Main(int capacity, int expansionFactor) {
        this.capacity = capacity;
        if (capacity <= MAX_INITIAL_CAPACITY && capacity > 0){
            this.capacity = capacity;
    }else if(capacity > MAX_INITIAL_CAPACITY){
            this.capacity = MAX_INITIAL_CAPACITY;
    }

        if(expansionFactor <= MAX_EXPANSION && expansionFactor > 0){
            this.expansionFactor = expansionFactor;
        }else if(expansionFactor > MAX_EXPANSION){
            this.expansionFactor = MAX_EXPANSION;
        }
        data = new int[capacity];
    }

    private int expansionFactor;

    public Main(){
        data = new int[10];
    }

    public int size(){
            return num_elements;
    }

    public void add(int num){
        if(num_elements == data.length){
            grow();
        }
        data[num_elements] = num;
        num_elements++;
    }



    private void grow(){
        //create an array with extra slots
        //loop through and copy info into new array
        //replace old array with new array
        int [] newArray = new int[num_elements+num_elements];

        for(int i = 0; i < data.length; i++){
            newArray[i] = data[i];
        }
        data = newArray;
    }

    }

package sr.unasat.traffic.service;



public class CameraSystem {

     public static class Traffic {

        String carType;
        int priority;

        public Traffic (String carType, int priority)
        {
            this.carType = carType;
            this.priority = priority;
        }

        public String toString()
        {
            return " Car Type :"+ carType+ "\npriority" + priority;
        }

    }

    public static class PriorityQueue {
        private Traffic[] heap;
        private  int heapSize, capacity;

        public  PriorityQueue(int capacity)
        {
            this.capacity = capacity+1;
            heap = new Traffic[this.capacity];
            heapSize= 0;
        }

        //function to clear
        public void clear ()
        {
            heap= new Traffic[capacity];
            heapSize=0;
        }
        //function to check if empty
        public boolean isEmpty()
        {
            return  heapSize==0;
        }
        //function to check if full
        public boolean isFull ()
        {
            return heapSize == capacity-1;
        }
        //function to get Size
        public int size()
        {
            return heapSize;
        }
        //function to insert

        public void insert (String carType, int priority)
        {
            Traffic trafficNew = new Traffic(carType,priority);

            heap[++heapSize] = trafficNew;
            int pos = heapSize;

            while (pos != 1 && trafficNew.priority > heap[pos/2].priority)
            {
                heap[pos]= heap[pos/2];
                pos /=2;
            }
            heap[pos]= trafficNew;
        }
    }
}

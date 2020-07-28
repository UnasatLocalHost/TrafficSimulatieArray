package sr.unasat.traffic.app;

import sr.unasat.traffic.service.CameraSystem;


public class Application {
    public static void main(String[] args) {
        CameraSystem.PriorityQueue priorityQueue = new CameraSystem.PriorityQueue(11);
        priorityQueue.insert("Politie met sirene",0);
        priorityQueue.insert("Lauto1",4);
        priorityQueue.insert("Lauto2",4);
        priorityQueue.insert("Lauto3",4);
        priorityQueue.insert("Lauto4",4);

        priorityQueue.insert("brandweer met sirene",1);
        priorityQueue.insert("brandweer",4);
        priorityQueue.insert("Rauto1",4);
        priorityQueue.insert("Rauto2",4);
        priorityQueue.insert("Rauto3",4);
        priorityQueue.insert("Rauto4",4);





    }
}

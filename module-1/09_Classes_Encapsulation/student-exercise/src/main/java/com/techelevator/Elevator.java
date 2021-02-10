package com.techelevator;

public class Elevator {

	private int shaftNumber;
    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen = true;
    private boolean moving;

    
    public Elevator(int shaftNumber, int totalNumberOfFloors) {
        this.shaftNumber = shaftNumber;
        this.numberOfFloors = totalNumberOfFloors;
        this.currentFloor = 1;
    }

  
    public int getShaftNumber() {
        return shaftNumber;
    }

   
    public int getCurrentLevel() {
        return currentFloor;
    }

    
    public int getNumberOfLevels() {
        return numberOfFloors;
    }

 
    public boolean isDoorOpen() {
        return doorOpen;
    }

   
    public boolean isMoving() {
        return moving;
    }

    
    public void OpenDoor()
    {
        if (!moving)
        {
            doorOpen = true;
        }
    }


    public void CloseDoor()
    {
        if (!moving)
        {
            doorOpen = !doorOpen;
        }
    }

    
     
    public boolean GoUp(int desiredFloor)
    {
        currentFloor = desiredFloor;

        if (desiredFloor > currentFloor && desiredFloor <= numberOfFloors && doorOpen)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

   
    public boolean GoDown(int desiredFloor)
    {
        if (!doorOpen && desiredFloor < currentFloor && desiredFloor > 0)
        {
            currentFloor -= desiredFloor;
            return true;
        }

        return false;
    }

}

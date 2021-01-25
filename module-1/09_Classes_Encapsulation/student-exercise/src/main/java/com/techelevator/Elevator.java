package com.techelevator;

public class Elevator {

	private int shaftNumber;
    private int currentLevel;
    private int numberOfLevels;
    private boolean doorOpen = true;
    private boolean moving;

    
    public Elevator(int shaftNumber, int totalNumberOfFloors) {
        this.shaftNumber = shaftNumber;
        this.numberOfLevels = totalNumberOfFloors;
        this.currentLevel = 1;
    }

  
    public int getShaftNumber() {
        return shaftNumber;
    }

   
    public int getCurrentLevel() {
        return currentLevel;
    }

    
    public int getNumberOfLevels() {
        return numberOfLevels;
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
        currentLevel = desiredFloor;

        if (desiredFloor > currentLevel && desiredFloor <= numberOfLevels && doorOpen)
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
        if (!doorOpen && desiredFloor < currentLevel && desiredFloor > 0)
        {
            currentLevel -= desiredFloor;
            return true;
        }

        return false;
    }

}

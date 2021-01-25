package com.techelevator;

public class Television {

	 private boolean isOn;
	    private int selectedChannel = 3;
	    private int currentVolume;

	  
	    public boolean IsOn() {
	        return isOn;        
	    }

	    
	    public int getSelectedChannel() {
	        return selectedChannel;            
	    }


	    
	    public int getCurrentVolume() {
	        return currentVolume;            
	    }

	   
	    public void TurnOn()
	    {
	        isOn = true;                        
	    }

	    
	    public void TurnOff()
	    {
	        isOn = false;
	    }

	   
	    public void ChangeChannel(int newChannel)
	    {
	        if (isOn && newChannel > 3 && newChannel < 18)
	        {
	            selectedChannel = newChannel;
	        }
	    }

	   
	    public void RaiseVolume()
	    {
	        currentVolume++;
	    }

	   
	    public void LowerVolume()
	    {
	        currentVolume--;
	    }

	}

package com.techelevator;

public class Television {

	 private boolean isOn = false;
	    private int currentChannel = 3;
	    private int currentVolume = 2;

	

	    
	    public int getSelectedChannel() {
	        return currentChannel;            
	    }


	    
	    public int getCurrentVolume() {
	        return currentVolume;            
	    }

	   
	    public void turnOn()
	    {
	        isOn = true;  
	        currentChannel = 3;
	        currentVolume = 2;
	    }

	    
	    public void turnOff()
	    {
	        isOn = false;
	    }

	   
	    public void ChangeChannel(int newChannel)
	    {
	        if (isOn && newChannel >= 3 && newChannel <= 18)
	        {
	            currentChannel = newChannel;
	        }
	    }
	    
	    public void channelUp () {
	    	if(isOn) {
	    		if(currentChannel == 18) {
	    			currentChannel = 3;
	    		}else {
	    			currentChannel ++;
	    		}
	    	}
	    }

	    public void channelDown () {
	    	if(isOn) {
	    		if(currentChannel == 3) {
	    			currentChannel = 18;
	    		}else {
	    			currentChannel --;
	    		}
	    	}
	    }

	   
	    public void RaiseVolume()
	    {
	    	if(isOn) {
	    		if(currentVolume < 18) {
	    	}
	        currentVolume++;
	    }
	    }

	   
	    public void volumeDown()
	    {
	    	if(isOn) {
	    		if(currentVolume > 0) {
	    	}
	        currentVolume--;
	    }
	    }
}


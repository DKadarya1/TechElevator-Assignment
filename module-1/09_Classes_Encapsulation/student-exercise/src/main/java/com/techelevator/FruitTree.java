package com.techelevator;

public class FruitTree {

	private String typeOfFruit;
    private int piecesOfFruitLeft;
	private java.lang.String typeOfFruit1;

    
    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        this.piecesOfFruitLeft = startingPiecesOfFruit;
        this.typeOfFruit = typeOfFruit;
    }

    
    public String getTypeOfFruit() {
        return typeOfFruit;
    }

  
    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    
    public boolean pickFruit(int numberOfPieces)
    {
    		if(numberOfPieces <= piecesOfFruitLeft) {
    			piecesOfFruitLeft -= numberOfPieces;
    	        return true;
    		} else {
    			return false;
    		}
        
    }

}

package com.techelevator.services;

import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.models.Auction;

public class AuctionService {

    public static final String BASE_URL = "http://localhost:3000/auctions";
    public RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();


    public Auction[] listAllAuctions() {
    	Auction[] output = restTemplate.getForObject( "http://localhost:3000/auctions", Auction[].class);
    	return output;
    }

    public Auction listDetailsForAuction(int id) {
    	 return restTemplate.getForObject("http://localhost:3000/auctions/1", Auction.class);
        
    }

    public Auction[] findAuctionsSearchTitle(String title) {
    	return restTemplate.getForObject( BASE_URL +"?title_like="+title, Auction[].class);
    	
    }

    public Auction[] findAuctionsSearchPrice(double price) {
    	return restTemplate.getForObject(BASE_URL + "?currentBid_lte=" + price, Auction[].class) ;    }

}

package com.example.auction.service;

public enum AuctionStatus {
    DEALED,
    CANCELLATION,
    RECALL,
    AVAILABLE;

    public static boolean isUnAvailable(AuctionStatus auctionStatus){
        return !AVAILABLE.equals(auctionStatus);
    }

}

package com.example.auction.controller;

import com.example.auction.service.AuctionObjectInfo;
import com.example.auction.service.AuctionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auctions")
public class AuctionController {


    private final AuctionService auctionService;


    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    @GetMapping("/{auctionNum}")
    public AuctionObjectInfo searchAuctionTarget(@PathVariable("auctionNum") String auctionNum) {
        return auctionService.getAuctionTarget(auctionNum);
    }
}

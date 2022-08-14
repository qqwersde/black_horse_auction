package com.example.auction.service;


import com.example.auction.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.auction.service.AuctionStatus.AVAILABLE;

@Service
@RequiredArgsConstructor
public class AuctionService {

    private final String successMessage = "查询成功";


    public AuctionObjectInfo getAuctionTarget(String auctionNum) {
        if (auctionNum.equals("A001")){
            return AuctionObjectInfo.builder().auctionNum("A001").auctionStatus(AVAILABLE).build();
        }
        else if (!auctionNum.startsWith("A")){
            throw new BusinessException("bad request", HttpStatus.BAD_REQUEST);
        }
        return null;
    }



}

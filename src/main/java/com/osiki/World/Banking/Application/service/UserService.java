package com.osiki.World.Banking.Application.service;

import com.osiki.World.Banking.Application.payload.request.CreditAndDebitRequest;
import com.osiki.World.Banking.Application.payload.request.EnquiryRequest;
import com.osiki.World.Banking.Application.payload.request.TransferRequest;
import com.osiki.World.Banking.Application.payload.response.BankResponse;

public interface UserService {
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);

    String nameEnquiry(EnquiryRequest enquiryRequest);

    BankResponse creditAccount(CreditAndDebitRequest creditAndDebitRequest);

    BankResponse debitAccount(CreditAndDebitRequest creditAndDebitRequest);

    BankResponse transfer(TransferRequest request);
}

package com.birthae.fundingservice.funding;

import com.birthae.fundingservice.domain.Funding;
import com.birthae.fundingservice.dto.CreateFundingRequestDto;

import java.util.Optional;

public interface FundingService {

    Optional<Funding> getFundings(int user_id);
}

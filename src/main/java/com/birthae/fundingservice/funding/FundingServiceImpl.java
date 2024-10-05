package com.birthae.fundingservice.funding;

import com.birthae.fundingservice.domain.Funding;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
@Slf4j
@RequiredArgsConstructor
public class FundingServiceImpl implements FundingService{

    private final FundingRepository fundingRepository;

    @Override
    public Optional<Funding> getFundings(int user_id) {
        return fundingRepository.findByUserId(user_id);
    }

}

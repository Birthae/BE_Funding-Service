package com.birthae.fundingservice.funding;

import com.birthae.fundingservice.domain.Funding;
import com.birthae.fundingservice.dto.CreateFundingRequestDto;
import com.birthae.fundingservice.dto.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/funding")
public class FundingController {

    private final Environment env;
    private final FundingService fundingService;

    @GetMapping("/health_check")
    public String check(HttpServletRequest request){

        log.info("Server port={}", request.getServerPort());
        return String.format("Hi, there. This is a message from Funding-service on PORT %s", env.getProperty("local.server.port"));

    }

    @GetMapping("/fundings/{user_id}")
    public ResponseEntity<ResponseMessage> getFundings (@PathVariable("user_id") int user_id) {

        System.out.println("createFundingRequestDto : " + user_id);
        Optional<Funding> funding = fundingService.getFundings(user_id);

        ResponseMessage response = ResponseMessage.builder()
                .data(funding)
                .statusCode(201)
                .resultMessage("get Funding successfully")
                .build();

        return ResponseEntity.status(201).body(response);

    }


}

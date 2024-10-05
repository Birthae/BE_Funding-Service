package com.birthae.fundingservice.funding;

import com.birthae.fundingservice.domain.Funding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FundingRepository extends JpaRepository<Funding,Integer> {

//    Optional<Funding> findByUser_Id(int user_Id);
    Optional<Funding> findByUserId(int user_id);

}

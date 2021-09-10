package com.liveproject.salonapi.repository;

import com.liveproject.salonapi.domain.SalonServiceDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonServiceDetailRepo extends JpaRepository<SalonServiceDetail,Long> {

}

package com.liveproject.salonapi.repository;

import com.liveproject.salonapi.domain.SalonServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

@Repository
public class SalonServiceDetailRepo {

    private final JdbcTemplate jdbc;

    @Autowired
    SalonServiceDetailRepo(JdbcTemplate template){
        this.jdbc = template;
    }

    public List<SalonServiceDetail> getAvailableServices(){

        return jdbc.query("Query here",this :: mapRowToSalonServiceDetail);
    }

    private SalonServiceDetail mapRowToSalonServiceDetail(ResultSet rs, int rowNum) throws SQLException {
        SalonServiceDetail salonService = new SalonServiceDetail();
        salonService.setName(rs.getString("Name"));
        return salonService;
    }
}

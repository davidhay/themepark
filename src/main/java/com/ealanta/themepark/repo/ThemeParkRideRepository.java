package com.ealanta.themepark.repo;

import com.ealanta.themepark.entity.ThemeParkRide;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long> {
  List<ThemeParkRide> findByName(String name);
}
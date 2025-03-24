package com.mwaisaka.SpringDTOTutorial.repository;

import com.mwaisaka.SpringDTOTutorial.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}

package org.project.fraudmicroservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudHistoryRepository extends JpaRepository<FraudHistory,Long> {
}
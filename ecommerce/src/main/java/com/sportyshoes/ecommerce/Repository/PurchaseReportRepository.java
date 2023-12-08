
package com.sportyshoes.ecommerce.Repository;

import com.sportyshoes.ecommerce.Entities.PurchaseReport;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseReportRepository extends JpaRepository<PurchaseReport, Long> {
    List<PurchaseReport> findByCategoryAndPurchaseDateBetween(String category, Date startDate, Date endDate);
}

package com.sportyshoes.ecommerce.Service.Implementations;

import com.sportyshoes.ecommerce.Repository.PurchaseReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseReportServiceImpl implements PurchaseReportService {
    @Autowired
    private PurchaseReportRepository purchaseReportRepository;

    @Override
    public List<PurchaseReport> getPurchaseReportsByCategoryAndDate(String category, Date startDate, Date endDate) {
        return purchaseReportRepository.findByCategoryAndPurchaseDateBetween(category, startDate, endDate);
    }
}
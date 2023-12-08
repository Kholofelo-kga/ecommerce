
package com.sportyshoes.ecommerce.Service;

import com.sportyshoes.ecommerce.Entities.PurchaseReport;
import java.util.Date;
import java.util.List;


public interface PurchaseReportService {
    
     List<PurchaseReport> getPurchaseReportsByCategoryAndDate(String category, Date startDate, Date endDate);
    
}

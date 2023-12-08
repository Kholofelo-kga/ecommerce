
package com.sportyshoes.ecommerce.Controller;

import ch.qos.logback.core.model.Model;
import com.sportyshoes.ecommerce.Service.PurchaseReportService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/purchase-reports")
public class PurchaseReportController {
    @Autowired
    private PurchaseReportService purchaseReportService;

    @GetMapping
    public String getPurchaseReports(
            @RequestParam String category,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate,
            Model model) {
        model.addAttribute("purchaseReports", purchaseReportService.getPurchaseReportsByCategoryAndDate(category, startDate, endDate));
        return "purchaseReports";
    }
}
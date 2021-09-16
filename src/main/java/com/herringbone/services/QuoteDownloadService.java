package com.herringbone.services;

import eu.verdelhan.ta4j.indicators.trackers.MACDIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteDownloadService {

    @Autowired
    RestTemplate restTemplate;

    public String downloadStock(String stock) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Type", "application/json");
//        MACDIndicator macdIndicator = new MACDIndicator()
        return this.restTemplate.getForObject("http://chart.finance.yahoo.com/table.csv?s=MSFT&a=0&b=24&c=2017&d=1&e=24&f=2017&g=d&ignore=.csv", String.class);
    }
}

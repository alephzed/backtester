package com.herringbone.controllers;

import com.herringbone.filters.BackTestFilter;
import com.herringbone.services.QuoteDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/analyze/{symbol}")
public class BackTestController {

    @Autowired
    QuoteDownloadService quoteDownloadService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public String runBackTest(@PathVariable String symbol) {
        return quoteDownloadService.downloadStock(symbol);
    }
}

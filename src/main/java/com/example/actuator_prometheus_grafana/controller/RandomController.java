package com.example.actuator_prometheus_grafana.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {
    private final Counter counter;

    public RandomController(MeterRegistry meterRegistry) {
        this.counter = meterRegistry.counter("number_requests_total");
    }

    @GetMapping("/number")
    public double number() {
        counter.increment();
        return Math.random();
    }

}

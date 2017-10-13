package com.netproscore.npsanswers.results;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ResultController {

    @GetMapping("/api/data")
    public Flux<FakeData> getData() {
        return Flux.just(
                new FakeData(1, "demo"),
                new FakeData(2, "label")
        );
    }

}

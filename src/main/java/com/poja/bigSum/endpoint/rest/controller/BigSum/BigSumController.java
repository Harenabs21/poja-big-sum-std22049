package com.poja.bigSum.endpoint.rest.controller.BigSum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;
@RestController
public class BigSumController {
    @GetMapping("/big-sum")
    public BigInteger sum(@RequestParam(value = "a") String a, @RequestParam(value = "b") String b) {
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        return bigA.add(bigB);
    }
}

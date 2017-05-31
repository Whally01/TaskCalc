package ru.kpfu.itis.controller;

import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.model.Power;

/**
 * Created by Dr.Raim on 31-May-17.
 */
@RestController
@RequestMapping("/calc")
public class CalcController {

    @GetMapping("/pow")
    public Power pow(@RequestParam(value = "base") double base, @RequestParam(value = "pow") double pow) {
        return new Power(base, pow);
    }

}

package org.example.analyzerword;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping(value = "/wordanalyzer/analyze")
    public Result wordanalyzer(
            @RequestParam(name = "word", required = false, defaultValue = " ") String word) {

        return LetterFinder.letterAmount(word);
    }

}
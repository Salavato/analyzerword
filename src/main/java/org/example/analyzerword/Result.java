package org.example.analyzerword;

public class Result {

    private String letter;
    private Integer count;

    public Result(String letter, Integer count) {
        this.letter = letter;
        this.count = count;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}

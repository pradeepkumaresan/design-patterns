package com.pradeep.creational.builder;

/**
 * This class is immutable after calling build().
 */
public class LunchOrder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    private LunchOrder(Builder builder){
        bread = builder.bread;
        condiments = builder.condiments;
        dressing = builder.dressing;
        meat = builder.meat;
    }

    /**
     * can be an external class as well.
     */
    static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        // can have args for mandatory fields.
        Builder(){

        }

        Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }

        Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }

        Builder meat(String meat){
            this.meat = meat;
            return this;
        }

        LunchOrder build(){
            return new LunchOrder(this);
        }
    }

    @Override
    public String toString() {
        return "LunchOrder{" +
                "bread='" + bread + '\'' +
                ", condiments='" + condiments + '\'' +
                ", dressing='" + dressing + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }
}

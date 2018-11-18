package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final   List<String> ingredients;

    public static class BigMacBuilder{
        private  String bun;
        private  int burgers;
        private  String sauce;
        private  List<String> ingredients = new ArrayList<>();

        public BigMacBuilder Bun(String bun){
            this.bun =bun;
            return this;
        }

        public BigMacBuilder Burgers(int burgers){
            this.burgers=burgers;
            return this;
        }

        public BigMacBuilder Sauce(String sauce){
            this.sauce=sauce;
            return this;
        }

        public BigMacBuilder Ingredient (String ingredient){
            this.ingredients.add(ingredient);
            return this;
        }

        public BigMac bulid(){
            return new BigMac(bun,burgers,sauce, ingredients);
        }
    }

    public BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}

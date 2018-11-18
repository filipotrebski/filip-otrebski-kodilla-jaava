package com.kodilla.patterns.builder.checkers;

public final class FigureFactory {
    public static final String PAWN = "PAWN";
    public static final String QUEEN = "QUEEN";

    public static Figure makeFigure(String figureType, String figureColor){
        if (figureType.equals(PAWN)){
            return new Pawn(figureColor);
        } else if (figureType.equals(QUEEN)) {
            return new Queen(figureColor);
        } else {
            throw new IllegalStateException("Type of figure should be pawn or queen");
        }
    }
}

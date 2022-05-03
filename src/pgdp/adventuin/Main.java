package pgdp.adventuin;

import pgdp.color.RgbColor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Adventuin a1 = new Adventuin("11", 10, new RgbColor(3, 2, 7, 0), HatType.FISHY_HAT, Language.ENGLISH);
        Adventuin a2 = new Adventuin("2", 23, new RgbColor(3, 1, 6, 0), HatType.NO_HAT, Language.GERMAN);
        Adventuin a3 = new Adventuin("33", 34, new RgbColor(3, 0, 5, 1), HatType.FISHY_HAT, Language.GERMAN);
        Adventuin a4 = new Adventuin("4", 11, new RgbColor(3, 2, 7, 0), HatType.SANTA_CLAUS, Language.ENGLISH);
        Adventuin a5 = new Adventuin("5", 18, new RgbColor(3, 1, 6, 0), HatType.NO_HAT, Language.ENGLISH);
        Adventuin a6 = new Adventuin("66", 25, new RgbColor(3, 0, 5, 1), HatType.REINDEER, Language.GERMAN);
        Adventuin a7 = new Adventuin("77", 12, new RgbColor(3, 2, 7, 0), HatType.FISHY_HAT, Language.GERMAN);
        Adventuin a8 = new Adventuin("88", 41, new RgbColor(3, 1, 6, 0), HatType.REINDEER, Language.GERMAN);
        Adventuin a9 = new Adventuin("999", 29, new RgbColor(3, 0, 5, 1), HatType.NO_HAT, Language.GERMAN);

        List<Adventuin> adventuins = new LinkedList<>();
        adventuins.add(a1);
        adventuins.add(a2);
        adventuins.add(a3);
        adventuins.add(a4);
        adventuins.add(a5);
        adventuins.add(a6);
        adventuins.add(a7);
        adventuins.add(a8);
        adventuins.add(a9);
        AdventuinParty party = new AdventuinParty();
        System.out.println(party.groupByHatType(adventuins));

        party.printLocalizedChristmasGreetings(adventuins);

        System.out.println(party.getAdventuinsWithLongestNamesByHatType(adventuins));

        int a1red = a1.getColor().toRgbColor8Bit().getRed();
        int a2red = a2.getColor().toRgbColor8Bit().getRed();
        int a3red = a3.getColor().toRgbColor8Bit().getRed();
        int a1green = a1.getColor().toRgbColor8Bit().getGreen();
        int a2green = a2.getColor().toRgbColor8Bit().getGreen();
        int a3green = a3.getColor().toRgbColor8Bit().getGreen();
        double a1blue = a1.getColor().toRgbColor8Bit().getBlue();
        double a2blue = a2.getColor().toRgbColor8Bit().getBlue();
        double a3blue = a3.getColor().toRgbColor8Bit().getBlue();
        double A1 = (0.2126 * a1red +
                0.7152 * a1green +
                0.0722 * a1blue) / 255;
        double A2 = (0.2126 * a2red +
                0.7152 * a2green +
                0.0722 * a2blue) / 255;
        double A3 = (0.2126 * a3red +
                0.7152 * a3green +
                0.0722 * a3blue) / 255;
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
        System.out.println((A1 + A2 + A3) / 3);

        System.out.println(party.getAverageColorBrightnessByHeight(adventuins));

        System.out.println(party.getDiffOfAvgHeightDiffsToPredecessorByHatType(adventuins));
    }
}

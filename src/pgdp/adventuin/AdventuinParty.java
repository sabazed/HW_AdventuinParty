package pgdp.adventuin;

import java.util.*;
import java.util.stream.Collectors;

public final class AdventuinParty {

    // Create a method to group the adventuins by hats
    public static Map<HatType, List <Adventuin>> groupByHatType(List<Adventuin> adventuins) {
        // Use stream to group all adventuins by their hat types
        return adventuins.stream().collect(Collectors.groupingBy(adventuin -> adventuin.getHatType()));
    }

    // Print out the greetings
    public static void printLocalizedChristmasGreetings(List<Adventuin> adventuins) {
        // Use a stream and sort it to ascending order by age using additional method
        adventuins.stream().sorted((a1, a2) -> a1.getHeight() - a2.getHeight()).forEach(adventuin -> {
            // Get the adventuin language object
            Language language = adventuin.getLanguage();
            // Pass its name as an argument and print the result out
            System.out.println(language.getLocalizedChristmasGreeting(adventuin.getName()));
        });
    }

    // Create a method where adventuins with the largest names are grouped by hat types
    public static Map<HatType, List<Adventuin>> getAdventuinsWithLongestNamesByHatType(List<Adventuin> adventuins) {
        // Create a variable to store the max name sizes
        int[] maxlength = new int[4];

        // Loop over all adventuins and get the largest name sizes fo each hat types
        for (Adventuin adventuin : adventuins) {
            // If the adventuin's name is larger the maxlength variable should be updated
            int name = adventuin.getName().length();
            if (name > maxlength[adventuin.getHatType().index]) maxlength[adventuin.getHatType().index] = name;
        }

        // Copy the maxlength to a final variable for the lambda function
        final int[] finalMaxlength = maxlength;

        // Create a List object to store all proper adventuins
        List<Adventuin> lastadventuins;

        // Create a stream and filter out the names by max lengths
        // Then convert the stream to a List and save it
        lastadventuins = adventuins.stream().filter(adventuin -> adventuin.getName().length() == finalMaxlength[adventuin.getHatType().index]).toList();

        // Use the predefined method to group the adventuins by the hat types and pass lastadventuins as an argument
        return groupByHatType(lastadventuins);
    }

    public static Map<Integer, Double> getAverageColorBrightnessByHeight(List<Adventuin> adventuins) {
        // Use stream to group all adventuins by their rounded height
        Map<Integer, List<Adventuin>> newadventuins = adventuins.stream()
                .collect(Collectors
                        .groupingBy(adventuin ->
                                (adventuin.getHeight() % 10 < 5) ? // Check if the adventuin should go in the lower bound or upper one
                                        adventuin.getHeight() - adventuin.getHeight() % 10 :
                                        adventuin.getHeight() + 5 - (adventuin.getHeight() + 5) % 10 // Add 5 so it goes to the upper one
        ));
        // Check if the height category 0 is created
        if (newadventuins.containsKey(0)) {
            // Copy all objects from 0 to 10 and remove 0
            newadventuins.put(10, newadventuins.get(0));
            newadventuins.remove(0);
        }
        // After generating a new map now we should calculate an average brightness from its values
        Map<Integer, Double> result = new HashMap<>();
        // Iterate over all map entries and put the corresponding double into a new map
        for (Map.Entry<Integer, List<Adventuin>> entry : newadventuins.entrySet()) {
            // Stream over all adventuins, apply the formula using mapToDouble() and get the average with proper method
            double brightness = entry.getValue().stream().mapToDouble(adventuin -> (
                    (0.2126 * adventuin.getColor().toRgbColor8Bit().getRed() +
                     0.7152 * adventuin.getColor().toRgbColor8Bit().getGreen() +
                     0.0722 * adventuin.getColor().toRgbColor8Bit().getBlue()) / 255)).average().getAsDouble();
            // Update the result map with the key and corresponding brightness
            result.put(entry.getKey(), brightness);
        }

        return result;
    }

    // Get the height difference in each hat group
    public static Map<HatType, Double> getDiffOfAvgHeightDiffsToPredecessorByHatType(List<Adventuin> adventuins) {
        // Firstly group the adventuins by their hat types using a predefined function
        Map<HatType, List<Adventuin>> groupedadventuins = groupByHatType(adventuins);
        // Create a final hashmap
        Map<HatType, Double> result = new HashMap<>();
        // Create variables to save the quantities[0] and values[1] of calculated differences
        double[] negativediff;
        double[] positivediff;
        // Create a variable outside the loop to save performance
        double[] adventuinheights;
        // Iterate over all the hat groups and calculate the differences
        for (Map.Entry<HatType, List<Adventuin>> entry : groupedadventuins.entrySet()) {
            //Reset the differences
            negativediff = new double[]{0.0, 0.0};
            positivediff = new double[]{0.0, 0.0};
            // Save the heights of groups in the array
            adventuinheights = entry.getValue().stream().mapToDouble(adventuin -> adventuin.getHeight()).toArray();
            // Loop over all height values and update the differences
            for (int i = 0; i < adventuinheights.length; i++) {
                // Save the result before for the sake of not calculating it again
                double resulth;
                // Calculate difference of the first and last element too
                if (i == adventuinheights.length - 1) resulth = adventuinheights[i] - adventuinheights[0];
                else resulth = adventuinheights[i] - adventuinheights[i + 1];
                // If the difference is 0 nothing should be returned
                if (resulth != 0) {
                    // Update the difference arrays
                    if (resulth > 0) {
                        positivediff[0]++;
                        positivediff[1] += resulth;
                    }
                    else {
                        // Save a negative value so we can get the positive average
                        negativediff[0]--;
                        negativediff[1] += resulth;
                    }
                }
            }

            // Calculate the absolute difference of the hat group
            double absolute = 0.0;
            // Avoid getting NaN
            if (negativediff[0] != 0 || positivediff[0] != 0) absolute = (negativediff[1] / negativediff[0]) + (positivediff[1] / positivediff[0]);

            // Now we should update the final map with the absolute average value
            result.put(entry.getKey(), absolute);
        }

        // Finally, return the result
        return result;
    }

}

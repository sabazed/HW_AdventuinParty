package pgdp.adventuin;

import pgdp.color.ExceptionUtil;
import pgdp.color.RgbColor;

public class Adventuin {

    // Add all attributes and mark them final
    private final String name;
    private final int height;
    private final RgbColor color;
    private final HatType hatType;
    private final Language language;

    // Create a constructor
    public Adventuin(String name, int size, RgbColor color, HatType hatType, Language language) {
        // Safety check
        if (name == null || size < 1 || color == null || hatType == null || language == null) ExceptionUtil.unsupportedOperation("Invalid arguments");
        this.name = name;
        this.height = size;
        this.color = color;
        this.hatType = hatType;
        this.language = language;
    }

    // Generate all getters
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public RgbColor getColor() {
        return color;
    }

    public HatType getHatType() {
        return hatType;
    }

    public Language getLanguage() {
        return language;
    }

}

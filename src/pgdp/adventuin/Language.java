package pgdp.adventuin;

public enum Language {

    // Add all language objects
    GERMAN {
        public String getLocalizedChristmasGreeting (String greeterName) {
            return "Fröhliche Weihnachten wünscht dir " + greeterName + "!";
        }
    },
    ENGLISH {
        public String getLocalizedChristmasGreeting (String greeterName) {
            return greeterName + " wishes you a Merry Christmas!";
        }
    },
    GEORGIAN {
        public String getLocalizedChristmasGreeting (String greeterName) {
            return greeterName + " ბედნიერ შობას გისურვებთ!";
        }
    };

    // Create an abstract function to call it later
    public abstract String getLocalizedChristmasGreeting(String name);

}

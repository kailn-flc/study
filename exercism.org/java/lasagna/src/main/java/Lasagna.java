public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinute) {
        int expectedMinute = expectedMinutesInOven();

        if (actualMinute < 0) {
            return 0;
        }

        return expectedMinute - actualMinute;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layerNumber) {
        if (layerNumber < 0) {
            return 0;
        }

        return layerNumber * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layerNumber, int actualMinute) {
        int preparedTime = preparationTimeInMinutes(layerNumber);
        
        return actualMinute + preparedTime;
    }
}

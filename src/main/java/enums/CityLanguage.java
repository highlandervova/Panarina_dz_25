package enums;

public enum CityLanguage {



        EN(1),
        RU(2),
        UA(3);

        private CityLanguage(int value) {
            this.value = value;
        }

        private int value;

        public int getValue() {
            return value;
        }
    }



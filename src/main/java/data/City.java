package data;

import java.io.Serializable;



import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

    public class City implements Serializable {
        private String id;
        private String name;
        private int    language;

        public City(String id, String name, int language) {
            this.id = id;
            this.name = name;
            this.language = language;
        }
        public City() {

        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getLanguage() {
            return language;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLanguage(int language) {
            this.language = language;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            City city = (City) o;
            return language == city.language && Objects.equals(id, city.id) && Objects.equals(name, city.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, language);
        }

        @Override
        public String toString() {
            return "City{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", language=" + language +
                    '}';
        }
    }

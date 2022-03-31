package za.ac.cput.Entity;

/*      Inventory.java
        Entity for the inventory
        Author: Devon Daniels (217299822)
        Date: 03 April 2022

 */
public class Inventory {
    private String ID, filmId, lastUpdate;

    private Inventory(){}

    private Inventory(Builder builder) {
        this.ID = builder.ID;
        this.filmId = builder.filmId;
        this.lastUpdate = builder.lastUpdate;
    }
    public String getID() {
        return ID;
    }

    public String getFilmId() {
        return filmId;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        return "za.ac.cput.Entity.Inventory{" +
                "Id='" + ID + '\'' +
                ", Film ID='" + filmId + '\'' +
                ", Last Update='" + lastUpdate + '\'' +
                '}';
    }

    public static class Builder {
        private String ID, filmId, lastUpdate;

        public Builder setID(String ID) {
            this.ID = ID;

            return this;
        }

        public Builder setfilmId(String filmId) {
            this.filmId = filmId;

            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            this.lastUpdate = lastUpdate;

            return this;
        }


        public Inventory Build() {

            return new Inventory(this);
        }

        public Builder copy(Inventory inventory) {
            this.ID = inventory.ID;
            this.filmId = inventory.filmId;
            this.lastUpdate = inventory.lastUpdate;

            return this;
        }


    }

}
package results;

public enum CardinalPoint {
    N ("północ","North",0),
    E ("wschód","East",90),
    S ("południe","South",180),
    W ("Zachód","West",270),
    NE ("Północny wschód","Northeast",45),
    SE ("Południowy wschód","Southeast",135),
    SW ("Południowy zachód","Soutwest",225),
    NW ("Północny zachód","Northwest",315);

    String namePl;
    String nameEn;
    int rotation;

    CardinalPoint(String namePl, String nameEn, int rotation) {
        this.namePl = namePl;
        this.nameEn = nameEn;
        this.rotation = rotation;
    }

    public String getNamePl() {
        return namePl;
    }

    public String getNameEn() {
        return nameEn;
    }

    public int getRotation() {
        return rotation;
    }

    @Override
    public String toString() {
        return "CardinalPoint{" +
                "namePl='" + namePl + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", rotation=" + rotation +
                '}';
    }
}

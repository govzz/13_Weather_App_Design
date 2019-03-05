package mg.studio.weather;

import com.google.gson.annotations.SerializedName;

import java.util.List;



public class Weather {


    /**
     * cod : 200
     * message : 0.0066
     * cnt : 40
     * list : [{"dt":1551787200,"main":{"temp":51.04,"temp_min":50.04,"temp_max":51.04,"pressure":1016.71,"sea_level":1016.71,"grnd_level":959.32,"humidity":94,"temp_kf":0.56},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":68},"wind":{"speed":2.15,"deg":188},"rain":{"3h":0.0425},"sys":{"pod":"n"},"dt_txt":"2019-03-05 12:00:00"},{"dt":1551798000,"main":{"temp":47.77,"temp_min":47.1,"temp_max":47.77,"pressure":1019.27,"sea_level":1019.27,"grnd_level":961.44,"humidity":92,"temp_kf":0.37},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":76},"wind":{"speed":3.15,"deg":176.501},"rain":{"3h":0.055},"sys":{"pod":"n"},"dt_txt":"2019-03-05 15:00:00"},{"dt":1551808800,"main":{"temp":46.98,"temp_min":46.64,"temp_max":46.98,"pressure":1019.84,"sea_level":1019.84,"grnd_level":961.69,"humidity":93,"temp_kf":0.19},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":80},"wind":{"speed":2.77,"deg":153},"rain":{"3h":0.7475},"sys":{"pod":"n"},"dt_txt":"2019-03-05 18:00:00"},{"dt":1551819600,"main":{"temp":45.7,"temp_min":45.7,"temp_max":45.7,"pressure":1018.78,"sea_level":1018.78,"grnd_level":960.6,"humidity":94,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":76},"wind":{"speed":2.71,"deg":124.5},"rain":{"3h":0.0425},"sys":{"pod":"n"},"dt_txt":"2019-03-05 21:00:00"},{"dt":1551830400,"main":{"temp":45.72,"temp_min":45.72,"temp_max":45.72,"pressure":1020.17,"sea_level":1020.17,"grnd_level":961.87,"humidity":92,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":48},"wind":{"speed":2.59,"deg":133.003},"rain":{"3h":0.02},"sys":{"pod":"d"},"dt_txt":"2019-03-06 00:00:00"},{"dt":1551841200,"main":{"temp":53.61,"temp_min":53.61,"temp_max":53.61,"pressure":1020.87,"sea_level":1020.87,"grnd_level":963.17,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":68},"wind":{"speed":3.74,"deg":111.5},"rain":{"3h":0.015},"sys":{"pod":"d"},"dt_txt":"2019-03-06 03:00:00"},{"dt":1551852000,"main":{"temp":56.06,"temp_min":56.06,"temp_max":56.06,"pressure":1018.55,"sea_level":1018.55,"grnd_level":961.19,"humidity":94,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":68},"wind":{"speed":4.07,"deg":150.004},"rain":{"3h":0.06},"sys":{"pod":"d"},"dt_txt":"2019-03-06 06:00:00"},{"dt":1551862800,"main":{"temp":54.79,"temp_min":54.79,"temp_max":54.79,"pressure":1016.86,"sea_level":1016.86,"grnd_level":959.67,"humidity":85,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":5.86,"deg":137.502},"rain":{"3h":0.07},"sys":{"pod":"d"},"dt_txt":"2019-03-06 09:00:00"},{"dt":1551873600,"main":{"temp":50.65,"temp_min":50.65,"temp_max":50.65,"pressure":1018.66,"sea_level":1018.66,"grnd_level":960.88,"humidity":85,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":4.16,"deg":122.502},"rain":{"3h":0.195},"sys":{"pod":"n"},"dt_txt":"2019-03-06 12:00:00"},{"dt":1551884400,"main":{"temp":48.71,"temp_min":48.71,"temp_max":48.71,"pressure":1020.7,"sea_level":1020.7,"grnd_level":962.68,"humidity":84,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":7.96,"deg":124.5},"rain":{"3h":0.1},"sys":{"pod":"n"},"dt_txt":"2019-03-06 15:00:00"},{"dt":1551895200,"main":{"temp":45.24,"temp_min":45.24,"temp_max":45.24,"pressure":1021.38,"sea_level":1021.38,"grnd_level":963.01,"humidity":93,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":7.23,"deg":131},"rain":{"3h":1.5},"sys":{"pod":"n"},"dt_txt":"2019-03-06 18:00:00"},{"dt":1551906000,"main":{"temp":44.66,"temp_min":44.66,"temp_max":44.66,"pressure":1020.25,"sea_level":1020.25,"grnd_level":961.67,"humidity":92,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":4.5,"deg":114.5},"rain":{"3h":0.3},"sys":{"pod":"n"},"dt_txt":"2019-03-06 21:00:00"},{"dt":1551916800,"main":{"temp":45.38,"temp_min":45.38,"temp_max":45.38,"pressure":1021.06,"sea_level":1021.06,"grnd_level":962.32,"humidity":91,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":3.94,"deg":107.003},"rain":{"3h":0.04},"sys":{"pod":"d"},"dt_txt":"2019-03-07 00:00:00"},{"dt":1551927600,"main":{"temp":49.45,"temp_min":49.45,"temp_max":49.45,"pressure":1022.32,"sea_level":1022.32,"grnd_level":963.94,"humidity":93,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":4.74,"deg":111.506},"rain":{"3h":0.065},"sys":{"pod":"d"},"dt_txt":"2019-03-07 03:00:00"},{"dt":1551938400,"main":{"temp":51.85,"temp_min":51.85,"temp_max":51.85,"pressure":1020,"sea_level":1020,"grnd_level":961.99,"humidity":84,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":6.29,"deg":112.501},"rain":{"3h":0.015000000000001},"sys":{"pod":"d"},"dt_txt":"2019-03-07 06:00:00"},{"dt":1551949200,"main":{"temp":51.32,"temp_min":51.32,"temp_max":51.32,"pressure":1018.36,"sea_level":1018.36,"grnd_level":960.45,"humidity":76,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":6.73,"deg":124.006},"rain":{"3h":0.02},"sys":{"pod":"d"},"dt_txt":"2019-03-07 09:00:00"},{"dt":1551960000,"main":{"temp":47.11,"temp_min":47.11,"temp_max":47.11,"pressure":1019.62,"sea_level":1019.62,"grnd_level":961.34,"humidity":75,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":6.64,"deg":122.503},"rain":{"3h":0.03},"sys":{"pod":"n"},"dt_txt":"2019-03-07 12:00:00"},{"dt":1551970800,"main":{"temp":43.64,"temp_min":43.64,"temp_max":43.64,"pressure":1021.42,"sea_level":1021.42,"grnd_level":962.78,"humidity":76,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":56},"wind":{"speed":3.96,"deg":124},"rain":{"3h":0.02},"sys":{"pod":"n"},"dt_txt":"2019-03-07 15:00:00"},{"dt":1551981600,"main":{"temp":42.85,"temp_min":42.85,"temp_max":42.85,"pressure":1021.18,"sea_level":1021.18,"grnd_level":962.25,"humidity":79,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":2.71,"deg":113.002},"rain":{"3h":0.045},"sys":{"pod":"n"},"dt_txt":"2019-03-07 18:00:00"},{"dt":1551992400,"main":{"temp":42.21,"temp_min":42.21,"temp_max":42.21,"pressure":1020,"sea_level":1020,"grnd_level":961.02,"humidity":82,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.93,"deg":119},"rain":{"3h":0.015000000000001},"sys":{"pod":"n"},"dt_txt":"2019-03-07 21:00:00"},{"dt":1552003200,"main":{"temp":42.25,"temp_min":42.25,"temp_max":42.25,"pressure":1020.76,"sea_level":1020.76,"grnd_level":961.63,"humidity":84,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":3.62,"deg":113.507},"rain":{"3h":0.02},"sys":{"pod":"d"},"dt_txt":"2019-03-08 00:00:00"},{"dt":1552014000,"main":{"temp":48.03,"temp_min":48.03,"temp_max":48.03,"pressure":1020.86,"sea_level":1020.86,"grnd_level":962.48,"humidity":83,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"多云","icon":"03d"}],"clouds":{"all":44},"wind":{"speed":3.74,"deg":136.003},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-08 03:00:00"},{"dt":1552024800,"main":{"temp":52.79,"temp_min":52.79,"temp_max":52.79,"pressure":1017.89,"sea_level":1017.89,"grnd_level":960.26,"humidity":82,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"多云","icon":"03d"}],"clouds":{"all":44},"wind":{"speed":2.39,"deg":71.5007},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-08 06:00:00"},{"dt":1552035600,"main":{"temp":53.81,"temp_min":53.81,"temp_max":53.81,"pressure":1015.41,"sea_level":1015.41,"grnd_level":957.9,"humidity":75,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"多云","icon":"03d"}],"clouds":{"all":32},"wind":{"speed":3.74,"deg":359.502},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-08 09:00:00"},{"dt":1552046400,"main":{"temp":49.79,"temp_min":49.79,"temp_max":49.79,"pressure":1016.74,"sea_level":1016.74,"grnd_level":958.82,"humidity":76,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":76},"wind":{"speed":2.59,"deg":348},"rain":{"3h":0.010000000000001},"sys":{"pod":"n"},"dt_txt":"2019-03-08 12:00:00"},{"dt":1552057200,"main":{"temp":48.06,"temp_min":48.06,"temp_max":48.06,"pressure":1018.86,"sea_level":1018.86,"grnd_level":960.46,"humidity":82,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.93,"deg":344.001},"rain":{"3h":0.085},"sys":{"pod":"n"},"dt_txt":"2019-03-08 15:00:00"},{"dt":1552068000,"main":{"temp":46.75,"temp_min":46.75,"temp_max":46.75,"pressure":1019.33,"sea_level":1019.33,"grnd_level":960.74,"humidity":94,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.25,"deg":121.002},"rain":{"3h":1.58},"sys":{"pod":"n"},"dt_txt":"2019-03-08 18:00:00"},{"dt":1552078800,"main":{"temp":45.75,"temp_min":45.75,"temp_max":45.75,"pressure":1018.47,"sea_level":1018.47,"grnd_level":959.84,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.71,"deg":98.0003},"rain":{"3h":1.39},"sys":{"pod":"n"},"dt_txt":"2019-03-08 21:00:00"},{"dt":1552089600,"main":{"temp":45.08,"temp_min":45.08,"temp_max":45.08,"pressure":1019.16,"sea_level":1019.16,"grnd_level":960.53,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":3.15,"deg":102.504},"rain":{"3h":1.19},"sys":{"pod":"d"},"dt_txt":"2019-03-09 00:00:00"},{"dt":1552100400,"main":{"temp":48.05,"temp_min":48.05,"temp_max":48.05,"pressure":1019.58,"sea_level":1019.58,"grnd_level":961.56,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.84,"deg":74.5002},"rain":{"3h":1.56},"sys":{"pod":"d"},"dt_txt":"2019-03-09 03:00:00"},{"dt":1552111200,"main":{"temp":48.88,"temp_min":48.88,"temp_max":48.88,"pressure":1018,"sea_level":1018,"grnd_level":960.4,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":3.36,"deg":306.003},"rain":{"3h":1.85},"sys":{"pod":"d"},"dt_txt":"2019-03-09 06:00:00"},{"dt":1552122000,"main":{"temp":49.4,"temp_min":49.4,"temp_max":49.4,"pressure":1016.33,"sea_level":1016.33,"grnd_level":958.77,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":3.58,"deg":323.002},"rain":{"3h":0.41},"sys":{"pod":"d"},"dt_txt":"2019-03-09 09:00:00"},{"dt":1552132800,"main":{"temp":47.94,"temp_min":47.94,"temp_max":47.94,"pressure":1017.54,"sea_level":1017.54,"grnd_level":959.6,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":2.68,"deg":338.5},"rain":{"3h":0.13},"sys":{"pod":"n"},"dt_txt":"2019-03-09 12:00:00"},{"dt":1552143600,"main":{"temp":47.42,"temp_min":47.42,"temp_max":47.42,"pressure":1020.44,"sea_level":1020.44,"grnd_level":962.08,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.59,"deg":270.002},"rain":{"3h":2.06},"sys":{"pod":"n"},"dt_txt":"2019-03-09 15:00:00"},{"dt":1552154400,"main":{"temp":47.26,"temp_min":47.26,"temp_max":47.26,"pressure":1021.37,"sea_level":1021.37,"grnd_level":962.72,"humidity":98,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"中雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.73,"deg":250.003},"rain":{"3h":6.3},"sys":{"pod":"n"},"dt_txt":"2019-03-09 18:00:00"},{"dt":1552165200,"main":{"temp":46.74,"temp_min":46.74,"temp_max":46.74,"pressure":1020.86,"sea_level":1020.86,"grnd_level":962.09,"humidity":100,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"中雨","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":2.93,"deg":191.5},"rain":{"3h":3.87},"sys":{"pod":"n"},"dt_txt":"2019-03-09 21:00:00"},{"dt":1552176000,"main":{"temp":46.3,"temp_min":46.3,"temp_max":46.3,"pressure":1022.06,"sea_level":1022.06,"grnd_level":963.15,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":3.2,"deg":233.503},"rain":{"3h":0.82},"sys":{"pod":"d"},"dt_txt":"2019-03-10 00:00:00"},{"dt":1552186800,"main":{"temp":49.33,"temp_min":49.33,"temp_max":49.33,"pressure":1022.58,"sea_level":1022.58,"grnd_level":964.67,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":80},"wind":{"speed":3.96,"deg":237.005},"rain":{"3h":0.46},"sys":{"pod":"d"},"dt_txt":"2019-03-10 03:00:00"},{"dt":1552197600,"main":{"temp":52.2,"temp_min":52.2,"temp_max":52.2,"pressure":1020.42,"sea_level":1020.42,"grnd_level":963.16,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":56},"wind":{"speed":3.6,"deg":306.005},"rain":{"3h":0.12},"sys":{"pod":"d"},"dt_txt":"2019-03-10 06:00:00"},{"dt":1552208400,"main":{"temp":53.61,"temp_min":53.61,"temp_max":53.61,"pressure":1018.2,"sea_level":1018.2,"grnd_level":961.09,"humidity":97,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"多云","icon":"03d"}],"clouds":{"all":48},"wind":{"speed":3.49,"deg":345.504},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-10 09:00:00"}]
     * city : {"id":1814906,"name":"Chongqing","coord":{"lat":29.5586,"lon":106.5493},"country":"CN","population":3967028}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityEntity city;
    private List<ListEntity> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }

    public List<ListEntity> getList() {
        return list;
    }

    public void setList(List<ListEntity> list) {
        this.list = list;
    }

    public static class CityEntity {
        /**
         * id : 1814906
         * name : Chongqing
         * coord : {"lat":29.5586,"lon":106.5493}
         * country : CN
         * population : 3967028
         */

        private int id;
        private String name;
        private CoordEntity coord;
        private String country;
        private int population;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordEntity getCoord() {
            return coord;
        }

        public void setCoord(CoordEntity coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public static class CoordEntity {
            /**
             * lat : 29.5586
             * lon : 106.5493
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListEntity {
        /**
         * dt : 1551787200
         * main : {"temp":51.04,"temp_min":50.04,"temp_max":51.04,"pressure":1016.71,"sea_level":1016.71,"grnd_level":959.32,"humidity":94,"temp_kf":0.56}
         * weather : [{"id":500,"main":"Rain","description":"小雨","icon":"10n"}]
         * clouds : {"all":68}
         * wind : {"speed":2.15,"deg":188}
         * rain : {"3h":0.0425}
         * sys : {"pod":"n"}
         * dt_txt : 2019-03-05 12:00:00
         */

        private int dt;
        private MainEntity main;
        private CloudsEntity clouds;
        private WindEntity wind;
        private RainEntity rain;
        private SysEntity sys;
        private String dt_txt;
        private List<WeatherEntity> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainEntity getMain() {
            return main;
        }

        public void setMain(MainEntity main) {
            this.main = main;
        }

        public CloudsEntity getClouds() {
            return clouds;
        }

        public void setClouds(CloudsEntity clouds) {
            this.clouds = clouds;
        }

        public WindEntity getWind() {
            return wind;
        }

        public void setWind(WindEntity wind) {
            this.wind = wind;
        }

        public RainEntity getRain() {
            return rain;
        }

        public void setRain(RainEntity rain) {
            this.rain = rain;
        }

        public SysEntity getSys() {
            return sys;
        }

        public void setSys(SysEntity sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public List<WeatherEntity> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherEntity> weather) {
            this.weather = weather;
        }

        public static class MainEntity {
            /**
             * temp : 51.04
             * temp_min : 50.04
             * temp_max : 51.04
             * pressure : 1016.71
             * sea_level : 1016.71
             * grnd_level : 959.32
             * humidity : 94
             * temp_kf : 0.56
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsEntity {
            /**
             * all : 68
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindEntity {
            /**
             * speed : 2.15
             * deg : 188
             */

            private double speed;
            private double deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public double getDeg() {
                return deg;
            }

            public void setDeg(double deg) {
                this.deg = deg;
            }
        }

        public static class RainEntity {
            /**
             * 3h : 0.0425
             */

            @SerializedName("3h")
            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class SysEntity {
            /**
             * pod : n
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class WeatherEntity {
            /**
             * id : 500
             * main : Rain
             * description : 小雨
             * icon : 10n
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}

package net.codejava;

import javax.persistence.*;

@Entity
public class Product {

        private Integer id;
        private String name;
        private float price;
        private String username;
        private String password;
        private String madein;
        private String brand;

        public Product() {

        }

        public Product(Integer id, String name, float price, String username, String password, String madein, String brand) {
                this.id = id;
                this.name = name;
                this.price = price;
                this.username = username;
                this.password = password;
                this.madein = madein;
                this.brand = brand;
        }




        @Id
        @GeneratedValue ( strategy = GenerationType.IDENTITY)
        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public float getPrice() {
                return price;
        }

        public void setPrice(float price) {
                this.price = price;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getMadein() {
                return madein;
        }

        public void setMadein(String madein) {
                this.madein = madein;
        }

        public String getBrand() {
                return brand;
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }



}

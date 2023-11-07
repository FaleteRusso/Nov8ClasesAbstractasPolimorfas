package com.corenetworks.modelo;


    public abstract class Figura {
        protected int x;
        protected int y;


        public abstract double calcularArea();

        @Override
        public String toString() {
            return "PruebaFigura{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public Figura() {
        }

        public Figura(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }


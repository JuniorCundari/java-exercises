package com.junior.ex1;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setName("Círculo");
        circle.setRadius(2);

        Square square = new Square();
        square.setName("Quadrado");
        square.setLength(2);

        Triangle triangle = new Triangle();
        triangle.setName("Triângulo");
        triangle.setBase(3);
        triangle.setHeight(2);

        Cube cube = new Cube();
        cube.setName("Cubo");
        cube.setColor("Vermelho");
        cube.setEdge(3);

        Cylinder cylinder = new Cylinder();
        cylinder.setName("Cilindro");
        cylinder.setColor("Azul");
        cylinder.setHeight(3);
        cylinder.setRadius(2);

        Pyramid pyramid = new Pyramid();
        pyramid.setName("Pirâmide");
        pyramid.setApothem(4);
        pyramid.setBase(square);
        pyramid.setHeight(3);
        pyramid.setBasePolygon(4);
        pyramid.setEdge(2);

        GeometricFigure[] figures = new GeometricFigure[6];
        figures[0] = circle;
        figures[1] = square;
        figures[2] = triangle;
        figures[3] = cube;
        figures[4] = cylinder;
        figures[5] = pyramid;

        for (GeometricFigure figure : figures) {
            System.out.println("---------------------");
            System.out.println(figure.getName());
            System.out.println(figure.getColor());

            if (figure instanceof Figure2D) {
                Figure2D figure2D = (Figure2D) figure;
                System.out.println(figure2D.calculateArea());
            }

            if (figure instanceof Figure3D) {
                Figure3D figure3D = (Figure3D) figure;
                System.out.println(figure3D.calculateArea());
                System.out.println(figure3D.calculateVolume());
            }
        }
    }
}
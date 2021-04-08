public class Estudiante{
    //Atributos
    String nombre;
    int edad;
    int carnetIdentidad;
    double altura;
    //Metodo constructor
    public Estudiante(String nombre, int edad, int carnetIdentidad, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.carnetIdentidad = carnetIdentidad;
        this.altura = altura;
    }
    //¿Que puede hacer?
    public int multiplicar(int num1, int num2){
        int producto;
        producto = num1 * num2;
        return producto;
    }

    public String saludar(){
        String saludo;
        saludo = " Hi my name is "+ nombre +" ,my age is "+ edad + " ,my card number is "+ carnetIdentidad +" and my height is "+ altura;
        return saludo;
    }

    public double dividir(double dividendo, double divisor){
        double cociente;
        cociente = dividendo / divisor;
        return cociente;
    }
    //Gets y sets
    public String getNombre(){
        return nombre;   
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getCarnetIdentidad(){
        return carnetIdentidad;
    }
    
    public void setCarnetIdentidad(int carnetIdentidad){
        this.carnetIdentidad = carnetIdentidad;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
}


public class Persona { //clase
    // Variables
    String nombre;
    String direccion;
    String ocupacion;
    int telefono;
    int edad;

    // Metodo constructor
    public Persona(String nombre, String direccion, String ocupacion, int edad, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.telefono = telefono;
    }



    // Metodo para presentarse
    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + ", y mi direccion es " + direccion + " mi ocupacion es  " + ocupacion +
                "mi telefono es " +telefono +".");
    }



    // metodo para correr
    public void correr() {
        System.out.println(nombre + " está corriendo.");
    }
    //metodo para caminar
    public void caminar() {
        System.out.println(nombre + " está caminando.");
    }

    //metodo dormir
    public  void  dormir (){
        System.out.println(nombre +" está dormido");
    }

    public static void main(String[] args) {
        //Crear instancia de estudiante
        Persona estudiante= new Persona("Pepito","solanda","estudiante",20, 984523160 );
        Persona docente= new Persona("Jorge","solanda","docente",40, 969517681 );
        Persona secretaria= new Persona("Camila","zabala","estudiante",28, 984523160 );


        //Usar los metodos
        estudiante.presentarse();
        secretaria.dormir();

    }
}

public class jugador{
    String avatar;
    int edad;
    String pais;

    public jugador(){  /*player1*/
        avatar = "Sebas";
        edad = 20;
        pais = "Ecuador";
    }

    public jugador (String avatar, int edad, String pais){   /*player 2*/
        this.avatar = avatar;
        this.edad = edad;
        this.pais = pais;
    }


    public  void patear(){
        System.out.println("EL jugador "+avatar+ " esta pateando");
    }
    public void correr(){
        System.out.println("El jugador "+avatar+ " esta corriendo");
    }

    public void saltar(){
        System.out.println("El jugador "+avatar +" esta saltando");

    }
    public static void main (String [] args){
    jugador player1= new jugador();
    jugador player2 = new jugador("Jairo",20,"mexico");

    player1.correr();
    player1.patear();

    player2.correr();
    player2.saltar();
    player2.patear();
    }
}


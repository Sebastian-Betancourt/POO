public class jugador{
    String avatar;
    int edad;
    String pais;
    int saltos=0;
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

    public void saltar(int s){
        saltos =4+s;
        System.out.println("El jugador "+avatar +" esta saltando");
        System.out.println(saltos);
    }

}


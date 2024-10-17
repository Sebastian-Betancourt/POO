public class llamarClase {
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

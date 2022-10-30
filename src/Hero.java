public class Hero {

    private String name;
    private String clas;
    private int force;
    private int mana;
    private boolean player;

    public Hero(String name, String clas, int force, int mana, boolean player) {
        this.name = name;
        this.clas = clas;
        this.force = force;
        this.mana = mana;
        this.player = player;

    }
        public void changeName (String name){
        this.name=name;
        }
        public String vievname(){
        return name;
        }
        public void changeClas (String clas){
        this.clas=clas;
        }
        public String vievclas(){
        return clas;
        }
        public void changePlayer(boolean player){
        this.player=player;
        }
        public boolean vievPlayer(){
        return player;
        }
}

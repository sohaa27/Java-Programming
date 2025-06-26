package day1_6;

class Player {
    private int playerCode;
    private String playerName;
    private static int count = 0;

    public Player(int code, String name) {
        this.playerCode = code;
        this.playerName = name;
        count++;
    }

    public void printDetails() {
        System.out.println("Player Code: " + playerCode);
        System.out.println("Player Name: " + playerName);
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Player p1 = new Player(101, "Rohit");
        Player p2 = new Player(102, "Virat");

        p1.printDetails();
        p2.printDetails();

        System.out.println("Total Players Created: " + Player.getCount());
    }
}

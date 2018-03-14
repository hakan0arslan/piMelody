package piMelody;

public class PiConverter{

    //object for playing notes
    Player pi = new Player();


    //choose notes for values of pi
    public void convert(int i) {


        switch (i) {
            case 0:
                System.out.print("0");
                pi.playSound("a.wav");
                break;
            case 1:
                System.out.print("1");
                pi.playSound("b.wav");
                break;
            case 2:
                System.out.print("2");
                pi.playSound("c.wav");
                break;
            case 3:
                System.out.print("3");
                pi.playSound("d.wav");
                break;
            case 4:
                System.out.print("4");
                pi.playSound("e.wav");
                break;
            case 5:
                System.out.print("5");
                pi.playSound("f.wav");
                break;
            case 6:
                System.out.print("6");
                pi.playSound("g.wav");
                break;
            case 7:
                System.out.print("7");
                pi.playSound("a.wav");
                break;
            case 8:
                System.out.print("8");
                pi.playSound("b.wav");
                break;
            case 9:
                System.out.print("9");
                pi.playSound("c.wav");
                break;

        }


    }


}

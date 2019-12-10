public class Cowsay{
    public static void main(String[] args){
        Cow[] cowObjects = HeiferGenerator.getCows();
        if(args[0].equals("-1")){
            listCows(cowObjects);
        }
        else if(args[0].equals("-n")){
            int count = 0;
            for(int i = 0; i < cowObjects.length; i++){
                if(args[1].equals(cowObjects[i].getName())){
                    System.out.println();
                    for(int x = 2; x < args.length; x++){
                        System.out.print(args[x] + " ");
                    }
                    System.out.println();
                    System.out.println(cowObjects[i].getImage());
                    if(cowObjects[i].getName().equals("dragon")){
                        System.out.println("This Dragon can breathe fire.");
                    }
                    if(cowObjects[i].getName().equals("ice-dragon")){
                        System.out.println("This dragon cannot breathe fire.");
                    }
                    i = cowObjects.length;
                    count++;
                }
            }
            if(count == 0){
                System.out.println("Could not find " + args[1] + " cow!");
            }
            System.out.println();
        }
        else{
            System.out.println();
            for(int i = 0; i < args.length; i++){
                System.out.print(args[i] + " ");
            }
            System.out.println();
            System.out.println(cowObjects[0].getImage());
        }
    }

    private static void listCows(Cow[] cows){
        System.out.print("Cows available: ");
        for(int i = 0; i < cows.length; i++){
            System.out.print(cows[i].getName() + " ");
        }
    }
}

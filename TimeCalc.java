public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int mm = Integer.parseInt(args[1]);
        int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
		int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));
        int totalminutes = (int)(hours * 60) + (int)(minutes) + mm;
        int totalhours = totalminutes / (int)(60);
        int newhours = totalhours % (int)(24);
        int newminutes = totalminutes - (totalhours * (int)(60));
        if (newhours < 10){
            System.out.print("0");
        }
        System.out.print(newhours + ":");
        if (newminutes < 10) {
            System.out.print("0");
        }
        System.out.println(newminutes);
    }
}

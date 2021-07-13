public class homeworkclass2temp {public static void main(String[] args ){
    double ctemp = 21;
    double ftemp = ctemp * 9/5 +32;
    System.out.println(ctemp + "ºC = " + ftemp+ "ºF");

    double ktemp = ctemp + 273.15;
    System.out.println(ctemp + "ºC = " + ktemp+"ºK");

    double Ftemp = 78;
    double Ctemp = (Ftemp - 32) / 1.8;
    System.out.println(Ftemp + "ºF = " + ctemp+"ºC");

    double Ktemp = (Ftemp + 459.67) * 5/9;
    System.out.println(Ftemp + "ºF = " + Ktemp+"ºK");

    double cTemp = Ktemp - 273.15;
    System.out.println(Ktemp + "ºK = " + cTemp+"ºC");

    double fTemp = (Ktemp * 9/5) - 459.67;
    System.out.println(Ktemp +"ºK = "+fTemp+"ºF");


}
}

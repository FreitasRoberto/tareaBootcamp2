public class Switch {
    public static void main(String[] args) {
        var estacion = "KEYLA";

        switch (estacion){
            case "INVIERNO":
            case "OTOÑO":
            case "PRIMAVERA":
            case "VERANO":
                System.out.println("la estacion es " + estacion);
                break;
            default:
                System.out.println("No es una estacion");

        }
    }

}

package NoSolid.DIP;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion sin DIP");
        InterfazUsuario usuario = new InterfazUsuario();
        usuario.saveEmployeeId("E001");
    }
}

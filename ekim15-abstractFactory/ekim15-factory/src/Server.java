public class Server extends Computer{
    String Ram,CPU;
    Server(String Ram, String CPU){
        this.Ram=Ram;this.CPU=CPU;
    }

    @Override
    String getRam(){
        return this.Ram;
    }

    @Override
    String getCpu(){
        return this.CPU;
    }
}

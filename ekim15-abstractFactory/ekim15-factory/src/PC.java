public class PC extends Computer{
    String Ram,CPU;
    PC(String Ram, String CPU){
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

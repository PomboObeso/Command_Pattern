class LightOffCommand implements Command {
    
    Light light;

    public LightOffCommand(Light light){
        this.light = light;                 //Comando que implementa Command
    }
    public void execute(){
        light.off();        //Metodo Invoker que executa o execute
    }
}

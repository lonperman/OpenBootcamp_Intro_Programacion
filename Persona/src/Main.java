public class Main {
    public static void main(String[] arg){
        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setNombre("Manuel");
        persona.setTelefono(23443348);
        String Nombre = persona.getNombre();
        int Edad = persona.Edad;
        int Telefono = persona.getTelefono();
        System.out.println(Nombre);
        System.out.println(Edad);
        System.out.println(Telefono);
    }

    static class Persona {
        private int Edad;
        private String Nombre;
        private int Telefono;


        public void setEdad(int Edad){
            this.Edad = Edad;
        }

        public int getEdad(){
            return this.Edad;
        }

        public void setNombre(String Nombre){
            this.Nombre = Nombre;
        }

        public String getNombre(){
            return this.Nombre;
        }

        public void setTelefono(int Telefono){
            this.Telefono = Telefono;
        }

        public int getTelefono(){
            return this.Telefono;
        }
    }
}

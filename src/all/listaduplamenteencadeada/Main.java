package all.listaduplamenteencadeada;

public class Main {

    public static void main(String[] args) {
            ListaDupla i = new ListaDupla();
            System.out.print(i);

            i.inserirInicio("Hamilton Sobrinho");
            System.out.println(i);
            i.inserirInicio("Pedro Macedo");
            System.out.println(i);
            i.inserir(1, "Macedo");
            System.out.println(i);

            System.out.println( "Foi retirado: "+ i.retirar(1));
            System.out.println(i);

             i.retirarInicio();
             System.out.println(i);
        }
}

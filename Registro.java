import java.util.*;
import java.io.*;
public class Registro
{
    private LinkedList<Veicolo> registro;

    public Registro()
    {
        registro = new LinkedList<Veicolo>();
    }

    public void carica()
    {
        File f = new File("Veicoli.txt");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            int nveicoli = Integer.parseInt(br.readLine());
            for (int i = 0; i<nveicoli; i++)
            {
				String cat = br.readLine();
                String ma = br.readLine();
                String mo = br.readLine();
                int cc = Integer.parseInt(br.readLine());
                Veicolo v =  new Veicolo(cat, ma, mo, cc);
                registro.add(v);
            }
        }
        catch (Exception e){}
    }
    
        
    public void stampa()
    {
        
    }
    
    public void stampa(String cat)
    {
       
    }
    
    public void stampaOrdinata()
    {
    
    }
}

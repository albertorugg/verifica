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
     for(Object b : registro)
        System.out.println(b.toString());
    }
    
    public void stampa(String cat)
    {
     if(cat.equals(""))
        System.out.println(((Veicolo)b).toString());
     else
        for(Object b : registro)
           if(((Veicolo)b).getCat().equalsCcat))
           System.out.println(b.toString());  
    }
    
    public void stampaOrdinata(){
    public int compare(Veicolo v1, Veicolo v2)
    {
     return v1.getMa().compareTo(v2.getMa());
    }
  }
}

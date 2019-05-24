import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CadastroUsuarios implements Iterable<Usuario>{
    private List<Usuario> users;

    public CadastroUsuarios() throws IOException {
        users = new LinkedList<Usuario>();
        inicializa(users, "pessoas.txt");
    }

    private static void inicializa(List<Usuario> lst,String fName)throws IOException{
        File file = new File(fName);
        Scanner s = new Scanner(file);
      	String line = s.nextLine();
        while(s.hasNextLine()){
        	line = s.nextLine();
        	StringTokenizer st = new StringTokenizer(line,",");
        	int id = Integer.parseInt(st.nextToken());
        	String nome = st.nextToken();
        	String sobrenome = st.nextToken();
        	String email = st.nextToken();
        	String sexo = st.nextToken();
        	String ip = st.nextToken();
            Usuario u = new Usuario(id,nome,sobrenome,email,sexo,ip);
            lst.add(u); 
        }
    }

    // TO DO letras a ate e
    @Override
    public Iterator<Usuario> iterator(){
    return users.iterator();
    }

    public int removeUsuario(String ip){
        ListIterator<Usuario> i = users.listIterator();
        int usersRemoved = 0;
        while(i.hasNext()){
            Usuario user = i.next();
            if(user.getIp().equals(ip))
                i.remove();
                usersRemoved++;
        }
    return usersRemoved;
    }

    public boolean addPos(String nome, String sobrenome, Usuario e){
        ListIterator<Usuario> i = users.listIterator();
        while(i.hasNext()){
            Usuario user = i.next();
            if(user.getNome().equals(nome) && user.getSobrenome().equals(sobrenome))
                i.add(e);
                return true;
        }
    return false;
    }

    public void orderByName(){
        ListIterator<Usuario> i = users.listIterator();
        List<Usuario> usersCopy = new LinkedList<Usuario>();
        

        while(i.hasNext()){
            Usuario user = i.next();
        }
    }

    public void random(){
        
    }
}

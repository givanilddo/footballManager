package FootballManager;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class dataRecorder {
    public static final String ARQUIVOS_DATA = "DATA.dat";

    public HashMap<String, Player> playerRetriver() throws IOException {
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream(ARQUIVOS_DATA));
            return (HashMap<String, Player>) in.readObject();
        } catch (Exception e){
            System.out.println("Não foi possível recuperar os contatos");
            throw new IOException("Não foi possível recuperar os dados do arquivo "+ ARQUIVOS_DATA);

        } finally {
            if (in!=null){
                in.close();
            }
        }
    }

    public void saveData(Map<String, Player> players) throws IOException{
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(ARQUIVOS_DATA));
            out.writeObject(players);
        } catch (Exception e){
            e.printStackTrace();
            throw new IOException("Erro ao salvar os jogadores no arquivo "+ ARQUIVOS_DATA);
        }
    }
}
//

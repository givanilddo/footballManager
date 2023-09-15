package footballManager;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class dataRecorder {

    public static final String ARCHIVE_DATA = "data.dat";

    public HashMap<String, Player> playerRetriver() throws IOException {
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream(ARCHIVE_DATA));
            return (HashMap<java.lang.String, Player>) in.readObject();
        } catch (Exception e){
            System.out.println("Não foi possível recuperar os contatos");
            throw new IOException("Não foi possível recuperar os dados do arquivo "+ARCHIVE_DATA);

        } finally {
            if (in!=null){
                in.close();
            }
        }
    }
    public void saveData(Map<String, Player> contatos) throws IOException{
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(ARCHIVE_DATA));
            out.writeObject(contatos);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException("Erro ao salvar os jogadores no arquivo "+ ARCHIVE_DATA);
        }
    }
}

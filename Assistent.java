import java.io.*;
import java.util.*;
import java.nio.file.Paths;


public class Assistent{
//______________________________________________STATIC_VARS_________________________________________________
    private static final String SESSION_PREFIX = "session";
    private static final String SESSION_FOLDER_NAME = "/sessions";
//_______________________________________________Data_Fields_________________________________________________
    private int sessionNumber;
    private ArrayList<File> sessionFiles;
    private ArrayList<Concept> concepts;
    private PrintWriter writer;
    private Scanner fileScanner, inputScan;
    private boolean trainingMode, running;
    //Interface

//___________________________________________________Run_Applikation___________________________________________
    public void Run(){
        Init();
        while(running){
            Refresh();
        }
        End();
    }

//_______________________________________________________Main_______________________________________
    private void Init(){
        setSessionFiles();
        //initCurrentSession();
        running = true;
    }
    private void Refresh(){
        //input
        //while(trainingMode){expectedOutput}
        //lookConnection
        //getFeedback
        //adjust/buildConnections
    }
    private void End(){
        //saveSession
    }

//___________________________________________________Primary_Methods____________________________________________
    private void setSessionFiles(){
        final String directory = Paths.get("").toAbsolutePath().toString() + SESSION_FOLDER_NAME;
        final File[] files = new File(directory).listFiles();
        sessionFiles = new ArrayList<>();
        int maxNumber = 0;
        if(files != null){
            for (File f : files) {
                String fileName = f.getName();
                if(fileName.contains(SESSION_PREFIX) && fileName.contains("\\d+")){
                    sessionFiles.add(f);
                    int fileSessionNumber = Integer.parseInt(fileName);
                    if(fileSessionNumber > maxNumber){
                        maxNumber = fileSessionNumber;
                    }
                }
            }
            sessionNumber = maxNumber + 1;
        }
    }

    private void initCurrentSession(){      
        //scan old session
        //pull concepts with its connections

    }
    
}
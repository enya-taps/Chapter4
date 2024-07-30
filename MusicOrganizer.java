import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(rightindex(index)==true){
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(rightindex(index)==true){
            files.remove(index);
        }
    }

    public void idxcontrol(int number){
        if(number< 0 || number> files.size()-1){
            System.out.println("Dies ist ein ungültiger Index.");
        }
    }

    public boolean rightindex(int number){
        if(number>=0 && number<= files.size()-1){
            return true;
        }else{
            return false;
        }
    }
}

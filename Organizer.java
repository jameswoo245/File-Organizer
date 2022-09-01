import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Organizer {

    private String filePath;
    private File[] folder;
    private HashMap<String, ArrayList<String>> sortList;

    public Organizer(String filePath) {
        this.filePath = filePath;
        // path to the folder
        File folderPath = new File(filePath);
        // items in folder
        folder = folderPath.listFiles();
    }

    public HashMap<String, ArrayList<String>> sortByCategory() {
        sortList = new HashMap<>();

        try {
            for (int i = 0; i < folder.length; i++) {
                String categoryName = folder[i].getName().substring(0, folder[i].getName().indexOf("_"));
                // exist in list
                if (sortList.containsKey(categoryName)) {
                    sortList.get(categoryName).add(folder[i].getAbsolutePath());
                } else // doesn't exist
                {
                    sortList.put(categoryName, new ArrayList<String>());
                    sortList.get(categoryName).add(folder[i].getAbsolutePath());
                }
            }
            return sortList;
        } 
        //catch exceptions that would cause program to crash
        catch (NullPointerException e) {
            System.out.println("Please enter a correct folder location");
            return null;
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Your folder cannot have folders in it");
            return null;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void sortIntoFolders(String path) {
        for (String i : sortList.keySet())// category
        {
            // make folder
            File f = new File(path + "\\" + i);
            boolean createNewFolder = f.mkdirs();

            // place in folders
            for (int j = 0; j < sortList.get(i).size(); j++)// loop arraylist of files
            {
                File file = new File(sortList.get(i).get(j));
                String dest = f + "\\" + file.getName();
                file.renameTo(new File(dest));
            }
        }
    }
}
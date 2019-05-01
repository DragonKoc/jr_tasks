package level05.lecture06;

/**
 * Created by Kgrebenyuk on 25.01.2019.
 */
public class lecture06 {
    private String filename = null;
    MyFile file = new MyFile();
    MyFile file2 = new MyFile();

    String text = file2.initialize("a.txt");
    String text2 = file.initialize("lololo");

     static class MyFile {
        private String filename = null;

        public String initialize(String name) {
            this.filename = name;
            return name;
        }

        public void initialize(String folder, String name) {
            this.filename = folder + name;
        }

        // Файл filename будет находиться в той же директории, что и file.
        public  void initialize(MyFile file, String name) {
            this.filename = file.getFolder("folder") + name;
        }

         public String getFolder(String folder) {
             return folder;
         }
     }
}

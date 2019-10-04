package Concurrent.Test;


import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String filePath = "/Users/xiao/Documents/github_project/algorithmic_exercises/lesson/src/Concurrent/Test/test.txt";
        File file = new File("test.txt");
//        bufferReader(file);
//        bufferWriter();
        readStream(file);
    }

    private static void readStream(File file) {
        char[] buf = new char[1024];
        int num = 0;
        try (FileInputStream fileInputStream = new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
            while ((num = bufferedInputStream.read()) != -1) {
                System.out.println(new String(buf, 0, num));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void writeStream() {

    }

    private static void bufferReader(File file) {
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferWriter() {
        try {
            File file = new File("xiao.hhh");
            boolean newFile = file.createNewFile();
            try (FileWriter fileWriter = new FileWriter(file);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write("hahhahahah");
                bufferedWriter.newLine();
                bufferedWriter.write("xiao is thinking");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

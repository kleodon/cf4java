package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;


public class StudentAverageGradeFileApp {
    public static void main(String[] args) {
        Path studentGradesFile;
        String line;
        String[] studentData;
        double avg;
        int sum;
        boolean errorFlag;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the full file path of the txt file with student grades:");
        studentGradesFile = Paths.get(sc.nextLine());

        if (Files.notExists(studentGradesFile)) {
            System.out.println("Not existing directory");
            return;
        }


        try (BufferedReader bf = new BufferedReader(new FileReader(studentGradesFile.toFile()))) {
            File studentsGradeAverage = new File(studentGradesFile.getParent() + "/studentsGradesOUT.txt");
            if (Files.notExists(studentsGradeAverage.toPath())) {
                studentGradesFile.getParent().resolve("studentsGradesOUT.txt");
            }
            File studentsLog = new File(studentGradesFile.getParent() + "/log.txt");
            if (Files.notExists(studentsLog.toPath())) {
                studentGradesFile.getParent().resolve("log.txt");
            }

            try (PrintWriter pwAvg = new PrintWriter(studentsGradeAverage);
                 PrintWriter pwLog = new PrintWriter(studentsLog)
                ) {


                while ((line = bf.readLine()) != null) {
                    studentData = line.split(" +");

                    int[] studentGrades = new int[studentData.length - 2];
                    errorFlag = false;
                    sum = 0;

                    for (int i = 2; i < studentData.length; i++) {
                        studentGrades[i - 2] = Integer.parseInt(studentData[i]);
                        if (studentGrades[i - 2] < 0 || studentGrades[i - 2] > 10) {
                            //log error
                            pwLog.println(studentData[0] + " "
                                    + studentData[1] + " "
                                    + "Invalid Grade "
                                    + studentGrades[i - 2]
                            );
                            errorFlag = true;
                            break;
                        }

                        sum += studentGrades[i - 2];
                    }

                    if (!errorFlag) {
                        avg = (double) sum / studentGrades.length;
                        pwAvg.println(studentData[0] + " "
                                + studentData[1] + " "
                                + avg);
                    }


                }
            } catch (FileNotFoundException ex) {
            }

        } catch (IOException ex) {
            //ex.printStackTrace();
            System.out.println("Error reading " + studentGradesFile);
        }
    }
}

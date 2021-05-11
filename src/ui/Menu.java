package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import model.Deparment;
import model.Employee;
import model.Generate;
import model.Project;
import model.WorksOn;

public class Menu {
	private final String PATH = "data/Inserts.sql";
	private final String PRINCIPAL_MENU = "\n1.Generate Departments." + "\n2.Generate Employees."
			+ "\n3.Generate Projects." + "\n4.Generate Works On." + "\n5.Exit & save.\n";

	private boolean exit;
	private BufferedReader bReader;
	private BufferedWriter bwriter;
	private Generate generate;

	private File file;

	public Menu() {
		exit = false;
		bReader = new BufferedReader(new InputStreamReader(System.in));
		bwriter = new BufferedWriter(new OutputStreamWriter(System.out));
		generate = new Generate();

	}

	public void start() {
		while (!exit) {
			try {

				writeLine(PRINCIPAL_MENU, bwriter);

				int option = Integer.parseInt(readLine(bReader));
				if (option < 1 && option > 5) {
					throw new NumberFormatException();
				}

				runOption(option, bwriter);

			} catch (IOException IOE) {
				// TODO: handle exception
			} catch (NumberFormatException NFE) {
				// TODO: handle exception
			}

		}

		try {

			writeLine("PROGRAM FINISHED", bwriter);

			bReader.close();
			bwriter.close();

		} catch (IOException IOE) {
			// TODO: handle exception
		}

	}

	private String readLine(BufferedReader bReader) throws IOException {
		String str = "";
		while (str.equals("")) {
			str = bReader.readLine();

		}

		return str;
	}

	private void writeLine(String str, BufferedWriter bwriter) throws IOException {
		bwriter.write(str);
		bwriter.flush();

	}

	private void runOption(int op, BufferedWriter bwriter) {
		switch (op) {
		case 1:
			runOptionOne(bwriter);
			break;
		case 2:
			runOptionTwo(bwriter);
			break;
		case 3:
			runOptionThree(bwriter);
			break;
		case 4:
			runOptionFour(bwriter);
			break;
		case 5:
			exit = true;
			export();
			break;
		}

	}

	private void runOptionOne(BufferedWriter bwriter) {
		boolean exit = false;
		while (!exit) {

			try {
				writeLine("Type the ammount of department inserts ", bwriter);

				int numInserts = Integer.parseInt(readLine(bReader));

				if (numInserts < 0) {
					throw new NumberFormatException();
				}

				List<Deparment> depList = new ArrayList<>();

				File fl = new File("resources/departments.csv");
				FileReader fr = new FileReader(fl);
				BufferedReader br = new BufferedReader(fr);
				String msg = br.readLine();
				int count = 0;

				while (count < numInserts) {
					String[] arrIns = msg.split(",");
					String deptNo = "\'" + arrIns[0] + "\'";
					String deptName = "\'" + arrIns[1] + "\'";
					String mgrEmpNo = "NULL";

					Deparment dept = new Deparment(deptNo, deptName, mgrEmpNo);
					depList.add(dept);

					count++;
					msg = br.readLine();
				}

				br.close();
				fr.close();
				generate.generateDeparment(depList);
				writeLine("Departments Generated Successfully.\n", bwriter);
				exit = true;

			} catch (IOException iOE) {
				// TODO: handle exception
			} catch (NumberFormatException nFE) {
				// TODO: handle exception
			}
		}

	}

	private void runOptionTwo(BufferedWriter bwriter) {
		boolean exit = false;
		while (!exit) {

			try {
				writeLine("Type the ammount of employees inserts ", bwriter);

				int numInserts = Integer.parseInt(readLine(bReader));

				if (numInserts < 0) {
					throw new NumberFormatException();
				}

				List<Employee> empList = new ArrayList<>();

				File fl = new File("resources/employees.csv");
				FileReader fr = new FileReader(fl);
				BufferedReader br = new BufferedReader(fr);
				String msg = br.readLine();
				int count = 0;

				while (count < numInserts) {
					String[] arrIns = msg.split(",");

					String empNo = arrIns[0];
					String empFName = "\'" + arrIns[1] + "\'";
					String empLName = "\'" + arrIns[2] + "\'";
					String empAddress = "\'" + arrIns[3] + "\'";
					String dOB = "\'" +arrIns[4]+"\'" ;
					String sex = "\'" + arrIns[5] + "\'";
					String position = "\'" + arrIns[6] + "\'";
					String deptNo = "\'" + arrIns[7] + "\'";

					Employee employee = new Employee(empNo, empFName, empLName, empAddress, dOB, sex, position, deptNo);
					empList.add(employee);

					count++;
					msg = br.readLine();
				}

				br.close();
				fr.close();
				generate.generateEmployee(empList);
				writeLine("Employees Generated Successfully.\n", bwriter);
				exit = true;

			} catch (IOException iOE) {
				// TODO: handle exception
			} catch (NumberFormatException nFE) {
				System.out.println(nFE.getMessage());
			}

		}
	}

	private void runOptionThree(BufferedWriter bwriter) {
		boolean exit = false;
		while (!exit) {

			try {
				writeLine("Type the ammount of projects inserts ", bwriter);

				int numInserts = Integer.parseInt(readLine(bReader));

				if (numInserts < 0) {
					throw new NumberFormatException();
				}

				List<Project> projList = new ArrayList<>();

				File fl = new File("resources/projects.csv");
				FileReader fr = new FileReader(fl);
				BufferedReader br = new BufferedReader(fr);
				String msg = br.readLine();
				int count = 0;

				while (count < numInserts) {
					String[] arrIns = msg.split(",");

					int projNo = Integer.parseInt(arrIns[0]);
					String projName = "\'" + arrIns[1] + "\'";
					String deptNo = "\'" + arrIns[2] + "\'";

					Project project = new Project(projNo, projName, deptNo);
					projList.add(project);

					count++;
					msg = br.readLine();
				}

				br.close();
				fr.close();

				generate.generateProject(projList);
				writeLine("Projects Generated Successfully.\n", bwriter);
				exit = true;

			} catch (IOException iOE) {
				// TODO: handle exception
			} catch (NumberFormatException nFE) {
				// TODO: handle exception
			}

		}
	}

	private void runOptionFour(BufferedWriter bwriter) {
		try {
			writeLine("Type the ammount of projects inserts ", bwriter);

			int numInserts = Integer.parseInt(readLine(bReader));

			if (numInserts < 0) {
				throw new NumberFormatException();
			}

			List<WorksOn> wOList = new ArrayList<>();

			File fl = new File("resources/workson.csv");
			FileReader fr = new FileReader(fl);
			BufferedReader br = new BufferedReader(fr);
			String msg = br.readLine();
			int count = 0;

			while (count < numInserts) {
				String[] arrIns = msg.split(",");

				String empNo = "\'" + arrIns[0] + "\'";
				int projNo = Integer.parseInt(arrIns[1]);
				String date = "\'" +arrIns[2]+"\'" ;
				int hoursWorked = Integer.parseInt(arrIns[3]);

				WorksOn worksOn = new WorksOn(empNo, projNo, date, hoursWorked);
				wOList.add(worksOn);

				count++;
				msg = br.readLine();
			}

			br.close();
			fr.close();

			generate.generateWorksOn(wOList);
			writeLine("WorksOn Generated Successfully.\n", bwriter);

		} catch (IOException iOE) {
			// TODO: handle exception
		} catch (NumberFormatException nFE) {

		}
	}

	private void export() {
		try {

			file = new File(PATH);

			FileWriter fWriter = new FileWriter(file);

			BufferedWriter bWriter = new BufferedWriter(fWriter);

			if (!generate.getDeptInsert().equals("")) {
				bWriter.write(generate.getDeptInsert());
			}

			if (!generate.getEmpInsert().equals("")) {
				bWriter.write(generate.getEmpInsert());
			}
			
			if (!generate.getDeptInsert().equals("") && !generate.getEmpInsert().equals("")) {
				if (generate.getDeptsInserted() <= generate.getEmployeesInserted()) {
					for (int i = 0; i < generate.getDeptsInserted(); i++) {
						int id = i + 1;
						bWriter.write(
								"\nUPDATE DEPARTMENT" + "\nSET mgrEmpNo = " + id + "\nWHERE deptNo = " + id + ";\n");
					}
				} else {
					writeLine("Please generate at least same number of employees as departments.", bwriter);
				}
			}


			if (!generate.getProjInsert().equals("")) {
				bWriter.write(generate.getProjInsert());
			}

			if (!generate.getwOInsert().equals("")) {
				bWriter.write(generate.getwOInsert());
			}

			bWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

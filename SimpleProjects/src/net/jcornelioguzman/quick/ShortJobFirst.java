package net.jcornelioguzman.quick;

import java.util.NavigableSet;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class ShortJobFirst {

	private static final String ERROR_MESSAGE = "Invalid Input.";
	private static final String MAIN_MENU = "Menu\n1. Add Job\n2. Job List\n3. Process Job\n4. Processed Job";
	private static final NavigableSet<Job> JOB_LIST = new TreeSet<Job>();
	private static final NavigableSet<Job> PROCESSED_JOBS = new TreeSet<Job>();

	public static void main(String[] args) {
		menu();
	}

	private static String getInput(String message) {
		return JOptionPane.showInputDialog(message);
	}

	private static void prompt(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	public static void menu() {
		int choice = Integer.parseInt(getInput(MAIN_MENU));
		switch (choice) {
		case 1:
			add();
			break;
		case 2:
			display();
			break;
		case 3:
			process();
			break;
		case 4:
			processedJob();
			break;
		default:
			JOptionPane.showMessageDialog(null, ERROR_MESSAGE);
			menu();
			break;
		}
	}

	private static void processedJob() {
		prompt("Job Name: Job No.:\n" + PROCESSED_JOBS);
		menu();
	}

	public static void add() {
		String jobName = getInput("Enter Job Name");
		int jobOrder = Integer.parseInt(getInput("Job Order #: "));
		Job job = new Job();
		job.setName(jobName);
		job.setOrder(jobOrder);
		JOB_LIST.add(job);
		prompt("Job Name " + job.getName() + " with Order # " + job.getOrder()
				+ " added.");
		job = null;
		menu();
	}

	public static void display() {
		prompt("Job Name: Job No.:\n" + JOB_LIST);
		menu();
	}

	public static void process() {
		prompt("Smallest Job Order: " + JOB_LIST.last());
		Job job = JOB_LIST.last();
		int choice = Integer.parseInt(getInput("Name: " + job.getName()
				+ " Job Order: " + job.getOrder()
				+ "\n1. Process Job\n2. Cancel Job"));
		if (choice == 1) {
			PROCESSED_JOBS.add(job);
			JOB_LIST.remove(job);
			prompt("Job Process: Complete.");
			menu();
		}
	}
}

class Job implements Comparable<Job> {
	private String name;
	private Integer order;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the order
	 */
	public Integer getOrder() {
		return order;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}

	@Override
	public int compareTo(Job o) {
		return Integer.compare(o.getOrder(), this.order);
	}

	@Override
	public String toString() {
		return this.getName() + " " + this.getOrder();
	}
}
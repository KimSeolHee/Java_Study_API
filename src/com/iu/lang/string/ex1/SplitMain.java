package com.iu.lang.string.ex1;

public class SplitMain {

	public static void main(String[] args) {


		WorkerService worker = new WorkerService();
		worker.init();
		
		WorkerView view = new WorkerView();
		WorkerDTO [] workerDTOs = worker.init();
		view.view(workerDTOs);
		
	}

}

package di;

public class Worker {
public void work() {
	
}
}
class Manager2{
	Worker worker;

	
	public void setWorker(Worker w) {
		worker = w;
	}
	public void manage() {
		worker.work();
	}
}
class Superworker2{
	public void work() {
		
	}
}
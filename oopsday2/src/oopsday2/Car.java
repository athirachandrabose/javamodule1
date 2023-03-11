package oopsday2;

public class Car implements CarIface {

        private double fuel;
		private double kilometersrun;
        private double battery;
        private boolean enginestatus;
        
        @Override
        public void start() {
        	if(enginestatus== false && fuel>1000 && battery>100) {
        		System.out.println("engine is starting");
        		enginestatus=true;
        	
        	}
        	
        }
	public double getFuel() {
			return fuel;
		}

		public void setFuel(double fuel) {
			this.fuel = fuel;
		}

		public double getKilometersrun() {
			return kilometersrun;
		}

		public void setKilometersrun(double kilometersrun) {
			this.kilometersrun = kilometersrun;
		}

		public double getBattery() {
			return battery;
		}

		public void setBattery(double battery) {
			this.battery = battery;
		}

		public boolean isEnginestatus() {
			return enginestatus;
		}

		public void setEnginestatus(boolean enginestatus) {
			this.enginestatus = enginestatus;
		}
        public Car(double fuel,double kilometersrun,double battery,boolean enginestatus) {
        	this.fuel=fuel;
        	this.kilometersrun=kilometersrun;
        	this.battery=battery;
        	this.enginestatus=enginestatus;
        }


	@Override
	public void honk() {
		// TODO Auto-generated method stub
System.out.println("pom...pom...");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
         if(enginestatus) {
        	 for( int i=0;i<=50;i++) {
        		 System.out.println("car is moving");
        		 fuel=fuel-10;
        		 battery=battery-2;
        		 kilometersrun++;
        		 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	 }
         }
	}
	

	@Override
	public String toString() {
		return "Car [fuel=" + fuel + ", kilometersrun=" + kilometersrun + ", battery=" + battery + ", enginestatus="
				+ enginestatus + "]";
	}

	@Override
	public void changegear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
        System.out.println("car is stoping");
        this.enginestatus=false;
	}
        }



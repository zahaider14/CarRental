.PHONY: clean all

clean:
	cd classes/rental; find . -name "*.class" -type f -delete;
	cd test; find . -name "*.class" -type f -delete;






# Compilation

compil:
	make clean;
	cd src; javac rental/vehicles/Vehicle.java -d ../classes;
	cd src; javac rental/vehicles/Car.java -d ../classes;


# Tests

VehicleTest:
	javac -classpath test-1.7.jar test/rental/vehicles/VehicleTest.java
	java -jar test-1.7.jar rental.vehicles.VehicleTest

CarTest:
	javac -classpath test-1.7.jar test/rental/vehicles/CarTest.java
	java -jar test-1.7.jar rental.vehicles.CarTest

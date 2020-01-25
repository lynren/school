CREATE TABLE airport
(
	airport_code VARCHAR2(15) NOT NULL,
	name VARCHAR2(50),
	city VARCHAR2(50),
	state VARCHAR2(15),
	PRIMARY KEY (airport_code)
);

CREATE TABLE flight
(
	flight_number VARCHAR2(15) NOT NULL,
	airline VARCHAR2(50),
	weekdays NUMBER(1),
	PRIMARY KEY (flight_number)
);

CREATE TABLE flight_leg
(
	flight_number VARCHAR2(15) NOT NULL,
	leg_number NUMBER(1) NOT NULL,
	departure_airport_code VARCHAR2(15),
	scheduled_departure_time NUMBER(5,2),
	arrival_airport_code VARCHAR2(15),
	scheduled_arrival_time NUMBER(5,2),
	PRIMARY KEY (flight_number, leg_number),
	FOREIGN KEY (flight_number) REFERENCES  flight (flight_number) ON DELETE CASCADE,
	FOREIGN KEY (departure_airport_code) REFERENCES airport (airport_code),
	FOREIGN KEY (arrival_airport_code) REFERENCES airport (airport_code)
);

CREATE TABLE leg_instance
(
	flight_number VARCHAR2(15) NOT NULL,
	leg_number NUMBER(1) NOT NULL,
	fdate DATE NOT NULL,
	num_available_seats NUMBER(3),
	airplane_id VARCHAR2(15),
	departure_airport_code VARCHAR2(15),
	departure_time NUMBER(5,2),
	arrival_airport_code VARCHAR2(15),
	arrival_time NUMBER(5,2),
	PRIMARY KEY (flight_number, leg_number, fdate),
	FOREIGN KEY (flight_number, leg_number) REFERENCES flight_leg (flight_number, leg_number) ON DELETE CASCADE,
	FOREIGN KEY (departure_airport_code) REFERENCES airport (airport_code),
	FOREIGN KEY (arrival_airport_code) REFERENCES airport (airport_code)
);

CREATE TABLE fare
(
	flight_number VARCHAR2(15) NOT NULL,
	fare_code VARCHAR2(15) NOT NULL,
	amount VARCHAR2(15),
	restrictions VARCHAR2(15),
	PRIMARY KEY (flight_number, fare_code),
	FOREIGN KEY (flight_number) REFERENCES flight (flight_number) ON DELETE CASCADE
);

CREATE TABLE seat_reservation
(
	flight_number VARCHAR2(15) NOT NULL,
	leg_number NUMBER(1) NOT NULL,
	fdate DATE NOT NULL,
	seat_number VARCHAR2(15) NOT NULL,
	customer_name VARCHAR2(50),
	customer_phone VARCHAR2(20),
	PRIMARY KEY (flight_number, leg_number, fdate, seat_number),
	FOREIGN KEY (flight_number, leg_number, fdate) REFERENCES leg_instance (flight_number, leg_number, fdate) ON DELETE CASCADE
);
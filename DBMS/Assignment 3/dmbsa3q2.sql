(a) Retrieve the names and flight numbers of all customers who have taken a flight departing from Windsor.
SELECT sr.customer_name, sr.flight_number
FROM seat_reservation sr, airport, leg_instance li 
WHERE airport.city='Windsor' and li.departure_airport_code=airport.airport_code and sr.flight_number=li.flight_number and sr.leg_number=li.leg_number;

(b) Retrieve the flight number and flight legs of all flights that have more than one leg.
SELECT flight_number, COUNT(leg_number) flight_legs
FROM flight_leg
HAVING COUNT(leg_number) > 1
GROUP BY flight_number;

(c) For each flight, retrieve the flight number, airline, flight date, and number of customers in the flight.
SELECT sr.flight_number, airline, fdate, count(customer_name) customers
FROM seat_reservation sr, flight
WHERE flight.flight_number=sr.flight_number
GROUP BY sr.flight_number, airline, fdate;

(d) Retrieve the name, seat number, and flight number of each customer in all Air Canada flights.
SELECT sr.customer_name, sr.seat_number, sr.flight_number
FROM seat_reservation sr, flight
WHERE airline='Air Canada' and sr.flight_number=flight.flight_number;

(e) Retrieve the names and flight numbers, departure and arrival airports of all customers who did not fly in a flight that is more than the first leg.
SELECT distinct sr.customer_name, sr.flight_number, departure_airport_code, arrival_airport_code
FROM seat_reservation sr, flight_leg fl
WHERE fl.flight_number=sr.flight_number and fl.leg_number=sr.leg_number and sr.leg_number=1;
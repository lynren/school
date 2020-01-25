/*question 4*/

/* Retrieve the customer names and flight number of all 2-leg flyers (customers who have flights with 2 legs in all their flights).*/
SELECT s1.customer_name, s1.flight_number
FROM seat_reservation s1
WHERE NOT EXISTS
(SELECT s2.flight_number
FROM seat_reservation s2
WHERE s2.customer_name=s1.customer_name and leg_number=1)
ORDER BY s1.customer_name DESC;


/*Retrieve the customer names and flight number of all customers who do not have any 2-leg flight in any of their flights.
SELECT s1.customer_name, s1.flight_number
FROM seat_reservation s1
WHERE NOT EXISTS
(SELECT s2.flight_number
FROM seat_reservation s2
WHERE s2.customer_name=s1.customer_name and leg_number=2)
ORDER BY s1.customer_name DESC;*/
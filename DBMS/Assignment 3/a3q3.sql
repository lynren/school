INSERT INTO airport
VALUES('YTT', 'Tintin Airport', 'Tintin', 'ON');

UPDATE seat_reservation
SET customer_phone='519-253-4001'
WHERE customer_name='Tony Appa';

INSERT INTO flight
VALUES('AC331', 'Air Canada', 2);

DELETE from seat_reservation
WHERE customer_name='Mariane Mooer';
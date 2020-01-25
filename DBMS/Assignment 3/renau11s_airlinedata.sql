INSERT INTO airport
VALUES('YYZ', 'Pearson Airport', 'Toronto', 'ON');

INSERT INTO airport
VALUES('YTZ', 'Island Airport', 'Toronto', 'ON');

INSERT INTO airport
VALUES('YQT', 'Thunder Bay Airport', 'Thunder Bay', 'ON');

INSERT INTO airport
VALUES('YQG', 'Windsor Airport', 'Windsor', 'ON');

INSERT INTO airport
VALUES('YYC', 'Calgary Airport', 'Calgary', 'ON');

INSERT INTO flight
VALUES('WJ250', 'WestJet', 3);

INSERT INTO flight
VALUES('WJ261', 'WestJet', 4);

INSERT INTO flight
VALUES('AC275', 'Air Canada', 2);

INSERT INTO flight
VALUES('AC300', 'Air Canada', 3);

INSERT INTO flight
VALUES('AC320', 'Air Canada', 2);

INSERT INTO flight
VALUES('PA233', 'Porter Airline', 5);

INSERT INTO flight
VALUES('PA280', 'Porter Airline', 4);

INSERT INTO flight_leg
VALUES('WJ250', 1, 'YQG', 08.80, 'YYZ', 09.00);

INSERT INTO flight_leg
VALUES('WJ250', 2, 'YYZ', 12.00, 'YYC', 17.00);

INSERT INTO flight_leg
VALUES('AC275', 1, 'YQT', 10.00, 'YYZ', 11.00);

INSERT INTO flight_leg
VALUES('AC275', 2, 'YYZ', 13.00, 'YQG', 14.00);

INSERT INTO flight_leg
VALUES('PA233', 1, 'YQG', 16.00, 'YYZ', 17.00);

INSERT INTO flight_leg
VALUES('PA280', 1, 'YYZ', 11.00, 'YQG', 12.00);

INSERT INTO leg_instance
VALUES('WJ250', 1, DATE '15-01-17', 200, 'Boeing_777', 'YQG', 8.00, 'YYZ', 8.50);

INSERT INTO leg_instance
VALUES('WJ250', 2, DATE '15-01-17', 200, 'Boeing_777', 'YYZ', 12.30, 'YYC', 16.50);

INSERT INTO leg_instance
VALUES('AC275', 1, DATE '10-01-17', 60, 'Airbus_200', 'YQT', 10.00, 'YYZ', 11.00);

INSERT INTO leg_instance
VALUES('AC275', 2, DATE '10-01-17', 60, 'Airbus_200', 'YYZ', 13.00, 'YQG', 14.00);

INSERT INTO leg_instance
VALUES('PA233', 1, DATE '30-01-17', 120, 'Boeing_737', 'YQG', 16.00, 'YYZ', 17.00);

INSERT INTO leg_instance
VALUES('PA280', 1, DATE '20-01-17', 120, 'Boeing_737', 'YYZ', 11.00, 'YQG', 12.00);

INSERT INTO fare
VALUES('WJ250', 'F1', '$250', 'None');

INSERT INTO fare
VALUES('WJ250', 'F2', '$350', 'None');

INSERT INTO fare
VALUES('AC275', 'F1', '$275', 'Non-refundable');

INSERT INTO fare
VALUES('AC275', 'F2', '$300', 'Non-refundable');

INSERT INTO fare
VALUES('PA233', 'F3', '$150', 'None');

INSERT INTO fare
VALUES('PA280', 'F3', '$150', 'None');

INSERT INTO seat_reservation
VALUES('WJ250', 1, DATE '15-01-17', '20A', 'Mariane Mooer', '519-253-3000');

INSERT INTO seat_reservation
VALUES('WJ250', 2, DATE '15-01-17', '13D', 'Mariane Mooer', '519-253-3000');

INSERT INTO seat_reservation
VALUES('WJ250', 1, DATE '15-01-17', '6A', 'Tony Appa', '226-253-4000');

INSERT INTO seat_reservation
VALUES('WJ250', 2, DATE '15-01-17', '7D', 'Tony Appa', '226-253-4000');

INSERT INTO seat_reservation
VALUES('WJ250', 1, DATE '15-01-17', '6B', 'Karen Appa', '226-253-4000');

INSERT INTO seat_reservation
VALUES('WJ250', 2, DATE '15-01-17', '7C', 'Karen Appa', '226-253-4000');

INSERT INTO seat_reservation
VALUES('AC275', 1, DATE '10-01-17', '5C', 'Mark Black', '226-212-5341');

INSERT INTO seat_reservation
VALUES('AC275', 2, DATE '10-01-17', '14B', 'Mark Black', '226-212-5341');

INSERT INTO seat_reservation
VALUES('PA233', 1, DATE '30-01-17', '5A', 'Peter Opo', '519-444-1234');

INSERT INTO seat_reservation
VALUES('PA280', 1, DATE '20-01-17', '16D', 'Chris Natta', '226-123-5555');
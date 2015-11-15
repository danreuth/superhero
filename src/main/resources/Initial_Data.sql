-- Create PowerTypes
INSERT INTO powertype (powertype) VALUES('Movement');
INSERT INTO powertype (powertype) VALUES('Offensive');
INSERT INTO powertype (powertype) VALUES('Defensive');
INSERT INTO powertype (powertype) VALUES('Observation');


-- Create Powers
INSERT INTO power (description, name, powertype_id) VALUES('desc100', 'Test name 2', 1);
INSERT INTO power (description, name, powertype_id) VALUES('desc500', 'Test name 5', 2);
INSERT INTO power (description, name, powertype_id) VALUES('desc800', 'Test name 8', 3);
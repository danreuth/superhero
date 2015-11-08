-- Create PowerTypes
INSERT INTO powertype (powertype) VALUES('Movement');
INSERT INTO powertype (powertype) VALUES('Offensive');
INSERT INTO powertype (powertype) VALUES('Defensive');
INSERT INTO powertype (powertype) VALUES('Observation');


-- Create Powers
INSERT INTO power (description, name, powertype_id) VALUES('test desc 2', 'Test name 2', 1);
INSERT INTO power (description, name, powertype_id) VALUES('test desc 5', 'Test name 5', 2);
INSERT INTO power (description, name, powertype_id) VALUES('test desc 8', 'Test name 8', 3);
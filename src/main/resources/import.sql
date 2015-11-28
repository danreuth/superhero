-- Create PowerTypes
INSERT INTO powertype (powertype) VALUES('Movement');
INSERT INTO powertype (powertype) VALUES('Offensive');
INSERT INTO powertype (powertype) VALUES('Defensive');
INSERT INTO powertype (powertype) VALUES('Observation');

-- Create OriginTypes
INSERT INTO origintype (origintype) VALUES('Mutant');
INSERT INTO origintype (origintype) VALUES('Magic');
INSERT INTO origintype (origintype) VALUES('Science');
INSERT INTO origintype (origintype) VALUES('Tech');
INSERT INTO origintype (origintype) VALUES('Skill');

-- Create Powers
INSERT INTO power (description, name, powertype_id) VALUES('Allows a hero to fly.', 'Flight', 1);
INSERT INTO power (description, name, powertype_id) VALUES('Projects heat rays from the hero''s eyes', 'Heat Vision', 2);
INSERT INTO power (description, name, powertype_id) VALUES('Hero''s skin is as tough as diamonds', 'Diamond Skin', 3);
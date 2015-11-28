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
INSERT INTO power (description, name, powertype_id) VALUES('Allows a hero to move over distance instantly', 'Teleportation', 1);
INSERT INTO power (description, name, powertype_id) VALUES('Allows a hero to read minds', 'Telepathy', 4);
INSERT INTO power (description, name, powertype_id) VALUES('Hero has a shield.', 'Shield', 3);
INSERT INTO power (description, name, powertype_id) VALUES('Hero has a bow with trick arrows', 'Bow', 2);
INSERT INTO power (description, name, powertype_id) VALUES('Hero possesses superior strength', 'Strength', 2);

-- Create Heroes
INSERT INTO hero (costumeimage, height, weight, heroname, realname, origintype_id) VALUES('http://static.comicvine.com/uploads/original/11114/111145037/3671559-3364434-3106405183-capta.jpg', 72, 220, 'Captain America', 'Steve Rodgers', 3);
INSERT INTO hero (costumeimage, height, weight, heroname, realname, origintype_id) VALUES('http://www.ign.com/static/test/topN/avengers/top-50-avengers_hawkeye.jpg', 70, 180, 'Hawkeye', 'Clint Barton', 5);
INSERT INTO hero (costumeimage, height, weight, heroname, realname, origintype_id) VALUES('http://www.oocities.org/tweaknz24/resources/xavier/charlesxavier.jpg', 70, 160, 'Professor X', 'Charles Xavier', 1);

-- Link Heroes and Powers
INSERT INTO hero_power (hero_id, powers_id) VALUES(1,6);
INSERT INTO hero_power (hero_id, powers_id) VALUES(1,8);
INSERT INTO hero_power (hero_id, powers_id) VALUES(2,7);
INSERT INTO hero_power (hero_id, powers_id) VALUES(3,5);
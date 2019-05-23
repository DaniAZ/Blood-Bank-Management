
INSERT INTO credentials(username,password,enabled) VALUES ('guest','$2y$12$r4.0DO/IVf.fOxZZkF46IOHVcS8OEF14XfVNOEeN9fEnV7lmA.18i', TRUE);
INSERT INTO credentials(username,password,enabled) VALUES ('admin','$2y$12$6DM21.kSYYfloTVZguv/1OCpxK7ITlEd9I/xAn3nnwVcchZ0a3F7S', TRUE);

INSERT  INTO Status(id,name) values (1,'IMMEDIATE');
INSERT  INTO Status(id,name) values (2,'NORMAL');
INSERT  INTO Status(id,name) values (3,'OUT OF STOCK ');

INSERT  INTO blood_type(id,name) values (1,'O');
INSERT  INTO blood_type(id,name) values (2,'A');
INSERT  INTO blood_type(id,name) values (3,'B');
INSERT  INTO blood_type(id,name) values (4,'AB');
INSERT  INTO blood_type(id,name) values (5,'O+');

INSERT INTO authority (id,username, authority) VALUES (1,'guest', 'ROLE_USER');
INSERT INTO authority (id,username, authority) VALUES (2,'admin', 'ROLE_ADMIN');


INSERT INTO state (id, code, name) VALUES (1, 'AL', 'Alabama');
INSERT INTO state (id, code, name) VALUES (2, 'AK', 'Alaska');
INSERT INTO state (id, code, name) VALUES (3, 'AZ', 'Arizona');
INSERT INTO state (id, code, name) VALUES (4, 'AR', 'Arkansas');
INSERT INTO state (id, code, name) VALUES (5, 'CA', 'California');
INSERT INTO state (id, code, name) VALUES (6, 'CO', 'Colorado');
INSERT INTO state (id, code, name) VALUES (7, 'CT', 'Connecticut');
INSERT INTO state (id, code, name) VALUES (8, 'DE', 'Delaware');
INSERT INTO state (id, code, name) VALUES (9, 'DC', 'District of Columbia');
INSERT INTO state (id, code, name) VALUES (10, 'FL', 'Florida');
INSERT INTO state (id, code, name) VALUES (11, 'GA', 'Georgia');
INSERT INTO state (id, code, name) VALUES (12, 'HI', 'Hawaii');
INSERT INTO state (id, code, name) VALUES (13, 'ID', 'Idaho');
INSERT INTO state (id, code, name) VALUES (14, 'IL', 'Illinois');
INSERT INTO state (id, code, name) VALUES (15, 'IN', 'Indiana');
INSERT INTO state (id, code, name) VALUES (16, 'IA', 'Iowa');
INSERT INTO state (id, code, name) VALUES (17, 'KS', 'Kansas');
INSERT INTO state (id, code, name) VALUES (18, 'KY', 'Kentucky');
INSERT INTO state (id, code, name) VALUES (19, 'LA', 'Louisiana');
INSERT INTO state (id, code, name) VALUES (20, 'ME', 'Maine');
INSERT INTO state (id, code, name) VALUES (21, 'MD', 'Maryland');
INSERT INTO state (id, code, name) VALUES (22, 'MA', 'Massachusetts');
INSERT INTO state (id, code, name) VALUES (23, 'MI', 'Michigan');
INSERT INTO state (id, code, name) VALUES (24, 'MN', 'Minnesota');
INSERT INTO state (id, code, name) VALUES (25, 'MS', 'Mississippi');
INSERT INTO state (id, code, name) VALUES (26, 'MO', 'Missouri');
INSERT INTO state (id, code, name) VALUES (27, 'MT', 'Montana');
INSERT INTO state (id, code, name) VALUES (28, 'NE', 'Nebraska');
INSERT INTO state (id, code, name) VALUES (29, 'NV', 'Nevada');
INSERT INTO state (id, code, name) VALUES (30, 'NH', 'New Hampshire');
INSERT INTO state (id, code, name) VALUES (31, 'NJ', 'New Jersey');
INSERT INTO state (id, code, name) VALUES (32, 'NM', 'New Mexico');
INSERT INTO state (id, code, name) VALUES (33, 'NY', 'New York');
INSERT INTO state (id, code, name) VALUES (34, 'NC', 'North Carolina');
INSERT INTO state (id, code, name) VALUES (35, 'ND', 'North Dakota');
INSERT INTO state (id, code, name) VALUES (36, 'OH', 'Ohio');
INSERT INTO state (id, code, name) VALUES (37, 'OK', 'Oklahoma');
INSERT INTO state (id, code, name) VALUES (38, 'OR', 'Oregon');
INSERT INTO state (id, code, name) VALUES (39, 'PA', 'Pennsylvania');
INSERT INTO state (id, code, name) VALUES (40, 'RI', 'Rhode Island');
INSERT INTO state (id, code, name) VALUES (41, 'SC', 'South Carolina');
INSERT INTO state (id, code, name) VALUES (42, 'SD', 'South Dakota');
INSERT INTO state (id, code, name) VALUES (43, 'TN', 'Tennessee');
INSERT INTO state (id, code, name) VALUES (44, 'TX', 'Texas');
INSERT INTO state (id, code, name) VALUES (45, 'UT', 'Utah');
INSERT INTO state (id, code, name) VALUES (46, 'VT', 'Vermont');
INSERT INTO state (id, code, name) VALUES (47, 'VA', 'Virginia');
INSERT INTO state (id, code, name) VALUES (48, 'WA', 'Washington');
INSERT INTO state (id, code, name) VALUES (49, 'WV', 'West Virginia');
INSERT INTO state (id, code, name) VALUES (50, 'WI', 'Wisconsin');
INSERT INTO state (id, code, name) VALUES (51, 'WY', 'Wyoming');


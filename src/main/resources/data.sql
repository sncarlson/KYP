/* Setup sex type table */
INSERT INTO SEX (SEX_TYPE) VALUES ('Male');
INSERT INTO SEX (SEX_TYPE) VALUES ('Female');

/* Setup component type table */
INSERT INTO COMPONENT (COMPONENT_TYPE) VALUES ('Run');
INSERT INTO COMPONENT (COMPONENT_TYPE) VALUES ('Walk');
INSERT INTO COMPONENT (COMPONENT_TYPE) VALUES ('Push-up');
INSERT INTO COMPONENT (COMPONENT_TYPE) VALUES ('Sit-up');
INSERT INTO COMPONENT (COMPONENT_TYPE) VALUES ('AC');

/* Setup risk category table */
INSERT INTO RISK (RISK_TYPE) VALUES ('Low');
INSERT INTO RISK (RISK_TYPE) VALUES ('Moderate');
INSERT INTO RISK (RISK_TYPE) VALUES ('High');

/* Setup age table */
INSERT INTO AGE (MIN_AGE, MAX_AGE) VALUES ('0', '30');
INSERT INTO AGE (MIN_AGE, MAX_AGE) VALUES ('30', '39');
INSERT INTO AGE (MIN_AGE, MAX_AGE) VALUES ('40', '49');
INSERT INTO AGE (MIN_AGE, MAX_AGE) VALUES ('50', '59');
INSERT INTO AGE (MIN_AGE, MAX_AGE) VALUES ('60', '99');

/* Setup targets table */
INSERT INTO TARGETS (MIN_VALUE, TARGET_VALUE, COMPONENT_ID, SEX_ID, AGE_ID) VALUES('14:00', '13:14', (SELECT COMPONENT_ID FROM COMPONENT WHERE COMPONENT_TYPE = 'Run'), (SELECT SEX_ID FROM SEX WHERE SEX_TYPE = 'Male'), (SELECT AGE_ID FROM AGE WHERE MAX_AGE = '39'));
INSERT INTO TARGETS (MIN_VALUE, TARGET_VALUE, COMPONENT_ID, SEX_ID, AGE_ID) VALUES('39.0', '37.5', (SELECT COMPONENT_ID FROM COMPONENT WHERE COMPONENT_TYPE = 'AC'), (SELECT SEX_ID FROM SEX WHERE SEX_TYPE = 'Male'), (SELECT AGE_ID FROM AGE WHERE MAX_AGE = '39'));
INSERT INTO TARGETS (MIN_VALUE, TARGET_VALUE, COMPONENT_ID, SEX_ID, AGE_ID) VALUES('27', '36', (SELECT COMPONENT_ID FROM COMPONENT WHERE COMPONENT_TYPE = 'Push-up'), (SELECT SEX_ID FROM SEX WHERE SEX_TYPE = 'Male'), (SELECT AGE_ID FROM AGE WHERE MAX_AGE = '39'));
INSERT INTO TARGETS (MIN_VALUE, TARGET_VALUE, COMPONENT_ID, SEX_ID, AGE_ID) VALUES('39', '42', (SELECT COMPONENT_ID FROM COMPONENT WHERE COMPONENT_TYPE = 'Sit-up'), (SELECT SEX_ID FROM SEX WHERE SEX_TYPE = 'Male'), (SELECT AGE_ID FROM AGE WHERE MAX_AGE = '39'));

/*
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO) VALUES ('Piccadilly', 'P1', '1Q');

INSERT INTO GUEST (LAST_NAME, FIRST_NAME, EMAIL_ADDRESS, COUNTRY, ADDRESS, STATE, PHONE_NUMBER) VALUES('Adams', 'Roy', 'radams1v@xinhuanet.com', 'United States', '2872 Marquette Street', 'NY', '1-(235)314-9823');

INSERT INTO RESERVATION (ROOM_ID, GUEST_ID, RES_DATE) VALUES ((SELECT ROOM_ID FROM ROOM WHERE ROOM_NUMBER = 'C2'), (SELECT GUEST_ID FROM GUEST WHERE LAST_NAME = 'Young'), '2020-01-01');
*/
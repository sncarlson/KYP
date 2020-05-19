CREATE TABLE SEX(
  SEX_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  SEX_TYPE CHAR(16) NOT NULL
);

CREATE TABLE COMPONENT(
  COMPONENT_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  COMPONENT_TYPE CHAR(64) NOT NULL
);

CREATE TABLE RISK(
  RISK_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  RISK_TYPE CHAR(16) NOT NULL
);

CREATE TABLE AGE(
  AGE_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  MIN_AGE CHAR(16) NOT NULL,
  MAX_AGE CHAR(16) NOT NULL
);

CREATE TABLE TARGETS(
  TARGET_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  MIN_VALUE CHAR(16) NOT NULL,
  TARGET_VALUE CHAR(16) NOT NULL,
  COMPONENT_ID BIGINT NOT NULL,
  SEX_ID BIGINT NOT NULL,
  AGE_ID BIGINT NOT NULL
);

CREATE TABLE CARDIO(
  CARDIO_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  MIN_TIME CHAR(16) NOT NULL,
  MAX_TIME CHAR(16) NOT NULL,
  POINTS CHAR(16) NOT NULL,
  COMPONENT_ID BIGINT NOT NULL,
  TARGET_ID BIGINT NOT NULL,
  RISK_ID BIGINT NOT NULL,
  SEX_ID BIGINT NOT NULL,
  AGE_ID BIGINT NOT NULL
);

CREATE TABLE BODY_COMP(
  BODY_COMP_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  AC_VALUE CHAR(16) NOT NULL,
  POINTS CHAR(16) NOT NULL,
  COMPONENT_ID BIGINT NOT NULL,
  TARGET_ID BIGINT NOT NULL,
  RISK_ID BIGINT NOT NULL,
  SEX_ID BIGINT NOT NULL,
  AGE_ID BIGINT NOT NULL
  );

CREATE TABLE MUSCLE_FITNESS(
  MF_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  MF_VALUE CHAR(16) NOT NULL,
  POINTS CHAR(16) NOT NULL,
  COMPONENT_ID BIGINT NOT NULL,
  TARGET_ID BIGINT NOT NULL,
  RISK_ID BIGINT NOT NULL,
  SEX_ID BIGINT NOT NULL,
  AGE_ID BIGINT NOT NULL
);

ALTER TABLE TARGETS ADD FOREIGN KEY (COMPONENT_ID) REFERENCES COMPONENT(COMPONENT_ID);
ALTER TABLE TARGETS ADD FOREIGN KEY (SEX_ID) REFERENCES SEX(SEX_ID);
ALTER TABLE TARGETS ADD FOREIGN KEY (AGE_ID) REFERENCES AGE(AGE_ID);

ALTER TABLE CARDIO ADD FOREIGN KEY (COMPONENT_ID) REFERENCES COMPONENT(COMPONENT_ID);
ALTER TABLE CARDIO ADD FOREIGN KEY (SEX_ID) REFERENCES SEX(SEX_ID);
ALTER TABLE CARDIO ADD FOREIGN KEY (AGE_ID) REFERENCES AGE(AGE_ID);
ALTER TABLE CARDIO ADD FOREIGN KEY (RISK_ID) REFERENCES RISK(RISK_ID);
ALTER TABLE CARDIO ADD FOREIGN KEY (TARGET_ID) REFERENCES TARGETS(TARGET_ID);

ALTER TABLE BODY_COMP ADD FOREIGN KEY (COMPONENT_ID) REFERENCES COMPONENT(COMPONENT_ID);
ALTER TABLE BODY_COMP ADD FOREIGN KEY (SEX_ID) REFERENCES SEX(SEX_ID);
ALTER TABLE BODY_COMP ADD FOREIGN KEY (AGE_ID) REFERENCES AGE(AGE_ID);
ALTER TABLE BODY_COMP ADD FOREIGN KEY (RISK_ID) REFERENCES RISK(RISK_ID);
ALTER TABLE BODY_COMP ADD FOREIGN KEY (TARGET_ID) REFERENCES TARGETS(TARGET_ID);

ALTER TABLE MUSCLE_FITNESS ADD FOREIGN KEY (COMPONENT_ID) REFERENCES COMPONENT(COMPONENT_ID);
ALTER TABLE MUSCLE_FITNESS ADD FOREIGN KEY (SEX_ID) REFERENCES SEX(SEX_ID);
ALTER TABLE MUSCLE_FITNESS ADD FOREIGN KEY (AGE_ID) REFERENCES AGE(AGE_ID);
ALTER TABLE MUSCLE_FITNESS ADD FOREIGN KEY (RISK_ID) REFERENCES RISK(RISK_ID);
ALTER TABLE MUSCLE_FITNESS ADD FOREIGN KEY (TARGET_ID) REFERENCES TARGETS(TARGET_ID);



########################################SHOPPING CENTER SCHEMA###################################

CREATE TABLE `CITY`
(
  `name`        VARCHAR(100),
  `orientation` VARCHAR(50),
  PRIMARY KEY `PK_CITY_NAME` (`name`)
);

CREATE TABLE `COUNTRY`
(
  `name`      VARCHAR(100),
  `continent` VARCHAR(100),
  `cityName`  VARCHAR(100),
  PRIMARY KEY `PK_COUNTRY_NAME` (`name`),
  FOREIGN KEY `FK_COUNTRY_CITY` (`cityName`) REFERENCES CITY (`name`)
);

CREATE TABLE `PRODUCT`
(
  `id`            INTEGER NOT NULL,
  `description`   VARCHAR(200),
  `price`         DOUBLE,
  `name`          VARCHAR(100),
  `origenCountry` VARCHAR(100),
  PRIMARY KEY `PK_PRODUCT_ID` (`id`),
  FOREIGN KEY `FK_PRODUCT_COUNTRY` (`origenCountry`) REFERENCES COUNTRY (name)
);

CREATE TABLE `STATUS_ORDER`
(
  `status`      VARCHAR(50),
  `description` VARCHAR(200),
  PRIMARY KEY `PK_ORDER_STATUS` (`status`)
);

CREATE TABLE `USER_SESSION`
(
  `status`      VARCHAR(50),
  `description` VARCHAR(200),
  `startTime`   DATE,
  `endTime`     DATE,
  PRIMARY KEY `PK_SESSION_STATUS` (`status`)
);

CREATE TABLE `USER`
(
  `username`    VARCHAR(100),
  `password`    VARCHAR(150),
  `userSession` VARCHAR(100),
  PRIMARY KEY `PK_USER_USERNAME` (`username`),
  FOREIGN KEY `FK_USER_USERSESSION` (`userSession`) REFERENCES USER_SESSION (`status`)
);

CREATE TABLE `ORDER`
(
  `id`          INTEGER,
  `username`    VARCHAR(100),
  `productID`   INTEGER,
  `statusOrder` VARCHAR(50),
  `orderDate`   DATE,
  PRIMARY KEY `PK_ORDER_ID` (`id`),
  FOREIGN KEY `FK_ORDER_USER` (`username`) REFERENCES USER (`username`),
  FOREIGN KEY `FK_ORDER_PRODUCT` (`productID`) REFERENCES PRODUCT (`id`),
  FOREIGN KEY `FK_ORDER_` (`statusOrder`) REFERENCES STATUS_ORDER (`status`)
);
-- *********************************************************************
-- Update Database Script
-- *********************************************************************
-- Change Log: C:/Users/в/Desktop/Project/liquibase/db/master.xml
-- Ran at: 30.10.20 19:26
-- Against: postgres@jdbc:postgresql://localhost:5432/project
-- Liquibase version: 3.10.0
-- *********************************************************************

-- Lock Database
UPDATE databasechangeloglock SET LOCKED = TRUE, LOCKEDBY = 'в-DNS (127.0.0.1)', LOCKGRANTED = '2020-10-30 19:26:53.557' WHERE ID = 1 AND LOCKED = FALSE;

-- Release Database Lock
UPDATE databasechangeloglock SET LOCKED = FALSE, LOCKEDBY = NULL, LOCKGRANTED = NULL WHERE ID = 1;


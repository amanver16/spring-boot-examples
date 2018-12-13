-- Create a new database called 'UserDb'
-- Create the new database if it does not exist already
IF NOT EXISTS (
    SELECT name
FROM sys.databases
WHERE name = N'UserDb'
)
CREATE DATABASE UserDb
GO

-- Use Database
USE UserDb

-- Create User Table

CREATE TABLE USERS
(
    ID INT PRIMARY KEY NOT NULL,
    NAME VARCHAR(20),
    AGE INT
)

INSERT INTO USERS
VALUES
    (1, 'Aman', 23),
    (2, 'Upendra', 24),
    (3, 'Vishal', 25)

SELECT *FROM USERS

-- Create Procedure
CREATE PROCEDURE USER_LIST
AS
SELECT *FROM USERS
GO;

-- Execute Procedure
EXEC USER_LIST
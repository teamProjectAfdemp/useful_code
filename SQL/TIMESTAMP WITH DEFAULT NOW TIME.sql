
-- Create a column of TIMESTAMP type that autofills when a row is inserted
CREATE TABLE IF NOT EXISTS `whatever` (
-- ...
`create_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
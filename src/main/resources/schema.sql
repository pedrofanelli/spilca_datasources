
CREATE TABLE IF NOT EXISTS purchase (
   id SERIAL PRIMARY KEY,
   product varchar(50) NOT NULL,
   price numeric NOT NULL
);
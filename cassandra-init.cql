CREATE KEYSPACE ex1 WITH replication = {'class': 'SimpleStrategy', 'replication_factor' : 1};

CREATE TABLE ex1.gdp (
    id TEXT,
    rank int,
    name TEXT,
    amount int,
    PRIMARY KEY(id)
);

// Letting Cassandra use default names for the indexs for ease.

CREATE INDEX ON ex1.gdp ( amount ); // Maybe we need good people by state?

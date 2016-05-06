CREATE KEYSPACE sparkfu WITH replication = {'class': 'SimpleStrategy', 'replication_factor' : 1};

CREATE TABLE sparkfu.human (
    id TIMEUUID,
    firstname TEXT,
    lastname TEXT,
    gender TEXT,
    address0 TEXT,
    address1 TEXT,
    city TEXT,
    stateprov TEXT,
    zippostal TEXT,
    country TEXT,
    phone TEXT,
    isgoodperson BOOLEAN,
    PRIMARY KEY(id)
);

// Letting Cassandra use default names for the indexs for ease.
CREATE INDEX ON sparkfu.human ( isgoodperson ); // We want to be able to find good people quickly

CREATE INDEX ON sparkfu.human ( stateprov ); // Maybe we need good people by state?

CREATE INDEX ON sparkfu.human ( firstname ); // Good people tend to be named "Brad" - let's find them fast too!
// Clearly this is a horrible model you would never ever use in production, but since this is just a simple example.
CREATE TABLE sparkfu.goodhuman (
    firstname TEXT,
    lastname TEXT,
    PRIMARY KEY(firstname,lastname)
);
CREATE TABLE sparkfu.humanfromtuple (
    id TIMEUUID,
    fname TEXT,
    lname TEXT,
    gender TEXT,
    address1 TEXT,
    address2 TEXT,
    city TEXT,
    state TEXT,
    zip TEXT,
    phone TEXT,
    PRIMARY KEY(id)
);
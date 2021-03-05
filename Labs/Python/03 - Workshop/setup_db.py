import psycopg2

con = psycopg2.connect(database="postgres", user="d3vg0d355", password="postgres", host="127.0.0.1", port="5432")

cur = con.cursor()


# Query via the cursor
cur.execute("CREATE SCHEMA if NOT EXISTS people")
#cur.execute("drop table people.person")

cur.execute("CREATE TABLE people.person("
            "person_id SERIAL PRIMARY KEY,"
            "first_name varchar(50) NOT NULL,"
            "last_name varchar(50) NOT NULL,"
            "address varchar(40) NULL,"
            "city varchar(20) NULL,"
            "county varchar(20) NULL,"
            "state char(2) NULL,"
            "zip char(5) NULL,"
            "landline varchar(12) NULL,"
            "mobile varchar(12) NULL);")
con.commit()
#cur.execute("select * from people.person")

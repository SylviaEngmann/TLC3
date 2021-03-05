import pandas as pd
import psycopg2

con = psycopg2.connect(database="postgres", user="d3vg0d355", password="postgres", host="127.0.0.1", port="5432")

cur = con.cursor()

queryCountPeopleByState = "select distinct state,count(person_id) from people.person group by state;"
cur.execute(queryCountPeopleByState)
rows = cur.fetchall()
for row in rows:
    print(row)

queryPeopleSameZipCode = "select zip , string_agg(first_name , ', ') from people.person group by zip;"
cur.execute(queryPeopleSameZipCode)
rows = cur.fetchall()
for row in rows:
    print(row)
    


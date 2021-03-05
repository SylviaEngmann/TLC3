import pandas as pd
import psycopg2

con = psycopg2.connect(database="postgres", user="d3vg0d355", password="postgres", host="127.0.0.1", port="5432")

cur = con.cursor()

user_df = pd.read_csv('500-us-users.csv')
for i in user_df.index:
    cur.execute("""
    INSERT into people.person(first_name, last_name,address, city, county, state, zip, landline, mobile) 
    values('%s','%s','%s','%s','%s','%s','%s','%s','%s');
    """ % (user_df.at[i, 'first_name'], user_df.at[i, 'last_name'], user_df.at[i, 'address'], user_df.at[i, 'city'],
           user_df.at[i, 'county'], user_df.at[i, 'state'], user_df.at[i, 'zip'], user_df.at[i, 'phone1'],
           user_df.at[i, 'phone2']))

con.commit()
cur.close()
con.close()



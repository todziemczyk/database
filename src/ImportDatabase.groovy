import groovy.sql.Sql;

def sql = Sql.newInstance("jdbc:oracle:thin:@//tgrall-linux:1521/XE",
        "GROOVY",
        "GROOVY",
        "oracle.jdbc.driver.OracleDriver")
def set = sql.dataSet("NEWS");
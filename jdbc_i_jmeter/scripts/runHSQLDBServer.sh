#!/bin/bash

java -cp /home/studinf/mkrakowiak/git_nowy/java_testy/jdbc/scripts/hsqldb.jar org.hsqldb.server.Server --database.0 mem:mydb --dbname.0 workdb

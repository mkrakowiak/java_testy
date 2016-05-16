#!/bin/bash

java -cp /home/krakmis/Pulpit/TestowanieAplikacjiJava-master/JDBC/scripts/hsqldb.jar org.hsqldb.server.Server --database.0 mem:mydb --dbname.0 workdb

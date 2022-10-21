#!/bin/bash

#Make Jboss home dir
mkdir /opt/jboss-eap-7.4.0

#Unzip .zip file and move to home dir
unzip jboss-eap-7.4.0.zip -d /tmp/test
cd /tmp/test || exit
cp jboss-eap-7.4 /opt/jboss-eap-7.4.0/

#Add a user
cd /opt/jboss-eap-7.4.0/jboss-eap-7.4/bin || exit
./add-user.sh -u 'admin' -p 'password' -g 'admin'

# start standalone instance in separate terminal (nohup) on port 9081
nohup ./standalone.sh -b 0.0.0.0 -Djboss.socket.binding.port-offset=1001 &

#start jboss-cli and connect
./jboss-cli.sh
connect localhost:8091

#add module for jdbc driver
module add --name=com.postgresql --resources=postgresql-42.2.5.jar --dependencies=javax.api,javax.transaction.api

#register jdbc module
/subsystem=datasources/jdbc-driver=postgresql:add(driver-name=postgresql,driver-module-name=com.postgresql,driver-class-name=org.postgresql.Driver)

#add postgresql datasource
data-source add --name=PostgresqlDB --jndi-name=java:jboss/datasources/PostgresqlDB --driver-name=postgresql  --connection-url=jdbc:postgresql://localhost:5432/PostgresqlDB

#deploy .war file

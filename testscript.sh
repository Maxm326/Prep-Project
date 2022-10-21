#!/bin/bash

#Make Jboss home dir
mkdir /opt/jboss-eap-7.4.0

#Unzip .zip file and move to home dir
unzip jboss-eap-7.4.0.zip -d /tmp/test
cd /tmp/test 
cp jboss-eap-7.4 /opt/jboss-eap-7.4.0/

#Add a user - FIXME using single line
cd /opt/jboss-eap-7.4.0/jboss-eap-7.4/bin
./add-user.sh -u 'admin' -p 'password' -g 'admin'

#need to start standalone instance in separate terminal (nohup)
nohup ./standalone.sh &

#start jboss-cli and connect
./jboss-cli.sh -c 

#add module for jdbc driver

#add postgresql datasource

#change http port binding to 8091

#deploy .war file

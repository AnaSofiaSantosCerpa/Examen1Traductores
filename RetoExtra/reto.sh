#!/bin/bash

export JAVA_OPTS="-Xmx2g"
export JAVA_OPTS="-Xss1g"
kotlin -cp Reto.jar:. RetoKt $1 

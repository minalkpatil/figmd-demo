#!/bin/sh

echo "current working dir `pwd`"
#TOP=/data1/patdev1/myProjects/c
cd src/c
echo "New current working dir `pwd`"
echo "started building c math project "
echo "+++++++++++++++++++++++++++++++++++++++++++++++"
make
echo "+++++++++++++++++++++++++++++++++++++++++++++++"
if [ $? = 0 ]; then
    echo " Build completed sucessfully"
    echo "Starting test code"
    echo "********************************************************"
    ./testcode/mathLibTest
    echo "********************************************************"

else
    echo "Build failed. Error Code $? "
fi

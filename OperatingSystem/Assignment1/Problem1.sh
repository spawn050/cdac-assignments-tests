#!/bin/bash

#This is Problem number 1
#Execute this file in home folder

cd /home;
sudo mkdir LinuxAssignment;
echo "a.Linux Assignment directory is created";
echo "";
echo "";

cd ./LinuxAssignment;
sudo touch file1.txt;
echo "Hello World" | sudo tee file1.txt;
echo "b.file1 is created and its value is displayed";
echo "";
echo "";

sudo mkdir docs;
echo "c.docs directory is created";
echo "";
echo "";

sudo cp file1.txt ./docs/;
cd docs;
sudo mv file1.txt file2.txt;
echo "d.copied file1 into docs directory by the name of file2";
echo "";
echo "";

sudo chmod 744 file2.txt;
sudo chown -c omkarsatam file2.txt;
echo "e.changed the permissions of file2";
echo "";
echo "";

cd /home;
sudo apt install tree;
tree;
echo "f.shown the tree structure of the directory";
echo "";
echo "";

find -type f -name "*.txt";
grep 'World' ./LinuxAssignment/file1.txt;
echo "g.searched for .txt files and displayed a line with a searched word";
echo "";
echo "";

date;
echo "h.shown date and time on the current system";
echo "";
echo "";

curl ifconfig.me;
sudo apt install traceroute;
traceroute 8.8.8.8;
echo "i.shown ip address and pinged the server";
echo "";
echo "";

sudo apt install zip;
cd LinuxAssignment/;
sudo zip -r docs.zip docs;
sudo mkdir docsZipDirectory;
sudo unzip docs.zip -d ./docsZipDirectory/;
echo "j.compressed and extracted zip file";
echo "";
echo "";

sudo sed -i 's/Hello/hi/' file1.txt;
cat file1.txt;
echo "k.replaced the word hello with hi in file1.txt and displayed the file1.txt";
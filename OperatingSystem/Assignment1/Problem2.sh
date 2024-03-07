#!/bin/bash

#This is Problem number 1
#Execute this file in home folder

cd /home;
sudo mkdir Assignment2/;
cd Assignment2/;
sudo touch data.txt;
echo -e "Lore Ipsum1 \n Lore Ipsum2 \n Lore Ipsum3 \n Lore Ipsum4 \n Lore Ipsum5 \n Lore Ipsum6 \n Lore Ipsum7 \n Lore Ipsum8 \n Lore Ipsum9 \n Lore Ipsum10 \n Lore Ipsum11 \n Lore Ipsum12 \n Lore Ipsum13 \n Lore Ipsum14 \n Lore Ipsum15 \n Lore Ipsum16 \n Lore Ipsum17\nLore Ipsum18\nLore Ipsum19\nLore Ipsum20" | sudo tee data.txt;
head -10 data.txt;
echo "a.displayed the first 10 lines of data.txt";
echo "";
echo "";

tail -5 data.txt;
echo "b.last 5 lines of the data.txt is printed";
echo "";
echo "";

sudo touch numbers.txt;
echo -e "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20" | sudo tee numbers.txt;
head -15 numbers.txt; 
echo "c.print first 15 lines of numbers";
echo "";
echo "";

tail -3 numbers.txt;
echo "d.print last 3 lines of numbers";
echo "";
echo "";

sudo touch input.txt;
sudo cp data.txt input.txt;
sudo touch ouput.txt;
sudo chmod u+w,o+w,g+w output.txt;
sudo tr '[:lower:]' '[:upper:]' < input.txt > output.txt;
sudo cat output.txt;
echo "e.converted from lower case to uppercase and copied the values in output.txt";
echo "";
echo "";

sudo touch duplicate.txt;
echo -e "apples\napples\noranges\noranges\noranges\njackfruit" | sudo tee duplicate.txt;
uniq duplicate.txt;
echo "f.print unique lines from duplicate.txt";
echo "";
echo "";

sudo touch fruit.txt;
sudo cp duplicate.txt fruit.txt;
uniq -c fruit.txt;
echo "g.print unique lines with number of occurences in fruit.txt";
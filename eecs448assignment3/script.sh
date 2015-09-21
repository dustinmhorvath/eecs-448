#/bin/sh

#cd ~/

#MAKE FOLDER, CD IN, CREATE A BLANK TEXT FILE
mkdir testdir
cd testdir
touch testfile.txt

#ECHO SOME TEXT INTO TESTFILE. CREATE SOME MORE BLANK TEXT FILES.
echo "some test text" > testfile.txt
touch testfile1
touch testfile2
touch testfile3

#APPEND LS OF TESTDIR INTO TESTFILE
ls >> testfile.txt

#OUTPUT ALL THE CONTENTS OF EVERY FILE IN TESTDIR
ls -la | cat testfile.txt


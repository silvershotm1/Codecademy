
// Redirection

//**1 stdin, is information inputted into the terminal through the keyboard or input device.
//**2 stdout, is the information outputted after a process is run.
//**3 stderr, is an error message outputted by a failed process.

1. ``` echo "Hello" ``` // prints Hello to the console

2. ``` echo "Hello" > hello.txt ``` ```cat hello.txt ```
// takes Hello and writes it to file

3. ```cat glaciers.txt >> rivers.txt```  // > overwrites while >> adds to file.

4. ``` cat < lakes.txt ``` // takes std input from right and inputs to program on left.

5.  ```cat volcanoes.txt | wc ``` // wordcount -- lines, words, characters

6.  ``` sort lakes.txt ``` // sorts names in file.

7. ``` sort deserts.txt | uniq > uniq-deserts.txt ``` // removes duplicates.

8. ``` grep Mount mountains.txt ``` // looks for mount in file.

9. ```grep -R Arctic /home/ccuser/workspace/geography ``` // Search Artic in folder

10. ```sed 's/snow/rain/g' forests.txt ``` //
// sed is stream editor  s = substitution;
// snow = text to find; rain = replacement string; g = global

# InvertedIndexMR
Generating Inverted Index

<b>Commands Used On Linux:</b>

1. export HADOOP_CLASSPATH=$(hadoop classpath)

2.hadoop fs -mkdir /InvertedIndexMR

3.hadoop fs -mkdir /InvertedIndexMR/Input

4.hadoop fs -put PathOfDataOnLocalMachine  /InvertedIndexMR/Input

5.cd /home/hadoop/Desktop/InvertededIndexMR

6.chmod 777 aba (Change permissions of all files)

7.javac -classpath  ${HADOOP_CLASSPATH} -d PathOfFolderWhereYouWantToStoreClassFilesOnLocalMachine JavaProgramToCompileve

8.jar -cvf JarFileName -C InvertedIndexMR/ .

9.hadoop jar JarFilePath ClassNameInMainProgram /InvertedIndexMR/Input /InvertedIndexMR/Output


For Splitting Cleaned Data Into Sections:

<b>csplit -z mahabharta.txt /sec_/ '{*}'</b>

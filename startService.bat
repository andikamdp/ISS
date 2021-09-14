echo Current Dir "%CD%"
xcopy /s /Y "C:\Users\Andika Mulyawan\.jenkins\workspace\test" E:\GIT\PUBLISH\Test
xcopy /s /Y "C:\Users\Andika Mulyawan\.jenkins\workspace\test\target" E:\GIT\PUBLISH\Test

cd /d E:
cd "E:\GIT\PUBLISH\Test"
java -jar -Xms1024m -Xmx1024m Spring_Boot_Training-0.0.1-SNAPSHOT.jar

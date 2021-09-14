pipeline
{
   agent {
      label 'master'
   }

   stages{

      stage ('windows-nohup')
      {

         steps
         {
            bat """ echo Current Dir '%CD%''""
            bat """ xcopy /s /Y C:\Users\Andika Mulyawan\.jenkins\workspace\test E:\GIT\PUBLISH\Test """
            bat """ xcopy /s /Y C:\Users\Andika Mulyawan\.jenkins\workspace\test\target E:\GIT\PUBLISH\Test """

            bat """ cd /d E: """
            bat """ cd 'E:\GIT\PUBLISH\Test' """
            bat """ java -jar -Xms1024m -Xmx1024m Spring_Boot_Training-0.0.1-SNAPSHOT.jar """



         }
      }
   }
}
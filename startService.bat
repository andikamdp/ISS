REM START java -jar Spring_Boot_Training-0.0.1-SNAPSHOT.jar

stage('build') {
      cmd_exec('echo "Buils starting..."')
      cmd_exec('echo The current directory is %CD%')
}

def cmd_exec(command) {
    return bat(returnStdout: true, script: "${command}").trim()
}

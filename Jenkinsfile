// Jenkinsfile
@Library('testlib@master') _
//library 'testlib@master'

echo "fullname: ${currentBuild.fullDisplayName}"
echo "build id: ${currentBuild.getNumber()}"

echo "result: ${currentBuild.getResult()}"

//echo "${currentBuild.getNumber()}"
evenOrOdd(currentBuild.getNumber())
//evenOrOdd(currentBuild.number())

echo "current result: ${currentBuild.getCurrentResult()}"


pipeline {
    agent none
    stages {
        stage ('Example') {
            steps {
                // log.info 'Starting' 
                script { 
                    log.info 'Starting'
                    log.warning 'Nothing to do!'
                }
            }
        }
    }
}

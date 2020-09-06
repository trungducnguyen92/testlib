// Jenkinsfile
@Library('testlib@master') _
//library 'testlib@master'

/*echo "fullname: ${currentBuild.fullDisplayName}"
echo "build id: ${currentBuild.getNumber()}"
echo "result: ${currentBuild.getResult()}"
*/

//evenOrOdd(currentBuild.getNumber())
//evenOrOdd(currentBuild.number()) // error https://opensource.triology.de/jenkins/pipeline-syntax/globals


//echo "current result: ${currentBuild.getCurrentResult()}"


pipeline {
    agent none
    stages {
        stage ('Example') {
            steps {
                // log.info 'Starting' 
                script { 
                    myurl = url()
                    echo $myurl
                    println "[INFO] This is my url: ${url}"
                    //log.info 'Starting'
                    //log.warning 'Nothing to do!'
                }
                //sayHello 'Joe'
                //sayHello() /* invoke with default arguments */
            }
        }
    }
}

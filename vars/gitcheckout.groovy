def mygiturl

pipeline {
    agent master
    stages {
        stage('Checkout git'){
            steps {
		        echo "test"
            }
        }
    }
}

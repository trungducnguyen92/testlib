def mygiturl

pipeline {
	agent master
	stages {
		stage('Checkout git'){
			steps {
				script {
					echo "Repository URL is:"
				}
			}
		}
	}
}

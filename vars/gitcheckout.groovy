def call(String mygiturl = 'https://github.com/trungducnguyen92/Test_repo.git'){
    pipeline {
      agent any
      stages {
        stage('Checkout git') {
          steps {
	    echo "Your repo url is: ${mygiturl}"
	    echo "Now cloning the repository"
	    sh 'git clone https://github.com/trungducnguyen92/Test_repo.git'
	    sh 'cd /var/lib/jenkins/workspace/exercise-git-checkout/Test_repo/'
	    sh 'cd Test_repo/'
	    sh 'ls -l'
	    /*sh 'git checkout test1'*/
	    /*sh 'git branch'*/
        }
      }
    }
  }
}

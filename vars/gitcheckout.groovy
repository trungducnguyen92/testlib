def call(String mygiturl = 'https://github.com/trungducnguyen92/Test_repo.git'){
    pipeline {
      agent any
      stages {
        stage('Checkout git') {
          steps {
	    echo "Your repo url is: ${mygiturl}"
	    echo "Now cloning the repository"
	    sh 'cd /home/test'
	    sh 'git clone https://github.com/trungducnguyen92/Test_repo.git'
	    sh 'cd Test_repo/'
	    sh 'ls -l'
	    /*sh 'git checkout test1'*/
	    /*sh 'git branch'*/
        }
      }
    }
  }
}

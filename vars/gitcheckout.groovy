def call(String mygiturl){
    pipeline {
      agent any
      stages {
        stage('Checkout git') {
          steps {
	    echo "Your repo url is: ${mygiturl}"
	    echo "Now cloning the repository"
	    sh '''
	    git clone https://github.com/trungducnguyen92/Test_repo.git
	    cd /var/lib/jenkins/workspace/exercise-git-checkout/Test_repo
	    ls -l
	    git checkout test1
	    git branch
	    '''
        }
      }
    }
  }
}

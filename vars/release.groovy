def call() {

    checkout scm

    def scmVars = [:]

    
    dir('testlib') {

        def repoScmVars = checkout([
            $class: 'GitSCM',
            branches: [[name: "master"]], 
            browser: [$class: 'GithubWeb', repoUrl: 'https://github.com/canhnp/testlib.git'],
           // extensions: [
            //    [$class: 'CleanBeforeCheckout'],
           // ]     
        ])
        //scmVars.put('testlib', repoScmVars)
    }
}

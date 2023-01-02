pipeline {
  agent any
  stages {
		stage('Maven Compile'){
			steps{
				echo 'Project compile stage'
				bat label: 'Compilation running', script: '''mvn compile'''
      		}
		}
 
		stage('Unit Test') {
  			steps {
				echo 'Project Testing stage'
				bat label: 'Test running', script: '''mvn test'''      
       		}
   		}
   		
   		stage('Jacoco Coverage Report') {
        	steps{
            	jacoco()
			}
		}
		
		stage('Generate Cucumber report') {
            steps{
                 cucumber buildStatus: 'UNSTABLE',
                      reportTitle: 'My Cucumber Report',
                      fileIncludePattern: '**/*.json',
                         trendsLimit: 10,
                      classifications: [
                          [
                              'key': 'Browser',
                              'value': 'Chrome'
                          ]
                      ]
                  }
         }

		stage('Maven Package'){
			steps{
				echo 'Project packaging stage'
				bat label: 'Project packaging', script: '''mvn package'''
			}
		} 
  	}
}
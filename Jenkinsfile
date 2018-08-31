pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package'
      }
    }
    stage('Test') {
      post {
        always {
          archiveArtifacts(artifacts: '**/*.jar', fingerprint: true)
          junit 'target/surefire-reports/*.xml'
        }
      }
      steps {
        sh 'mvn test verify'
      }
    }
    stage('Deploy & Report') {
      parallel {
        stage('deploy') {
          steps {
            pushToCloudFoundry(target: 'https://api.run.pivotal.io', organization: 'BitShift', cloudSpace: 'development', credentialsId: '6e3719ab-a9ae-4c90-b26b-33356b5c7671', pluginTimeout: '240')
          }
        }
        stage('code coverage report') {
          steps {
            build(job: 'code-coverage', quietPeriod: 12)
          }
        }
      }
    }
  }
  tools {
    maven 'localMaven'
  }
  triggers {
    pollSCM('* * * * *')
  }
}
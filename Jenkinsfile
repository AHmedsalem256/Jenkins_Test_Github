pipeline {
  agent any
  stages {
    stage('Build ') {
      steps {
        git 'https://github.com/AHmedsalem256/Jenkins_Test_Github.git'
        bat 'mvn clean compile'
      }
    }

    stage('Test_Code') {
      steps {
        bat 'mvn test'
      }
    }

    stage('Deploy ') {
      steps {
        echo 'Project_Deployed'
      }
    }

  }
}

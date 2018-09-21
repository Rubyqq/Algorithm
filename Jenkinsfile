node{
  echo "Before checkout"
  stage("Checkout"){}
  echo "After checkout"
  
  echo "Before build"
  stage("Build"){}
  echo "After Build"
  
  echo "DIR"
  bat "DIR"
  echo "Geting git version"
  bat "git --version"
  checkout scm
  echo "test commit"
  
  bat "git add ."
  bat "git status"
  bat "git commit -m "this is auto git commit""
  bat "git push"
  
  echo "git test finished!"
}

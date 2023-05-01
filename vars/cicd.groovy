def newgit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}

def newmaven()
{
  sh "mvn package"
}

def newdeploy(jobname,ipaddress,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat9/webapps/${context}.war"
  
}

def newtest(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
  
}


  

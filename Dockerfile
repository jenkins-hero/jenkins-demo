FROM jenkins/jenkins:2.248

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

COPY seedJob.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml

VOLUME /var/jenkins_home


ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
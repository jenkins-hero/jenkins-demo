FROM jenkins/jenkins:2.182

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
COPY seedJob.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml

RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
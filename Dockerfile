FROM jenkins/jenkins:2.182

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
COPY seed-job.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml

RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt
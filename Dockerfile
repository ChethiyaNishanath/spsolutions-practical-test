FROM ghcr.io/eclipse-ee4j/glassfish:8.0.2
COPY target/news.war /opt/gfinstall/glassfish/domains/domain1/autodeploy

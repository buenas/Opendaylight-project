#           Opendaylight-project

Generated Opendaylight project based on Boron-SR2 startup archetype using :
 mvn org.apache.maven.plugins:maven-archetype-plugin:3.0.0:generate 
 -DarchetypeGroupId=org.opendaylight.controller 
 -DarchetypeArtifactId=opendaylight-startup-archetype 
 -DarchetypeVersion=1.2.2-Boron-SR2
         
         
         Build Project: 
 Edit ~/.m2/settings.xml to use ODL mirror repositories using the following command: 
 
 cp -n ~/.m2/settings.xml{,.orig} ; 
wget -q -O - https://raw.githubusercontent.com/opendaylight/odlparent/master/settings.xml > ~/.m2/settings.xml mvn clean install

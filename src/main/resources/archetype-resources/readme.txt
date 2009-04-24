;create project
;NT/2000
mvn archetype:create ^
 -DgroupId=org.mix3.struts2Test ^
 -DartifactId=struts2Test ^
 -DarchetypeGroupId=org.mix3 ^
 -DarchetypeArtifactId=struts2-archetype-quickstart ^
 -DarchetypeVersion=0.1 -U
;linux
mvn archetype:create
 -DgroupId=org.mix3.struts2Test \
 -DartifactId=struts2Test \
 -DarchetypeGroupId=org.mix3 \
 -DarchetypeArtifactId=struts2-archetype-quickstart \
 -DarchetypeVersion=0.1 -U
					
;import eclipse
mvn -DdownloadSources=true eclipse:eclipse

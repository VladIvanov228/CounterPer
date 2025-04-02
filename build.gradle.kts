/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.4/samples
 */
plugins{
	java
	pmd
}

version="1.0"
group="ru.ac.uniyar.testingcourse"

repositories{
	mavenCentral()
}

dependencies{
	implementation("org.assertj:assertj-core:3.24.0")
	implementation("org.junit.jupiter:junit-jupiter-api:5.11.0")	
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.0")
	testImplementation("org.assertj:assertj-core:3.24.0")
}

tasks.named<Test>("test"){
	useJUnitPlatform()
}

pmd{
	maxFailures = 10000
	toolVersion = "6.51.0"
}

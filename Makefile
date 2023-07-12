JAVA_HOME :=/usr/lib/jvm/java-11-openjdk

PACKAGE = com.deimos.chatroomgpt
BUILD_TYPE = Debug

start: install launch logcat
restart: launch logcat
attach: logcat

init:
	gradle wrapper

clean:
	./gradlew clean

install: 
	./gradlew install${BUILD_TYPE}

build: clean
	./gradlew assemble${BUILD_TYPE}

launch: 
	adb shell am force-stop ${PACKAGE}
	adb shell monkey -p ${PACKAGE} 1

logcat: 
	adb logcat -v color | grep $(shell adb shell pidof ${PACKAGE}) 

info:
	./gradlew tasks

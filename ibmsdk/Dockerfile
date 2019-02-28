FROM ibmjava:sdk-alpine

RUN java -version

CMD cd /src && javac JavaProp.java && java JavaProp && java -version && cat /proc/version
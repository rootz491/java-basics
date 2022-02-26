#	Java Servlet

starting out with java servlets now, here's what i've followed before touching any of below stuff: [blog](https://www.herongyang.com/JSP/macOS-My-First-Servlet-Page.html)

---

Writing Hello World from servlet!

1. Starting with installing Tomcat [binary](https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.58/bin/apache-tomcat-9.0.58.tar.gz)

	*	unzip the file: 
		```sh
		tar -xf apache-tomcat-9.0.58.tar.gz
		```

2.	Directory has bunch of sub-directories; But I'm interested in `bin`.
	It has few scripts, make them executable
	```sh
	cd /Library/Tomcat/bin
	chmod +x *.sh
	```

3.	Now we can start Tomcat server
	```sh
	./startup.sh
	```
	To close the server
	```sh
	./shutdown.sh
	```

4.	You probably need some privilidge to manage tomcat server, so add a user
	```sh
	cd /Library/Tomcat/conf
	nano tomcat-users.xml
	```
	now just read the comments and you'll know what to do.
	> PS: If you still can't figure this out, drop this stuff already; You're wasting your time here!

5.	
















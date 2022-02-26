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
	check if server started, go to browser & visit
	```
	localhost:8080
	```
	To close the server
	```sh
	./shutdown.sh
	```
	> read about other script's working on google etc...

4.	You probably need some privilidge to manage tomcat server, so add a user
	```sh
	cd /Library/Tomcat/conf
	nano tomcat-users.xml
	```
	now just read the comments and you'll know what to do.
	> PS: If you still can't figure this out, drop this stuff already; You're wasting your time here!

5.	Now everything is set. Let's write out first servlet i.e. **Hello World**
	*	Go to your wokring directory and make a file called `HelloServlet.java`.
		```sh
		cd ~/servlets/
		nano HelloServlet.java
		```
	*	copy [code](./HelloServlet.java) to your file.
	*	now compile the code
		```sh
		javac -cp /Library/Tomcat/lib/servlet-api.jar HelloServlet.java
		```
	*	Byte-code should be generated as `HelloServlet.class`, now copy this code to specific folder in Tomcat directory.
		```sh
		cp HelloServlet.class /Library/Tomcat/webapps/rootz491/WEB-INF/classes
		```

	*	Now create new file called `web.xml` in specific location of Tomcat directory.
		```sh
		nano /Library/Tomcat/webapps/rootz491/WEB-INF/web.xml
		```
		and paste below xml code into above file
		```
		<web-app>
		  <servlet>
		    <servlet-name>Hello</servlet-name>
		    <servlet-class>HelloServlet</servlet-class>
		  </servlet>
		  <servlet-mapping>
		    <servlet-name>Hello</servlet-name>
		    <url-pattern>/hello</url-pattern>
		  </servlet-mapping>
		</web-app>
		```
		This code is config of our servlet for Tomcat server.

	*	Finally, visit `http://localhost:8080/rootz491/hello` and you'll get the response from your servlet!



Now I'll continue with little more complex servlet code & will try running it.

All the code will be here soon!
















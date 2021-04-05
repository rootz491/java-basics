import java.lang.Thread;


class demo  extends Thread {
	public void run() {
		System.out.println("Hello World!\nThread Name: 	" + Thread.currentThread().getName());
		System.out.println("Thread ID:	" + Thread.currentThread().getId());
		System.out.println("Thread Priority:	" + Thread.currentThread().getPriority());
		System.out.println("Thread Group:		" + Thread.currentThread().getThreadGroup());
		System.out.println("Thread -> toString: " + Thread.currentThread().toString());
		System.out.println("thread State: 		" + Thread.currentThread().getState());
		System.out.println("thread " + Thread.currentThread().getId() + " Strack Trace: " + Thread.currentThread().getStackTrace());
	}
}

class doubleHelloWorld {
	public static void main(String[] args) {

		System.out.println("GOD Thread's name: 	" + Thread.currentThread().getName());
		System.out.println("GOD Thread's ID:	" + Thread.currentThread().getId());
		System.out.println("GOD Thread's Priority:	" + Thread.currentThread().getPriority());

		for(int i=0; i<5; i++) {
			demo obj = new demo();
			//	start() method invokes the run() method of corresponding process!
			obj.start();
		}

	}
} 

/*
OUTPUT
======
% javac doubleHelloWorld.java
% java doubleHelloWorld

GOD Thread's name: 	main
GOD Thread's ID:	1
GOD Thread's Priority:	5
Hello World!
Thread Name: 	Thread-1
Hello World!
Thread Name: 	Thread-2
Hello World!
Thread Name: 	Thread-3
Hello World!
Thread Name: 	Thread-4
Thread ID:	17
Thread ID:	14
Thread ID:	16
Thread Priority:	5
Thread Priority:	5
Thread ID:	15
Thread Priority:	5
Thread Priority:	5
Thread Group:		java.lang.ThreadGroup[name=main,maxpri=10]
Thread -> toString: Thread[Thread-2,5,main]
Thread Group:		java.lang.ThreadGroup[name=main,maxpri=10]
thread State: 		RUNNABLE
Thread -> toString: Thread[Thread-4,5,main]
thread State: 		RUNNABLE
Thread Group:		java.lang.ThreadGroup[name=main,maxpri=10]
Hello World!
Thread Name: 	Thread-0
Thread ID:	13
Thread Priority:	5
Thread -> toString: Thread[Thread-1,5,main]
thread State: 		RUNNABLE
Thread Group:		java.lang.ThreadGroup[name=main,maxpri=10]
Thread Group:		java.lang.ThreadGroup[name=main,maxpri=10]
Thread -> toString: Thread[Thread-3,5,main]
thread State: 		RUNNABLE
Thread -> toString: Thread[Thread-0,5,main]
thread State: 		RUNNABLE
thread 17 Strack Trace: [Ljava.lang.StackTraceElement;@3974eb38
thread 16 Strack Trace: [Ljava.lang.StackTraceElement;@3b889e4f
thread 13 Strack Trace: [Ljava.lang.StackTraceElement;@67344f72
thread 15 Strack Trace: [Ljava.lang.StackTraceElement;@7a5d0762
thread 14 Strack Trace: [Ljava.lang.StackTraceElement;@2c203648
*/
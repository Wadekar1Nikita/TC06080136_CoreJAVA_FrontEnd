//common data can be accessed by various threads at same time
//threads are made up of multiple operations
//two set of instruction can overlap on a common data items and manipulate it.
//leads to data corruption issues

//Thread Synchronization
//key to synchronization is the concept of monitor
//a monitor is an object is used as mutually exclusive lock 
//only one thread can own a monitor at a give time
//when a thread acquires a lock it is said to have entered the monitor
//All other threads attempting to enter the locked monitor will be suspended until 
//the first thread exits the monitor
public class ThreadInterferenceDEmo {

}

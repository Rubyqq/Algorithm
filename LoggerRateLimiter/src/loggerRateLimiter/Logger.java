package loggerRateLimiter;

import java.util.HashMap;
import java.util.Map;

public class Logger {
	
	Map <String, Integer> messageTime;
	
	public static void main(String...args){
		
		Logger log = new Logger();
		log.shouldPrintMessage(1, "foo");
	}
	
    /** Initialize your data structure here. */
    public Logger() {
    	messageTime = new HashMap <>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!messageTime.containsKey(message) || Math.abs(timestamp - messageTime.get(message)) >= 10) {
        	messageTime.put(message, timestamp);
        	return true;
        }
        return false;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
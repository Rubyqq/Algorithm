package MeetingRooms;

import java.util.Arrays;

/**
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), 
 * determine if a person could attend all meetings.
 * For example,
 * Given [[0, 30],[5, 10],[15, 20]],
 * return false. 
 * @author Mengyi
 *
 */

public class MeetingRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interval [] intervals = new Interval[3];
		
		Interval interval = new Interval(1,17); 
		Interval interval1 = new Interval(7,10);
		Interval interval2 = new Interval(12,14);
		
		for(int i = 0; i < intervals.length; i++){
			intervals[0] = interval;
			intervals[1] = interval1;
			intervals[2] = interval2;
		}
		
		sort(intervals);
		
		System.out.print(canAttendMeetings(intervals));
	}

	public static boolean canAttendMeetings(Interval[] intervals) {
		sort(intervals);
		
		for(int i = 0; i < intervals.length-1; i++){
			if(intervals[i].end > intervals[i+1].start) {
				return false;
			}
		}
		
		return true;
    }
	
	public static void sort(Interval[] intervals) {
		
		if(intervals.length < 2) return;
		
		int mid = intervals.length/2;
		int right = intervals.length-mid;
		
		Interval [] left1 = new Interval[mid];
		Interval [] right1 = new Interval[intervals.length-mid];
		
		for(int i = 0; i < left1.length; i++){
			left1[i] = intervals[i];
		}
		
		for(int i = mid; i < intervals.length; i++){
			right1[i - mid] = intervals[i];
		}
		sort(left1);
		sort(right1);
		merge(intervals, left1, right1);
		
	
	}
	
	public static void merge(Interval[] intervalk, Interval[] left2, Interval[] right2){
		
		int a = 0, b = 0, c = 0;
		
		while(a < left2.length && b < right2.length){
			if(left2[a].start <= right2[b].start){
				intervalk[c] = left2[a];
				a++;
			}
			else{
				intervalk[c] = right2[b];
				b++;
			}
			c++;
		}
		
		while(b < right2.length){
			intervalk[c] = right2[b];
			b++;
			c++;
		}
		
		while(a < left2.length){
			intervalk[c] = left2[a];
			a++;
			c++;
		}
		
		
	}
		

}

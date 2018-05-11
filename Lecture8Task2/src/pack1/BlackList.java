package pack1;

import java.util.Arrays;
import java.util.Comparator;

public class BlackList {

	private String[] blackList;
	private int count;

	public BlackList(String[] blackList) {
		super();
		this.blackList = blackList;
		count = blackList.length - 1;
	}

	public BlackList() {
		super();
		blackList = new String[1];
		count = 0;
	}

	public String[] getBlackList() {
		return blackList;
	}

	public <T> void addToBlackList(T obj) {

		blackList[count] = obj.getClass().getName();
		count++;
		String[] temp = Arrays.copyOf(blackList, blackList.length + 1);
		blackList = temp;

	}

	
	Comparator<Object> c=BlackList::compare;
	
	public <T> void removeFromBlackList(T obj) {

		for (int j = 0; j < blackList.length; j++) {

			if (obj.getClass().getName().equals(blackList[j])) {
				blackList[j] = null;

			}

			Arrays.sort(blackList, (st1, st2) -> compare(st1, st2));

		}
	}

	public <T> boolean isInBlakList(T obj) {

		for (int i = 0; i < blackList.length; i++) {
			if (obj.getClass().getName().equals(blackList[i])) {
				return true;
			}
		}

		return false;

	}

	public static int compare(Object o1, Object o2) {

		if (o1 == null & o2 != null) {
			return -1;
		}

		if (o1 != null & o2 == null) {
			return 1;
		}

		return 0;

	}

	@Override
	public String toString() {
		return "BlackList [blackList=" + Arrays.toString(blackList) + "]";
	}
	
	
}

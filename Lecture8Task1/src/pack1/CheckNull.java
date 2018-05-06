package pack1;

public interface CheckNull {

	public static final int CONST = 2;

	public static int checkNull(Object ob1, Object ob2) {
		if (ob1 == null && ob2 != null) {
			return 1;
		}
		if (ob1 != null && ob2 == null) {
			return -1;
		}
		if (ob1 == null && ob2 == null) {
			return 0;
		}
		return CONST;

	}

}

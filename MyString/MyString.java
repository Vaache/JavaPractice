package MyString;

import java.sql.PreparedStatement;

public class MyString {
	private char[] value;

	MyString(char[] value) {
		this.value = new char[value.length];
		int i = 0;
		for (char c : value) {
			this.value[i] = value[i];
			i++;
		}
	}

	MyString(String original) {
		this.value = new char[original.length()];

		int i;
		for (i = 0; i < original.length(); ++ i) {
			this.value[i] = original.charAt(i);
		}
	}

	public char charAt(int index) {
		if (index > this.value.length || index < 0)
			return 0;
		return this.value[index];
	}

	public boolean equals(String anObject) {
		for (int i = 0; i < anObject.length(); ++ i) {
			if (this.charAt(i) != anObject.charAt(i))
				return false;
		}
		return true;
	}

	public boolean equalsIgnoreCase(char[] anotherString) {
		for (int i = 0; i < anotherString.length; ++ i) {
			if (this.charAt(i) != anotherString[i] &&
					this.charAt(i) != (anotherString[i] - 32) && this.charAt(i) != (anotherString[i] + 32)) {
				System.out.println(this.charAt(i));
				return false;
			}
		}
		return true;
	}

	public MyString substring(int beginIndex) {
		if (beginIndex > this.value.length || beginIndex < -1) return null;

		char[] res = new char[this.value.length - beginIndex];

		int i;
		for (i = 0; beginIndex < this.value.length; ++ i, ++ beginIndex) {
			res[i] = this.charAt(beginIndex);
		}
		return new MyString(res);
	}

	public MyString substring(int beginIndex, int endIndex) {
		if (beginIndex > this.value.length || beginIndex < 0
			|| endIndex < beginIndex || endIndex > this.value.length)  { return null; }

		char[] res = new char[endIndex - beginIndex];

		int i;
		for (i = 0; beginIndex < endIndex; ++ i, ++ beginIndex) {
			res[i] = this.charAt(beginIndex);
		}
		return new MyString(res);
	}

	public MyString concat(MyString str) {
		if (str == null)
			return null;
		char[] res = new char[str.value.length + this.value.length];

		int i = 0;
		for (char c : this.value) {
			res[i++] = c;
		}
		for (char c : str.value) {
			res[i++] = c;
		}
		return new MyString(res);
	}

	public int indexOf(char ch) {
		int i = 0;
		for (char c : this.value) {
			if (c == ch)
				return i;
			i++;
		}
		return -1;
	}

	public int indexOf(char ch, int fromIndex) {
		if (fromIndex > this.value.length || fromIndex < 0)
			return -1;

		while (fromIndex < this.value.length) {
			if (this.charAt(fromIndex) == ch)
				return fromIndex;
			fromIndex++;
		}
		return -1;
	}

	public int indexOf(MyString str) {
		if (str == null)
			return 0;
		int i = 0;
		for (char c : this.value) {
			if (c == str.charAt(i))
				return i;
			i++;
		}
		return -1;
	}

	public int lastIndexOf(char ch) {
		int end = this.value.length - 1;

		while (end >= 0) {
			if (this.charAt(end) == ch)
				return end;
			end--;
		}
		return -1;
	}

	public int lastIndexOf(MyString str) {
		if (str == null)
			return 0;
		int end = this.value.length - 1;

		while (end >= 0) {
			if (this.charAt(end) == str.charAt(end))
				return end;
			end--;
		}
		return -1;
	}

	public MyString trim() {
		int len = 0;
		for (int i = 0; i < this.value.length; ++ i) {
			if (this.charAt(i) != ' ' && this.charAt(i) != '\r' &&
					this.charAt(i) != '\t' && this.charAt(i) != '\n') { len++; }
		}
		char[] res = new char[len];

		for (int i = 0, j = 0; i < this.value.length; ++ i) {
			if (this.charAt(i) != ' ' && this.charAt(i) != '\r' &&
					this.charAt(i) != '\t' && this.charAt(i) != '\n')
				res[j++] = this.charAt(i);
		}
		return new MyString(res);
	}

	public MyString replace(char oldChar, char newChar) {
		char[] res = new char[this.value.length];

		int i = 0;
		for (char c : this.value) {
			if (c == oldChar)
				res[i++] = newChar;
			else
				res[i++] = c;
		}
		return new MyString(res);
	}

	public MyString replace(MyString target, MyString replacement) {
		if (target == null || replacement == null)
			return null;
		int newLen = ((target.value.length - replacement.value.length) * countSubstring(this, target)) * -1;
		char[] res = new char[this.value.length + newLen];

		for (int i = 0, j = 0; i < this.value.length; ++ i) {
			if (this.charAt(i) == target.charAt(0) && contains(target, i)) {
				for (int k = 0; k < replacement.value.length; ++ k) {
					res[j++] = replacement.charAt(k);
				}
				i += target.value.length - 1;
			} else {
				res[j++] = this.charAt(i);
			}
		}
		return new MyString(res);
	}

	public MyString toLowerCase() {
		char[] res = new char[this.value.length];

		for (int i = 0; i < this.value.length; ++ i) {
			if (this.charAt(i) >= 'A' && this.charAt(i) <= 'Z')
				res[i] = (char) (this.charAt(i) + 32);
			else
				res[i] = this.charAt(i);
		}
		return new MyString(res);
	}

	public MyString toUpperCase() {
		char[] res = new char[this.value.length];

		for (int i = 0; i < this.value.length; ++ i) {
			if (this.charAt(i) >= 'a' && this.charAt(i) <= 'z')
				res[i] = (char) (this.charAt(i) - 32);
			else
				res[i] = this.charAt(i);
		}
		return new MyString(res);
	}

	public MyString[] split(MyString regex) {

			return null;
	}

	public static MyString join(MyString delimiter, MyString... elements) {
		if (delimiter == null && elements == null)
			return null;
		int len = delimiter == null ? 0 : delimiter.value.length;
		if (elements != null) {
			for (MyString element : elements) {
				len += element == null ? 0 : element.value.length;
			}
		}

		char[] res = new char[len];

		int i = 0;
		if (delimiter != null) {
			for (char c : delimiter.value) {
				res[i++] = c;
			}
		}

		if (elements != null) {
			for (MyString element : elements) {
				if (element != null) {
					for (char c : element.value)
						res[i++] = c;
				}
			}
		}

		return new MyString(res);
	}

	public char[] toCharArray() {

		return null;
	}

	public boolean contains(MyString str) {
		for (int i = 0; i < this.value.length; ++ i) {
			if (this.charAt(i) == str.charAt(0)) {
				int j = i;
				int count = 0;
				for (char c : str.value) {
					if (str.charAt(j++) != c)
						break;
					count ++;
				}
				if (count == str.value.length)
					return true;
			}
		}
		return false;
	}

	private boolean contains(MyString str, int index) {
		for (int i = 0, j = index; i < str.value.length; ++ i) {
			if (str.charAt(i) != this.charAt(j++))
				return false;
		}
		return true;
	}

	private int countSubstring(MyString dst, MyString src) {
		int res = 0;
		for (int i = 0; i < dst.value.length; ++ i) {
			if (dst.charAt(i) == src.charAt(0)) {
				int j = i;
				int count = 0;
				for (char c : src.value) {
					if (dst.charAt(j++) != c)
						break;
					count++;
				}
				if (count == src.value.length)
					res ++;
			}
		}
		return res;
	}

	private int countSubstringWithRegex(MyString str) {
		int start = 0;
		int end = 0;
		for (int i = 0; i < this.value.length; ++ i) {

		}
		return 0;
	}


	@Override
	public String toString() {
		return new String(this.value);
	}

	public static void main(String[] args) {
		MyString string = MyString.join(new MyString("Hello"), null);

		System.out.println(string);

	}
}

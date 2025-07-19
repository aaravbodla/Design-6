public class PhoneDirectory {

    HashSet<Integer> set;
    Queue<Integer> q;
    int maxNummm;

    public PhoneDirectory(int maxNumbers) {
        maxNummm = maxNumbers;
        set = new HashSet<>();
        q = new LinkedList<>();
        for(int i = 0; i < maxNumbers; i++){
            set.add(i);
            q.add(i);
        }
    }

    public int get() {
        if(q.isEmpty()) return -1;
        int num = q.poll();
        set.remove(num);
        return num;
    }

    public boolean check(int number) {
        return set.contains(number);
    }

    public void release(int number) {
        if (number >= 0 && number < maxNummm && !set.contains(number)) {
            q.add(number);
            set.add(number);
        }
    }
}

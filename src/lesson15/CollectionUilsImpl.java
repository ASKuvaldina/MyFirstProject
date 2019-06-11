package lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number:a) {
            result.add(number);
        }
        for (Integer number:b) {
            result.add(number);
        }
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number:a) {
                if (b.contains(number)) {
                    result.add(number);
                }
        }
        for (Integer number:b) {
            if (a.contains(number)) {
                result.add(number);
            }
        }
        return result;

    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result = new HashSet<>();
        for (Integer number:a) {
            result.add(number);
        }
        for (Integer number:b) {
            result.add(number);
        }
        return result;

    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result = new HashSet<>();
        for (Integer number:a) {
            if (b.contains(number)) {
                result.add(number);
            }
        }

        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number:a) {
            if (!(b.contains(number))) {
                result.add(number);
            }
        }
        for (Integer number:b) {
            if (!(a.contains(number))) {
                result.add(number);
            }
        }

        return result;
    }
}

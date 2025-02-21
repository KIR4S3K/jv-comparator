package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> sortedEmployees = new TreeSet<>(new EmployeeComparator());

        sortedEmployees.addAll(employees);

        return sortedEmployees;
    }

    private static class EmployeeComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            int ageComparison = Integer.compare(e1.getAge(), e2.getAge());
            if (ageComparison != 0) {
                return ageComparison;
            }

            return e1.getName().compareTo(e2.getName());
        }
    }
}

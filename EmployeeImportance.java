/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    HashMap<Integer,Employee> map;
    public int getImportance(List<Employee> employees, int id) {
        map=new HashMap<>();
        for(Employee e:employees){
            map.put(e.id,e);
        }
        return search(id);
    }
    public int search(int id){
        Employee employee=map.get(id);
        int sum=employee.importance;
        for(Integer subId:employee.subordinates){
            sum+=search(subId);
        }
        return sum;
    }
}

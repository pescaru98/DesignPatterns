package structural.adapter;

/**
 * Since we cannot (or don't want to) change the class EmployeeLdap (to implement Employee) or any other class,
 * we have to define this adapter, so itself implements Employee and takes as constructor an EmployeeLdap
 * and makes it suitable for my Employee list.
 *
 * It is used to make classes fit together when needed (kind of a real life socket adapter)
 * and it is not present at the start of a project, but rather, in the future.
 *
 * Basically, adapter comes as a need of not changing the actual classes, but come with a new one
 */
public class EmployeeAdapterLdap implements Employee {
    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

 

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}

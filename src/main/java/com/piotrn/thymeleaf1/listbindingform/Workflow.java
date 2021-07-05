package com.piotrn.thymeleaf1.listbindingform;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Workflow {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String employer;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String description;
//    private Map<String, String> attributes;
    @Getter
    @Setter
    private String attributes;



    /*
        long nextId = getNextId();

        for (Workflow workflow : workflows) {
            if (workflow.getId() == 0) {
                workflow.setId(nextId++);
            }
        }
*/

/*
    private Long getNextId() {
        return workflowsDb.keySet()
            .stream()
            .mapToLong(value -> value)
            .max()
            .orElse(0) + 1;
    }

 */


/*
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Form other = (Form) obj;
        if (last_name == null) {
            if (other.last_name != null)
                return false;
        } else if (!last_name.equals(other.last_name))
            return false;
        if (id != other.id)
            return false;
        if (first_name == null) {
            if (other.first_name != null)
                return false;
        } else if (!first_name.equals(other.first_name))
            return false;
        return true;
    }
*/
    @Override
    public String toString() {
        return "Workflow [id=" + id + ", name=" + name + ", employer=" + employer + "]";
    }



}

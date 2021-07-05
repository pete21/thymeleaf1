package com.piotrn.thymeleaf1.listbindingform;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class WorkflowsDTO {

    @Getter
    @Setter
    private List<Workflow> workflows;

    public WorkflowsDTO() {
        this.workflows = new ArrayList<>();
    }

//    public WorkflowsDTO(List<Workflow> workflows) {
//        this.workflows = workflows;
//    }

//    public void addWorkflow(Workflow workflow) {
//        this.workflows.add(workflow);
//    }

}

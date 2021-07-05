package com.piotrn.thymeleaf1.listbindingform;

import java.util.List;

public interface WorkflowsService {

    List<Workflow> findAll();

    void saveAll(List<Workflow> workflows);

    Workflow update(Workflow workflow);

    Workflow add(Workflow workflow);

    void delete(Workflow workflow);
}

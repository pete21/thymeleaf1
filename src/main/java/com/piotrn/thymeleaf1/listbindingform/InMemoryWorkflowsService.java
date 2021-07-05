package com.piotrn.thymeleaf1.listbindingform;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Repository
public class InMemoryWorkflowsService implements WorkflowsService {

    private static final Map<Long, Workflow> workflowsDb = new HashMap<>();

    @Override
    public List<Workflow> findAll() {
        return new ArrayList<>(workflowsDb.values());
    }

    @Override
    public void saveAll(List<Workflow> workflows) {
        Map<Long, Workflow> workflowsMap = workflows.stream()
            .collect(Collectors.toMap(Workflow::getId, Function.identity()));

        workflowsDb.putAll(workflowsMap);
    }

    @Override
    public Workflow update(Workflow workflow) {
        workflowsDb.put(workflow.getId(), workflow);
        return workflow;
    }

    @Override
    public void delete(Workflow workflow) {
        workflowsDb.remove(workflow.getId());
    }

    @Override
    public Workflow add(Workflow workflow) {
        workflowsDb.put(workflow.getId(), workflow);
        return workflow;
    }


}

package com.piotrn.thymeleaf1.listbindingform;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/workflows")
public class WorkflowsController {

    private final WorkflowsService workflowsService;

    @GetMapping(value = "/")
    public String showIndex(Model model) {
        return "workflows/index";
    }

    @GetMapping(value = "/all")
    public String showAll(Model model) {

        model.addAttribute("workflows", workflowsService.findAll());
        return "workflows/allWorkflows";
    }

    @GetMapping(value = "/create")
    public String showCreateForm(Model model) {

        model.addAttribute("workflow", new Workflow());
        return "workflows/createWorkflowForm";
    }

    @GetMapping(value = "/edit")
    public String showEditForm(Model model) {

        model.addAttribute("workflows", workflowsService.findAll());
        return "workflows/editWorkflowsForm";
    }

    @PostMapping(value = "/save")
    public String saveForms(@ModelAttribute WorkflowsDTO form, Model model) {
        workflowsService.saveAll(form.getWorkflows());

        model.addAttribute("workflows", workflowsService.findAll());
        return "redirect:/workflows/all";
    }

    @PostMapping(value = "/add")
    public String addForms(@ModelAttribute Workflow form, Model model) {
        workflowsService.add(form);

        model.addAttribute("workflows", workflowsService.findAll());
        return "redirect:/workflows/all";
    }

}

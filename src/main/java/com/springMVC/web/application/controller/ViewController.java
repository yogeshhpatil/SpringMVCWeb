package com.springMVC.web.application.controller;


import com.springMVC.web.application.bo.Employee;
import com.springMVC.web.application.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ViewController {

    @Autowired
    private EmployeeDAO dao;

    @RequestMapping("/empform")
    public ModelAndView showform(){
        return new ModelAndView("empform","command",new Employee());
    }

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("employee") Employee employee){
        dao.save(employee);
        return new ModelAndView("redirect:/viewemp");
    }

    @RequestMapping("/viewemp")
    public ModelAndView viewemp(){
        List<Employee> list=dao.getEmployees();
        return new ModelAndView("viewemp","list",list);
    }

    @RequestMapping(value="/editemp/{id}")
    public ModelAndView edit(@PathVariable int id){
        Employee employee =dao.getEmpById(id);
        return new ModelAndView("empeditform","employee", employee);
    }

    @RequestMapping(value="/editemp/editsave",method = RequestMethod.POST)
    public ModelAndView editsave(@ModelAttribute Employee employee){
        dao.update(employee);
        return new ModelAndView("redirect:/viewemp");
    }

    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable int id){
        dao.delete(id);
        return new ModelAndView("redirect:/viewemp");
    }

}

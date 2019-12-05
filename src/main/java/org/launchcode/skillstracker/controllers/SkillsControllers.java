package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsControllers {

    @GetMapping
    public String skillsController() {
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> Some skills we should learn: </h2>" +
                "<ol>" +
                "<li> JavaScript </li>" +
                "<li> Java </li>" +
                "<li> Python </li>" +
                "</body>" +
                "</html>";

    }

    @GetMapping("form")
    public String skillForm() {
        return "<html>" +
                "<body>" +
                "<h2> Name: </h2>" +
                "<form action='createMessage' method='post'>"+
                "<input type='text' name='name'>" +

                "<h2> My favorite language: </h2>" +
                "<select id='favLanguage1' name='favLanguage1'>" +
                "<option value='javascript'> JavaScript </option>" +
                "<option value='java'> Java </option>" +
                "<option value='python'> Python </option>" +
                "</select>" +

                "<h2> My second favorite language: </h2>" +
                "<select id='favLanguage2' name='favLanguage2'>" +
                "<option value='javascript'> JavaScript </option>" +
                "<option value='java'> Java </option>" +
                "<option value='python'> Python </option>" +
                "</select>" +

                "<h2> My third favorite language: </h2>" +
                "<select id='favLanguage3' name='favLanguage3'>" +
                "<option value='javascript'> JavaScript </option>" +
                "<option value='java'> Java </option>" +
                "<option value='python'> Python </option>" +
                "</select>" +

                "<br><br><input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("createMessage")
    public static String createMessage(String name,  String favLanguage1, String favLanguage2, String favLanguage3) {
       return "<html>" +
               "<body>" +
               "<h1>" + name + "</h1>" +
               "<ol>" +
               "<li><h2>"+ favLanguage1+ "</h2></li>" +
               "<li><h2>"+ favLanguage2+ "</h2></li>" +
               "<li><h2>"+ favLanguage3+ "</h2></li>" +
               "</ol>" +
               "</body>" +
               "</html>" ;
//        return "<html>" +
//                "<body>" +
//                "<h1>" + name + "</h1>" +
//                "<table style='border:1px solid black'>" +
//                "<tr><td> 1 </td> <td>"+ favLanguage1 +"</td></tr>" +
//                "<tr><td> 2 </td> <td>"+ favLanguage2 +"</td></tr>" +
//                "<tr><td> 3 </td> <td>"+ favLanguage3 +"</td></tr>" +
//                "</table>" +
//                "</body>" +
//                "</html>" ;
    }


}

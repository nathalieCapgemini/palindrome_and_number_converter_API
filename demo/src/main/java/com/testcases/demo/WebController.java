package com.testcases.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * API class for palindrome and roman number to integer conversion.
 * @Author: Nathalie AE
 * @Version: 1.0
 * @Since: 2024-03-25
 * @Description: This class is used to handle the web requests
 */

@Controller
public class WebController {
    /**
     * This method is used to display the form for the isPalindrome
     * @return
     */
    @GetMapping("/isPalindrome")
    public String isPalindrome(){
        return "isPalindrome";
    }
    /**
     * This method is used to check if a number is a palindrome
     * @param number
     * @param model
     * @return isPalindrome
     */
    @PostMapping("/isPalindrome")
    public String submitForm(@RequestParam("number") String number, Model model){
        Service service = new Service();
        if(number == null || number.isEmpty()){//Make sure the input is not empty
            model.addAttribute("result", "Please enter a valid number");
            return "isPalindrome";
        } else if (!number.matches("[0-9]+")) {//Make sure the input is a number
            model.addAttribute("result", "Please enter a valid number");
            return "isPalindrome";
        }else{//Valid input was entered
            int num = Integer.parseInt(number);
            if(service.isPalindrome(num)){
                model.addAttribute("result", "The number is a palindrome");
            }else {
                model.addAttribute("result", "The number is not a palindrome");
            }
            return "isPalindrome";
        }
    }

    /**
     * This method is used to display the form for the romanNumberToInteger
     * @return
     */
    @GetMapping("/romanNumberToInteger")
    public String romanNumberToInteger(){
        return "romanNumberToInteger";
    }
    /**
     * This method is used to convert a Roman number to an integer
     * @param number
     * @param model
     * @return romanNumberToInteger
     */
    @PostMapping("/romanNumberToInteger")
    public String submitForm2(@RequestParam("number") String number, Model model){
        Service service = new Service();
        if(number == null || number.isEmpty()){//Make sure the input is not empty
            model.addAttribute("result", "Please enter a valid Roman number");
            return "romanNumberToInteger";
        }
        model.addAttribute("result", "The number is: " + service.romanNumberToInteger(number));
        return "romanNumberToInteger";
    }
}

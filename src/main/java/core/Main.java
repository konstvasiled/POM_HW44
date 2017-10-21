package core;

class Main {
    public static void main(String[] args) {
        Validate function =  new Validate();Locators element = new Locators();
        function.startDriver("safari", "http://alex.academy/exe/signup/v1/index.php");element.initialize(function.driver);
        System.out.printf("Current url is: %s", function.captureURL());//function.driver.getCurrentUrl();
        System.out.printf("\n01. Element [Quotes (dynamic)]:\t%s",(function.isPresent(element.quote) ? "Exists "+((function.isVisible(element.quote)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n02. Element [Current Location]:\t%s",(function.isPresent(element.location) ? "Exists "+((function.isVisible(element.location)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n03. Element [Weather Icon]:\t%s",(function.isPresent(element.weather) ? "Exists "+((function.isVisible(element.weather)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n04. Element [Title]:\t%s",(function.isPresent(element.title) ? "Exists "+((function.isVisible(element.title)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n05. Element [First Name (label)]:\t%s",(function.isPresent(element.fn_lb) ? "Exists "+((function.isVisible(element.fn_lb)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n06. Element [First Name (field)]:\t%s",(function.isPresent(element.fn_fld) ? "Exists "+((function.isVisible(element.fn_fld)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n07. Element [Last Name (label)]:\t%s",(function.isPresent(element.ln_lb) ? "Exists "+((function.isVisible(element.ln_lb)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n08. Element [Last Name (field)]:\t%s",(function.isPresent(element.ln_fld) ? "Exists "+((function.isVisible(element.ln_fld)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n09. Element [Email (label)]:\t%s",(function.isPresent(element.email_lb) ? "Exists "+((function.isVisible(element.email_lb)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n10. Element [Email (filed)]:\t%s",(function.isPresent(element.email_fld) ? "Exists "+((function.isVisible(element.email_fld)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n11. Element [Phone (label)]:\t%s",(function.isPresent(element.phone_lb) ? "Exists "+((function.isVisible(element.phone_lb)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n12. Element [Phone (field)]:\t%s",(function.isPresent(element.phone_fld) ? "Exists "+((function.isVisible(element.phone_fld)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n13. Element [Genre (label)]:\t%s",(function.isPresent(element.gender) ? "Exists "+((function.isVisible(element.gender)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n14. Element [Male (label)]:\t%s",(function.isPresent(element.gendermalelabel) ? "Exists "+((function.isVisible(element.gendermalelabel)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n15. Element [Male (radio button)]:\t%s",(function.isPresent(element.gendermaleoption) ? "Exists "+((function.isVisible(element.gendermaleoption)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n16. Element [Female (label)]:\t%s",(function.isPresent(element.genderfemalelabel) ? "Exists "+((function.isVisible(element.gendermalelabel)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n17. Element [Female (radio button)]:\t%s",(function.isPresent(element.genderfemaleoption) ? "Exists "+((function.isVisible(element.genderfemaleoption)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n18. Element [State (label)]:\t%s",(function.isPresent(element.statelabel) ? "Exists "+((function.isVisible(element.statelabel)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n19. Element [State (drop-down)]:\t%s",(function.isPresent(element.stateoptions) ? "Exists "+((function.isVisible(element.stateoptions)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n20. Element [State California (item)]:\t%s",(function.isPresent(element.option_california) ? "Exists "+((function.isVisible(element.option_california)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n21. Element [Terms (label)]:\t%s",(function.isPresent(element.terms) ? "Exists "+((function.isVisible(element.terms)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n22. Element [Terms (checkbox)]:\t%s",(function.isPresent(element.temrscheckbox) ? "Exists "+((function.isVisible(element.temrscheckbox)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n23. Element [Image (facebook)]:\t%s",(function.isPresent(element.facebooklink) ? "Exists "+((function.isVisible(element.facebooklink)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n24. Element [Image (twitter)]:\t%s",(function.isPresent(element.twitterlink) ? "Exists "+((function.isVisible(element.twitterlink)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n25. Element [Image (flickr)]:\t%s",(function.isPresent(element.flickrlink) ? "Exists "+((function.isVisible(element.flickrlink)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n26. Element [Image (youtube)]:\t%s",(function.isPresent(element.youtubelink) ? "Exists "+((function.isVisible(element.youtubelink)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n27. Element [Reset (button)]:\t%s",(function.isPresent(element.reset) ? "Exists "+((function.isVisible(element.reset)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n28. Element [Submit (button)]:\t%s",(function.isPresent(element.submit) ? "Exists "+((function.isVisible(element.submit)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n29. Element [Timestamp (dynamic)]:\t%s",(function.isPresent(element.timestamp) ? "Exists "+((function.isVisible(element.timestamp)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n30. Element [Copyright (dynamic)]:\t%s",(function.isPresent(element.copyright) ? "Exists "+((function.isVisible(element.copyright)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n31. Element [OS & Browser (dynamic)]:\t%s",(function.isPresent(element.useragent) ? "Exists "+((function.isVisible(element.useragent)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n32. Element [Error Line]:\t%s",(function.isPresent(element.errorline) ? "Exists "+((function.isVisible(element.errorline)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n33. Element [First Name Error]:\t%s",(function.isPresent(element.fn_error) ? "Exists "+((function.isVisible(element.fn_error)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n34. Element [Last Name Error]:\t%s",(function.isPresent(element.ln_error) ? "Exists "+((function.isVisible(element.ln_error)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n35. Element [Email Error]:\t%s",(function.isPresent(element.email_error) ? "Exists "+((function.isVisible(element.email_error)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n36. Element [Phone Error]:\t%s",(function.isPresent(element.phone_error) ? "Exists "+((function.isVisible(element.phone_error)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n37. Element [First Name Error (img)]:\t%s",(function.isPresent(element.fn_error_img) ? "Exists "+((function.isVisible(element.fn_error_img)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n38. Element [Last Name Error (img)]:\t%s",(function.isPresent(element.ln_error_img) ? "Exists "+((function.isVisible(element.ln_error_img)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n39. Element [Email Error (img)]:\t%s",(function.isPresent(element.email_error_img) ? "Exists "+((function.isVisible(element.email_error_img)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n40. Element [Phone Error (img)]:\t%s",(function.isPresent(element.phone_error_img) ? "Exists "+((function.isVisible(element.phone_error_img)?"and Visible":"but not Visible")):"Not Exists"));
        function.changeURI("http://alex.academy/exe/signup/v1/confirmation.php"); System.out.printf("\n\nCurrent url is: %s", function.captureURL()); //function.driver.getCurrentUrl();
        System.out.printf("\n01. Element [Title]:\t%s",(function.isPresent(element.title) ? "Exists "+((function.isVisible(element.title)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n02. Element [First Name (label)]:\t%s",(function.isPresent(element.fn_lb) ? "Exists "+((function.isVisible(element.fn_lb)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n03. Element [First Name (field)]:\t%s",(function.isPresent(element.fn_fld) ? "Exists "+((function.isVisible(element.fn_fld)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n04. Element [Last Name (label)]:\t%s",(function.isPresent(element.ln_lb) ? "Exists "+((function.isVisible(element.ln_lb)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n05. Element [Last Name (field)]:\t%s",(function.isPresent(element.ln_fld) ? "Exists "+((function.isVisible(element.ln_fld)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n06. Element [Email (label)]:\t%s",(function.isPresent(element.email_lb) ? "Exists "+((function.isVisible(element.email_lb)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n07. Element [Email (filed)]:\t%s",(function.isPresent(element.email_fld) ? "Exists "+((function.isVisible(element.email_fld)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n08. Element [Phone (label)]:\t%s",(function.isPresent(element.phone_lb) ? "Exists "+((function.isVisible(element.phone_lb)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n09. Element [Phone (field)]:\t%s",(function.isPresent(element.phone_fld) ? "Exists "+((function.isVisible(element.phone_fld)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n10. Element [Genre (label)]:\t%s",(function.isPresent(element.gender) ? "Exists "+((function.isVisible(element.gender)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n11. Element [Genre (field)):\t%s",(function.isPresent(element.gender_fld) ? "Exists "+((function.isVisible(element.gender_fld)?"and Visible":"but not Visible")):"Not Exists"));
        System.out.printf("\n12. Element [Back (button)]:\t%s",(function.isPresent(element.back_button) ? "Exists "+((function.isVisible(element.back_button)?"and Visible":"but not Visible")):"Not Exists"));
        function.quit();
    }

}

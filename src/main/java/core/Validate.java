package core;

import org.openqa.selenium.*;

class Validate extends Functionality {
    boolean isPresent(By by) {
        if (driver.findElements(by).size() > 0) return true; return false; }
    boolean isVisible(By by) {
        if (driver.findElements(by).size() > 0 && driver.findElement(by).isDisplayed()) return true; return false; }
    boolean isPresent(WebElement element) {
        try {element.getTagName(); return true;}
        catch (NoSuchElementException e) {return false;} }
    boolean isVisible(WebElement element) {
        if (element.isDisplayed()) return true; return false; }
}

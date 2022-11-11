package com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

// Realmente esto no es un Log in es un Sign Up

public class UTestLoginPage {
    public static final Target LOGIN_BUTTON = Target.the("button that redirect us to the register form").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target INPUT_FNAME = Target.the("Where do we write our first name").located(By.id("firstName"));
    public static final Target INPUT_LNAME = Target.the("Where do we write our last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Where do we write our Email").located(By.className("ng-pristine ng-untouched ng-empty ng-valid-email ng-invalid ng-invalid-required ng-valid-pattern"));
    public static final Target SELECT_MONTH = Target.the("Where do we select the month of our birth").located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("Where do we select the day of our birth").located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("Where do we select the year of our birth").located(By.id("birthYear"));
    public static final Target SUBMIT_BUTTON = Target.the("Where do we click to send the data").located(By.className("btn btn-blue"));
    // Lo mas probable es que estos no se necesiten ya que se llenan automaticamente gracias a que la pagina lo llena por nuestra ubicacion
    public static final Target INPUT_CITY = Target.the("Where do we write the city where we live").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Where do we write the zip code of where we live").located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("Where do we select our country").located(By.className("ui-select-match-text pull-left"));
    public static final Target BUTTON_DEVICES = Target.the("Where do we click to send our data").located(By.className("btn btn-blue pull-right"));
    // Por algun motivo el Xpath es el mismo (No deberia de ser asi) asi que hay que buscar otra forma de capturar el atributo
    // Ademas probablemente este tampoco se necesite ya que es algo opcional
    public static final Target SELECT_COMPUTER = Target.the("Where do we select the OS of our computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target SELECT_VERSION = Target.the("Where do we select the version of the SO of our computer").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target SELECT_LANGUAGE = Target.the("Where do we select the language of the SO of our computer").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target SELECT_MOBILE = Target.the("Where do we select our mobile devise").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target SELECT_MODEL = Target.the("Where do we select the model of our mobile devise").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target SELECT_OS_MIBILE = Target.the("Where do we select the OS of our mobile devise").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    // AQUI VA DE NUEVO EL BUTTON_DEVICES
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Where do we confirm the password").located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS_USE = Target.the("Where do we check the consent of the terms of use").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY = Target.the("Where do we check the consent of the terms of privacy").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    // AQUI VA DE NUEVO EL SUBMIT_BUTTON
}

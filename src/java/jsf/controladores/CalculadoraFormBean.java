/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.controladores;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import jsf.resources.ResourcesUtil;

/**
 *
 * @author djimenez
 */
@Named(value = "calculadoraFormBean")
@RequestScoped
public class CalculadoraFormBean {

    /**
     * Creates a new instance of CalculadoraFormBean
     */
    public CalculadoraFormBean() {
    }

    private String num1;
    private String num2;
    private String[] select = {"Suma", "Resta", "Multiplicacion", "Division"};
    private String resultado;

    /**
     * Get the value of resultado
     *
     * @return the value of resultado
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Set the value of resultado
     *
     * @param resultado new value of resultado
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    /**
     * Get the value of num1
     *
     * @return the value of num1
     */
    public String getNum1() {
        return num1;
    }

    /**
     * Set the value of num1
     *
     * @param num1 new value of num1
     */
    public void setNum1(String num1) {
        this.num1 = num1;
    }

    /**
     * Get the value of num2
     *
     * @return the value of num2
     */
    public String getNum2() {
        return num2;
    }

    /**
     * Set the value of num2
     *
     * @param num2 new value of num2
     */
    public void setNum2(String num2) {
        this.num2 = num2;
    }

    /**
     * Get the value of select
     *
     * @return the value of select
     */
    public Object getSelect() {
        return select;
    }

    /**
     * Set the value of select
     *
     * @param select new value of select
     */
    public void setSelect(String[] select) {
        this.select = select;
    }

    private String operador;

    /**
     * Get the value of operador
     *
     * @return the value of operador
     */
    public String getOperador() {
        return operador;
    }

    /**
     * Set the value of operador
     *
     * @param operador new value of operador
     */
    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getCalculo() {
        double val1 = Integer.parseInt(num1);
        double val2 = Integer.parseInt(num2);

        switch (operador) {
            case "+":
                resultado = ResourcesUtil.getString("#{msg['app.resultado']}") + (val1 + val2);
                break;
            case "-":
                resultado = ResourcesUtil.getString("#{msg['app.resultado']}") + (val1 - val2);
                break;
            case "*":
                resultado = ResourcesUtil.getString("#{msg['app.resultado']}") + (val1 * val2);
                break;
            case "/":
                resultado = ResourcesUtil.getString("#{msg['app.resultado']}") + (val1 / val2);
                break;
            default:

                break;
        }
        return resultado;
    }
}

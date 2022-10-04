/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.l1q07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.plaf.ComboBoxUI;

/**
 *
 * @author mathe
 */
class Q7Handler implements ActionListener {

    private JTextField maiorField, menorField, mediaField, numField, valoresField;
    private JButton Button;
    private JComboBox<String> ComboBox;
    private Q7Calculator q7Calculator;

    public Q7Handler(JTextField maiorField, JTextField menorField,
            JTextField mediaField, JTextField numField, JTextField valoresField,
            JComboBox<String> ComboBox) {
        this.maiorField = maiorField;
        this.menorField = menorField;
        this.mediaField = mediaField;
        this.numField = numField;
        this.valoresField = valoresField;
        this.ComboBox = ComboBox;
        setQ7Calculator(new Q7Calculator());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = ((JButton) (e.getSource())).getText();
        if (buttonText == "Ok") {
           
            getQ7Calculator().adicionarNum(Integer.parseInt(getNumField().getText()));
        } else if (buttonText == "Exibir") {
            Integer maior = 0, menor = 99999, soma = 0;
            Double media = 0.0;
            for (Integer num : getQ7Calculator().getNumeros()) {
                soma += num;
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
            media = (double) soma / getQ7Calculator().getNumeros().size();
            getMaiorField().setText(maior.toString());
            getMenorField().setText(menor.toString());
            getMediaField().setText(media.toString());
        } else if (buttonText == "Calcular") {
            Double op = 0.0;
            String valores = getValoresField().getText();
            switch (getComboBox().getSelectedIndex()) {
                case 0:
                    Integer soma = 0;
                    for (int i = 0; i < 12; i += 2) {
                        soma += Integer.parseInt(valores.charAt(i) + "" + valores.charAt(i + 1));
                        getValoresField().setText(soma.toString());
                    }
                    break;
                case 1:
                    Integer sub = Integer.parseInt(valores.charAt(0) + "" + valores.charAt(1));
                    ;
                    for (int i = 2; i < 12; i += 2) {
                        sub -= Integer.parseInt(valores.charAt(i) + "" + valores.charAt(i + 1));
                        getValoresField().setText(sub.toString());
                    }
                    break;
                case 2:
                    Integer mult = 1;
                    for (int i = 0; i < 12; i += 2) {
                        mult *= Integer.parseInt(valores.charAt(i) + "" + valores.charAt(i + 1));
                        getValoresField().setText(mult.toString());
                    }
                    break;
                case 3:
                    Double div = Double.parseDouble(valores.charAt(0) + "" + valores.charAt(1));
                    for (int i = 2; i < 12; i += 2) {
                        div /= Integer.parseInt(valores.charAt(i) + "" + valores.charAt(i + 1));
                        getValoresField().setText(div.toString());
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

    public JTextField getMaiorField() {
        return maiorField;
    }

    public void setMaiorField(JTextField maiorField) {
        this.maiorField = maiorField;
    }

    public JTextField getMenorField() {
        return menorField;
    }

    public void setMenorField(JTextField menorField) {
        this.menorField = menorField;
    }

    public JTextField getMediaField() {
        return mediaField;
    }

    public void setMediaField(JTextField mediaField) {
        this.mediaField = mediaField;
    }

    public JTextField getNumField() {
        return numField;
    }

    public void setNumField(JTextField numField) {
        this.numField = numField;
    }

    public JTextField getValoresField() {
        return valoresField;
    }

    public void setValoresField(JTextField valoresField) {
        this.valoresField = valoresField;
    }

    public JButton getButton() {
        return Button;
    }

    public void setButton(JButton Button) {
        this.Button = Button;
    }

    public JComboBox<String> getComboBox() {
        return ComboBox;
    }

    public void setComboBox(JComboBox<String> ComboBox) {
        this.ComboBox = ComboBox;
    }

    public Q7Calculator getQ7Calculator() {
        return q7Calculator;
    }

    public void setQ7Calculator(Q7Calculator q7Calculator) {
        this.q7Calculator = q7Calculator;
    }

}

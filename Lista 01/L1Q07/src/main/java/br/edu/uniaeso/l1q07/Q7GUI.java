/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.l1q07;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mathe
 */
class Q7GUI extends JFrame {

    private JButton bOk, bExibir, bCalcular;
    private JLabel lNum, lMaior, lMenor, lMedia, lValores;
    private JTextField numField, maiorField, menorField, mediaField, valoresField;
    private JComboBox<String> operacaoBox;
    private Q7Handler q7Handler;

    public Q7GUI() {
        super("Programa Frame - V2LP5");
        setSize(450, 400);
        setLayout(null);
        configurelNum();
        configureNumField();
        configurelMaior();
        configureMaiorField();
        configurelMenor();
        configureMenorField();
        configurelMedia();
        configureMediaField(); 
        configurelValores();
        configureValoresField();
        configureOperacaoBox();
        setQ7Handler(new Q7Handler(getMaiorField(),getMenorField(),getMediaField(),getNumField(),getValoresField(),getOperacaoBox()));
        configureBOk();
        configureBExibir();
        configurebCalcular();
        setVisible(true);
    }

    private void configurelNum() {
        setlNum(new JLabel("Digite o numero:"));
        getlNum().setBounds(10, 10, 100, 20);
        getContentPane().add(getlNum());
    }

    private void configureNumField() {
        setNumField(new JTextField());
        getNumField().setBounds(10, 30, 130, 20);
        getContentPane().add(getNumField());
    }

    private void configureBOk() {
        setbOk(new JButton("Ok"));
        getbOk().setBounds(140, 30, 100, 20);
        getbOk().addActionListener(getQ7Handler());
        getContentPane().add(getbOk());
    }

    private void configurelMaior() {
        setlMaior(new JLabel("Maior > > >"));
        getlMaior().setBounds(50, 100, 100, 20);
        getContentPane().add(getlMaior());
    }
    private void configureMaiorField(){
        setMaiorField(new JTextField());
        getMaiorField().setBounds(140, 100, 100, 20);
        getContentPane().add(getMaiorField());
    }
    private void configurelMenor() {
        setlMenor(new JLabel("Menor > > >"));
        getlMenor().setBounds(50, 130, 100, 20);
        getContentPane().add(getlMenor());
    }
    private void configureMenorField(){
        setMenorField(new JTextField());
        getMenorField().setBounds(140, 130, 100, 20);
        getContentPane().add(getMenorField());
    }
        private void configurelMedia() {
        setlMedia(new JLabel("Media > > >"));
        getlMedia().setBounds(50, 160, 100, 20);
        getContentPane().add(getlMedia());
    }
    private void configureMediaField(){
        setMediaField(new JTextField());
        getMediaField().setBounds(140, 160, 100, 20);
        getContentPane().add(getMediaField());
    }
    private void configureBExibir(){
        setbExibir(new JButton("Exibir"));
        getbExibir().setBounds(250, 130, 100, 20);
        getbExibir().addActionListener(getQ7Handler());
        getContentPane().add(getbExibir());
    }
    private void configurelValores(){
        setlValores(new JLabel("Valores:"));
        getlValores().setBounds(50, 250, 100, 20);
        getContentPane().add(getlValores());
    }
    private void configureValoresField(){
        setValoresField(new JTextField());
        getValoresField().setBounds(140, 250, 100, 20);
        getContentPane().add(getValoresField());
    }
    private void configureOperacaoBox(){
        setOperacaoBox(new JComboBox<String>());
        getOperacaoBox().addItem("Somar");
        getOperacaoBox().addItem("Subtrair");
        getOperacaoBox().addItem("Multiplicar");
        getOperacaoBox().addItem("Dividir");
        getOperacaoBox().setBounds(140, 280, 100, 20);
        getContentPane().add(getOperacaoBox());
    }
    private void configurebCalcular(){
        setbCalcular(new JButton("Calcular"));
        getbCalcular().setBounds(250, 280, 100, 20);
        getbCalcular().addActionListener(getQ7Handler());
        getContentPane().add(getbCalcular());
    }
    

    public JButton getbOk() {
        return bOk;
    }

    public void setbOk(JButton bOk) {
        this.bOk = bOk;
    }

    public JButton getbExibir() {
        return bExibir;
    }

    public void setbExibir(JButton bExibir) {
        this.bExibir = bExibir;
    }

    public Q7Handler getQ7Handler() {
        return q7Handler;
    }

    public void setQ7Handler(Q7Handler q7Handler) {
        this.q7Handler = q7Handler;
    }

    public JButton getbCalcular() {
        return bCalcular;
    }

    public void setbCalcular(JButton bCalcular) {
        this.bCalcular = bCalcular;
    }

    public JLabel getlNum() {
        return lNum;
    }

    public void setlNum(JLabel lNum) {
        this.lNum = lNum;
    }

    public JLabel getlMaior() {
        return lMaior;
    }

    public void setlMaior(JLabel lMaior) {
        this.lMaior = lMaior;
    }

    public JLabel getlMenor() {
        return lMenor;
    }

    public void setlMenor(JLabel lMenor) {
        this.lMenor = lMenor;
    }

    public JLabel getlMedia() {
        return lMedia;
    }

    public void setlMedia(JLabel lMedia) {
        this.lMedia = lMedia;
    }

    public JLabel getlValores() {
        return lValores;
    }

    public void setlValores(JLabel lValores) {
        this.lValores = lValores;
    }

    public JTextField getNumField() {
        return numField;
    }

    public void setNumField(JTextField numField) {
        this.numField = numField;
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

    public JTextField getValoresField() {
        return valoresField;
    }

    public void setValoresField(JTextField valoresField) {
        this.valoresField = valoresField;
    }

    public JComboBox<String> getOperacaoBox() {
        return operacaoBox;
    }

    public void setOperacaoBox(JComboBox<String> operacaoBox) {
        this.operacaoBox = operacaoBox;
    }

}

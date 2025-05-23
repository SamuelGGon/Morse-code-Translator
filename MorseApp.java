/*

Isso cria o basico de uma interface.
Com as bordas, titulo 

*/




import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class MorseApp implements ActionListener{ //Precisa fazer desse jeito para o botão funcionar e ter alguma função nele
    
    // Esse aqui é o metodo do botao, para dar uma função a ele
    JButton botao;
    JLabel printAlgo;
    JTextField caixinhaTexto;
    JTextArea areaTexto;
    JTextArea areaTexto2;
    
    Morse m = new Morse();

    



    public void actionPerformed(ActionEvent e){
        if(e.getSource() == botao){
            //botao.setEnabled(false);// mudar se o botão fica habilitado ou não
            printAlgo.setVisible(true); //faz palavra ficar visivel
            String inoutText = areaTexto2.getText();
            if (inoutText.charAt(0) == '.' || inoutText.charAt(0) == '-' || inoutText.charAt(0) == '_'){
                String morseTranslate = m.translate(inoutText);
                areaTexto.setText(morseTranslate);


            }else{
                String morseTranaslate = m.translateMorse(inoutText);
                areaTexto.setText(morseTranaslate);
            }

            
            
            

        }
            
    }
    

    public MorseApp() {
        
        //Aqui fazer a janela aka windows
        JFrame tela = new JFrame(); //cria a janela
        tela.setLayout(null);
        tela.setTitle("Morse code translate"); //esse comando tbm escreve no titulo da janela
        tela.setSize(940, 460); // aqui vai justar o tamanho da janela, eixo X e eixo y
        tela.setVisible(true); //Aqui faz a janela ficar visivel 
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ao clicar no X encerra a operação, dependendo o que vc escrever apos JFrame. pode impedir de fechar o programa, deixar ele rodandod e fundo. etc
        tela.setResizable(false);//Aqui você pode reajustar a tela, mudando pra false, impede e fica no tamanho que foi desejado.
        
        //Aqui faz imagem de icone
        
        ImageIcon imagem = new ImageIcon("./telegraph.png"); // aqui cria e vc pode colocar o nome do icone ou o caminho que ele está
        tela.setIconImage(imagem.getImage()); //muda o icone da janela
        tela.getContentPane().setBackground(new Color(46, 44 ,44)); //Muda  a cor do fundo da janela, RGB min 0 e  max 255 ou HexaDicimal
        
        //Aqui faz titulos, strings, letras, palavras   
        
        JLabel texto = new JLabel(); //Cria um texto
        JLabel texto2 = new JLabel();
        texto.setText("<html>Please enter your morse code below </html>"); // tu faz o texto aqui. O html, faz a quebra de linha
        texto2.setText("<html>" + "----".repeat(300) + "</html>");
        texto.setBounds(10, 35, 350, 100); // Aqui pode definir o tamanho do texto X, Y  e a posição Width, height. 
        texto2.setBounds(10, 160, 350, 100);
        //texto.setIcon(imagem);// TU coloca uma imagem para aparecer
        //texto.setHorizontalTextPosition(JLabel.CENTER); //pode mudar a  posição horizontal do texto dependendo da onde está a imagem de icone. CENTER, LEFT, RIGHT
        //texto.setVerticalTextPosition(JLabel.BOTTOM); // pode mudar a posição vertical do texto dependendo da onde está a imagem de icone. TOP, CENTER, BOTTOM.
        texto.setForeground(new Color(255,255,255)); // Muda a cor da fonte(texto) usando RGB ou Hexadecimal.
        texto.setFont(new Font("Comic sans", Font.BOLD, 20)); // Muda o nome da fonte, estilo e tamanho.
        texto2.setForeground(new Color(255, 255, 255));
        texto2.setFont(new Font("Comic sans", Font.BOLD, 20));
        texto.setIconTextGap(0);// distancia entre a imagem e o texto.
        tela.getContentPane().add(texto);
        tela.getContentPane().add(texto2);
        
        //Aqui se faz botões
        
        printAlgo = new JLabel();
        printAlgo.setBounds(10, 220, 300, 30);//Posição e tamanho do texto
        printAlgo.setVisible(false);
        printAlgo.setForeground(Color.white);
        printAlgo.setFont(new Font("Comic sans", Font.BOLD, 20));

        botao = new JButton(); // cria o botão
        botao.setBounds(760, 120, 150, 70);//Aqui pode definir possição do botão na tela X, Y e o tamanho dele width, height.
        botao.addActionListener(this); // para isso funcionar tem que fazer implements ActionListener no seu public class (nome do programa)
        botao.setText("Translate\n here"); // da o nome do botão
        botao.setFocusable(false); // Tira o contorno ao clicar do nome que vc deu ao botão.
        //botao.setIcon(imagem); // Coloca imagem no botão tbm
        botao.setFont(new Font("Comic Sans", Font.BOLD, 20));
        botao.setForeground(Color.white);//Muda a cor da fonte 
        botao.setBackground(new Color(82, 79, 79));// Muda a cor do fundo do botão
        botao.setBorder(BorderFactory.createEtchedBorder());//Muda o contorno do botão
        //tela.setLayout(null); // 
        tela.add(botao);
        tela.add(printAlgo);
        
        //Aqui se faz uma caixinha para escrever.
        JPanel painelCima = new JPanel();
        areaTexto2 = new JTextArea(3, 41);
        JScrollPane scroll2 = new JScrollPane(areaTexto2);

        caixinhaTexto = new JTextField(); // Chama ou cria o objeto caixinha de texto
        painelCima.setBounds(10, 100, 720, 90);
        areaTexto2.setBackground(Color.BLACK);
        areaTexto2.setFont(new Font("Comic sans", Font.CENTER_BASELINE, 20));
        areaTexto2.setForeground(Color.WHITE);
        areaTexto2.setText("Use (.- or ._) + for spaces between word and for each morse char add a space between letters.(<---Delete)");
        areaTexto2.setLineWrap(true);
        areaTexto2.setWrapStyleWord(true);
        painelCima.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        scroll2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        painelCima.add(scroll2);
        tela.add(painelCima);

        //Aqui faz um painel qualquer.

        JPanel painel = new JPanel();
        areaTexto = new JTextArea(3, 41);
        JScrollPane scroll = new JScrollPane(areaTexto);
        areaTexto.setEditable(false);
        painel.setBounds(10, 235, 720, 90);
        areaTexto.setBackground(new Color(0, 0, 0));
        areaTexto.setFont(new Font("Comic sans", Font.CENTER_BASELINE, 20));
        areaTexto.setForeground(Color.WHITE);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        painel.setBorder(BorderFactory.createLineBorder(Color.WHITE)); 
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);       
        painel.add(scroll);
        tela.add(painel);
        
        
        // você quer mudar a cor do texto e a fonte nesse areatexto
    }
    
    
    public static void main(String[] args){
        
        new MorseApp();
    }


   
}

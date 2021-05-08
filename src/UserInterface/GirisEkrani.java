package UserInterface;

import ArayuzIslemleri.RenkVeIconlar;
import SQLIslemleri.SQLKullanıcıIslemleri;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class GirisEkrani extends javax.swing.JFrame {
    
    // Classlar
    
    RenkVeIconlar renkVeIconlar = new RenkVeIconlar();
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();  
    
    // Classlar - Sonradan Silinebilir
    
    SQLKullanıcıIslemleri sqlKullanıcıIslemleri = new SQLKullanıcıIslemleri();
    
    // Değişkenler
    
    public Integer posX;
    public Integer posY;
    
    
    // Değişkenler - Sonradan Silinecek
    
    public String kullanıcıAdı = "mehmet";
    public String kullanıcıSifre = "123456";
    

    /**
     * Creates new form GirisEkrani
     */
    public GirisEkrani() {
        initComponents();
        initComponents_2(false);
        
        this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
                
    }
    
    
    public void initComponents_2(boolean acılıs){
        
        jLabel_KurtarmaMesajı.setVisible(acılıs);
        jLabel_Sayac.setVisible(acılıs);
        jTextField_KurtarmaKodu.setVisible(acılıs);
        
        jTextField_KullanıcıAdı.setVisible(!acılıs);
        jPasswordField_Sifre.setVisible(!acılıs);
        
        if(acılıs){
            jLabel_UserLogin.setIcon(renkVeIconlar.getUser2());
        }else{
            jLabel_UserLogin.setIcon(renkVeIconlar.getUser());            
        }
    
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_AnaPanel = new javax.swing.JPanel();
        jPanel_GırısIkon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_GırısParametreleri = new javax.swing.JPanel();
        jPanel_Navigasyon = new javax.swing.JPanel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel_Minimize = new javax.swing.JLabel();
        jLabel_Move = new javax.swing.JLabel();
        jPanel_KullanıcıIkon = new javax.swing.JPanel();
        jLabel_UserLogin = new javax.swing.JLabel();
        jLabel_KurtarmaMesajı = new javax.swing.JLabel();
        jLabel_Sayac = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField_KullanıcıAdı = new javax.swing.JTextField();
        jPasswordField_Sifre = new javax.swing.JPasswordField();
        jTextField_KurtarmaKodu = new javax.swing.JTextField();
        jLabel_SifremiUnuttum = new javax.swing.JLabel();
        jButton_GirisYap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel_AnaPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GirisEkranı.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_GırısIkonLayout = new javax.swing.GroupLayout(jPanel_GırısIkon);
        jPanel_GırısIkon.setLayout(jPanel_GırısIkonLayout);
        jPanel_GırısIkonLayout.setHorizontalGroup(
            jPanel_GırısIkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_GırısIkonLayout.setVerticalGroup(
            jPanel_GırısIkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_GırısParametreleri.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Navigasyon.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel2.png"))); // NOI18N
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseExited(evt);
            }
        });

        jLabel_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize2.png"))); // NOI18N
        jLabel_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseExited(evt);
            }
        });

        jLabel_Move.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Move.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/move.png"))); // NOI18N
        jLabel_Move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel_MoveMouseDragged(evt);
            }
        });
        jLabel_Move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_MoveMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_NavigasyonLayout = new javax.swing.GroupLayout(jPanel_Navigasyon);
        jPanel_Navigasyon.setLayout(jPanel_NavigasyonLayout);
        jPanel_NavigasyonLayout.setHorizontalGroup(
            jPanel_NavigasyonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NavigasyonLayout.createSequentialGroup()
                .addComponent(jLabel_Move, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Close)
                .addContainerGap())
        );
        jPanel_NavigasyonLayout.setVerticalGroup(
            jPanel_NavigasyonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NavigasyonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_NavigasyonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel_Minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel_Move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_KullanıcıIkon.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_UserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_UserLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_KullanıcıIkonLayout = new javax.swing.GroupLayout(jPanel_KullanıcıIkon);
        jPanel_KullanıcıIkon.setLayout(jPanel_KullanıcıIkonLayout);
        jPanel_KullanıcıIkonLayout.setHorizontalGroup(
            jPanel_KullanıcıIkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_UserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_KullanıcıIkonLayout.setVerticalGroup(
            jPanel_KullanıcıIkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_UserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );

        jLabel_KurtarmaMesajı.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_KurtarmaMesajı.setForeground(new java.awt.Color(32, 188, 233));
        jLabel_KurtarmaMesajı.setText("Kurtarma Kodunu Giriniz");

        jLabel_Sayac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Sayac.setForeground(new java.awt.Color(32, 188, 233));
        jLabel_Sayac.setText("120");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_KullanıcıAdı.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_KullanıcıAdı.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kullanıcı Adı", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 18))); // NOI18N
        jTextField_KullanıcıAdı.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_KullanıcıAdıKeyPressed(evt);
            }
        });

        jPasswordField_Sifre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sifre", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 18))); // NOI18N
        jPasswordField_Sifre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_SifreKeyPressed(evt);
            }
        });

        jTextField_KurtarmaKodu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_KurtarmaKodu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kurtarma Kodu", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 18))); // NOI18N
        jTextField_KurtarmaKodu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_KurtarmaKoduKeyPressed(evt);
            }
        });

        jLabel_SifremiUnuttum.setForeground(new java.awt.Color(43, 81, 154));
        jLabel_SifremiUnuttum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_SifremiUnuttum.setText("Şifremi Unuttum");
        jLabel_SifremiUnuttum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SifremiUnuttumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_SifremiUnuttumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_SifremiUnuttumMouseExited(evt);
            }
        });

        jButton_GirisYap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/enter.png"))); // NOI18N
        jButton_GirisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GirisYapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_KullanıcıAdı)
                    .addComponent(jPasswordField_Sifre)
                    .addComponent(jTextField_KurtarmaKodu)
                    .addComponent(jLabel_SifremiUnuttum, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_GirisYap))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTextField_KullanıcıAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_KurtarmaKodu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_SifremiUnuttum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_GirisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_GırısParametreleriLayout = new javax.swing.GroupLayout(jPanel_GırısParametreleri);
        jPanel_GırısParametreleri.setLayout(jPanel_GırısParametreleriLayout);
        jPanel_GırısParametreleriLayout.setHorizontalGroup(
            jPanel_GırısParametreleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Navigasyon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_KullanıcıIkon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_GırısParametreleriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_KurtarmaMesajı, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Sayac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_GırısParametreleriLayout.setVerticalGroup(
            jPanel_GırısParametreleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GırısParametreleriLayout.createSequentialGroup()
                .addComponent(jPanel_Navigasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_KullanıcıIkon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel_GırısParametreleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_KurtarmaMesajı)
                    .addComponent(jLabel_Sayac))
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_AnaPanelLayout = new javax.swing.GroupLayout(jPanel_AnaPanel);
        jPanel_AnaPanel.setLayout(jPanel_AnaPanelLayout);
        jPanel_AnaPanelLayout.setHorizontalGroup(
            jPanel_AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AnaPanelLayout.createSequentialGroup()
                .addComponent(jPanel_GırısIkon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_GırısParametreleri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_AnaPanelLayout.setVerticalGroup(
            jPanel_AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_GırısIkon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_GırısParametreleri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AnaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AnaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseEntered
        
        jLabel_Minimize.setIcon(renkVeIconlar.getMinimize());
        
    }//GEN-LAST:event_jLabel_MinimizeMouseEntered

    private void jLabel_MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseExited
        
        jLabel_Minimize.setIcon(renkVeIconlar.getMinimize2());
        
    }//GEN-LAST:event_jLabel_MinimizeMouseExited

    private void jLabel_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseEntered
        
        jLabel_Close.setIcon(renkVeIconlar.getCancel());
        
    }//GEN-LAST:event_jLabel_CloseMouseEntered

    private void jLabel_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseExited
       
        jLabel_Close.setIcon(renkVeIconlar.getCancel2());
        
    }//GEN-LAST:event_jLabel_CloseMouseExited

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseClicked
        
        this.setState(Frame.ICONIFIED);
        
    }//GEN-LAST:event_jLabel_MinimizeMouseClicked

    private void jLabel_SifremiUnuttumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SifremiUnuttumMouseEntered
        
        jLabel_SifremiUnuttum.setForeground(Color.BLACK);
        jLabel_SifremiUnuttum.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
    }//GEN-LAST:event_jLabel_SifremiUnuttumMouseEntered

    private void jLabel_SifremiUnuttumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SifremiUnuttumMouseExited
        
        jLabel_SifremiUnuttum.setForeground(renkVeIconlar.getMavi());
        
    }//GEN-LAST:event_jLabel_SifremiUnuttumMouseExited

    private void jLabel_SifremiUnuttumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SifremiUnuttumMouseClicked
              
        String kullanıcıAdı = jTextField_KullanıcıAdı.getText();
        kullanıcıAdı = kullanıcıAdı.replaceAll(" ", "");
        jTextField_KullanıcıAdı.setText(kullanıcıAdı);
        
        if(!kullanıcıAdı.equals("")){   // Mail Gönderilcek
            
            int dialogButton = JOptionPane.showConfirmDialog(this, "Kurtarma Kodu Mailinize Gönderilsin mi?", "Uyarı", JOptionPane.YES_NO_OPTION);
        
            if(dialogButton == 0){  // Evet
                System.out.println("Kurtarma Kodu Mailinize gönderiliyor");
                
                initComponents_2(true);
                
                SwingWorker<Boolean, Integer> worker = new SwingWorker<Boolean, Integer>(){
                    @Override
                    protected Boolean doInBackground() throws Exception {
                        
                        
                        
                        for(int i= 120; i>= 0; i--){
                            
                            jLabel_Sayac.setText(String.valueOf(i));
                            Thread.sleep(100);
                            
                        }
                        
                        return true;
                    }   

                    @Override
                    protected void done() {
                        
                        initComponents_2(false);
                        System.out.println("Süreniz Bitti");
                        
                    }                
                };
                
                worker.execute();
                
            }            
            
        }else{
            JOptionPane.showMessageDialog(this, "Kullanıcı Adı Girmediniz.");
        }
        
    }//GEN-LAST:event_jLabel_SifremiUnuttumMouseClicked

    private void jLabel_MoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MoveMousePressed
        
        posX = evt.getX();
        posY = evt.getY();
        
    }//GEN-LAST:event_jLabel_MoveMousePressed

    private void jLabel_MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MoveMouseDragged
       
        this.setLocation(evt.getXOnScreen() - posX - 351, evt.getYOnScreen() - posY);
        
    }//GEN-LAST:event_jLabel_MoveMouseDragged

    private void jButton_GirisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GirisYapActionPerformed
        
        String girilenKullanıcıAdı = jTextField_KullanıcıAdı.getText();
        String girilenSifre = new String(jPasswordField_Sifre.getPassword());
        
        if(girilenKullanıcıAdı.equals("") && girilenSifre.equals("")){
            JOptionPane.showMessageDialog(this, "Kullanıcı Adı ve Şifresi Giriniz");
        }else if(girilenKullanıcıAdı.equals("")){
            JOptionPane.showMessageDialog(this, "Kullanıcı Adı Giriniz");
        }else if(girilenSifre.equals("")){
            JOptionPane.showMessageDialog(this, "Şifre Giriniz");
        }else{
            
            if(girilenKullanıcıAdı.equals(kullanıcıAdı) && Objects.equals(girilenSifre, kullanıcıSifre)){
                System.out.println("Hoşgeldiniz");
            }else{
                JOptionPane.showMessageDialog(this, "Kullanıcı Adınız veya Şifreniz Yanlış");
            }
            
            
        }
        
        
    }//GEN-LAST:event_jButton_GirisYapActionPerformed

    private void jTextField_KullanıcıAdıKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_KullanıcıAdıKeyPressed
       
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            jButton_GirisYap.doClick();
        }
        
    }//GEN-LAST:event_jTextField_KullanıcıAdıKeyPressed

    private void jPasswordField_SifreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_SifreKeyPressed
        
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            jButton_GirisYap.doClick();
        }
        
    }//GEN-LAST:event_jPasswordField_SifreKeyPressed

    private void jTextField_KurtarmaKoduKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_KurtarmaKoduKeyPressed
        
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            jButton_GirisYap.doClick();
        }
        
    }//GEN-LAST:event_jTextField_KurtarmaKoduKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_GirisYap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_KurtarmaMesajı;
    private javax.swing.JLabel jLabel_Minimize;
    private javax.swing.JLabel jLabel_Move;
    private javax.swing.JLabel jLabel_Sayac;
    private javax.swing.JLabel jLabel_SifremiUnuttum;
    private javax.swing.JLabel jLabel_UserLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_AnaPanel;
    private javax.swing.JPanel jPanel_GırısIkon;
    private javax.swing.JPanel jPanel_GırısParametreleri;
    private javax.swing.JPanel jPanel_KullanıcıIkon;
    private javax.swing.JPanel jPanel_Navigasyon;
    private javax.swing.JPasswordField jPasswordField_Sifre;
    private javax.swing.JTextField jTextField_KullanıcıAdı;
    private javax.swing.JTextField jTextField_KurtarmaKodu;
    // End of variables declaration//GEN-END:variables
}

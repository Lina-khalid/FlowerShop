package FlowerApplication;

import classes.Order;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class HomeInterface extends javax.swing.JFrame {

    // Static arraylist of Order 
    public static ArrayList<Order> newOrder = new ArrayList<Order>();

    public HomeInterface() {
        initComponents();

        // To change the appearance of the button
        JButton[] btns = {addButton1, addButton2, addButton3, addButton4};
        for (JButton btn : btns) {
            btn.setBackground(new Color(225, 218, 211));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
                }

                @Override
                public void mousePressed(MouseEvent me) {
                }

                @Override
                public void mouseReleased(MouseEvent me) {

                }

                @Override
                public void mouseEntered(MouseEvent me) {
                    btn.setBackground(new Color(209, 190, 190));
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    btn.setBackground(new Color(225, 218, 211));
                }
            });
        }

        JButton[] btns2 = {cartButton, homeButton, signOutButton};
        for (JButton btn1 : btns2) {
            btn1.setBackground(new Color(207, 196, 199));
            btn1.setUI(new BasicButtonUI());
            btn1.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
                }

                @Override
                public void mousePressed(MouseEvent me) {
                }

                @Override
                public void mouseReleased(MouseEvent me) {

                }

                @Override
                public void mouseEntered(MouseEvent me) {
                    btn1.setBackground(new Color(209, 190, 190));
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    btn1.setBackground(new Color(207, 196, 199));
                }
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pageTitleLabel2 = new javax.swing.JLabel();
        pageTitleLabel1 = new javax.swing.JLabel();
        flowerPanel2 = new javax.swing.JPanel();
        flowerPicLabel2 = new javax.swing.JLabel();
        flowerNameLabel2 = new javax.swing.JLabel();
        priceLabel2 = new javax.swing.JLabel();
        addButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        Purple = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        flowerPanel1 = new javax.swing.JPanel();
        flowerPicLabel1 = new javax.swing.JLabel();
        flowerNameLabel1 = new javax.swing.JLabel();
        priceLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        addButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        Blue = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        flowerPanel3 = new javax.swing.JPanel();
        flowerPicLabel3 = new javax.swing.JLabel();
        flowerNameLabel3 = new javax.swing.JLabel();
        priceLabel3 = new javax.swing.JLabel();
        addButton3 = new javax.swing.JButton();
        Bag = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        flowerPanel4 = new javax.swing.JPanel();
        flowerPicLabel4 = new javax.swing.JLabel();
        flowerNameLabel4 = new javax.swing.JLabel();
        addButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Vase = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        priceLabel4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        flowerPicLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        javax.swing.JPanel menuPanel = new javax.swing.JPanel();
        cartButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        signOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 243, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 524));

        pageTitleLabel2.setBackground(new java.awt.Color(225, 218, 211));
        pageTitleLabel2.setFont(new java.awt.Font("Gabriola", 0, 90)); // NOI18N
        pageTitleLabel2.setForeground(new java.awt.Color(237, 192, 204));
        pageTitleLabel2.setText("Page");

        pageTitleLabel1.setFont(new java.awt.Font("Gabriola", 0, 90)); // NOI18N
        pageTitleLabel1.setForeground(new java.awt.Color(204, 204, 204));
        pageTitleLabel1.setText("Home");

        flowerPanel2.setBackground(new java.awt.Color(237, 192, 204));
        flowerPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        flowerPanel2.setPreferredSize(new java.awt.Dimension(185, 283));

        flowerPicLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flowerPicLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/Picture9.png"))); // NOI18N

        flowerNameLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flowerNameLabel2.setForeground(new java.awt.Color(102, 102, 102));
        flowerNameLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flowerNameLabel2.setText("Purple Flower");

        priceLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        priceLabel2.setForeground(new java.awt.Color(102, 102, 102));
        priceLabel2.setText("170");

        addButton2.setBackground(new java.awt.Color(102, 102, 102));
        addButton2.setText("ADD");
        addButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton2ActionPerformed(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("QTY");

        Purple.setBackground(new java.awt.Color(240, 240, 240));
        Purple.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 240, 240)));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("SAR");

        javax.swing.GroupLayout flowerPanel2Layout = new javax.swing.GroupLayout(flowerPanel2);
        flowerPanel2.setLayout(flowerPanel2Layout);
        flowerPanel2Layout.setHorizontalGroup(
            flowerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, flowerPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(flowerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(flowerPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(priceLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22))
                    .addComponent(flowerNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flowerPicLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(flowerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(flowerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purple, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        flowerPanel2Layout.setVerticalGroup(
            flowerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flowerPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(flowerNameLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(flowerPicLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(flowerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel2)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(flowerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purple, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        flowerPanel1.setBackground(new java.awt.Color(237, 192, 204));
        flowerPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        flowerPanel1.setPreferredSize(new java.awt.Dimension(185, 283));

        flowerPicLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flowerPicLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/Picture8.png"))); // NOI18N

        flowerNameLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flowerNameLabel1.setForeground(new java.awt.Color(102, 102, 102));
        flowerNameLabel1.setText("Blue Flower");

        priceLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        priceLabel1.setForeground(new java.awt.Color(102, 102, 102));
        priceLabel1.setText("150");

        addButton1.setBackground(new java.awt.Color(102, 102, 102));
        addButton1.setText("ADD");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("QTY");

        Blue.setBackground(new java.awt.Color(240, 240, 240));
        Blue.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 240, 240)));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("SAR");

        javax.swing.GroupLayout flowerPanel1Layout = new javax.swing.GroupLayout(flowerPanel1);
        flowerPanel1.setLayout(flowerPanel1Layout);
        flowerPanel1Layout.setHorizontalGroup(
            flowerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, flowerPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(flowerNameLabel1)
                .addGap(51, 51, 51))
            .addGroup(flowerPanel1Layout.createSequentialGroup()
                .addGroup(flowerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(flowerPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(flowerPicLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(flowerPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(flowerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Blue, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(flowerPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(priceLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        flowerPanel1Layout.setVerticalGroup(
            flowerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flowerPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(flowerNameLabel1)
                .addGap(18, 18, 18)
                .addComponent(flowerPicLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(flowerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel1)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(flowerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(flowerPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Blue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        flowerPanel3.setBackground(new java.awt.Color(237, 192, 204));
        flowerPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        flowerPanel3.setPreferredSize(new java.awt.Dimension(185, 283));

        flowerPicLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flowerPicLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/Picture10.png"))); // NOI18N

        flowerNameLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flowerNameLabel3.setForeground(new java.awt.Color(102, 102, 102));
        flowerNameLabel3.setText("Flower Bag");

        priceLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        priceLabel3.setForeground(new java.awt.Color(102, 102, 102));
        priceLabel3.setText("200");

        addButton3.setBackground(new java.awt.Color(102, 102, 102));
        addButton3.setText("ADD");
        addButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton3ActionPerformed(evt);
            }
        });

        Bag.setBackground(new java.awt.Color(240, 240, 240));
        Bag.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 240, 240)));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("QTY");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("SAR");

        javax.swing.GroupLayout flowerPanel3Layout = new javax.swing.GroupLayout(flowerPanel3);
        flowerPanel3.setLayout(flowerPanel3Layout);
        flowerPanel3Layout.setHorizontalGroup(
            flowerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flowerPanel3Layout.createSequentialGroup()
                .addGroup(flowerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(flowerPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(flowerPicLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(flowerPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(flowerNameLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, flowerPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(priceLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, flowerPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(flowerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bag, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        flowerPanel3Layout.setVerticalGroup(
            flowerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, flowerPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(flowerNameLabel3)
                .addGap(18, 18, 18)
                .addComponent(flowerPicLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(flowerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel3)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(flowerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bag, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        flowerPanel4.setBackground(new java.awt.Color(237, 192, 204));

        flowerPicLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/Picture12.png"))); // NOI18N

        flowerNameLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        flowerNameLabel4.setForeground(new java.awt.Color(102, 102, 102));
        flowerNameLabel4.setText("Flower Vase ");

        addButton4.setBackground(new java.awt.Color(102, 102, 102));
        addButton4.setText("ADD");
        addButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton4ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(169, 156, 181));
        jLabel16.setText("<html> <body><div align=\"center\"> Choose the flowers you like<br>  and leave the arrangement to us</div> </body> </html>");

        Vase.setBackground(new java.awt.Color(240, 240, 240));
        Vase.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 240, 240)));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("QTY");

        priceLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        priceLabel4.setForeground(new java.awt.Color(102, 102, 102));
        priceLabel4.setText("200");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("SAR");

        javax.swing.GroupLayout flowerPanel4Layout = new javax.swing.GroupLayout(flowerPanel4);
        flowerPanel4.setLayout(flowerPanel4Layout);
        flowerPanel4Layout.setHorizontalGroup(
            flowerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flowerPanel4Layout.createSequentialGroup()
                .addGroup(flowerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(flowerPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(flowerNameLabel4))
                    .addGroup(flowerPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(flowerPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(flowerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(flowerPanel4Layout.createSequentialGroup()
                                .addComponent(Vase, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(priceLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(flowerPicLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        flowerPanel4Layout.setVerticalGroup(
            flowerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flowerPanel4Layout.createSequentialGroup()
                .addGroup(flowerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(flowerPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(flowerNameLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(flowerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Vase, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel4)
                            .addComponent(jLabel25)))
                    .addComponent(flowerPicLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(237, 192, 204));

        flowerPicLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flowerPicLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/Picture13.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Beauty Of Flowers");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel14))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(flowerPicLabel5)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flowerPicLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.setBackground(new java.awt.Color(237, 192, 204));

        cartButton.setBackground(new java.awt.Color(102, 102, 102));
        cartButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cartButton.setForeground(new java.awt.Color(255, 255, 255));
        cartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/icons8-shopping-cart-30.png"))); // NOI18N
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });

        homeButton.setBackground(new java.awt.Color(102, 102, 102));
        homeButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/icons8-home-30_1.png"))); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        signOutButton.setBackground(new java.awt.Color(102, 102, 102));
        signOutButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signOutButton.setForeground(new java.awt.Color(255, 255, 255));
        signOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/icons8-sign-out-30.png"))); // NOI18N
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(signOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
            .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(signOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuPanelLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(392, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pageTitleLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pageTitleLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(flowerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(flowerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(flowerPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(flowerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pageTitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pageTitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(flowerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(flowerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(flowerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(flowerPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed

        // To navigate to the Cart interface  
        CartInterface CartInterface1 = null;
        if (CartInterface1 == null) {
            CartInterface1 = new CartInterface();
        }
        CartInterface1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cartButtonActionPerformed


    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed

        // To navigate to the Login interface
        LoginInterface logintInterface2 = null;
        if (logintInterface2 == null) {
            logintInterface2 = new LoginInterface();
        }
        logintInterface2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signOutButtonActionPerformed

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed

        // Read customer input 
        int blueQ = Integer.parseInt(Blue.getText());
        // New object of Order 
        Order blue = new Order(blueQ, "Blue Flower", 150);
        // Update newOrder array 
        newOrder.add(blue);
        // To delete after added the item to cart
        Blue.setText(null);
    }//GEN-LAST:event_addButton1ActionPerformed

    private void addButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton2ActionPerformed

        // Read customer input 
        int purpleQ = Integer.parseInt(Purple.getText());
        // New object of Order 
        Order purple = new Order(purpleQ, "Purple Flower", 170);
        // Update newOrder array 
        newOrder.add(purple);
        // To delete after added the item to cart
        Purple.setText(null);
    }//GEN-LAST:event_addButton2ActionPerformed

    private void addButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton3ActionPerformed

        // Read customer input 
        int bagQ = Integer.parseInt(Bag.getText());
        // New object of Order 
        Order bag = new Order(bagQ, "Flower Bag", 200);
        // Update newOrder array 
        newOrder.add(bag);
        // To delete after added the item to cart
        Bag.setText(null);

    }//GEN-LAST:event_addButton3ActionPerformed

    private void addButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton4ActionPerformed

        // Read customer input 
        int vaseQ = Integer.parseInt(Vase.getText());
        // New object of Order 
        Order vase = new Order(vaseQ, "Flower Vase", 200);
        // Update newOrder array 
        newOrder.add(vase);
        // To delete after added the item to cart
        Vase.setText(null);
    }//GEN-LAST:event_addButton4ActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bag;
    private javax.swing.JTextField Blue;
    private javax.swing.JTextField Purple;
    private javax.swing.JTextField Vase;
    private javax.swing.JButton addButton1;
    private javax.swing.JButton addButton2;
    private javax.swing.JButton addButton3;
    private javax.swing.JButton addButton4;
    private javax.swing.JButton cartButton;
    private javax.swing.JLabel flowerNameLabel1;
    private javax.swing.JLabel flowerNameLabel2;
    private javax.swing.JLabel flowerNameLabel3;
    private javax.swing.JLabel flowerNameLabel4;
    private javax.swing.JPanel flowerPanel1;
    private javax.swing.JPanel flowerPanel2;
    private javax.swing.JPanel flowerPanel3;
    private javax.swing.JPanel flowerPanel4;
    private javax.swing.JLabel flowerPicLabel1;
    private javax.swing.JLabel flowerPicLabel2;
    private javax.swing.JLabel flowerPicLabel3;
    private javax.swing.JLabel flowerPicLabel4;
    private javax.swing.JLabel flowerPicLabel5;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel pageTitleLabel1;
    private javax.swing.JLabel pageTitleLabel2;
    private javax.swing.JLabel priceLabel1;
    private javax.swing.JLabel priceLabel2;
    private javax.swing.JLabel priceLabel3;
    private javax.swing.JLabel priceLabel4;
    private javax.swing.JButton signOutButton;
    // End of variables declaration//GEN-END:variables
}

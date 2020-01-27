package main.java;


import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.text.DecimalFormat;

public class LLLForm extends javax.swing.JFrame {

    public LLLForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jTabbedPaneLLL = new javax.swing.JTabbedPane();
        jPanelBasisReduction = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPaneBasis = new javax.swing.JScrollPane();
        jTableBasis = new javax.swing.JTable();
        jScrollPaneReducedBasis = new javax.swing.JScrollPane();
        jTableReducedBasis = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButtonLLLalgorithm = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTFColumns = new javax.swing.JTextField();
        jTFColumns.setText("3");
        jLabel8 = new javax.swing.JLabel();
        jTFRows = new javax.swing.JTextField();
        jTFRows.setText("3");
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTotalTime = new javax.swing.JTextField();
        jLabelErroText = new javax.swing.JLabel();
        jPanelFactorization = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFX = new javax.swing.JTextField();
        jTFOutputValue = new javax.swing.JTextField();
        jButtonShowValue = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFactorizationOutput = new javax.swing.JTextField();
        jButtonClearF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePolynomial = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Degree = new javax.swing.JTextField();
        jTextField_Degree.setText("3");
        Button_OK_Degree = new javax.swing.JButton();
        Button_ShowFactorizedPol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LLL reduced basis ");
        setBackground(new java.awt.Color(153, 204, 255));
        setBounds(new java.awt.Rectangle(0, 0, 510, 380));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(510, 380));
        setMinimumSize(new java.awt.Dimension(510, 380));
        setPreferredSize(new java.awt.Dimension(510, 380));

        jTabbedPaneLLL.setMaximumSize(new java.awt.Dimension(500, 380));
        jTabbedPaneLLL.setMinimumSize(new java.awt.Dimension(500, 380));
        jTabbedPaneLLL.setName(""); // NOI18N
        jTabbedPaneLLL.setPreferredSize(new java.awt.Dimension(500, 380));

        jPanelBasisReduction.setMaximumSize(new java.awt.Dimension(448, 340));
        jPanelBasisReduction.setMinimumSize(new java.awt.Dimension(448, 340));
        jPanelBasisReduction.setPreferredSize(new java.awt.Dimension(448, 340));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Basis matrix");

        jTableBasis.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}

                },
                new String [] {
                        "A", "B", "C"
                }
        ));
        jScrollPaneBasis.setViewportView(jTableBasis);

        jTableReducedBasis.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}

                },
                new String [] {
                        "A", "B", "C"
                }
        ));
        jScrollPaneReducedBasis.setViewportView(jTableReducedBasis);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Reduced matrix ");

        jButtonLLLalgorithm.setText("LLL algorithm");
        jButtonLLLalgorithm.setToolTipText("");
        jButtonLLLalgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLLLalgorithmActionPerformed(evt);
            }
        });

        jButtonClear.setText("Clear");
        jButtonClear.setActionCommand("Clear ");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jLabel6.setText("Number of dimensions:");

        jLabel8.setText("Number of vectors");

        jLabel9.setText("Total time: ");

        jTextFieldTotalTime.setAutoscrolls(false);

        javax.swing.GroupLayout jPanelBasisReductionLayout = new javax.swing.GroupLayout(jPanelBasisReduction);
        jPanelBasisReduction.setLayout(jPanelBasisReductionLayout);
        jPanelBasisReductionLayout.setHorizontalGroup(
            jPanelBasisReductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBasisReductionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBasisReductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBasisReductionLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFColumns, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFRows, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBasisReductionLayout.createSequentialGroup()
                        .addGroup(jPanelBasisReductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelErroText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBasisReductionLayout.createSequentialGroup()
                                .addGroup(jPanelBasisReductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPaneBasis, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelBasisReductionLayout.createSequentialGroup()
                                        .addComponent(jButtonLLLalgorithm)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addGroup(jPanelBasisReductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelBasisReductionLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTotalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPaneReducedBasis, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48))))
        );
        jPanelBasisReductionLayout.setVerticalGroup(
            jPanelBasisReductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBasisReductionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBasisReductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFColumns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBasisReductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBasisReductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneBasis, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jScrollPaneReducedBasis, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanelBasisReductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLLLalgorithm)
                    .addComponent(jButtonClear)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldTotalTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabelErroText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        jTabbedPaneLLL.addTab("Basis Reduction", jPanelBasisReduction);

        jPanelFactorization.setPreferredSize(new java.awt.Dimension(448, 561));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Polynomial: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("x: ");

        jTFOutputValue.setEditable(false);
        jTFOutputValue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButtonShowValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonShowValue.setText("Show polynomial value of x");
        jButtonShowValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowValueActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Factorization output: ");

        jTextFieldFactorizationOutput.setEditable(false);
        jTextFieldFactorizationOutput.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButtonClearF.setLabel("Clear");
        jButtonClearF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearFActionPerformed(evt);
            }
        });

        jTablePolynomial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "A0", "A1", "A2", "A3"
            }
        ));
        jScrollPane1.setViewportView(jTablePolynomial);

        jLabel7.setText("Choose the degree of polynomial: ");

        Button_OK_Degree.setText("OK");
        Button_OK_Degree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_OK_DegreeActionPerformed(evt);
            }
        });

        Button_ShowFactorizedPol.setText("Show factorized polynomial");
        Button_ShowFactorizedPol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ShowFactorizedPolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFactorizationLayout = new javax.swing.GroupLayout(jPanelFactorization);
        jPanelFactorization.setLayout(jPanelFactorizationLayout);
        jPanelFactorizationLayout.setHorizontalGroup(
            jPanelFactorizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFactorizationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFactorizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFactorizationLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Degree, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_OK_Degree))
                    .addGroup(jPanelFactorizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldFactorizationOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelFactorizationLayout.createSequentialGroup()
                            .addGroup(jPanelFactorizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelFactorizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelFactorizationLayout.createSequentialGroup()
                                    .addComponent(jTFX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonShowValue)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFOutputValue))))
                        .addComponent(jButtonClearF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFactorizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Button_ShowFactorizedPol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelFactorizationLayout.setVerticalGroup(
            jPanelFactorizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFactorizationLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelFactorizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_Degree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_OK_Degree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFactorizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFactorizationLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addGroup(jPanelFactorizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFactorizationLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanelFactorizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFOutputValue))
                        .addGap(18, 18, 18)
                        .addComponent(Button_ShowFactorizedPol)
                        .addGap(4, 4, 4))
                    .addGroup(jPanelFactorizationLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonShowValue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelFactorizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFactorizationOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonClearF)
                .addGap(737, 737, 737))
        );

        jTabbedPaneLLL.addTab("Factorization", jPanelFactorization);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneLLL, javax.swing.GroupLayout.PREFERRED_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneLLL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
    private void jButtonLLLalgorithmActionPerformed(java.awt.event.ActionEvent evt) {
        int cols=jTableBasis.getColumnCount();
        int rows=jTableBasis.getRowCount();
        if(rows>cols) jLabelErroText.setText("Number of dimensions should be greater or equal to number of vectors!");
        else{
            Object[][]basis=new Object[rows][cols];
            int[][] reducedBasis=new int[rows][cols];

            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    basis[i][j]=jTableBasis.getValueAt(i,j);

                }
            }
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    reducedBasis[i][j]=Integer.parseInt(String.valueOf(basis[i][j]));
                }
            }
            long start = System.nanoTime();
            LLL.integral_LLL(reducedBasis,rows,cols);
            long elapsedTime = System.nanoTime() - start;

            for(int i=0;i<rows;i++) {
                for (int j = 0; j < cols; j++) {
                    jTableReducedBasis.setValueAt(reducedBasis[i][j],i,j);
                }
            }
            jTextFieldTotalTime.setText(String.valueOf(elapsedTime));
        }


    }//GEN-LAST:event_jButtonLLLalgorithmActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed

          if(!jTFRows.getText().equals("") && !jTFColumns.getText().equals("")){
            int rows= Integer.parseInt(jTFRows.getText());
            int cols=Integer.parseInt(jTFColumns.getText());
            if(rows>cols) jLabelErroText.setText("Number of diemnsions should be greater or equal to number of vectors!");
            else{
                jTableBasis.setModel(new DefaultTableModel(rows,cols));
                jTableReducedBasis.setModel(new DefaultTableModel(rows,cols));
                jTextFieldTotalTime.setText("");
                jLabelErroText.setText("Remeber to set integer values in basis, and the row vectors must be lineary independent! ");
            }

        }
        else jLabelErroText.setText("Set numbers of rows and columns!");
    }

    private void jButtonClearFActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        jTextField_Degree.setText("3");
        jTablePolynomial.setModel(new DefaultTableModel(1,4));
        for(int i=0;i<jTablePolynomial.getColumnCount();i++)
        {
            TableColumn column1 = jTablePolynomial.getTableHeader().getColumnModel().getColumn(i);
            column1.setHeaderValue("A"+i);
        }
        jTFX.setText("");
        jTFOutputValue.setText("");
    }                                             

    private void jButtonShowValueActionPerformed(java.awt.event.ActionEvent evt) {
        double x= Double.parseDouble(jTFX.getText());
        int coef;
        double value=0.0;
        for(int i=0; i<jTablePolynomial.getColumnCount();i++){
            coef=Integer.parseInt(String.valueOf(jTablePolynomial.getValueAt(0, i)));
            value+=coef*Math.pow(x,i);
        }
        DecimalFormat df = new DecimalFormat("#.####");
        value = Double.valueOf(df.format(value));

        jTFOutputValue.setText(String.valueOf(value));
    }

    private void Button_ShowFactorizedPolActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void Button_OK_DegreeActionPerformed(java.awt.event.ActionEvent evt) {
        int cols=Integer.parseInt(jTextField_Degree.getText());
        jTablePolynomial.setModel(new DefaultTableModel(1,cols+1));
        for(int i=0;i<jTablePolynomial.getColumnCount();i++)
        {
            TableColumn column1 = jTablePolynomial.getTableHeader().getColumnModel().getColumn(i);
            column1.setHeaderValue("A"+i);
        }
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LLLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LLLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LLLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LLLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LLLForm().setVisible(true);
            }
        });
    }

    private javax.swing.JButton Button_OK_Degree;
    private javax.swing.JButton Button_ShowFactorizedPol;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonClearF;
    private javax.swing.JButton jButtonLLLalgorithm;
    private javax.swing.JButton jButtonShowValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelErroText;
    private javax.swing.JPanel jPanelBasisReduction;
    private javax.swing.JPanel jPanelFactorization;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneBasis;
    private javax.swing.JScrollPane jScrollPaneReducedBasis;
    private javax.swing.JTextField jTFColumns;
    private javax.swing.JTextField jTFOutputValue;
    private javax.swing.JTextField jTFRows;
    private javax.swing.JTextField jTFX;
    private javax.swing.JTabbedPane jTabbedPaneLLL;
    private javax.swing.JTable jTableBasis;
    private javax.swing.JTable jTablePolynomial;
    private javax.swing.JTable jTableReducedBasis;
    private javax.swing.JTextField jTextFieldFactorizationOutput;
    private javax.swing.JTextField jTextFieldTotalTime;
    private javax.swing.JTextField jTextField_Degree;

}

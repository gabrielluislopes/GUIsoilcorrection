/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

/**
 *
 * @author gabri
 */
public class CorrecaoPotassio extends javax.swing.JFrame {

    /**
     * Creates new form CorrecaoPotassio
     */
    public CorrecaoPotassio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtTitulo = new javax.swing.JLabel();
        rtParticipacaoAtual = new javax.swing.JLabel();
        cxParticipacaoAtual = new javax.swing.JTextField();
        rtUnidadeParticipacaoAtual = new javax.swing.JLabel();
        rtParticipacaoDesejada = new javax.swing.JLabel();
        cxParticipacaoDesejada = new javax.swing.JTextField();
        rtUnidadeParticipacaodesejada = new javax.swing.JLabel();
        rtParticipacaoCorrecao = new javax.swing.JLabel();
        cxParticipacaoCorrecao = new javax.swing.JTextField();
        rtUnidadeParticipacaoCorrecao = new javax.swing.JLabel();
        rtParticipacaoIdeal = new javax.swing.JLabel();
        cxParticipacaoIdeal = new javax.swing.JTextField();
        rtUnidadeParticipacaoIdeal = new javax.swing.JLabel();
        rtFontePotassio = new javax.swing.JLabel();
        cbFontePotassio = new javax.swing.JComboBox<>();
        rtQuantidadeAplicar = new javax.swing.JLabel();
        cxQuantidadeAplicar = new javax.swing.JTextField();
        rtUnidadeQuantidadeAplicar = new javax.swing.JLabel();
        rtCusto = new javax.swing.JLabel();
        cxCusto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Correção Potássio");
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        rtTitulo.setForeground(new java.awt.Color(0, 0, 0));
        rtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rtTitulo.setText("Correção Potássio");
        rtTitulo.setPreferredSize(new java.awt.Dimension(450, 100));
        getContentPane().add(rtTitulo);
        rtTitulo.setBounds(287, 60, 450, 100);

        rtParticipacaoAtual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtParticipacaoAtual.setForeground(new java.awt.Color(0, 0, 0));
        rtParticipacaoAtual.setText("Participação atual do POTÁSSIO na CTC do solo: ");
        getContentPane().add(rtParticipacaoAtual);
        rtParticipacaoAtual.setBounds(190, 223, 389, 25);

        cxParticipacaoAtual.setEditable(false);
        cxParticipacaoAtual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxParticipacaoAtual.setForeground(new java.awt.Color(0, 0, 0));
        cxParticipacaoAtual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxParticipacaoAtual);
        cxParticipacaoAtual.setBounds(609, 220, 150, 30);

        rtUnidadeParticipacaoAtual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtUnidadeParticipacaoAtual.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadeParticipacaoAtual.setText("%");
        getContentPane().add(rtUnidadeParticipacaoAtual);
        rtUnidadeParticipacaoAtual.setBounds(777, 223, 15, 25);

        rtParticipacaoDesejada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtParticipacaoDesejada.setForeground(new java.awt.Color(0, 0, 0));
        rtParticipacaoDesejada.setText("Participação do POTÁSSIO na CTC, desejada: ");
        getContentPane().add(rtParticipacaoDesejada);
        rtParticipacaoDesejada.setBounds(190, 271, 359, 25);

        cxParticipacaoDesejada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxParticipacaoDesejada.setForeground(new java.awt.Color(0, 0, 0));
        cxParticipacaoDesejada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxParticipacaoDesejada);
        cxParticipacaoDesejada.setBounds(609, 268, 150, 30);

        rtUnidadeParticipacaodesejada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtUnidadeParticipacaodesejada.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadeParticipacaodesejada.setText("%");
        getContentPane().add(rtUnidadeParticipacaodesejada);
        rtUnidadeParticipacaodesejada.setBounds(777, 271, 15, 25);

        rtParticipacaoCorrecao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtParticipacaoCorrecao.setForeground(new java.awt.Color(0, 0, 0));
        rtParticipacaoCorrecao.setText("Participação do POTÁSSIO na CTC, após correção: ");
        getContentPane().add(rtParticipacaoCorrecao);
        rtParticipacaoCorrecao.setBounds(190, 319, 401, 25);

        cxParticipacaoCorrecao.setEditable(false);
        cxParticipacaoCorrecao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxParticipacaoCorrecao.setForeground(new java.awt.Color(0, 0, 0));
        cxParticipacaoCorrecao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxParticipacaoCorrecao);
        cxParticipacaoCorrecao.setBounds(609, 316, 150, 30);

        rtUnidadeParticipacaoCorrecao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtUnidadeParticipacaoCorrecao.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadeParticipacaoCorrecao.setText("%");
        getContentPane().add(rtUnidadeParticipacaoCorrecao);
        rtUnidadeParticipacaoCorrecao.setBounds(777, 319, 15, 25);

        rtParticipacaoIdeal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtParticipacaoIdeal.setForeground(new java.awt.Color(0, 0, 0));
        rtParticipacaoIdeal.setText("Participação ideal do POTÁSSIO na CTC: ");
        getContentPane().add(rtParticipacaoIdeal);
        rtParticipacaoIdeal.setBounds(190, 367, 322, 25);

        cxParticipacaoIdeal.setEditable(false);
        cxParticipacaoIdeal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cxParticipacaoIdeal.setForeground(new java.awt.Color(0, 0, 0));
        cxParticipacaoIdeal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cxParticipacaoIdeal.setText("3,0");
        getContentPane().add(cxParticipacaoIdeal);
        cxParticipacaoIdeal.setBounds(609, 364, 150, 30);

        rtUnidadeParticipacaoIdeal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtUnidadeParticipacaoIdeal.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadeParticipacaoIdeal.setText("%");
        getContentPane().add(rtUnidadeParticipacaoIdeal);
        rtUnidadeParticipacaoIdeal.setBounds(777, 367, 15, 25);

        rtFontePotassio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtFontePotassio.setForeground(new java.awt.Color(0, 0, 0));
        rtFontePotassio.setText("Fonte de POTÁSSIO a usar: ");
        getContentPane().add(rtFontePotassio);
        rtFontePotassio.setBounds(190, 415, 220, 25);

        cbFontePotassio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbFontePotassio.setForeground(new java.awt.Color(0, 0, 0));
        cbFontePotassio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cloreto de Potássio", "Sulfato de Potássio", "Sulfato Potássio/Magnésio" }));
        getContentPane().add(cbFontePotassio);
        cbFontePotassio.setBounds(509, 412, 250, 30);

        rtQuantidadeAplicar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtQuantidadeAplicar.setForeground(new java.awt.Color(0, 0, 0));
        rtQuantidadeAplicar.setText("Quantidade a aplicar:");
        getContentPane().add(rtQuantidadeAplicar);
        rtQuantidadeAplicar.setBounds(190, 463, 167, 25);

        cxQuantidadeAplicar.setEditable(false);
        cxQuantidadeAplicar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxQuantidadeAplicar.setForeground(new java.awt.Color(0, 0, 0));
        cxQuantidadeAplicar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxQuantidadeAplicar);
        cxQuantidadeAplicar.setBounds(609, 460, 150, 30);

        rtUnidadeQuantidadeAplicar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtUnidadeQuantidadeAplicar.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadeQuantidadeAplicar.setText("kg/hectare");
        getContentPane().add(rtUnidadeQuantidadeAplicar);
        rtUnidadeQuantidadeAplicar.setBounds(780, 460, 84, 25);

        rtCusto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtCusto.setForeground(new java.awt.Color(0, 0, 0));
        rtCusto.setText("Custo - R$/ha");
        getContentPane().add(rtCusto);
        rtCusto.setBounds(190, 511, 110, 25);

        cxCusto.setEditable(false);
        cxCusto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxCusto.setForeground(new java.awt.Color(0, 0, 0));
        cxCusto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxCusto);
        cxCusto.setBounds(609, 508, 150, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\gabri\\OneDrive\\Documentos\\UTFPR\\2021 - semestre 2\\Arquitetura de Software\\GUIsoilcorrection\\GUIsoilcorrection\\src\\main\\java\\gui\\imagens\\fundo3.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1080, 770);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CorrecaoPotassio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CorrecaoPotassio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CorrecaoPotassio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CorrecaoPotassio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CorrecaoPotassio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbFontePotassio;
    private javax.swing.JTextField cxCusto;
    private javax.swing.JTextField cxParticipacaoAtual;
    private javax.swing.JTextField cxParticipacaoCorrecao;
    private javax.swing.JTextField cxParticipacaoDesejada;
    private javax.swing.JTextField cxParticipacaoIdeal;
    private javax.swing.JTextField cxQuantidadeAplicar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel rtCusto;
    private javax.swing.JLabel rtFontePotassio;
    private javax.swing.JLabel rtParticipacaoAtual;
    private javax.swing.JLabel rtParticipacaoCorrecao;
    private javax.swing.JLabel rtParticipacaoDesejada;
    private javax.swing.JLabel rtParticipacaoIdeal;
    private javax.swing.JLabel rtQuantidadeAplicar;
    private javax.swing.JLabel rtTitulo;
    private javax.swing.JLabel rtUnidadeParticipacaoAtual;
    private javax.swing.JLabel rtUnidadeParticipacaoCorrecao;
    private javax.swing.JLabel rtUnidadeParticipacaoIdeal;
    private javax.swing.JLabel rtUnidadeParticipacaodesejada;
    private javax.swing.JLabel rtUnidadeQuantidadeAplicar;
    // End of variables declaration//GEN-END:variables
}

package morinigo_ignacio_tpo1.Logica;

public class Main extends javax.swing.JFrame {
    // Vectores para guardar la informacion
    String[] name      = new String[10];
    String[] lastname  = new String[10];
    String[] phone     = new String[10];
    String[] address   = new String[10];
    String[] document  = new String[10];
    String[] birthDate = new String[10];
    int indiceCount    = 0; // Indice para mostrar la posicion
    
    public Main() {
        initComponents();
        indiceInput.setText(Integer.toString(indiceCount + 1)); // Incremento en 1 para que no empiece en 0, sin modificarlo para los arreglos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dniInput = new javax.swing.JTextField();
        telefonoInput = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        fNacimientoLabel = new javax.swing.JLabel();
        indiceLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nombreInput = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JButton();
        indiceInput = new javax.swing.JTextField();
        siguienteBtn = new javax.swing.JButton();
        anteriorBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        apellidoLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        direccionLabel = new javax.swing.JLabel();
        apellidoInput = new javax.swing.JTextField();
        docLabel = new javax.swing.JLabel();
        direccionInput = new javax.swing.JTextField();
        telefonoLabel = new javax.swing.JLabel();
        fNacimientoInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fNacimientoLabel.setText("F. Nac.:");

        indiceLabel.setText("Indice:");

        nameLabel.setText("Nombre:");

        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        indiceInput.setEditable(false);

        siguienteBtn.setText(">>");
        siguienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteBtnActionPerformed(evt);
            }
        });

        anteriorBtn.setText("<<");
        anteriorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(40, 54, 181));
        jLabel12.setText("Agenda Electrónica");

        apellidoLabel.setText("Apellido:");

        direccionLabel.setText("Dirección:");

        docLabel.setText("DNI:");

        telefonoLabel.setText("Teléfono:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nameLabel)
                                .addComponent(docLabel)
                                .addComponent(apellidoLabel))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(dniInput, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52)
                                    .addComponent(direccionLabel))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(telefonoLabel))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(apellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fNacimientoLabel)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fNacimientoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telefonoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(direccionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 21, Short.MAX_VALUE))
                        .addComponent(jSeparator3)
                        .addComponent(jSeparator4)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(indiceLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(indiceInput))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(anteriorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(guardarBtn)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(siguienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(197, 197, 197))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(174, 174, 174)))))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dniInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(docLabel)
                        .addComponent(direccionLabel)
                        .addComponent(direccionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameLabel)
                        .addComponent(telefonoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefonoLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(apellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apellidoLabel)
                        .addComponent(fNacimientoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fNacimientoLabel))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(guardarBtn)
                        .addComponent(siguienteBtn)
                        .addComponent(anteriorBtn))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(indiceLabel)
                        .addComponent(indiceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteBtnActionPerformed
        indiceCount++; // Incremento para mostrar los siguientes datos
        if(indiceCount < 10){ // Pregunto si no desbobrda la cantidad de elementos definidos, 10
            // Muestro en los input la informacion de los arreglos correspondiente a la posicion dada por el indice
            dniInput.setText(document[indiceCount]);
            nombreInput.setText(name[indiceCount]);
            apellidoInput.setText(lastname[indiceCount]);
            direccionInput.setText(address[indiceCount]);
            telefonoInput.setText(phone[indiceCount]);
            fNacimientoInput.setText(birthDate[indiceCount]);
            
            indiceInput.setText(Integer.toString(indiceCount + 1)); // Muestro el indice incrementado sumandole 1 para la correccion sin modificarlo
        }
        else{
            indiceCount--; // si es 10 decremento a 9 para evitar desvordamiento posterior
        }
    }//GEN-LAST:event_siguienteBtnActionPerformed

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        // Guardo la informacion en la posicion que indica el indice
        document[indiceCount]  = dniInput.getText();
        name[indiceCount]      = nombreInput.getText();
        lastname[indiceCount]  = apellidoInput.getText();
        address[indiceCount]   = direccionInput.getText();
        phone[indiceCount]     = telefonoInput.getText();
        birthDate[indiceCount] = fNacimientoInput.getText();
        
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void anteriorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorBtnActionPerformed
        indiceCount--; // Decremento para mostrar los datos anteriores
        if(indiceCount >= 0){ // Pregunto si no desborda el primer elemento, 0
            // Muestro en los input la informacion de los arreglos correspondiente a la posicion dada por el indice
            dniInput.setText(document[indiceCount]);
            nombreInput.setText(name[indiceCount]);
            apellidoInput.setText(lastname[indiceCount]);
            direccionInput.setText(address[indiceCount]);
            telefonoInput.setText(phone[indiceCount]);
            fNacimientoInput.setText(birthDate[indiceCount]);
            
            indiceInput.setText(Integer.toString(indiceCount + 1)); // Muestro el indice decrementado sumandole 1 para la correccion sin modificarlo
        }
        else{
            indiceCount++; // si es -1 incremento a 0 para evitar desvordamiento posterior
        }
    }//GEN-LAST:event_anteriorBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anteriorBtn;
    private javax.swing.JTextField apellidoInput;
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JTextField direccionInput;
    private javax.swing.JLabel direccionLabel;
    private javax.swing.JTextField dniInput;
    private javax.swing.JLabel docLabel;
    private javax.swing.JTextField fNacimientoInput;
    private javax.swing.JLabel fNacimientoLabel;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JTextField indiceInput;
    private javax.swing.JLabel indiceLabel;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nombreInput;
    private javax.swing.JButton siguienteBtn;
    private javax.swing.JTextField telefonoInput;
    private javax.swing.JLabel telefonoLabel;
    // End of variables declaration//GEN-END:variables
}
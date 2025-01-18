/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MovieBooking.view;

import com.MovieBooking.model.MovieModel;
import com.MovieBooking.util.validationUtil;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.MovieBooking.controller.algorithms.SelectionSort;
import com.MovieBooking.controller.algorithms.InsertionSort;
import com.MovieBooking.controller.algorithms.MergeSort;
import com.MovieBooking.controller.algorithms.BinarySearch;


/**
 *
 * @author Dechen
 */
public class MovieBooking extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private LinkedList<MovieModel> movieList; 
    private java.awt.CardLayout cardLayout;
    private final Color errorColor = new Color(255, 0, 0); // Red for errors
    private final Color yellowColor = new Color(255, 255, 0); // Yellow for highlighting
    private final SelectionSort selectionsort;
    private final InsertionSort insertionSort;
    private final MergeSort mergeSort;
    
    
    /**
    * Constructor for NewJFrame class.
    * Initializes the components and layout of the JFrame, and sets up initial data and sorting algorithms.
    * Also initializes the movieList and other necessary variables.
    */
    public MovieBooking() {
        initComponents();
        initializeLayout();
        movieList = new LinkedList<>();  
        initialData();  
        startProgress();
        selectionsort = new SelectionSort();
        insertionSort = new InsertionSort();
        mergeSort = new MergeSort();
    }
    
    /**
     * Displays a dialog box with a given message, title, and message type.
     * @param message the message to be displayed in the dialog box
     * @param title the title of the dialog box
     * @param messageType the type of message to be displayed (e.g., ERROR_MESSAGE, INFORMATION_MESSAGE)
     */
    private void showDialogBox(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(this, message, title, messageType);
    }

    /**
    * Displays the screen specified by the screen name using CardLayout.
    * @param screenName the name of the screen to display
    */
    private void loadScreen(String screenName) {
        cardLayout.show(getContentPane(), screenName);
    }

    /**
    * Initializes the layout for the JFrame using CardLayout.
    * Adds different panels to the content pane and sets the initial screen to the loading screen.
    */
    private void initializeLayout() {
        cardLayout = new java.awt.CardLayout();
        getContentPane().setLayout(cardLayout);

        getContentPane().add(loadingscreenpnl, "LoadingScreen");
        getContentPane().add(loginscreenpnl, "LoginScreen");
        getContentPane().add(mainscreenpnl, "MainScreen");
        
        loadScreen("LoadingScreen");
    }
    
    /**
     * Initializes the movie list with sample data and loads it into the table.
     * Adds movie details such as booking ID, name, email, contact, movie title, 
     * showtime, seat number, and date to the movie list.
     */
    private void initialData() {
        movieList = new LinkedList<>();
        movieList.add(new MovieModel(1234567, "Dawa Balami", "Dawa@gmail.com", "9862737491", "Inside Out", "1:30 PM", "A1", "Sunday"));
        movieList.add(new MovieModel(5678912, "Mary Lama", "mary@gmail.com", "9860097032", "Zootopia", "1:30 PM", "A3", "Sunday"));
        movieList.add(new MovieModel(7643864, "Aarya Poudel", "aarya@gmail.com", "9803464891", "Zootopia", "3:30 PM", "A2", "Monday"));
        movieList.add(new MovieModel(5396510, "Paras Adhikari", "paras@gmail.com", "9898467283", "Inside Out", "3:30 PM", "A4", "Sunday"));
        movieList.add(new MovieModel(9631045, "Umanga Amatya", "umanga@gmail.com", "9836274896", "Inside Out", "1:30 PM", "A5", "Monday"));
        loadListToTable(movieList);
    }

    
    
     /**
     * Starts a background task to simulate a loading progress.
     * This method uses SwingWorker to update the progress bar while 
     * simulating a delay, and switches to the login screen once the progress reaches 100%.
     */
    private void startProgress() {
        javax.swing.SwingWorker<Void, Integer> worker = new javax.swing.SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(30); 
                    publish(i); 
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                int progress = chunks.get(chunks.size() - 1);
                loadingbarpg.setValue(progress);
            }

            @Override
            protected void done() {
                loadScreen("LoginScreen"); 
            }
        };
        worker.execute(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginscreenpnl = new javax.swing.JPanel();
        usernametxtFld = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        errorlbl = new javax.swing.JLabel();
        passwordFld = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        mainscreenpnl = new javax.swing.JPanel();
        JTP = new javax.swing.JTabbedPane();
        JPNLhome = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        JPNLSchedule = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JPNLbooking = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        movietbl = new javax.swing.JTable();
        clearbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        nameerrorlbl = new javax.swing.JLabel();
        iderrorlbl = new javax.swing.JLabel();
        contacterrorlbl = new javax.swing.JLabel();
        emailerrorlbl = new javax.swing.JLabel();
        movieerrorlbl = new javax.swing.JLabel();
        timeerrorlbl = new javax.swing.JLabel();
        seaterrorlbl = new javax.swing.JLabel();
        dateerrorlbl = new javax.swing.JLabel();
        timetxtfld = new javax.swing.JTextField();
        deletebtn1 = new javax.swing.JButton();
        idtxtfld = new javax.swing.JTextField();
        contacttxtfld = new javax.swing.JTextField();
        btnsortseatascending = new javax.swing.JButton();
        btnsortseatdescending = new javax.swing.JButton();
        btnsortiddescending = new javax.swing.JButton();
        btnsortidascending = new javax.swing.JButton();
        btnsortnamedescending = new javax.swing.JButton();
        btnsortnameacsending = new javax.swing.JButton();
        searchbutton = new javax.swing.JButton();
        nametxtfld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        searchtxtfld = new javax.swing.JTextField();
        emailtxtfld = new javax.swing.JTextField();
        seattxtfld = new javax.swing.JTextField();
        movietxtfld = new javax.swing.JTextField();
        datetxtfld = new javax.swing.JTextField();
        resetbtn = new javax.swing.JButton();
        JPNLcontactus = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        PNLmap = new javax.swing.JPanel();
        LBLmap = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        JPNLlogo1 = new javax.swing.JPanel();
        JLBLlogo1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        logoutbtn1 = new javax.swing.JButton();
        loadingscreenpnl = new javax.swing.JPanel();
        loadingbarpg = new javax.swing.JProgressBar();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        loginscreenpnl.setBackground(new java.awt.Color(204, 177, 139));

        usernametxtFld.setText("admin");

        jLabel15.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 51, 0));
        jLabel15.setText("Username :");

        jLabel16.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 51, 0));
        jLabel16.setText("Password");

        loginbtn.setBackground(new java.awt.Color(102, 51, 0));
        loginbtn.setFont(new java.awt.Font("Al Bayan", 1, 14)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Login");
        loginbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Al Bayan", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 51, 0));
        jLabel18.setText("Sign in To Take Your Seat");

        passwordFld.setText("admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/cineworld(1).jpg"))); // NOI18N

        javax.swing.GroupLayout loginscreenpnlLayout = new javax.swing.GroupLayout(loginscreenpnl);
        loginscreenpnl.setLayout(loginscreenpnlLayout);
        loginscreenpnlLayout.setHorizontalGroup(
            loginscreenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginscreenpnlLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addGroup(loginscreenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginscreenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginscreenpnlLayout.createSequentialGroup()
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(272, 272, 272))
                        .addGroup(loginscreenpnlLayout.createSequentialGroup()
                            .addGroup(loginscreenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(usernametxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)
                                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginscreenpnlLayout.createSequentialGroup()
                        .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(418, 418, 418))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginscreenpnlLayout.createSequentialGroup()
                        .addComponent(errorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))))
        );
        loginscreenpnlLayout.setVerticalGroup(
            loginscreenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginscreenpnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(errorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernametxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel16)
                .addGap(13, 13, 13)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
        );

        mainscreenpnl.setBackground(new java.awt.Color(255, 255, 255));

        JTP.setBackground(new java.awt.Color(255, 255, 204));
        JTP.setForeground(new java.awt.Color(153, 0, 0));

        JPNLhome.setBackground(new java.awt.Color(204, 177, 139));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/homealoneposter(1).jpg"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 177, 139));
        jLabel23.setText("Home Alone");

        jLabel32.setFont(new java.awt.Font("Al Bayan", 1, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 0, 0));
        jLabel32.setText("2 Hours 35 Mins");

        jLabel44.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(153, 0, 0));
        jLabel44.setText("Comedy, Drama");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel32))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/harrypotter(1).jpg"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 177, 139));
        jLabel24.setText("Harry Potter");

        jLabel33.setFont(new java.awt.Font("Al Bayan", 1, 10)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 0, 0));
        jLabel33.setText("2 Hours 35 Mins");

        jLabel46.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(153, 0, 0));
        jLabel46.setText("Mystery, Thriller");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel33)
                    .addComponent(jLabel24)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/zootopia(1).jpg"))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 177, 139));
        jLabel29.setText("Zootopia");

        jLabel43.setFont(new java.awt.Font("Al Bayan", 1, 10)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(153, 0, 0));
        jLabel43.setText("1 Hours 50 Mins");

        jLabel51.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(153, 0, 0));
        jLabel51.setText("Comedy, Animation");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(jLabel29)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 204));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/howtoloseaguy(1).jpg"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 177, 139));
        jLabel27.setText("How to lose a guy in 10 days");

        jLabel41.setFont(new java.awt.Font("Al Bayan", 1, 10)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(153, 0, 0));
        jLabel41.setText("2 Hours 46 Mins");

        jLabel49.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(153, 0, 0));
        jLabel49.setText("Romance, Comedy");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel49))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 204));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/spiderman-into-the-spiderverse-md-web(1).jpg"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 177, 139));
        jLabel25.setText("Spider-Man: Into The Verse");

        jLabel34.setFont(new java.awt.Font("Al Bayan", 1, 10)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 0, 0));
        jLabel34.setText("2 Hours 45 Mins");

        jLabel47.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(153, 0, 0));
        jLabel47.setText("Action, Comedy");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel34))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 204));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/hungergameposter(1).jpg"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 177, 139));
        jLabel26.setText("Hunger Games");

        jLabel35.setFont(new java.awt.Font("Al Bayan", 1, 10)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 0, 0));
        jLabel35.setText("2 Hours 20 Mins");

        jLabel48.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(153, 0, 0));
        jLabel48.setText("Mystery, Thriller");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 204));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/insideout.jpg"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 177, 139));
        jLabel28.setText("Inside Out");

        jLabel42.setFont(new java.awt.Font("Al Bayan", 1, 10)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(153, 0, 0));
        jLabel42.setText("1 Hours 35 Mins");

        jLabel50.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(153, 0, 0));
        jLabel50.setText("Advrenture, Animation");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel30.setFont(new java.awt.Font("Al Bayan", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 0, 0));
        jLabel30.setText("Coming Soon");

        jLabel31.setFont(new java.awt.Font("Al Bayan", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 0, 0));
        jLabel31.setText("Now Showing");

        javax.swing.GroupLayout JPNLhomeLayout = new javax.swing.GroupLayout(JPNLhome);
        JPNLhome.setLayout(JPNLhomeLayout);
        JPNLhomeLayout.setHorizontalGroup(
            JPNLhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNLhomeLayout.createSequentialGroup()
                .addContainerGap(355, Short.MAX_VALUE)
                .addGroup(JPNLhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNLhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNLhomeLayout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPNLhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPNLhomeLayout.createSequentialGroup()
                                    .addGap(314, 314, 314)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(JPNLhomeLayout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(315, 315, 315)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(329, 329, 329))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNLhomeLayout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addGap(701, 701, 701))
                        .addGroup(JPNLhomeLayout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(59, 59, 59)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNLhomeLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(706, 706, 706))))
        );
        JPNLhomeLayout.setVerticalGroup(
            JPNLhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNLhomeLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNLhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPNLhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        JTP.addTab("Home", JPNLhome);

        JPNLSchedule.setBackground(new java.awt.Color(204, 177, 139));

        jLabel36.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 51, 0));
        jLabel36.setText("How To Lose A Guy In 10 Days");

        jLabel37.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 51, 0));
        jLabel37.setText("Inside Out");

        jLabel38.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 51, 0));
        jLabel38.setText("Zootopia");

        jPanel12.setPreferredSize(new java.awt.Dimension(111, 151));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/howtoloseaguy(1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.setPreferredSize(new java.awt.Dimension(111, 151));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/insideout.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel14.setPreferredSize(new java.awt.Dimension(111, 151));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/zootopia(1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setPreferredSize(new java.awt.Dimension(267, 125));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/howtoloseaguyabout(1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setPreferredSize(new java.awt.Dimension(267, 125));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/insideoutabout(1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setPreferredSize(new java.awt.Dimension(267, 125));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/zootopiaabout(1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPNLScheduleLayout = new javax.swing.GroupLayout(JPNLSchedule);
        JPNLSchedule.setLayout(JPNLScheduleLayout);
        JPNLScheduleLayout.setHorizontalGroup(
            JPNLScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNLScheduleLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPNLScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNLScheduleLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPNLScheduleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPNLScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPNLScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        JPNLScheduleLayout.setVerticalGroup(
            JPNLScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNLScheduleLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(JPNLScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNLScheduleLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPNLScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(JPNLScheduleLayout.createSequentialGroup()
                            .addComponent(jLabel37)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPNLScheduleLayout.createSequentialGroup()
                            .addComponent(jLabel38)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTP.addTab("Schedule", JPNLSchedule);

        JPNLbooking.setBackground(new java.awt.Color(204, 177, 139));
        JPNLbooking.setForeground(new java.awt.Color(255, 255, 255));

        movietbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name ", "Booking ID", "Email", " Contact", "Movie ", "Show Time", "Seat Number", "Date"
            }
        ));
        jScrollPane2.setViewportView(movietbl);

        clearbtn.setBackground(new java.awt.Color(204, 177, 139));
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("Clear");
        clearbtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(204, 177, 139));
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(204, 177, 139));
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        timetxtfld.setBackground(new java.awt.Color(204, 177, 139));
        timetxtfld.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        deletebtn1.setBackground(new java.awt.Color(204, 177, 139));
        deletebtn1.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn1.setText("Delete");
        deletebtn1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        deletebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtn1ActionPerformed(evt);
            }
        });

        idtxtfld.setBackground(new java.awt.Color(204, 177, 139));
        idtxtfld.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Booking ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        contacttxtfld.setBackground(new java.awt.Color(204, 177, 139));
        contacttxtfld.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnsortseatascending.setBackground(new java.awt.Color(204, 177, 139));
        btnsortseatascending.setForeground(new java.awt.Color(255, 255, 255));
        btnsortseatascending.setText("Sort By SeatA");
        btnsortseatascending.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        btnsortseatascending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortseatascendingActionPerformed(evt);
            }
        });

        btnsortseatdescending.setBackground(new java.awt.Color(204, 177, 139));
        btnsortseatdescending.setForeground(new java.awt.Color(255, 255, 255));
        btnsortseatdescending.setText("Sort By SeatD");
        btnsortseatdescending.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        btnsortseatdescending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortseatdescendingActionPerformed(evt);
            }
        });

        btnsortiddescending.setBackground(new java.awt.Color(204, 177, 139));
        btnsortiddescending.setForeground(new java.awt.Color(255, 255, 255));
        btnsortiddescending.setText("Sort By IDD");
        btnsortiddescending.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        btnsortiddescending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortiddescendingActionPerformed(evt);
            }
        });

        btnsortidascending.setBackground(new java.awt.Color(204, 177, 139));
        btnsortidascending.setForeground(new java.awt.Color(255, 255, 255));
        btnsortidascending.setText("Sort By IDA");
        btnsortidascending.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        btnsortidascending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortidascendingActionPerformed(evt);
            }
        });

        btnsortnamedescending.setBackground(new java.awt.Color(204, 177, 139));
        btnsortnamedescending.setForeground(new java.awt.Color(255, 255, 255));
        btnsortnamedescending.setText("Sort By NameD");
        btnsortnamedescending.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        btnsortnamedescending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortnamedescendingActionPerformed(evt);
            }
        });

        btnsortnameacsending.setBackground(new java.awt.Color(204, 177, 139));
        btnsortnameacsending.setForeground(new java.awt.Color(255, 255, 255));
        btnsortnameacsending.setText("Sort By NameA");
        btnsortnameacsending.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnsortnameacsending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortnameacsendingActionPerformed(evt);
            }
        });

        searchbutton.setText("Search ");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });

        nametxtfld.setBackground(new java.awt.Color(204, 177, 139));
        nametxtfld.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Al Bayan", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Booking Information");

        searchtxtfld.setBackground(new java.awt.Color(204, 177, 139));
        searchtxtfld.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        emailtxtfld.setBackground(new java.awt.Color(204, 177, 139));
        emailtxtfld.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        seattxtfld.setBackground(new java.awt.Color(204, 177, 139));
        seattxtfld.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        movietxtfld.setBackground(new java.awt.Color(204, 177, 139));
        movietxtfld.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        datetxtfld.setBackground(new java.awt.Color(204, 177, 139));
        datetxtfld.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPNLbookingLayout = new javax.swing.GroupLayout(JPNLbooking);
        JPNLbooking.setLayout(JPNLbookingLayout);
        JPNLbookingLayout.setHorizontalGroup(
            JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNLbookingLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(JPNLbookingLayout.createSequentialGroup()
                            .addComponent(searchtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsortnameacsending)
                            .addGap(18, 18, 18)
                            .addComponent(btnsortnamedescending)
                            .addGap(18, 18, 18)
                            .addComponent(btnsortidascending)
                            .addGap(7, 7, 7)
                            .addComponent(btnsortiddescending)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnsortseatascending)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnsortseatdescending))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNLbookingLayout.createSequentialGroup()
                .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNLbookingLayout.createSequentialGroup()
                        .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPNLbookingLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(movietxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nametxtfld, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(movieerrorlbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(JPNLbookingLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(nameerrorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPNLbookingLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(timetxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(iderrorlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(idtxtfld, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                            .addGroup(JPNLbookingLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(timeerrorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPNLbookingLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seattxtfld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contacttxtfld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))
                            .addGroup(JPNLbookingLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(contacterrorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seaterrorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE))))
                    .addGroup(JPNLbookingLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNLbookingLayout.createSequentialGroup()
                        .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPNLbookingLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(emailerrorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPNLbookingLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPNLbookingLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(emailtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNLbookingLayout.createSequentialGroup()
                                        .addComponent(deletebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))
                                    .addComponent(datetxtfld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNLbookingLayout.createSequentialGroup()
                        .addComponent(dateerrorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))))
        );
        JPNLbookingLayout.setVerticalGroup(
            JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNLbookingLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsortseatascending)
                        .addComponent(btnsortseatdescending)
                        .addComponent(btnsortiddescending)
                        .addComponent(btnsortidascending)
                        .addComponent(btnsortnamedescending)
                        .addComponent(btnsortnameacsending)
                        .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNLbookingLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailerrorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(JPNLbookingLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idtxtfld)
                            .addComponent(contacttxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nametxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contacterrorlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(iderrorlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameerrorlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timetxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seattxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movietxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datetxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateerrorlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(movieerrorlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addComponent(timeerrorlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addComponent(seaterrorlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(JPNLbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        JTP.addTab("Booking", JPNLbooking);

        JPNLcontactus.setBackground(new java.awt.Color(204, 177, 139));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PNLmap.setPreferredSize(new java.awt.Dimension(1175, 206));

        LBLmap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/map (1).jpg"))); // NOI18N

        javax.swing.GroupLayout PNLmapLayout = new javax.swing.GroupLayout(PNLmap);
        PNLmap.setLayout(PNLmapLayout);
        PNLmapLayout.setHorizontalGroup(
            PNLmapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LBLmap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PNLmapLayout.setVerticalGroup(
            PNLmapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LBLmap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Al Bayan", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GET IN TOUCH ");

        jLabel52.setFont(new java.awt.Font("Al Bayan", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("We are located at the heart of kathmandu, enjoy our time with us!");

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("______________________________________________________________");

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("_______________________________________________________________________________________________________________________________________________________________________________________");

        jLabel55.setFont(new java.awt.Font("Al Bayan", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(153, 0, 0));
        jLabel55.setText("We would be pleased to hear from you!");

        jLabel56.setFont(new java.awt.Font("Al Bayan", 1, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("DIRECT CONTACT");

        jLabel57.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Address");

        jLabel58.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(153, 0, 0));
        jLabel58.setText("KamalPokhari, Kathmandu");

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Tel");

        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Mail");

        jLabel61.setForeground(new java.awt.Color(204, 0, 0));
        jLabel61.setText("+977 9860098765");

        jLabel62.setForeground(new java.awt.Color(204, 0, 0));
        jLabel62.setText("Cineworldnepal@gmail.com");

        javax.swing.GroupLayout JPNLcontactusLayout = new javax.swing.GroupLayout(JPNLcontactus);
        JPNLcontactus.setLayout(JPNLcontactusLayout);
        JPNLcontactusLayout.setHorizontalGroup(
            JPNLcontactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNLcontactusLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(JPNLcontactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNLcontactusLayout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 1339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(130, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNLcontactusLayout.createSequentialGroup()
                        .addGroup(JPNLcontactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel53)
                            .addGroup(JPNLcontactusLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel55)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PNLmap, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(JPNLcontactusLayout.createSequentialGroup()
                        .addGroup(JPNLcontactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel57)
                            .addComponent(jLabel56)
                            .addGroup(JPNLcontactusLayout.createSequentialGroup()
                                .addGroup(JPNLcontactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel60))
                                .addGap(18, 18, 18)
                                .addGroup(JPNLcontactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel61)
                                    .addComponent(jLabel62))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        JPNLcontactusLayout.setVerticalGroup(
            JPNLcontactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNLcontactusLayout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNLcontactusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPNLcontactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNLcontactusLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PNLmap, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel54)
                .addGap(62, 62, 62)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPNLcontactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPNLcontactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel62))
                .addGap(71, 71, 71))
        );

        JTP.addTab("Contact Us", JPNLcontactus);

        javax.swing.GroupLayout JPNLlogo1Layout = new javax.swing.GroupLayout(JPNLlogo1);
        JPNLlogo1.setLayout(JPNLlogo1Layout);
        JPNLlogo1Layout.setHorizontalGroup(
            JPNLlogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLBLlogo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPNLlogo1Layout.setVerticalGroup(
            JPNLlogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLBLlogo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/cineworldlogo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        logoutbtn1.setText("Logout");
        logoutbtn1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        logoutbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainscreenpnlLayout = new javax.swing.GroupLayout(mainscreenpnl);
        mainscreenpnl.setLayout(mainscreenpnlLayout);
        mainscreenpnlLayout.setHorizontalGroup(
            mainscreenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainscreenpnlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JPNLlogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainscreenpnlLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
            .addComponent(JTP, javax.swing.GroupLayout.DEFAULT_SIZE, 1588, Short.MAX_VALUE)
        );
        mainscreenpnlLayout.setVerticalGroup(
            mainscreenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainscreenpnlLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(mainscreenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainscreenpnlLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainscreenpnlLayout.createSequentialGroup()
                        .addComponent(logoutbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addComponent(JPNLlogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTP, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loadingscreenpnl.setBackground(new java.awt.Color(255, 255, 255));

        loadingbarpg.setBackground(new java.awt.Color(153, 0, 51));

        jLabel17.setBackground(new java.awt.Color(153, 0, 0));
        jLabel17.setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("Every Great Story Start With A Little Wait  ....");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MovieBooking/resources/cineworld(2).jpg"))); // NOI18N

        javax.swing.GroupLayout loadingscreenpnlLayout = new javax.swing.GroupLayout(loadingscreenpnl);
        loadingscreenpnl.setLayout(loadingscreenpnlLayout);
        loadingscreenpnlLayout.setHorizontalGroup(
            loadingscreenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadingscreenpnlLayout.createSequentialGroup()
                .addContainerGap(447, Short.MAX_VALUE)
                .addGroup(loadingscreenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(loadingscreenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadingscreenpnlLayout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(547, 547, 547))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadingscreenpnlLayout.createSequentialGroup()
                            .addComponent(loadingbarpg, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(371, 371, 371)))))
        );
        loadingscreenpnlLayout.setVerticalGroup(
            loadingscreenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadingscreenpnlLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingbarpg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadingscreenpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadingscreenpnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        //        String username = usernametxtFld.getText();
        String password = new String(passwordFld.getPassword());
        String username = usernametxtFld.getText();

        // Check if username or password is empty
        if (username.isEmpty() || password.isEmpty()) {
            errorlbl.setText("Please enter your username and password.");
        } // Check if username and password are incorrect
        else if (!username.equals("admin") || !password.equals("admin")) {
            errorlbl.setText("Username and password mismatch.");
        } // If credentials are correct, proceed to load the main screen
        else {
            errorlbl.setText(""); // Clear any previous error messages
            loadScreen("MainScreen");
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // Check if any text field has data
    if (idtxtfld.getText().trim().isEmpty() &&
        nametxtfld.getText().trim().isEmpty() &&
        contacttxtfld.getText().trim().isEmpty() &&
        emailtxtfld.getText().trim().isEmpty() &&
        movietxtfld.getText().trim().isEmpty() &&
        timetxtfld.getText().trim().isEmpty() &&
        seattxtfld.getText().trim().isEmpty() &&
        datetxtfld.getText().trim().isEmpty()) {
        
        // Show error message if all fields are empty
        JOptionPane.showMessageDialog(
            null, 
            "Please enter data first before clearing!", 
            "Error", 
            JOptionPane.ERROR_MESSAGE
        );
    } else {
        // Clear all fields
        idtxtfld.setText("");         
        nametxtfld.setText("");       
        contacttxtfld.setText("");   
        emailtxtfld.setText("");    
        movietxtfld.setText("");     
        timetxtfld.setText("");      
        seattxtfld.setText("");      
        datetxtfld.setText("");     

        // Show success message if fields were cleared
        JOptionPane.showMessageDialog(
            null, 
            "All fields have been cleared!", 
            "Fields Cleared", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }
    }//GEN-LAST:event_clearbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed

        boolean isValid = true;

        try {
            // Validate ID
            isValid &= validateField(
                idtxtfld, "bookingID", iderrorlbl, "Must be a 7-digit number.",
                errorColor, yellowColor, validationUtil.isValidId(idtxtfld.getText())
            );

            // Validate Full Name
            isValid &= validateField(
                nametxtfld, "Name", nameerrorlbl, "Must contain only alphabets.",
                errorColor, yellowColor, validationUtil.isValidName(nametxtfld.getText())
            );

            // Validate Contact
            isValid &= validateField(
                contacttxtfld, "Contact", contacterrorlbl, "Must start with 98 and have 10 digits",
                errorColor, yellowColor, validationUtil.isValidContact(contacttxtfld.getText())
            );

            // Validate Email
            isValid &= validateField(
                emailtxtfld, "Email", emailerrorlbl, "Please enter a valid email address.",
                errorColor, yellowColor, validationUtil.isValidEmail(emailtxtfld.getText())
            );

            // Validate Movie Name
            isValid &= validateField(
                movietxtfld, "Movie", movieerrorlbl, "Please enter a valid available movie",
                errorColor, yellowColor, validationUtil.isValidMovie(movietxtfld.getText())
            );

            // Validate Time
            isValid &= validateField(
                timetxtfld, "Time", timeerrorlbl, "Please enter a valid available time (1:30 PM or 3:30 PM).",
                errorColor, yellowColor, validationUtil.isValidTime(timetxtfld.getText())
            );

            // Validate Seat Number
            isValid &= validateField(
                seattxtfld, "Seat Number", seaterrorlbl, "Please enter a valid seat (A1, A2, ..., C5).",
                errorColor, yellowColor, validationUtil.isValidSeat(seattxtfld.getText())
            );

            // Validate Date
            isValid &= validateField(
                datetxtfld, "Date", dateerrorlbl, "Please enter a valid date (Sunday or Monday).",
                errorColor, yellowColor, validationUtil.isValidDate(datetxtfld.getText())
            );

            if (isValid) {
                // Create a MovieModel instance
                MovieModel newMovie = new MovieModel(
                    Integer.parseInt(idtxtfld.getText().trim()),
                    nametxtfld.getText().trim(),
                    emailtxtfld.getText().trim(),
                    contacttxtfld.getText().trim(),
                    movietxtfld.getText().trim(),
                    timetxtfld.getText().trim(),
                    seattxtfld.getText().trim(),
                    datetxtfld.getText().trim()
                );

                // Check for duplicate booking ID
                if (checkDuplicateMovie(newMovie)) {
                    idtxtfld.setBorder(createTitledBorder(errorColor, "Booking ID"));
                    showDialogBox("Booking ID already exists.", "Duplicate Entry", JOptionPane.WARNING_MESSAGE);
                } 
                // Check for duplicate seat (same movie, date, and time)
                else if (checkDuplicateSeat(
                    newMovie.getSeatNumber(),
                    newMovie.getMovie(),
                    newMovie.getDate(),
                    newMovie.getShowTime()
                )) {
                    seattxtfld.setBorder(createTitledBorder(errorColor, "Seat Number"));
                    showDialogBox("Seat Number is already booked for this movie, date, and time.", "Duplicate Entry", JOptionPane.WARNING_MESSAGE);
                } 
                else {
                    // Add the movie if no duplicate is found
                    movieList.add(newMovie);
                    clearMovieForm();
                    loadListToTable(movieList);
                    idtxtfld.setBorder(createTitledBorder(yellowColor, "Booking ID"));
                    showDialogBox("Movie added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
                } catch (Exception e) {
                // Catch any unexpected exceptions
                showDialogBox("An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }

    }//GEN-LAST:event_addbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try {
            // Get the booking ID from the input field (use the correct field name)
            int bookingID = Integer.parseInt(idtxtfld.getText().trim());
            boolean movieFound = false;

            // Loop through movie list to find the movie with the given booking ID
            for (MovieModel movie : movieList) {
                if (movie.getBookingID() == bookingID) {
                    // Movie found, update their details
                    movie.setName(nametxtfld.getText().trim());
                    movie.setBookingID(Integer.parseInt(idtxtfld.getText().trim()));  // Update with correct ID field
                    movie.setEmail(emailtxtfld.getText().trim());  // Fixed setEmail to emailtxtfld
                    movie.setContact(contacttxtfld.getText().trim());
                    movie.setMovie(movietxtfld.getText().trim());
                    movie.setShowTime(timetxtfld.getText().trim());
                    movie.setSeatNumber(seattxtfld.getText().trim());
                    movie.setDate(datetxtfld.getText().trim());  // Set the correct date field

                    movieFound = true;
                    break;
                }
            }

            // Check if the movie was found and updated
            if (movieFound) {
                loadListToTable(movieList);  // Update the table with the new data

                showDialogBox("Movie information updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearMovieForm();  // Clear input fields after successful update
            } else {
                // Movie with the given booking ID not found
                showDialogBox("No movie found with Booking ID: " + bookingID, "Update Failed", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Show error if the input for Booking ID is not a valid number
            showDialogBox("Please enter a valid Booking ID.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtn1ActionPerformed
        try {
            // Assuming 'bookingNo' is analogous to 'BookingID' in your MovieBooking class
            int bookingNo = Integer.parseInt(idtxtfld.getText().trim());  // Using bookingNo instead of kartNo
            boolean found = false;

            // Iterate through the movieList to find the MovieBooking with the specified Booking No
            for (int i = 0; i < movieList.size(); i++) {
                // Assuming getBookingID() is the method in MovieBooking to get the BookingID (or bookingNo)
                if (movieList.get(i).getBookingID() == bookingNo) {
                    // Remove the movie booking from the list
                    movieList.remove(i);
                    found = true;

                    // Update the table
                    loadListToTable(movieList);

                    // Clear the form
                    clearMovieForm();

                    // Show success message
                    showDialogBox("Movie booking deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }

            if (!found) {
                // Show error if the Booking No (BookingID) is not found
                showDialogBox("Booking No not found. Please enter a valid Booking No.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Show error if Booking No is invalid
            showDialogBox("Please enter a valid Booking No.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deletebtn1ActionPerformed

    private void btnsortseatascendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortseatascendingActionPerformed
        // Create an instance of the MergeSort class
        MergeSort mergeSort = new MergeSort();

        // Sort the list by Seat No in descending order
        List<MovieModel> sortedList = mergeSort.sortBySeatNo(movieList, true); // true for descending order

        // Convert the sorted list to LinkedList
        LinkedList<MovieModel> sortedLinkedList = new LinkedList<>(sortedList);

        // Load the sorted list into the table
        loadListToTable(sortedLinkedList); // Display sorted list in the table

        // Show success dialog
        showDialogBox("Sorted by Seat No in ascending order successfully.", "Success", JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_btnsortseatascendingActionPerformed

    private void btnsortnamedescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortnamedescendingActionPerformed
       // Create an instance of the InsertionSort class
    InsertionSort insertionSort = new InsertionSort();

    // Sort the list by Name in descending order
    List<MovieModel> sortedList = insertionSort.sortByName(movieList, true); // true for descending order

    // Convert the sorted list to LinkedList
    LinkedList<MovieModel> sortedLinkedList = new LinkedList<>(sortedList);

    // Load the sorted list into the table
    loadListToTable(sortedLinkedList); // Display sorted list in the table

    // Show success dialog
    showDialogBox("Sorted by Name in descending order successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnsortnamedescendingActionPerformed

    private void btnsortidascendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortidascendingActionPerformed
            // Sort the list
    List<MovieModel> sortedList = selectionsort.sortByBookingId(movieList, false); // false for ascending order

    // Convert the sorted list to LinkedList
    LinkedList<MovieModel> sortedLinkedList = new LinkedList<>(sortedList);

    // Load the sorted list into the table
    loadListToTable(sortedLinkedList); // Display sorted list in the table

    // Show success dialog
    showDialogBox("Sorted by Booking ID in ascending order successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnsortidascendingActionPerformed

    private void btnsortiddescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortiddescendingActionPerformed
        // Create an instance of the SelectionSort class
    SelectionSort selectionSort = new SelectionSort();

    // Sort the list by Booking ID in descending order
    List<MovieModel> sortedList = selectionSort.sortByBookingId(movieList, true); // true for descending order

    // Convert the sorted list to LinkedList
    LinkedList<MovieModel> sortedLinkedList = new LinkedList<>(sortedList);

    // Load the sorted list into the table
    loadListToTable(sortedLinkedList); // Display sorted list in the table

    // Show success dialog
    showDialogBox("Sorted by Booking ID in descending order successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnsortiddescendingActionPerformed

    private void btnsortseatdescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortseatdescendingActionPerformed
        // Create an instance of the MergeSort class
    MergeSort mergeSort = new MergeSort();

    // Sort the list by seat number in ascending order
    List<MovieModel> sortedList = mergeSort.sortBySeatNo(movieList, false); // false for ascending order

    // Convert the sorted list to LinkedList
    LinkedList<MovieModel> sortedLinkedList = new LinkedList<>(sortedList);

    // Load the sorted list into the table
    loadListToTable(sortedLinkedList); // Display sorted list in the table

    // Show success dialog
    showDialogBox("Sorted by Seat Number in descending order successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnsortseatdescendingActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
    // Check if the search field is empty
    String searchText = searchtxtfld.getText().trim();
    if (searchText.isEmpty()) {
        // Show an error message
        JOptionPane.showMessageDialog(
            this, 
            "Please enter a name for search!", 
            "Validation Error", 
            JOptionPane.ERROR_MESSAGE
        );
        return; // Exit the method if the field is empty
    }

    // Sort the movie list by name first (ensures it is sorted for binary search)
    InsertionSort insertionSort = new InsertionSort();
    List<MovieModel> sortedList = insertionSort.sortByName(movieList, false);

    // Create an instance of BinarySearch
    BinarySearch binarySearch = new BinarySearch();

    // Perform the search and update the table
    binarySearch.searchAndUpdateTable(
        searchText,                // Name to search for
        sortedList,                // Sorted list
        0,                         // Start index
        sortedList.size() - 1,     // End index
        movietbl                   // JTable to update
    );
    }//GEN-LAST:event_searchbuttonActionPerformed
private boolean isSearchPerformed = false;
    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        try {
        // Check if a search was performed
        if (!isSearchPerformed) {
            JOptionPane.showMessageDialog(
                this,
                "No search has been performed yet. Please perform a search first.",
                "Reset Not Allowed",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // Reset the table and clear the search field
        loadListToTable(movieList);
        searchtxtfld.setText("");

        // Reset the search flag
        isSearchPerformed = false;

        // Provide confirmation to the user
        JOptionPane.showMessageDialog(
            this,
            "Table reset successfully. All data is now displayed.",
            "Reset Table",
            JOptionPane.INFORMATION_MESSAGE
        );
    } catch (Exception e) {
        // Handle any unexpected errors
        JOptionPane.showMessageDialog(
            this,
            "An error occurred while resetting the table: " + e.getMessage(),
            "Error",
            JOptionPane.ERROR_MESSAGE
        );
        e.printStackTrace();
    }
    }//GEN-LAST:event_resetbtnActionPerformed

    private void btnsortnameacsendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortnameacsendingActionPerformed

        List<MovieModel> sortedList = insertionSort.sortByName(movieList, false); // false for ascending order

        // Convert the sorted list to LinkedList
        LinkedList<MovieModel> sortedLinkedList = new LinkedList<>(sortedList);

        // Load the sorted list into the table
        loadListToTable(sortedLinkedList); // Display sorted list in the table

        // Show success dialog
        showDialogBox("Sorted by Name in ascending order successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnsortnameacsendingActionPerformed

    private void logoutbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtn1ActionPerformed
        passwordFld.setText("");
        usernametxtFld.setText("");
        loadScreen("LoginScreen");
    }//GEN-LAST:event_logoutbtn1ActionPerformed

    

    /**
    * Loads a list of movies into the table for display.
    * @param movieList the list of movies to load into the table
    * 
    * This method clears any existing rows from the table and populates it with the details 
    * of each movie in the provided list. Each movie's details, such as name, booking ID, 
    * email, contact, movie name, showtime, seat number, and date, are added as a new row in the table.
    */
   private void loadListToTable(LinkedList<MovieModel> movieList) {
       DefaultTableModel model = (DefaultTableModel) movietbl.getModel();

       // Clear any existing rows from the table
       model.setRowCount(0);

       // Populate the table with movie data
       movieList.forEach(movie -> model.addRow(new Object[]{
           movie.getName(),
           movie.getBookingID(),
           movie.getEmail(),
           movie.getContact(),
           movie.getMovie(),
           movie.getShowTime(),
           movie.getSeatNumber(),
           movie.getDate()
       }));
   }

    /**
     * Validates a single input field based on specific criteria and updates its visual state.
     * @param textField the TextField to validate
     * @param fieldName the name of the field for error display
     * @param errorLbl the Label to show error messages
     * @param errorMsg the error message to display for invalid input
     * @param errorColor the color for error borders and text
     * @param successColor the color for successful validation borders
     * @param isValidFormat whether the input satisfies the field-specific validation criteria
     * @return true if the field passes validation, false otherwise
     */
    private boolean validateField(JTextField textField, String fieldName, JLabel errorLbl,
            String errorMsg, Color errorColor, Color successColor, boolean isValidFormat) {
        if (validationUtil.isNullOrEmpty(textField.getText())) {
            textField.setBorder(createTitledBorder(errorColor, fieldName));
            errorLbl.setText("Field cannot be empty!");
            errorLbl.setVisible(true);
            return false;
        } 
        else if (!isValidFormat) {
            textField.setBorder(createTitledBorder(errorColor, fieldName));
            errorLbl.setText(errorMsg);
            errorLbl.setVisible(true);
            return false;
        } 
        else {
            textField.setBorder(createTitledBorder(successColor, fieldName));
            errorLbl.setVisible(false);
            return true;
        }
    }


    /**
     * Creates a titled border with the specified color and title.
     * @param color the color of the border
     * @param title the title to display on the border
     * @return a TitledBorder with the specified color and title
     */
    private javax.swing.border.TitledBorder createTitledBorder(Color color, String title) {
        return javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(color, 2),
                title,
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 12),
                color
        );
    }

     /**
     * Clears all fields in the movie form.
     * Resets the text fields to be empty for a fresh input.
     */
    private void clearMovieForm() {
        idtxtfld.setText("");         
        nametxtfld.setText("");       
        contacttxtfld.setText("");   
        emailtxtfld.setText("");    
        movietxtfld.setText("");     
        timetxtfld.setText("");      
        seattxtfld.setText("");      
        datetxtfld.setText("");     
    }

     /**
     * Checks if a movie with the same booking ID already exists in the movie list.
     * @param movie the movie to check for duplicates
     * @return true if a duplicate movie with the same booking ID is found, false otherwise
     */
    private boolean checkDuplicateMovie(MovieModel movie) {
        return movieList.stream()
                .anyMatch(existingMovie -> existingMovie.getBookingID() == movie.getBookingID());
    }
    
     /**
     * Checks if the seat number is already taken for the same movie, date, and time.
     * @param seatNumber the seat number to check for duplication
     * @param movieName the movie name to check against
     * @param Date the date to check against
     * @param Time the showtime to check against
     * @return true if a duplicate seat is found, false otherwise
     */
    private boolean checkDuplicateSeat(String seatNumber, String movieName, String Date, String Time) {
        if (movieList == null || movieList.isEmpty()) {
        }

        for (MovieModel movie : movieList) {
            if (movie.getSeatNumber().equalsIgnoreCase(seatNumber)
                    && movie.getMovie().equalsIgnoreCase(movieName)
                    && movie.getDate().equalsIgnoreCase(Date)
                    && movie.getShowTime().equalsIgnoreCase(Time)) {
                System.out.println("Duplicate seat found: " + seatNumber);
                return true; 
            }
        }
        return false; 
    }


     /**
     * The main entry point for the application.
     * @param args command-line arguments (not used in this case)
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLBLlogo1;
    private javax.swing.JPanel JPNLSchedule;
    private javax.swing.JPanel JPNLbooking;
    private javax.swing.JPanel JPNLcontactus;
    private javax.swing.JPanel JPNLhome;
    private javax.swing.JPanel JPNLlogo1;
    private javax.swing.JTabbedPane JTP;
    private javax.swing.JLabel LBLmap;
    private javax.swing.JPanel PNLmap;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton btnsortidascending;
    private javax.swing.JButton btnsortiddescending;
    private javax.swing.JButton btnsortnameacsending;
    private javax.swing.JButton btnsortnamedescending;
    private javax.swing.JButton btnsortseatascending;
    private javax.swing.JButton btnsortseatdescending;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel contacterrorlbl;
    private javax.swing.JTextField contacttxtfld;
    private javax.swing.JLabel dateerrorlbl;
    private javax.swing.JTextField datetxtfld;
    private javax.swing.JButton deletebtn1;
    private javax.swing.JLabel emailerrorlbl;
    private javax.swing.JTextField emailtxtfld;
    private javax.swing.JLabel errorlbl;
    private javax.swing.JLabel iderrorlbl;
    private javax.swing.JTextField idtxtfld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JProgressBar loadingbarpg;
    private javax.swing.JPanel loadingscreenpnl;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPanel loginscreenpnl;
    private javax.swing.JButton logoutbtn1;
    private javax.swing.JPanel mainscreenpnl;
    private javax.swing.JLabel movieerrorlbl;
    private javax.swing.JTable movietbl;
    private javax.swing.JTextField movietxtfld;
    private javax.swing.JLabel nameerrorlbl;
    private javax.swing.JTextField nametxtfld;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTextField searchtxtfld;
    private javax.swing.JLabel seaterrorlbl;
    private javax.swing.JTextField seattxtfld;
    private javax.swing.JLabel timeerrorlbl;
    private javax.swing.JTextField timetxtfld;
    private javax.swing.JButton updatebtn;
    private javax.swing.JTextField usernametxtFld;
    // End of variables declaration//GEN-END:variables
}

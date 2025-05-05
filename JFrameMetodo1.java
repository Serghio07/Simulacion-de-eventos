// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class JFrameMetodo1 extends JFrame {
   public static int g1 = 0;
   public static int g2 = 0;
   public static int m1 = 0;
   public static int m2 = 0;
   public static int a = 0;
   private static JTable tablaDatos1;
   private static JTable tablaDatos2;
   private static JTable tablaDatos3;
   private static JTable tablaDatos4;
   private static JTable tablaDatos5;
   private static JTable tablaDatos6;
   private static JTable tablaDatos7;
   private JPanel contentPanel;
   public static double p4gn = 0.0;
   public static double p4jp = 0.0;
   public static double p4pjp = 0.0;
   public static double p5gn = 0.0;
   public static double p5tac = 0.0;
   public static double p6ibt = 0.0;
   public static double p6ibp = 0.0;
   public static double p6hr = 0.0;
   public static double p6pm = 0.0;
   public static double p7gn = 0.0;
   public static double p7ct = 0.0;
   public static double p7di = 0.0;
   public static ArrayList<datosMetodo4> listaMetodo1 = new ArrayList();
   public static ArrayList<datosMetodo5> listaMetodo2 = new ArrayList();
   public static ArrayList<datosMetodo1> listaMetodo3 = new ArrayList();
   public static ArrayList<datosMetodo5> listaMetodo4 = new ArrayList();
   public static ArrayList<datosMetodo4> listaMetodo5 = new ArrayList();
   public static ArrayList<datosMetodo1> listaMetodo6 = new ArrayList();
   public static ArrayList<datosMetodo5> listaMetodo7 = new ArrayList();
   public static boolean degeneracion1 = false;
   public static boolean degeneracion2 = false;
   public static String mensajeMetodo1;
   public static String mensajeMetodo2;
   public static String mensajeMetodo3;
   public static String mensajeMetodo4;
   JLabel mostrarMensaje1 = new JLabel("Ingrese los valores");
   JLabel mostrarMensaje2 = new JLabel("Las dos semillas de igual tamaño");
   JLabel mostrarMensaje3 = new JLabel("K es mayor a 0, C es primo");
   JLabel mostrarMensaje4 = new JLabel("K es mayor a 0, seleccione un A");

   public static void main(String[] args) {
      EventQueue.invokeLater(new JFrameMetodo1$1());
   }

   static class JFrameMetodo1$1 implements Runnable {
      JFrameMetodo1$1() {
      }
   
      public void run() {
         try {
            JFrameMetodo1 frame = new JFrameMetodo1();
            frame.setVisible(true);
         } catch (Exception var2) {
            var2.printStackTrace();
         }
   
      }
   }

   static class JFrameMetodo1$2 implements ActionListener {
      private JFrameMetodo1 this$0;
      private JTextField val$semilla;
      private JTextField val$interes;
      private JPanel val$panel1;
      private JTextField val$cantidad;
      JFrameMetodo1$2(final JFrameMetodo1 this$0, final JTextField var2, final JTextField var3, final JPanel var4, final JTextField var5) {
         this.this$0 = this$0;
         this.val$semilla = var2;
         this.val$interes = var3;
         this.val$panel1 = var4;
         this.val$cantidad = var5;
      }
   
      public void actionPerformed(ActionEvent e) {
         try {
            if (Double.parseDouble(this.val$semilla.getText()) > 0.0) {
               if (Double.parseDouble(this.val$interes.getText()) > 0.0) {
                  this.val$panel1.remove(this.this$0.mostrarMensaje1);
                  JFrameMetodo1.degeneracion1 = false;
                  this.this$0.limpiarTabla();
                  JFrameMetodo1.problema1(Integer.parseInt(this.val$cantidad.getText()), Double.parseDouble(this.val$interes.getText()), Double.parseDouble(this.val$semilla.getText()));
                  this.this$0.cargaDatos1();
                  if (JFrameMetodo1.degeneracion1) {
                     this.this$0.mostrarMensaje1 = new JLabel(JFrameMetodo1.mensajeMetodo1);
                     this.this$0.mostrarMensaje1.setBounds(870, 350, 250, 100);
                     this.val$panel1.add(this.this$0.mostrarMensaje1);
                  }
   
                  this.this$0.repaint();
               } else {
                  this.val$panel1.remove(this.this$0.mostrarMensaje1);
                  JFrameMetodo1.degeneracion1 = false;
                  this.this$0.mostrarMensaje1 = new JLabel("El interés debe ser mayor a 0");
                  this.this$0.mostrarMensaje1.setBounds(860, 350, 250, 100);
                  this.val$panel1.add(this.this$0.mostrarMensaje1);
                  this.this$0.repaint();
               }
            } else {
               this.val$panel1.remove(this.this$0.mostrarMensaje1);
               JFrameMetodo1.degeneracion1 = false;
               this.this$0.mostrarMensaje1 = new JLabel("El capital debe ser mayor a 0");
               this.this$0.mostrarMensaje1.setBounds(860, 350, 250, 100);
               this.val$panel1.add(this.this$0.mostrarMensaje1);
               this.this$0.repaint();
            }
         } catch (Exception var3) {
            this.val$panel1.remove(this.this$0.mostrarMensaje1);
            JFrameMetodo1.degeneracion1 = false;
            this.this$0.mostrarMensaje1 = new JLabel("Ingrese los valores correspondientes");
            this.this$0.mostrarMensaje1.setBounds(860, 350, 250, 100);
            this.val$panel1.add(this.this$0.mostrarMensaje1);
            this.this$0.repaint();
         }
   
      }
   }

   static class JFrameMetodo1$3 implements ActionListener {
      private JFrameMetodo1 this$0;
      private JTextField val$cantidad;
      private JTextField val$interes;
      private JTextField val$semilla;
      JFrameMetodo1$3(final JFrameMetodo1 this$0, final JTextField var2, final JTextField var3, final JTextField var4) {
         this.this$0 = this$0;
         this.val$cantidad = var2;
         this.val$interes = var3;
         this.val$semilla = var4;
      }

      public void actionPerformed(ActionEvent e) {
         this.this$0.limpiarTabla();
         this.val$cantidad.setText((String)null);
         this.val$interes.setText((String)null);
         this.val$semilla.setText((String)null);
         this.this$0.cargaDatos1();
         this.this$0.repaint();
      }
   }

   static class JFrameMetodo1$4 implements ActionListener {
      private JFrameMetodo1 this$0;
      private JTextField val$semilla1;
      private JTextField val$semilla2;
      private JTextField val$tsMort;
      private JPanel val$panel2;
      private JTextField val$periodo;
      JFrameMetodo1$4(final JFrameMetodo1 this$0, final JTextField var2, final JTextField var3, final JTextField var4, final JPanel var5, final JTextField var6) {
         this.this$0 = this$0;
         this.val$semilla1 = var2;
         this.val$semilla2 = var3;
         this.val$tsMort = var4;
         this.val$panel2 = var5;
         this.val$periodo = var6;
      }
   
      public void actionPerformed(ActionEvent e) {
         if (Double.parseDouble(this.val$semilla1.getText()) > 0.0 && Double.parseDouble(this.val$semilla2.getText()) > 0.0 && Double.parseDouble(this.val$tsMort.getText()) > 0.0) {
            try {
               this.val$panel2.remove(this.this$0.mostrarMensaje2);
               JFrameMetodo1.degeneracion2 = false;
               this.this$0.limpiarTabla();
               JFrameMetodo1.problema2(Integer.parseInt(this.val$periodo.getText()), Integer.parseInt(this.val$semilla1.getText()), Double.parseDouble(this.val$semilla2.getText()), Double.parseDouble(this.val$tsMort.getText()));
               this.this$0.cargaDatos2();
               if (JFrameMetodo1.degeneracion2) {
                  this.this$0.mostrarMensaje2 = new JLabel(JFrameMetodo1.mensajeMetodo2);
                  this.this$0.mostrarMensaje2.setBounds(870, 350, 250, 100);
                  this.val$panel2.add(this.this$0.mostrarMensaje2);
               }
   
               this.this$0.repaint();
            } catch (Exception var3) {
               this.val$panel2.remove(this.this$0.mostrarMensaje2);
               JFrameMetodo1.degeneracion2 = false;
               this.this$0.mostrarMensaje2 = new JLabel("Ingrese los valores correspondientes");
               this.this$0.mostrarMensaje2.setBounds(860, 350, 250, 100);
               this.val$panel2.add(this.this$0.mostrarMensaje2);
               this.this$0.repaint();
            }
         } else {
            this.val$panel2.remove(this.this$0.mostrarMensaje2);
            JFrameMetodo1.degeneracion2 = false;
            this.this$0.mostrarMensaje2 = new JLabel("Los valores tienen que ser positivos");
            this.this$0.mostrarMensaje2.setBounds(860, 350, 250, 100);
            this.val$panel2.add(this.this$0.mostrarMensaje2);
            this.this$0.repaint();
         }
   
      }
   }

   static class JFrameMetodo1$5 implements ActionListener {
      private JFrameMetodo1 this$0;
      private JTextField val$periodo;
      private JTextField val$semilla1;
      private JTextField val$semilla2;
      private JTextField val$tsMort;
      JFrameMetodo1$5(final JFrameMetodo1 this$0, final JTextField var2, final JTextField var3, final JTextField var4, final JTextField var5) {
         this.this$0 = this$0;
         this.val$periodo = var2;
         this.val$semilla1 = var3;
         this.val$semilla2 = var4;
         this.val$tsMort = var5;
      }
   
      public void actionPerformed(ActionEvent e) {
         this.this$0.limpiarTabla();
         this.val$periodo.setText((String)null);
         this.val$semilla1.setText((String)null);
         this.val$semilla2.setText((String)null);
         this.val$tsMort.setText((String)null);
         this.this$0.cargaDatos2();
         this.this$0.repaint();
      }
   }

   static class JFrameMetodo1$6 implements ActionListener {
      private JFrameMetodo1 this$0;
      private JPanel val$panel3;
      private JTextField val$periodo3;
      private JTextField val$semilla3;
      JFrameMetodo1$6(final JFrameMetodo1 this$0, final JPanel var2, final JTextField var3, final JTextField var4) {
         this.this$0 = this$0;
         this.val$panel3 = var2;
         this.val$periodo3 = var3;
         this.val$semilla3 = var4;
      }
   
      public void actionPerformed(ActionEvent e) {
         try {
            this.val$panel3.remove(this.this$0.mostrarMensaje3);
            this.this$0.limpiarTabla();
            JFrameMetodo1.problema3(Integer.parseInt(this.val$periodo3.getText()), Integer.parseInt(this.val$semilla3.getText()));
            this.this$0.cargaDatos3();
            this.this$0.repaint();
         } catch (Exception var3) {
            this.val$panel3.remove(this.this$0.mostrarMensaje3);
            this.this$0.mostrarMensaje3 = new JLabel("Ingrese los valores correspondientes");
            this.this$0.mostrarMensaje3.setBounds(860, 350, 250, 100);
            this.val$panel3.add(this.this$0.mostrarMensaje3);
            this.this$0.repaint();
         }
   
      }
   }

   static class JFrameMetodo1$7 implements ActionListener {
      private JFrameMetodo1 this$0;
      private JTextField val$periodo3;
      private JTextField val$semilla3;
      JFrameMetodo1$7(final JFrameMetodo1 this$0, final JTextField var2, final JTextField var3) {
         this.this$0 = this$0;
         this.val$periodo3 = var2;
         this.val$semilla3 = var3;
      }
   
      public void actionPerformed(ActionEvent e) {
         this.this$0.limpiarTabla();
         this.val$periodo3.setText((String)null);
         this.val$semilla3.setText((String)null);
         this.this$0.cargaDatos3();
         this.this$0.repaint();
      }
   }

   static class JFrameMetodo1$8 implements ActionListener {
      private JFrameMetodo1 this$0;
      private JTextField val$p4valor1;
      private JTextField val$p4valor2;
      private JTextField val$p4valor3;
      private JTextField val$p4valor4;
      private JPanel val$panel4;
      private JTextField val$p4valor5;
      private DecimalFormat val$df2d;
      private JTextField val$p4valor6;
      private DecimalFormat val$df0d;
      private JTextField val$p4valor7;
      private DecimalFormat val$df3d;
      JFrameMetodo1$8(final JFrameMetodo1 this$0, final JTextField var2, final JTextField var3, final JTextField var4, final JTextField var5, 
      final JPanel var6, final JTextField var7, final DecimalFormat var8, final JTextField var9, final DecimalFormat var10, final JTextField var11, final DecimalFormat var12) {
         this.this$0 = this$0;
         this.val$p4valor1 = var2;
         this.val$p4valor2 = var3;
         this.val$p4valor3 = var4;
         this.val$p4valor4 = var5;
         this.val$panel4 = var6;
         this.val$p4valor5 = var7;
         this.val$df2d = var8;
         this.val$p4valor6 = var9;
         this.val$df0d = var10;
         this.val$p4valor7 = var11;
         this.val$df3d = var12;
      }
   
      public void actionPerformed(ActionEvent e) {
         if (Integer.parseInt(this.val$p4valor1.getText()) > 0 && Double.parseDouble(this.val$p4valor2.getText()) > 0.0 && Integer.parseInt(this.val$p4valor3.getText()) > 0 && Integer.parseInt(this.val$p4valor4.getText()) > 0) {
            try {
               this.val$panel4.remove(this.this$0.mostrarMensaje3);
               this.this$0.limpiarTabla();
               JFrameMetodo1.p4gn = 0.0;
               JFrameMetodo1.p4jp = 0.0;
               JFrameMetodo1.p4pjp = 0.0;
               JFrameMetodo1.problema4(Integer.parseInt(this.val$p4valor1.getText()), Double.parseDouble(this.val$p4valor2.getText()), Integer.parseInt(this.val$p4valor3.getText()), Integer.parseInt(this.val$p4valor4.getText()));
               this.this$0.cargaDatos4();
               this.val$p4valor5.setText(String.valueOf(this.val$df2d.format(JFrameMetodo1.p4gn) + " Bs."));
               this.val$p4valor6.setText(String.valueOf(this.val$df0d.format(JFrameMetodo1.p4jp)));
               this.val$p4valor7.setText(String.valueOf(this.val$df3d.format(JFrameMetodo1.p4pjp) + "%"));
               this.this$0.repaint();
            } catch (Exception var3) {
               this.val$panel4.remove(this.this$0.mostrarMensaje3);
               this.this$0.mostrarMensaje4 = new JLabel("Ingrese los valores correspondientes");
               this.this$0.mostrarMensaje4.setBounds(860, 350, 250, 100);
               this.val$panel4.add(this.this$0.mostrarMensaje4);
               this.this$0.repaint();
            }
         }
   
      }
   }

   class JFrameMetodo1$9 implements ActionListener {
      private JFrameMetodo1 this$0;
      private JTextField val$p4valor1;
      private JTextField val$p4valor2;
      private JTextField val$p4valor3;
      private JTextField val$p4valor4;
      private JTextField val$p4valor5;
      private JTextField val$p4valor6;
      private JTextField val$p4valor7;
      JFrameMetodo1$9(final JFrameMetodo1 this$0, final JTextField var2, final JTextField var3, final JTextField var4, final JTextField var5, final JTextField var6, final JTextField var7, final JTextField var8) {
         this.this$0 = this$0;
         this.val$p4valor1 = var2;
         this.val$p4valor2 = var3;
         this.val$p4valor3 = var4;
         this.val$p4valor4 = var5;
         this.val$p4valor5 = var6;
         this.val$p4valor6 = var7;
         this.val$p4valor7 = var8;
      }
   
      public void actionPerformed(ActionEvent e) {
         this.this$0.limpiarTabla();
         this.val$p4valor1.setText((String)null);
         this.val$p4valor2.setText((String)null);
         this.val$p4valor3.setText((String)null);
         this.val$p4valor4.setText((String)null);
         JFrameMetodo1.p4gn = 0.0;
         JFrameMetodo1.p4jp = 0.0;
         JFrameMetodo1.p4pjp = 0.0;
         this.val$p4valor5.setText(String.valueOf(JFrameMetodo1.p4gn + " Bs."));
         this.val$p4valor6.setText(String.valueOf(JFrameMetodo1.p4jp));
         this.val$p4valor7.setText(String.valueOf(JFrameMetodo1.p4pjp + "%"));
         this.this$0.cargaDatos4();
         this.this$0.repaint();
      }
   }

   static class JFrameMetodo1$10 implements ActionListener {
      private JFrameMetodo1 this$0;
      private JTextField val$p5valor1;
      private JTextField val$p5valor2;
      private JTextField val$p5valor5;
      private JTextField val$p5valor4;
      private JTextField val$p5valor3;
      private JTextField val$p5valor6;
      private DecimalFormat val$df2d;
      private JTextField val$p5valor7;
      private DecimalFormat val$df0d;
      JFrameMetodo1$10(final JFrameMetodo1 this$0, final JTextField var2, final JTextField var3, final JTextField var4, 
      final JTextField var5, final JTextField var6, final JTextField var7, final DecimalFormat var8, final JTextField var9, final DecimalFormat var10) {
         this.this$0 = this$0;
         this.val$p5valor1 = var2;
         this.val$p5valor2 = var3;
         this.val$p5valor5 = var4;
         this.val$p5valor4 = var5;
         this.val$p5valor3 = var6;
         this.val$p5valor6 = var7;
         this.val$df2d = var8;
         this.val$p5valor7 = var9;
         this.val$df0d = var10;
      }
   
      public void actionPerformed(ActionEvent e) {
         if (Integer.parseInt(this.val$p5valor1.getText()) > 0 && Integer.parseInt(this.val$p5valor2.getText()) > 0 && Integer.parseInt(this.val$p5valor5.getText()) > 0 && Integer.parseInt(this.val$p5valor4.getText()) > 0 && Integer.parseInt(this.val$p5valor3.getText()) > 0) {
            try {
               this.this$0.limpiarTabla();
               JFrameMetodo1.p5gn = 0.0;
               JFrameMetodo1.p5tac = 0.0;
               JFrameMetodo1.problema5(Integer.parseInt(this.val$p5valor1.getText()), Integer.parseInt(this.val$p5valor2.getText()), Integer.parseInt(this.val$p5valor5.getText()), Integer.parseInt(this.val$p5valor4.getText()), Integer.parseInt(this.val$p5valor3.getText()));
               this.this$0.cargaDatos5();
               this.val$p5valor6.setText(String.valueOf(this.val$df2d.format(JFrameMetodo1.p5gn) + " Bs."));
               this.val$p5valor7.setText(String.valueOf(this.val$df0d.format(JFrameMetodo1.p5tac)));
               this.this$0.repaint();
            } catch (Exception var3) {
               this.this$0.repaint();
            }
         }
   
      }
   }

   static class JFrameMetodo1$11 implements ActionListener {
      private JFrameMetodo1 this$0;
      private JTextField val$p5valor1;
      private JTextField val$p5valor2;
      private JTextField val$p5valor3;
      private JTextField val$p5valor4;
      private JTextField val$p5valor5;
      private JTextField val$p5valor6;
      private JTextField val$p5valor7;
      JFrameMetodo1$11(final JFrameMetodo1 this$0, final JTextField var2, final JTextField var3, final JTextField var4, final JTextField var5, final JTextField var6, final JTextField var7, final JTextField var8) {
         this.this$0 = this$0;
         this.val$p5valor1 = var2;
         this.val$p5valor2 = var3;
         this.val$p5valor3 = var4;
         this.val$p5valor4 = var5;
         this.val$p5valor5 = var6;
         this.val$p5valor6 = var7;
         this.val$p5valor7 = var8;
      }
   
      public void actionPerformed(ActionEvent e) {
         this.this$0.limpiarTabla();
         this.val$p5valor1.setText((String)null);
         this.val$p5valor2.setText((String)null);
         this.val$p5valor3.setText((String)null);
         this.val$p5valor4.setText((String)null);
         this.val$p5valor5.setText((String)null);
         JFrameMetodo1.p5gn = 0.0;
         JFrameMetodo1.p5tac = 0.0;
         this.val$p5valor6.setText(String.valueOf(JFrameMetodo1.p4gn + " Bs."));
         this.val$p5valor7.setText(String.valueOf(0));
         this.this$0.cargaDatos5();
         this.this$0.repaint();
      }
   }

   static class JFrameMetodo1$12 implements ActionListener {
      private JFrameMetodo1 this$0;
      private JTextField val$p6valor1;
      private JTextField val$p6valor2;
      private JTextField val$p6valor3;
      private JTextField val$p6valor4;
      private JTextField val$p6valor5;
      private JTextField val$p6valor6;
      private DecimalFormat val$df2d;
      private JTextField val$p6valor7;
      private JTextField val$p6valor8;
      private DecimalFormat val$df0d;
      private JTextField val$p6valor9;
      JFrameMetodo1$12(final JFrameMetodo1 this$0, final JTextField var2, final JTextField var3, final JTextField var4, final JTextField var5, final JTextField var6, final DecimalFormat var7, final JTextField var8, final JTextField var9, final DecimalFormat var10, final JTextField var11) {
         this.this$0 = this$0;
         this.val$p6valor1 = var2;
         this.val$p6valor2 = var3;
         this.val$p6valor3 = var4;
         this.val$p6valor4 = var5;
         this.val$p6valor6 = var6;
         this.val$df2d = var7;
         this.val$p6valor7 = var8;
         this.val$p6valor8 = var9;
         this.val$df0d = var10;
         this.val$p6valor9 = var11;
      }
   
      public void actionPerformed(ActionEvent e) {
         if (Integer.parseInt(this.val$p6valor1.getText()) > 0 && Double.parseDouble(this.val$p6valor2.getText()) > 0.0 && Integer.parseInt(this.val$p6valor3.getText()) > 0 && Integer.parseInt(this.val$p6valor4.getText()) > 0) {
            try {
               this.this$0.limpiarTabla();
               JFrameMetodo1.p6ibt = 0.0;
               JFrameMetodo1.p6ibp = 0.0;
               JFrameMetodo1.p6hr = 0.0;
               JFrameMetodo1.p6pm = 0.0;
               JFrameMetodo1.problema6(Integer.parseInt(this.val$p6valor1.getText()), Double.parseDouble(this.val$p6valor2.getText()), Integer.parseInt(this.val$p6valor3.getText()), Integer.parseInt(this.val$p6valor4.getText()));
               this.this$0.cargaDatos6();
               this.val$p6valor6.setText(String.valueOf(this.val$df2d.format(JFrameMetodo1.p6ibt) + " Bs."));
               this.val$p6valor7.setText(String.valueOf(this.val$df2d.format(JFrameMetodo1.p6ibp) + " Bs."));
               this.val$p6valor8.setText(String.valueOf(this.val$df0d.format(JFrameMetodo1.p6hr)));
               this.val$p6valor9.setText(String.valueOf(this.val$df0d.format(JFrameMetodo1.p6pm)));
               this.this$0.repaint();
            } catch (Exception var3) {
               this.this$0.repaint();
            }
         }
   
      }
   }

   static class JFrameMetodo1$13 implements ActionListener{
      private JFrameMetodo1 this$0;
      private JTextField val$p6valor1;
      private JTextField val$p6valor2;
      private JTextField val$p6valor3;
      private JTextField val$p6valor4;
      private JTextField val$p6valor5;
      private JTextField val$p6valor6;
      private DecimalFormat val$df2d;
      private JTextField val$p6valor7;
      private JTextField val$p6valor8;
      private DecimalFormat val$df0d;
      private JTextField val$p6valor9;
      JFrameMetodo1$13(final JFrameMetodo1 this$0, final JTextField var2, final JTextField var3, final JTextField var4, final JTextField var5, final JTextField var6, final DecimalFormat var7, final JTextField var8, final JTextField var9, final DecimalFormat var10, final JTextField var11) {
         this.this$0 = this$0;
         this.val$p6valor1 = var2;
         this.val$p6valor2 = var3;
         this.val$p6valor3 = var4;
         this.val$p6valor4 = var5;
         this.val$p6valor6 = var6;
         this.val$df2d = var7;
         this.val$p6valor7 = var8;
         this.val$p6valor8 = var9;
         this.val$df0d = var10;
         this.val$p6valor9 = var11;
      }
   
      public void actionPerformed(ActionEvent e) {
         this.this$0.limpiarTabla();
         this.val$p6valor1.setText((String)null);
         this.val$p6valor2.setText((String)null);
         this.val$p6valor3.setText((String)null);
         this.val$p6valor4.setText((String)null);
         JFrameMetodo1.p6ibt = 0.0;
         JFrameMetodo1.p6ibp = 0.0;
         JFrameMetodo1.p6hr = 0.0;
         JFrameMetodo1.p6pm = 0.0;
         this.val$p6valor6.setText(String.valueOf(this.val$df2d.format(JFrameMetodo1.p6ibt) + " Bs."));
         this.val$p6valor7.setText(String.valueOf(this.val$df2d.format(JFrameMetodo1.p6ibp) + " Bs."));
         this.val$p6valor8.setText(String.valueOf(this.val$df0d.format(JFrameMetodo1.p6hr)));
         this.val$p6valor9.setText(String.valueOf(this.val$df0d.format(JFrameMetodo1.p6pm)));
         this.this$0.cargaDatos6();
         this.this$0.repaint();
      }
   }

   static class JFrameMetodo1$14 implements ActionListener {
      private JFrameMetodo1 this$0;
      private JTextField val$p7valor1;
      private JTextField val$p7valor2;
      private JTextField val$p7valor3;
      private JTextField val$p7valor4;
      private JTextField val$p7valor5;
      private JTextField val$p7valor6;
      private JTextField val$p7valor7;
      private JTextField val$p7valor8;
      private DecimalFormat val$df2d;
      private JTextField val$p7valor9;
      private JTextField val$p7valor10;
      private DecimalFormat val$df0d;
      JFrameMetodo1$14(final JFrameMetodo1 this$0, final JTextField var2, final JTextField var3, final JTextField var4, final JTextField var5, final JTextField var6, 
      final JTextField var7, final JTextField var8, final JTextField var9, final DecimalFormat var10, final JTextField var11, final JTextField var12, final DecimalFormat var13) {
         this.this$0 = this$0;
         this.val$p7valor1 = var2;
         this.val$p7valor2 = var3;
         this.val$p7valor3 = var4;
         this.val$p7valor4 = var5;
         this.val$p7valor5 = var6;
         this.val$p7valor6 = var7;
         this.val$p7valor7 = var8;
         this.val$p7valor8 = var9;
         this.val$df2d = var10;
         this.val$p7valor9 = var11;
         this.val$p7valor10 = var12;
         this.val$df0d = var13;
      }
   
      public void actionPerformed(ActionEvent e) {
         if (Integer.parseInt(this.val$p7valor1.getText()) > 0 && Integer.parseInt(this.val$p7valor2.getText()) > 0 && Integer.parseInt(this.val$p7valor3.getText()) > 0 && Double.parseDouble(this.val$p7valor4.getText()) > 0.0 && Integer.parseInt(this.val$p7valor5.getText()) > 0 && Double.parseDouble(this.val$p7valor6.getText()) > 0.0 && Double.parseDouble(this.val$p7valor7.getText()) > 0.0) {
            try {
               this.this$0.limpiarTabla();
               JFrameMetodo1.p7gn = 0.0;
               JFrameMetodo1.p7ct = 0.0;
               JFrameMetodo1.p7di = 0.0;
               JFrameMetodo1.problema7(Integer.parseInt(this.val$p7valor1.getText()), Integer.parseInt(this.val$p7valor2.getText()), Integer.parseInt(this.val$p7valor3.getText()), Double.parseDouble(this.val$p7valor4.getText()), Integer.parseInt(this.val$p7valor5.getText()), Double.parseDouble(this.val$p7valor6.getText()), Double.parseDouble(this.val$p7valor7.getText()));
               this.this$0.cargaDatos7();
               this.val$p7valor8.setText(String.valueOf(this.val$df2d.format(JFrameMetodo1.p7gn) + " Bs."));
               this.val$p7valor9.setText(String.valueOf(this.val$df2d.format(JFrameMetodo1.p7ct) + " Bs."));
               this.val$p7valor10.setText(String.valueOf(this.val$df0d.format(JFrameMetodo1.p7di) + " Kg."));
               this.this$0.repaint();
            } catch (Exception var3) {
               this.this$0.repaint();
            }
         }
   
      }
   }

   static class JFrameMetodo1$15 implements ActionListener {
      private JFrameMetodo1 this$0;
      private JTextField val$p7valor1;
      private JTextField val$p7valor2;
      private JTextField val$p7valor3;
      private JTextField val$p7valor4;
      private JTextField val$p7valor5;
      private JTextField val$p7valor6;
      private JTextField val$p7valor7;
      private JTextField val$p7valor8;
      private DecimalFormat val$df2d;
      private JTextField val$p7valor9;
      private JTextField val$p7valor10;
      private DecimalFormat val$df0d;
      JFrameMetodo1$15(final JFrameMetodo1 this$0, final JTextField var2, final JTextField var3, final JTextField var4, final JTextField var5, final JTextField var6, final JTextField var7, final JTextField var8, final JTextField var9, final DecimalFormat var10, final JTextField var11, final JTextField var12, final DecimalFormat var13) {
         this.this$0 = this$0;
         this.val$p7valor1 = var2;
         this.val$p7valor2 = var3;
         this.val$p7valor3 = var4;
         this.val$p7valor4 = var5;
         this.val$p7valor5 = var6;
         this.val$p7valor6 = var7;
         this.val$p7valor7 = var8;
         this.val$p7valor8 = var9;
         this.val$df2d = var10;
         this.val$p7valor9 = var11;
         this.val$p7valor10 = var12;
         this.val$df0d = var13;
      }
   
      public void actionPerformed(ActionEvent e) {
         this.this$0.limpiarTabla();
         this.val$p7valor1.setText((String)null);
         this.val$p7valor2.setText((String)null);
         this.val$p7valor3.setText((String)null);
         this.val$p7valor4.setText((String)null);
         this.val$p7valor5.setText((String)null);
         this.val$p7valor6.setText((String)null);
         this.val$p7valor7.setText((String)null);
         JFrameMetodo1.p7gn = 0.0;
         JFrameMetodo1.p7ct = 0.0;
         JFrameMetodo1.p7di = 0.0;
         this.val$p7valor8.setText(String.valueOf(this.val$df2d.format(JFrameMetodo1.p7gn) + " Bs."));
         this.val$p7valor9.setText(String.valueOf(this.val$df2d.format(JFrameMetodo1.p7ct) + " Bs."));
         this.val$p7valor10.setText(String.valueOf(this.val$df0d.format(JFrameMetodo1.p7di) + " Kg."));
         this.this$0.cargaDatos7();
         this.this$0.repaint();
      }
   }
   
   
   

   

   public JFrameMetodo1() {
      this.setDefaultCloseOperation(3);
      this.setTitle("Simulacion de eventos");
      this.setBounds(100, 100, 1150, 720);
      this.contentPanel = new JPanel();
      this.contentPanel.setBackground(new Color(33, 47, 61)); // Azul oscuro
      this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
      this.setResizable(false);
      JPanel emptyPanel = new JPanel();
      emptyPanel.setBounds(0, 0, 1150, 70);
      emptyPanel.setBackground(new Color(33, 47, 61)); // Azul oscuro
      JLabel titulo = new JLabel("Simulacion de eventos");
      Font fuente = new Font("Arial", 1, 40);
      titulo.setBounds(5, 5, 1140, 60);
      titulo.setForeground(new Color(183, 186, 190));
      titulo.setFont(fuente);
      emptyPanel.add(titulo);
      this.contentPanel.setLayout(new BorderLayout());
      this.setContentPane(this.contentPanel);
      this.contentPanel.setLayout((LayoutManager)null);
      this.add(emptyPanel);
      JTabbedPane tabPanel = new JTabbedPane();
      tabPanel.setBounds(0, 70, 1150, 650);
      JPanel panel1 = new JPanel();
      tabPanel.addTab("Problema 1", panel1);
      panel1.setBackground(new Color(141, 162, 245));
      JPanel panel2 = new JPanel();
      tabPanel.addTab("Problema 2", panel2);
      panel2.setBackground(new Color(141, 162, 245));
      JPanel panel3 = new JPanel();
      tabPanel.addTab("Problema 3", panel3);
      panel3.setBackground(new Color(141, 162, 245));
      JPanel panel4 = new JPanel();
      tabPanel.addTab("Problema 4", panel4);
      panel4.setBackground(new Color(141, 162, 245));
      JPanel panel5 = new JPanel();
      tabPanel.addTab("Problema 5", panel5);
      panel5.setBackground(new Color(141, 162, 245));
      JPanel panel6 = new JPanel();
      tabPanel.addTab("Problema 6", panel6);
      panel6.setBackground(new Color(141, 162, 245));
      JPanel panel7 = new JPanel();
      tabPanel.addTab("Problema 7", panel7);
      panel7.setBackground(new Color(141, 162, 245));
      Font fuenteTituloPr = new Font("Arial", 1, 35);
      Font fuenteSubTitPr = new Font("Arial", 1, 25);
      JLabel p1title = new JLabel("Interés sobre una capital");
      p1title.setBounds(40, 8, 1140, 60);
      p1title.setFont(fuenteTituloPr);
      panel1.add(p1title);
      JLabel hintCantidad = new JLabel("Años");
      hintCantidad.setBounds(50, 70, 60, 30);
      panel1.add(hintCantidad);
      JTextField cantidad = new JTextField();
      cantidad.setBounds(120, 70, 80, 30);
      panel1.add(cantidad);
      JLabel hintSemilla = new JLabel("Capital Inicial");
      hintSemilla.setBounds(240, 70, 80, 30);
      panel1.add(hintSemilla);
      JTextField semilla = new JTextField();
      semilla.setBounds(340, 70, 100, 30);
      panel1.add(semilla);
      JLabel hintInteres = new JLabel("Interés");
      hintInteres.setBounds(460, 70, 60, 30);
      panel1.add(hintInteres);
      JTextField interes = new JTextField();
      interes.setBounds(540, 70, 100, 30);
      panel1.add(interes);
      JLabel p2title = new JLabel("Estimación de una población");
      p2title.setBounds(40, 8, 1140, 60);
      p2title.setFont(fuenteTituloPr);
      panel2.add(p2title);
      JLabel hintPeriodo = new JLabel("Años (Inicio 2012)");
      hintPeriodo.setBounds(40, 70, 110, 30);
      panel2.add(hintPeriodo);
      JTextField periodo = new JTextField();
      periodo.setBounds(170, 70, 70, 30);
      panel2.add(periodo);
      JLabel hintSemilla1 = new JLabel("Población Inicial");
      hintSemilla1.setBounds(260, 70, 110, 30);
      panel2.add(hintSemilla1);
      JTextField semilla1 = new JTextField();
      semilla1.setBounds(390, 70, 100, 30);
      panel2.add(semilla1);
      JLabel hintSemilla2 = new JLabel("Tasa Natalidad");
      hintSemilla2.setBounds(510, 70, 110, 30);
      panel2.add(hintSemilla2);
      JTextField semilla2 = new JTextField();
      semilla2.setBounds(630, 70, 100, 30);
      panel2.add(semilla2);
      JLabel hintTsMort = new JLabel("Tasa Mortandad");
      hintTsMort.setBounds(750, 70, 110, 30);
      panel2.add(hintTsMort);
      JTextField tsMort = new JTextField();
      tsMort.setBounds(880, 70, 100, 30);
      panel2.add(tsMort);
      JLabel p3title = new JLabel("Obtener la función maxima");
      p3title.setBounds(40, 8, 1140, 60);
      p3title.setFont(fuenteTituloPr);
      panel3.add(p3title);
      JLabel hintPeriodo3 = new JLabel("Número de Simulaciones");
      hintPeriodo3.setBounds(50, 70, 150, 30);
      panel3.add(hintPeriodo3);
      JTextField periodo3 = new JTextField();
      periodo3.setBounds(210, 70, 80, 30);
      panel3.add(periodo3);
      JLabel hintSemilla3 = new JLabel("Número de iteraciones");
      hintSemilla3.setBounds(320, 70, 150, 30);
      panel3.add(hintSemilla3);
      JTextField semilla3 = new JTextField();
      semilla3.setBounds(480, 70, 100, 30);
      panel3.add(semilla3);
      JLabel p4title = new JLabel("Lanzamiento de dados");
      p4title.setBounds(40, 8, 1140, 60);
      p4title.setFont(fuenteTituloPr);
      panel4.add(p4title);
      JLabel p4hint1 = new JLabel("Número de Simulaciones");
      p4hint1.setBounds(40, 80, 160, 30);
      panel4.add(p4hint1);
      JTextField p4valor1 = new JTextField();
      p4valor1.setBounds(240, 80, 100, 30);
      panel4.add(p4valor1);
      JLabel p4param = new JLabel("Parámetros");
      p4param.setBounds(40, 120, 400, 60);
      p4param.setFont(fuenteSubTitPr);
      panel4.add(p4param);
      JLabel p4hint2 = new JLabel("Número de Lanzamientos");
      p4hint2.setBounds(40, 200, 160, 30);
      panel4.add(p4hint2);
      JTextField p4valor2 = new JTextField();
      p4valor2.setBounds(240, 200, 100, 30);
      panel4.add(p4valor2);
      JLabel p4hint3 = new JLabel("Costo por juego");
      p4hint3.setBounds(40, 250, 160, 30);
      panel4.add(p4hint3);
      JTextField p4valor3 = new JTextField();
      p4valor3.setBounds(240, 250, 100, 30);
      panel4.add(p4valor3);
      JLabel p4hint4 = new JLabel("Costo por Juego perdido");
      p4hint4.setBounds(40, 300, 160, 30);
      panel4.add(p4hint4);
      JTextField p4valor4 = new JTextField();
      p4valor4.setBounds(240, 300, 100, 30);
      panel4.add(p4valor4);
      JLabel p4proms = new JLabel("Promedio de Resultados");
      p4proms.setBounds(450, 380, 400, 60);
      p4proms.setFont(fuenteSubTitPr);
      panel4.add(p4proms);
      JLabel p4hint5 = new JLabel("Ganancia Neta");
      p4hint5.setBounds(450, 450, 170, 30);
      panel4.add(p4hint5);
      JTextField p4valor5 = new JTextField();
      p4valor5.setBounds(630, 450, 100, 30);
      p4valor5.setEditable(false);
      p4valor5.setText(String.valueOf(p4gn + " Bs."));
      panel4.add(p4valor5);
      JLabel p4hint6 = new JLabel("Juegos Perdidos");
      p4hint6.setBounds(450, 500, 170, 30);
      panel4.add(p4hint6);
      JTextField p4valor6 = new JTextField();
      p4valor6.setBounds(630, 500, 100, 30);
      p4valor6.setEditable(false);
      p4valor6.setText(String.valueOf(p4jp));
      panel4.add(p4valor6);
      JLabel p4hint7 = new JLabel("Porcentaje Juegos Perdidos");
      p4hint7.setBounds(770, 450, 170, 30);
      panel4.add(p4hint7);
      JTextField p4valor7 = new JTextField();
      p4valor7.setBounds(950, 450, 100, 30);
      p4valor7.setEditable(false);
      p4valor7.setText(String.valueOf(p4pjp + "%"));
      panel4.add(p4valor7);
      JLabel p5title = new JLabel("Llegada de clientes");
      p5title.setBounds(40, 8, 1140, 60);
      p5title.setFont(fuenteTituloPr);
      panel5.add(p5title);
      JLabel p5hint1 = new JLabel("Número de Simulaciones");
      p5hint1.setBounds(40, 80, 160, 30);
      panel5.add(p5hint1);
      JTextField p5valor1 = new JTextField();
      p5valor1.setBounds(240, 80, 100, 30);
      panel5.add(p5valor1);
      JLabel p5param = new JLabel("Párametros");
      p5param.setBounds(40, 120, 400, 60);
      p5param.setFont(fuenteSubTitPr);
      panel5.add(p5param);
      JLabel p5hint2 = new JLabel("Cantidad de Horas");
      p5hint2.setBounds(40, 200, 160, 30);
      panel5.add(p5hint2);
      JTextField p5valor2 = new JTextField();
      p5valor2.setBounds(240, 200, 100, 30);
      panel5.add(p5valor2);
      JLabel p5hint3 = new JLabel("Costo fijo");
      p5hint3.setBounds(40, 250, 160, 30);
      panel5.add(p5hint3);
      JTextField p5valor3 = new JTextField();
      p5valor3.setBounds(240, 250, 100, 30);
      panel5.add(p5valor3);
      JLabel p5hint4 = new JLabel("Precio de Venta");
      p5hint4.setBounds(40, 300, 160, 30);
      panel5.add(p5hint4);
      JTextField p5valor4 = new JTextField();
      p5valor4.setBounds(240, 300, 100, 30);
      panel5.add(p5valor4);
      JLabel p5hint5 = new JLabel("Precio de Compra");
      p5hint5.setBounds(40, 350, 160, 30);
      panel5.add(p5hint5);
      JTextField p5valor5 = new JTextField();
      p5valor5.setBounds(240, 350, 100, 30);
      panel5.add(p5valor5);
      JLabel p5proms = new JLabel("Promedio de Resultados");
      p5proms.setBounds(450, 380, 400, 60);
      p5proms.setFont(fuenteSubTitPr);
      panel5.add(p5proms);
      JLabel p5hint6 = new JLabel("Ganancia Neta");
      p5hint6.setBounds(450, 450, 170, 30);
      panel5.add(p5hint6);
      JTextField p5valor6 = new JTextField();
      p5valor6.setBounds(630, 450, 100, 30);
      p5valor6.setEditable(false);
      p5valor6.setText(String.valueOf(p5gn + " Bs."));
      panel5.add(p5valor6);
      JLabel p5hint7 = new JLabel("Total Artículos comprados");
      p5hint7.setBounds(450, 500, 170, 30);
      panel5.add(p5hint7);
      JTextField p5valor7 = new JTextField();
      p5valor7.setBounds(630, 500, 100, 30);
      p5valor7.setEditable(false);
      p5valor7.setText(String.valueOf(0));
      panel5.add(p5valor7);
      JLabel p6title = new JLabel("Gallina ponedora de huevos");
      p6title.setBounds(40, 8, 1140, 60);
      p6title.setFont(fuenteTituloPr);
      panel6.add(p6title);
      JLabel p6hint1 = new JLabel("Número de Simulaciones");
      p6hint1.setBounds(40, 80, 160, 30);
      panel6.add(p6hint1);
      JTextField p6valor1 = new JTextField();
      p6valor1.setBounds(240, 80, 100, 30);
      panel6.add(p6valor1);
      JLabel p6param = new JLabel("Parámetros");
      p6param.setBounds(40, 120, 400, 60);
      p6param.setFont(fuenteSubTitPr);
      panel6.add(p6param);
      JLabel p6hint2 = new JLabel("Cantidad de Dias");
      p6hint2.setBounds(40, 200, 160, 30);
      panel6.add(p6hint2);
      JTextField p6valor2 = new JTextField();
      p6valor2.setBounds(240, 200, 100, 30);
      panel6.add(p6valor2);
      JLabel p6hint3 = new JLabel("Precio Venta Huevo");
      p6hint3.setBounds(40, 250, 160, 30);
      panel6.add(p6hint3);
      JTextField p6valor3 = new JTextField();
      p6valor3.setBounds(240, 250, 100, 30);
      panel6.add(p6valor3);
      JLabel p6hint4 = new JLabel("Precio Venta Pollo");
      p6hint4.setBounds(40, 300, 160, 30);
      panel6.add(p6hint4);
      JTextField p6valor4 = new JTextField();
      p6valor4.setBounds(240, 300, 100, 30);
      panel6.add(p6valor4);
      JLabel p6proms = new JLabel("Promedio de Resultados");
      p6proms.setBounds(450, 380, 400, 60);
      p6proms.setFont(fuenteSubTitPr);
      panel6.add(p6proms);
      JLabel p6hint6 = new JLabel("Ingreso Bruto Total");
      p6hint6.setBounds(450, 450, 170, 30);
      panel6.add(p6hint6);
      JTextField p6valor6 = new JTextField();
      p6valor6.setBounds(630, 450, 100, 30);
      p6valor6.setEditable(false);
      p6valor6.setText(String.valueOf(p6ibt + " Bs."));
      panel6.add(p6valor6);
      JLabel p6hint7 = new JLabel("Ingreso Bruto por Día");
      p6hint7.setBounds(450, 500, 170, 30);
      panel6.add(p6hint7);
      JTextField p6valor7 = new JTextField();
      p6valor7.setBounds(630, 500, 100, 30);
      p6valor7.setEditable(false);
      p6valor7.setText(String.valueOf(p6ibp + " Bs."));
      panel6.add(p6valor7);
      JLabel p6hint8 = new JLabel("Huevos Vendidos");
      p6hint8.setBounds(770, 450, 170, 30);
      panel6.add(p6hint8);
      JTextField p6valor8 = new JTextField();
      p6valor8.setBounds(950, 450, 100, 30);
      p6valor8.setEditable(false);
      p6valor8.setText(String.valueOf(p6hr + " Bs."));
      panel6.add(p6valor8);
      JLabel p6hint9 = new JLabel("Pollos Vendidos");
      p6hint9.setBounds(770, 500, 170, 30);
      panel6.add(p6hint9);
      JTextField p6valor9 = new JTextField();
      p6valor9.setBounds(950, 500, 100, 30);
      p6valor9.setEditable(false);
      p6valor9.setText(String.valueOf(p6pm + " Bs."));
      panel6.add(p6valor9);
      JLabel p7title = new JLabel("Agencia de azúcar");
      p7title.setBounds(40, 8, 1140, 60);
      p7title.setFont(fuenteTituloPr);
      panel7.add(p7title);
      JLabel p7hint1 = new JLabel("Número de Simulaciones");
      p7hint1.setBounds(40, 80, 160, 30);
      panel7.add(p7hint1);
      JTextField p7valor1 = new JTextField();
      p7valor1.setBounds(240, 80, 100, 30);
      panel7.add(p7valor1);
      JLabel p7param = new JLabel("Parámetros");
      p7param.setBounds(40, 120, 400, 60);
      p7param.setFont(fuenteSubTitPr);
      panel7.add(p7param);
      JLabel p7hint2 = new JLabel("Cantidad de Dias");
      p7hint2.setBounds(40, 200, 160, 30);
      panel7.add(p7hint2);
      JTextField p7valor2 = new JTextField();
      p7valor2.setBounds(240, 200, 100, 30);
      panel7.add(p7valor2);
      JLabel p7hint3 = new JLabel("Capacidad de la Bodega");
      p7hint3.setBounds(40, 250, 160, 30);
      panel7.add(p7hint3);
      JTextField p7valor3 = new JTextField();
      p7valor3.setBounds(240, 250, 100, 30);
      panel7.add(p7valor3);
      JLabel p7hint4 = new JLabel("Costo Unit. Inventario");
      p7hint4.setBounds(40, 300, 160, 30);
      panel7.add(p7hint4);
      JTextField p7valor4 = new JTextField();
      p7valor4.setBounds(240, 300, 100, 30);
      panel7.add(p7valor4);
      JLabel p7hint5 = new JLabel("Costo de Reorden");
      p7hint5.setBounds(40, 350, 160, 30);
      panel7.add(p7hint5);
      JTextField p7valor5 = new JTextField();
      p7valor5.setBounds(240, 350, 100, 30);
      panel7.add(p7valor5);
      JLabel p7hint6 = new JLabel("Costo Unit. Adquisicion");
      p7hint6.setBounds(40, 400, 160, 30);
      panel7.add(p7hint6);
      JTextField p7valor6 = new JTextField();
      p7valor6.setBounds(240, 400, 100, 30);
      panel7.add(p7valor6);
      JLabel p7hint7 = new JLabel("Costo Unit. Venta");
      p7hint7.setBounds(40, 450, 160, 30);
      panel7.add(p7hint7);
      JTextField p7valor7 = new JTextField();
      p7valor7.setBounds(240, 450, 100, 30);
      panel7.add(p7valor7);
      JLabel p7proms = new JLabel("Promedio de Resultados");
      p7proms.setBounds(450, 380, 400, 60);
      p7proms.setFont(fuenteSubTitPr);
      panel7.add(p7proms);
      JLabel p7hint8 = new JLabel("Ganancia Neta");
      p7hint8.setBounds(450, 450, 170, 30);
      panel7.add(p7hint8);
      JTextField p7valor8 = new JTextField();
      p7valor8.setBounds(630, 450, 100, 30);
      p7valor8.setEditable(false);
      p7valor8.setText(String.valueOf(p7gn + " Bs."));
      panel7.add(p7valor8);
      JLabel p7hint9 = new JLabel("Costo Total");
      p7hint9.setBounds(450, 500, 170, 30);
      panel7.add(p7hint9);
      JTextField p7valor9 = new JTextField();
      p7valor9.setBounds(630, 500, 100, 30);
      p7valor9.setEditable(false);
      p7valor9.setText(String.valueOf(p7ct + " Bs."));
      panel7.add(p7valor9);
      JLabel p7hint10 = new JLabel("Demanda Insatisfecha");
      p7hint10.setBounds(770, 450, 170, 30);
      panel7.add(p7hint10);
      JTextField p7valor10 = new JTextField();
      p7valor10.setBounds(950, 450, 100, 30);
      p7valor10.setEditable(false);
      p7valor10.setText(String.valueOf(p7di + " Kg."));
      panel7.add(p7valor10);
      DecimalFormat df0d = new DecimalFormat("0");
      new DecimalFormat("0.0");
      DecimalFormat df2d = new DecimalFormat("0.00");
      DecimalFormat df3d = new DecimalFormat("0.000");
      JButton botonAgregar1 = new JButton("Calcular");
      botonAgregar1.setBounds(50, 120, 150, 25);
      botonAgregar1.addActionListener(new JFrameMetodo1$2(this, semilla, interes, panel1, cantidad));
      panel1.add(botonAgregar1);
      JButton botonEliminar1 = new JButton("Limpiar");
      botonEliminar1.setBounds(280, 120, 150, 25);
      botonEliminar1.addActionListener(new JFrameMetodo1$3(this, cantidad, interes, semilla));
      panel1.add(botonEliminar1);
      JButton botonAgregar2 = new JButton("Calcular");
      botonAgregar2.setBounds(50, 120, 150, 25);
      botonAgregar2.addActionListener(new JFrameMetodo1$4(this, semilla1, semilla2, tsMort, panel2, periodo));
      panel2.add(botonAgregar2);
      JButton botonEliminar2 = new JButton("Limpiar");
      botonEliminar2.setBounds(280, 120, 150, 25);
      botonEliminar2.addActionListener(new JFrameMetodo1$5(this, periodo, semilla1, semilla2, tsMort));
      panel2.add(botonEliminar2);
      JButton botonAgregar3 = new JButton("Calcular");
      botonAgregar3.setBounds(50, 120, 150, 25);
      botonAgregar3.addActionListener(new JFrameMetodo1$6(this, panel3, periodo3, semilla3));
      panel3.add(botonAgregar3);
      JButton botonEliminar3 = new JButton("Limpiar");
      botonEliminar3.setBounds(280, 120, 150, 25);
      botonEliminar3.addActionListener(new JFrameMetodo1$7(this, periodo3, semilla3));
      panel3.add(botonEliminar3);
      JButton botonAgregar4 = new JButton("Simular");
      botonAgregar4.setBounds(40, 520, 140, 25);
      botonAgregar4.addActionListener(new JFrameMetodo1$8(this, p4valor1, p4valor2, p4valor3, p4valor4, panel4, p4valor5, df2d, p4valor6, df0d, p4valor7, df3d));
      panel4.add(botonAgregar4);
      JButton botonEliminar4 = new JButton("Limpiar");
      botonEliminar4.setBounds(200, 520, 140, 25);
      botonEliminar4.addActionListener(new JFrameMetodo1$9(this, p4valor1, p4valor2, p4valor3, p4valor4, p4valor5, p4valor6, p4valor7));
      panel4.add(botonEliminar4);
      JButton botonAgregar5 = new JButton("Simular");
      botonAgregar5.setBounds(40, 520, 140, 25);
      botonAgregar5.addActionListener(new JFrameMetodo1$10(this, p5valor1, p5valor2, p5valor5, p5valor4, p5valor3, p5valor6, df2d, p5valor7, df0d));
      panel5.add(botonAgregar5);
      JButton botonEliminar5 = new JButton("Limpiar");
      botonEliminar5.setBounds(200, 520, 140, 25);
      botonEliminar5.addActionListener(new JFrameMetodo1$11(this, p5valor1, p5valor2, p5valor3, p5valor4, p5valor5, p5valor6, p5valor7));
      panel5.add(botonEliminar5);
      JButton botonAgregar6 = new JButton("Simular");
      botonAgregar6.setBounds(40, 520, 140, 25);
      botonAgregar6.addActionListener(new JFrameMetodo1$12(this, p6valor1, p6valor2, p6valor3, p6valor4, p6valor6, df2d, p6valor7, p6valor8, df0d, p6valor9));
      panel6.add(botonAgregar6);
      JButton botonEliminar6 = new JButton("Limpiar");
      botonEliminar6.setBounds(200, 520, 140, 25);
      botonEliminar6.addActionListener(new JFrameMetodo1$13(this, p6valor1, p6valor2, p6valor3, p6valor4, p6valor6, df2d, p6valor7, p6valor8, df0d, p6valor9));
      panel6.add(botonEliminar6);
      JButton botonAgregar7 = new JButton("Simular");
      botonAgregar7.setBounds(40, 520, 140, 25);
      botonAgregar7.addActionListener(new JFrameMetodo1$14(this, p7valor1, p7valor2, p7valor3, p7valor4, p7valor5, p7valor6, p7valor7, p7valor8, df2d, p7valor9, p7valor10, df0d));
      panel7.add(botonAgregar7);
      JButton botonEliminar7 = new JButton("Limpiar");
      botonEliminar7.setBounds(200, 520, 140, 25);
      botonEliminar7.addActionListener(new JFrameMetodo1$15(this, p7valor1, p7valor2, p7valor3, p7valor4, p7valor5, p7valor6, p7valor7, p7valor8, df2d, p7valor9, p7valor10, df0d));
      panel7.add(botonEliminar7);
      JScrollPane scrollPanel1 = new JScrollPane();
      scrollPanel1.setBounds(50, 170, 800, 360);
      panel1.add(scrollPanel1);
      tablaDatos1 = new JTable();
      tablaDatos1.setEnabled(true);
      tablaDatos1.setRowSelectionAllowed(false);
      tablaDatos1.setModel(new DefaultTableModel(new Object[0][], new String[]{"Año", "Interés", "Capital"}));
      tablaDatos1.getColumnModel().getColumn(0).setPreferredWidth(200);
      tablaDatos1.getColumnModel().getColumn(1).setPreferredWidth(300);
      tablaDatos1.getColumnModel().getColumn(2).setPreferredWidth(300);
      scrollPanel1.setViewportView(tablaDatos1);
      JScrollPane scrollPanel2 = new JScrollPane();
      scrollPanel2.setBounds(50, 170, 800, 360);
      panel2.add(scrollPanel2);
      tablaDatos2 = new JTable();
      tablaDatos2.setEnabled(true);
      tablaDatos2.setRowSelectionAllowed(false);
      tablaDatos2.setModel(new DefaultTableModel(new Object[0][], new String[]{"Año", "Nacimientos", "Muertes", "Poblacion Final"}));
      tablaDatos2.getColumnModel().getColumn(0).setPreferredWidth(200);
      tablaDatos2.getColumnModel().getColumn(1).setPreferredWidth(200);
      tablaDatos2.getColumnModel().getColumn(2).setPreferredWidth(200);
      tablaDatos2.getColumnModel().getColumn(3).setPreferredWidth(200);
      scrollPanel2.setViewportView(tablaDatos2);
      JScrollPane scrollPanel3 = new JScrollPane();
      scrollPanel3.setBounds(50, 170, 800, 360);
      panel3.add(scrollPanel3);
      tablaDatos3 = new JTable();
      tablaDatos3.setEnabled(true);
      tablaDatos3.setRowSelectionAllowed(false);
      tablaDatos3.setModel(new DefaultTableModel(new Object[0][], new String[]{"Simulacion", "Valor de Z", "Valor de x1", "Valor de x2", "Valor de x3"}));
      tablaDatos3.getColumnModel().getColumn(0).setPreferredWidth(160);
      tablaDatos3.getColumnModel().getColumn(1).setPreferredWidth(160);
      tablaDatos3.getColumnModel().getColumn(2).setPreferredWidth(160);
      tablaDatos3.getColumnModel().getColumn(3).setPreferredWidth(160);
      tablaDatos3.getColumnModel().getColumn(4).setPreferredWidth(160);
      scrollPanel3.setViewportView(tablaDatos3);
      JScrollPane scrollPanel4 = new JScrollPane();
      scrollPanel4.setBounds(450, 80, 600, 300);
      panel4.add(scrollPanel4);
      tablaDatos4 = new JTable();
      tablaDatos4.setEnabled(true);
      tablaDatos4.setRowSelectionAllowed(false);
      tablaDatos4.setModel(new DefaultTableModel(new Object[0][], new String[]{"Numero Simulacion", "Ganancia Neta", "Juegos Perdidos", "Promedio J. P."}));
      tablaDatos4.getColumnModel().getColumn(0).setPreferredWidth(150);
      tablaDatos4.getColumnModel().getColumn(1).setPreferredWidth(150);
      tablaDatos4.getColumnModel().getColumn(2).setPreferredWidth(150);
      tablaDatos4.getColumnModel().getColumn(3).setPreferredWidth(150);
      scrollPanel4.setViewportView(tablaDatos4);
      JScrollPane scrollPanel5 = new JScrollPane();
      scrollPanel5.setBounds(450, 80, 600, 300);
      panel5.add(scrollPanel5);
      tablaDatos5 = new JTable();
      tablaDatos5.setEnabled(true);
      tablaDatos5.setRowSelectionAllowed(false);
      tablaDatos5.setModel(new DefaultTableModel(new Object[0][], new String[]{"Numero Simulacion", "Ganancia Neta", "Total Articulos Comprados"}));
      tablaDatos5.getColumnModel().getColumn(0).setPreferredWidth(200);
      tablaDatos5.getColumnModel().getColumn(1).setPreferredWidth(200);
      tablaDatos5.getColumnModel().getColumn(2).setPreferredWidth(200);
      scrollPanel5.setViewportView(tablaDatos5);
      JScrollPane scrollPanel6 = new JScrollPane();
      scrollPanel6.setBounds(450, 80, 600, 300);
      panel6.add(scrollPanel6);
      tablaDatos6 = new JTable();
      tablaDatos6.setEnabled(true);
      tablaDatos6.setRowSelectionAllowed(false);
      tablaDatos6.setModel(new DefaultTableModel(new Object[0][], new String[]{"Num. Simulacion", "I.B. Total", "I.B. Promedio", "Huevos Vendidos", "Pollos Vendidos"}));
      tablaDatos6.getColumnModel().getColumn(0).setPreferredWidth(120);
      tablaDatos6.getColumnModel().getColumn(1).setPreferredWidth(120);
      tablaDatos6.getColumnModel().getColumn(2).setPreferredWidth(120);
      tablaDatos6.getColumnModel().getColumn(3).setPreferredWidth(120);
      tablaDatos6.getColumnModel().getColumn(4).setPreferredWidth(120);
      scrollPanel6.setViewportView(tablaDatos6);
      JScrollPane scrollPanel7 = new JScrollPane();
      scrollPanel7.setBounds(450, 80, 600, 300);
      panel7.add(scrollPanel7);
      tablaDatos7 = new JTable();
      tablaDatos7.setEnabled(true);
      tablaDatos7.setRowSelectionAllowed(false);
      tablaDatos7.setModel(new DefaultTableModel(new Object[0][], new String[]{"Num. Simulacion", "Ganancia Neta", "Costo Total", "Demanda Insatisfecha"}));
      tablaDatos7.getColumnModel().getColumn(0).setPreferredWidth(150);
      tablaDatos7.getColumnModel().getColumn(1).setPreferredWidth(150);
      tablaDatos7.getColumnModel().getColumn(2).setPreferredWidth(150);
      tablaDatos7.getColumnModel().getColumn(3).setPreferredWidth(150);
      scrollPanel7.setViewportView(tablaDatos7);
      panel1.setLayout((LayoutManager)null);
      panel2.setLayout((LayoutManager)null);
      panel3.setLayout((LayoutManager)null);
      panel4.setLayout((LayoutManager)null);
      panel5.setLayout((LayoutManager)null);
      panel6.setLayout((LayoutManager)null);
      panel7.setLayout((LayoutManager)null);
      this.setLayout((LayoutManager)null);
      this.add(tabPanel);
      this.setVisible(true);
   }

   void limpiarTabla() {
      int i;
      for(i = 0; i < listaMetodo1.size(); ++i) {
         listaMetodo1.clear();
      }

      for(i = 0; i < listaMetodo2.size(); ++i) {
         listaMetodo2.clear();
      }

      for(i = 0; i < listaMetodo3.size(); ++i) {
         listaMetodo3.clear();
      }

      for(i = 0; i < listaMetodo4.size(); ++i) {
         listaMetodo4.clear();
      }

      for(i = 0; i < listaMetodo5.size(); ++i) {
         listaMetodo5.clear();
      }

      for(i = 0; i < listaMetodo6.size(); ++i) {
         listaMetodo6.clear();
      }

      for(i = 0; i < listaMetodo7.size(); ++i) {
         listaMetodo7.clear();
      }

   }

    void cargaDatos1() {
      DefaultTableModel modelo = (DefaultTableModel)tablaDatos1.getModel();
      modelo.setRowCount(0);
      Object[] fila = new Object[modelo.getColumnCount()];

      for(int i = 0; i < listaMetodo1.size(); ++i) {
         fila[0] = ((datosMetodo4)listaMetodo1.get(i)).getI();
         fila[1] = ((datosMetodo4)listaMetodo1.get(i)).getValor1();
         fila[2] = ((datosMetodo4)listaMetodo1.get(i)).getValor2();
         modelo.addRow(fila);
      }

   }

   void cargaDatos2() {
      DefaultTableModel modelo = (DefaultTableModel)tablaDatos2.getModel();
      modelo.setRowCount(0);
      Object[] fila = new Object[modelo.getColumnCount()];

      for(int i = 0; i < listaMetodo2.size(); ++i) {
         fila[0] = ((datosMetodo5)listaMetodo2.get(i)).getI();
         fila[1] = ((datosMetodo5)listaMetodo2.get(i)).getValor1();
         fila[2] = ((datosMetodo5)listaMetodo2.get(i)).getValor2();
         fila[3] = ((datosMetodo5)listaMetodo2.get(i)).getValor3();
         modelo.addRow(fila);
      }

   }

   void cargaDatos3() {
      DefaultTableModel modelo = (DefaultTableModel)tablaDatos3.getModel();
      modelo.setRowCount(0);
      Object[] fila = new Object[modelo.getColumnCount()];

      for(int i = 0; i < listaMetodo3.size(); ++i) {
         fila[0] = ((datosMetodo1)listaMetodo3.get(i)).getI();
         fila[1] = ((datosMetodo1)listaMetodo3.get(i)).getOperacion();
         fila[2] = ((datosMetodo1)listaMetodo3.get(i)).getResultado();
         fila[3] = ((datosMetodo1)listaMetodo3.get(i)).getXi();
         fila[4] = ((datosMetodo1)listaMetodo3.get(i)).getRi();
         modelo.addRow(fila);
      }

   }

   void cargaDatos4() {
      DefaultTableModel modelo = (DefaultTableModel)tablaDatos4.getModel();
      modelo.setRowCount(0);
      Object[] fila = new Object[modelo.getColumnCount()];

      for(int i = 0; i < listaMetodo4.size(); ++i) {
         fila[0] = ((datosMetodo5)listaMetodo4.get(i)).getI();
         fila[1] = ((datosMetodo5)listaMetodo4.get(i)).getValor1();
         fila[2] = ((datosMetodo5)listaMetodo4.get(i)).getValor2();
         fila[3] = ((datosMetodo5)listaMetodo4.get(i)).getValor3();
         modelo.addRow(fila);
      }

   }

   void cargaDatos5() {
      DefaultTableModel modelo = (DefaultTableModel)tablaDatos5.getModel();
      modelo.setRowCount(0);
      Object[] fila = new Object[modelo.getColumnCount()];

      for(int i = 0; i < listaMetodo5.size(); ++i) {
         fila[0] = ((datosMetodo4)listaMetodo5.get(i)).getI();
         fila[1] = ((datosMetodo4)listaMetodo5.get(i)).getValor1();
         fila[2] = ((datosMetodo4)listaMetodo5.get(i)).getValor2();
         modelo.addRow(fila);
      }

   }

   void cargaDatos6() {
      DefaultTableModel modelo = (DefaultTableModel)tablaDatos6.getModel();
      modelo.setRowCount(0);
      Object[] fila = new Object[modelo.getColumnCount()];

      for(int i = 0; i < listaMetodo6.size(); ++i) {
         fila[0] = ((datosMetodo1)listaMetodo6.get(i)).getI();
         fila[1] = ((datosMetodo1)listaMetodo6.get(i)).getOperacion();
         fila[2] = ((datosMetodo1)listaMetodo6.get(i)).getResultado();
         fila[3] = ((datosMetodo1)listaMetodo6.get(i)).getXi();
         fila[4] = ((datosMetodo1)listaMetodo6.get(i)).getRi();
         modelo.addRow(fila);
      }

   }

   void cargaDatos7() {
      DefaultTableModel modelo = (DefaultTableModel)tablaDatos7.getModel();
      modelo.setRowCount(0);
      Object[] fila = new Object[modelo.getColumnCount()];

      for(int i = 0; i < listaMetodo7.size(); ++i) {
         fila[0] = ((datosMetodo5)listaMetodo7.get(i)).getI();
         fila[1] = ((datosMetodo5)listaMetodo7.get(i)).getValor1();
         fila[2] = ((datosMetodo5)listaMetodo7.get(i)).getValor2();
         fila[3] = ((datosMetodo5)listaMetodo7.get(i)).getValor3();
         modelo.addRow(fila);
      }

   }

    static void problema1(int t, double interes, double capital) {
      DecimalFormat df1 = new DecimalFormat("0.0");
      DecimalFormat df2 = new DecimalFormat("0.00");
      int ct = 0;

      while(ct < t) {
         ++ct;
         double tasaInt = capital * interes;
         capital += tasaInt;
         String var10002 = "Año: " + ct;
         String var10003 = "Interés: " + df1.format(tasaInt);
         String var10004 = df2.format(capital);
         datosMetodo4 datos = new datosMetodo4(var10002, var10003, "Capital Final: " + var10004);
         listaMetodo1.add(datos);
      }

   }

   static void problema2(int t, int poblacion, double tasaNat, double tasaMort) {
      DecimalFormat df1 = new DecimalFormat("0.0000");
      int ct = 0;
      int nacimientos;
      int muertes;

      while(ct < t) {
         ++ct;
         nacimientos = (int)Math.round((double)poblacion * tasaNat);
         muertes = (int)Math.round((double)poblacion * tasaMort);
         poblacion = poblacion + nacimientos - muertes;
         String var10002 = "Año: " + ct;
         String var10003 = "Nacimientos: " + df1.format((long)nacimientos);
         String var10004 = "Muertes: " + df1.format((long)muertes);
         String var10005 = df1.format((long)poblacion);
         datosMetodo5 datos = new datosMetodo5(var10002, var10003, var10004, "Población: " + var10005);
         listaMetodo2.add(datos);
      }

   }

   static void problema3(int sim, int nmi) {
      DecimalFormat df1 = new DecimalFormat("0.00");

      for(int k = 0; k < sim; ++k) {
         int cit = 0;
         int x2 = 0;
         double Z = 0.0;
         double x1 = 0.0;
         double x3 = 0.0;

         while(cit < nmi) {
            ++cit;
            double r1 = Math.random();
            double r2 = Math.random();
            double r3 = Math.random();
            double x1C = 10.0 * r1;
            int x2C = (int)Math.round(r2 * 100.0);
            if (x1C + (double)x2C > 2.0) {
               double x3C = 1.0 + r3;
               double ZC = 2.0 * x1C + (double)(3 * x2C) - x3C;
               if (ZC > Z) {
                  Z = ZC;
                  x1 = x1C;
                  x2 = x2C;
                  x3 = x3C;
               }
            }
         }

         String var10002 = "Sim: " + (k + 1);
         String var10003 = "Z = " + df1.format(Z);
         String var10004 = "x1 = " + df1.format(x1);
         String var10005 = "x2 = " + df1.format((long)x2);
         String var10006 = df1.format(x3);
         datosMetodo1 datos = new datosMetodo1(var10002, var10003, var10004, var10005, "x3 = " + var10006);
         listaMetodo3.add(datos);
      }

   }

   static void problema4(int sim, double nml, int iuj, int puc) {
      DecimalFormat df1 = new DecimalFormat("0.00");
      DecimalFormat df2 = new DecimalFormat("0");
      double pgn = 0.0;
      double pjg = 0.0;
      double ppjg = 0.0;

      for(int k = 0; k < sim; ++k) {
         int cl = 0;
         int gnc = 0;
         double njc = 0.0;

         while((double)cl < nml) {
            ++cl;
            gnc += iuj;
            double rd1 = Math.random();
            double rd2 = Math.random();
            int d1 = (int)Math.round(rd1 * 5.0 + 1.0);
            int d2 = (int)Math.round(rd2 * 5.0 + 1.0);
            int sd = d1 + d2;
            if (sd == 7) {
               gnc -= puc;
            } else {
               ++njc;
            }
         }

         pgn += (double)gnc;
         pjg += njc;
         double pjc = njc / nml * 100.0;
         ppjg += pjc;
         String var10002 = "" + (k + 1);
         String var10003 = "" + gnc + " Bs.";
         String var10004 = df2.format(njc);
         String var10005 = df1.format(pjc);
         datosMetodo5 datos = new datosMetodo5(var10002, var10003, var10004, var10005 + "%");
         listaMetodo4.add(datos);
      }

      p4gn = pgn / (double)sim;
      p4jp = pjg / (double)sim;
      p4pjp = ppjg / (double)sim;
   }

   static void problema5(int sim, int nmh, int cua, int pvu, int cf) {
      double suma1 = 0.0;
      double suma2 = 0.0;

      label42:
      for(int k = 0; k < sim; ++k) {
         int ch = 0;
         int tav = 0;

         while(true) {
            int llc;
            do {
               if (ch >= nmh) {
                  int gn = tav * (pvu - cua) - cf;
                  datosMetodo4 datos = new datosMetodo4("" + (k + 1), "" + gn + " Bs.", "" + tav);
                  listaMetodo5.add(datos);
                  suma1 += (double)gn;
                  suma2 += (double)tav;
                  continue label42;
               }

               ++ch;
               double rllc = Math.random();
               llc = (int)Math.round(4.0 * rllc);
            } while(llc == 0);

            byte vac;
            for(; llc > 0; tav += vac) {
               --llc;
               double rvac = Math.random();
               if (rvac > 0.2) {
                  vac = 1;
               } else {
                  vac = 0;
               }

               if (rvac > 0.5) {
                  vac = 2;
               }

               if (rvac > 0.9) {
                  vac = 3;
               }
            }
         }
      }

      p5gn = suma1 / (double)sim;
      p5tac = suma2 / (double)sim;
   }

   static void problema6(int sim, double nmd, int puh, int pup) {
      DecimalFormat df1 = new DecimalFormat("0.00");

      for(int k = 0; k < sim; ++k) {
         int cd = 0;
         int thr = 0;
         int tpo = 0;
         int thue = 0;
         int pmue = 0;
         int pviv = 0;

         while((double)cd < nmd) {
            ++cd;
            double rhue = Math.random();
            int hue;
            if (rhue > 0.14) {
               hue = 1;
            } else {
               hue = 0;
            }

            if (rhue > 0.41) {
               hue = 2;
            }

            if (rhue > 0.68) {
               hue = 3;
            }

            if (rhue > 0.86) {
               hue = 4;
            }

            if (rhue > 0.95) {
               hue = 5;
            }

            if (rhue > 0.98) {
               hue = 6;
            }

            while(hue > 0) {
               --hue;
               double rehue = Math.random();
               if (rehue <= 0.2) {
                  ++thr;
               }

               if (rehue > 0.2 && rehue <= 0.7) {
                  ++thue;
               }

               if (rehue > 0.7) {
                  ++tpo;
                  double rdpo = Math.random();
                  if (rdpo <= 0.2) {
                     ++pmue;
                  } else {
                     ++pviv;
                  }
               }
            }
         }

         double gn = (double)(pviv * pup + thue * puh);
         double gnp = gn / nmd;
         p6ibt += gn;
         p6ibp += gnp;
         p6hr += (double)thue;
         p6pm += (double)pviv;
         datosMetodo1 datos = new datosMetodo1("" + (k + 1), "" + gn + " Bs.", df1.format(gnp) + " Bs.", "" + thue, "" + pviv);
         listaMetodo6.add(datos);
      }

      p6ibt /= (double)sim;
      p6ibp /= (double)sim;
      p6hr /= (double)sim;
      p6pm /= (double)sim;
   }

   static void problema7(int sim, int nmd, int cb, double cui, int cor, double cua, double puv) {
      new DecimalFormat("0.0");
      DecimalFormat df2 = new DecimalFormat("0.00");

      for(int k = 0; k < sim; ++k) {
         int cd = 0;
         int inv = cb;
         int pazu = 0;
         int di = 0;
         int cort = cor;
         int dll = 0;
         double gn = 0.0;
         double cdi = 0.0;
         double cad = cua * (double)cb;
         double ib = 0.0;

         while(cd < nmd) {
            ++cd;
            if (cd == dll) {
               inv += pazu;
               dll = 0;
            }

            double rdaz = Math.random();
            int daz = (int)Math.round(-100.0 * Math.log(1.0 - rdaz));
            if (daz > inv) {
               di = di + daz - inv;
               ib += (double)inv * puv;
               inv = 0;
            } else {
               ib += (double)daz * puv;
               inv -= daz;
               cdi += (double)inv * cui;
            }

            if (cd % 7 == 0) {
               pazu = cb - inv;
               cad += (double)pazu * cua;
               cort += cor;
               double rtent = Math.random();
               int tent = (int)Math.round(1.0 + 2.0 * rtent);
               dll = cd + tent;
            }
         }

         double ctot = cdi + cad + (double)cort;
         gn = ib - ctot;
         datosMetodo5 datos = new datosMetodo5("" + (k + 1), df2.format(gn) + " Bs.", df2.format(ctot) + " Bs.", "" + di + " Kg.");
         listaMetodo7.add(datos);
         p7gn += gn;
         p7ct += ctot;
         p7di += (double)di;
      }

      p7gn /= (double)sim;
      p7ct /= (double)sim;
      p7di /= (double)sim;
   }
}
//SERGIO TICONA MAMANI
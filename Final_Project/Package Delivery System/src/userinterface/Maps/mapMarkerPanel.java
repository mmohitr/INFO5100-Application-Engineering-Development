/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Maps;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.CardLayout;
import userinterface.BPOenterprise.bpoAdminPanel;
import userinterface.customer.customerCart;
import java.sql.*;
import userinterface.Delivery.deliveryAgentHome;

/**
 *
 * @author adity
 */
public class mapMarkerPanel extends javax.swing.JPanel {
Browser browser;
String longi;
String lati;
int zoom;
String orderid;
Connection connection;

    /**
     * Creates new form mapMarkerPanel
     */
    public mapMarkerPanel(String longi, String lati,int zoom, String selectedProduct) {
        this.longi = longi;
        this.lati = lati;
        this.zoom = zoom;
        this.orderid = selectedProduct;
        initComponents();
        
        loadMarkedMaps(longi,lati,zoom);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMarkers = new javax.swing.JButton();
        mapsArea = new javax.swing.JPanel();

        setMarkers.setText("Show Location");

        mapsArea.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(setMarkers)
                .addContainerGap(488, Short.MAX_VALUE))
            .addComponent(mapsArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(setMarkers)
                .addGap(17, 17, 17)
                .addComponent(mapsArea, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

     public void loadMarkedMaps(String longi,String lati,int zoom){
        
        EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDHFSC1G4NNJSWIB7FX6CBOWWCX8MKR14WNT2DH9XV6YW9EOWTXHCOQSIKV88D6J65JS").build();
        Engine engine = Engine.newInstance(options);
        browser = engine.newBrowser();
        BrowserView view = BrowserView.newInstance(browser);
//      browser.navigation().loadUrl("https://www.google.com/maps");

         browser.navigation().loadUrl("D:\\AED Project\\AED_FinalProject_MAM\\Google Maps\\index.html");
         
        String first = "var locations = [\n";
        String second = "["+orderid+","+longi+","+lati+","+String.valueOf(zoom)+"]";
        System.out.println(second);
        System.out.println("longi"+longi);
        String third = "];\n";
        String fourth = "var i;\n\nfor (i = 0; i < locations.length; i++) {  \n var marker = new google.maps.Marker({\n\tposition: new google.maps.LatLng(locations[i][1], locations[i][2]),\n\tmap: map,\n\tlabel: locations[i][0]\n });\n}\n\tbounds.extend(marker.position);";
        String fifth = "\nmap.fitBounds(bounds)";
        String setMarkerScript = first+second+third+fourth+fifth;        
        
        
        setMarkers.addActionListener(e -> browser.mainFrame().ifPresent(frame -> frame.executeJavaScript(setMarkerScript)));
        
        mapsArea.add(view);
        
        String rootPath = System.getProperty("user.dir");
        browser.navigation().loadUrl(rootPath+"/simple_map.html/");
        browser.navigation().loadUrl("D:\\AED Project\\AED_FinalProject_MAM\\Google Maps\\index.html");

        mapsArea.add(view);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mapsArea;
    private javax.swing.JButton setMarkers;
    // End of variables declaration//GEN-END:variables
}
package Tablolar;

import ArayuzIslemleri.RenkVeIconlar;
import Kullanıcılar.OkulMuduru;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Tablo {
    
    private JTable jTable;
    private DefaultTableModel tabloModel;
    private DefaultTableCellRenderer tabloSutun;
    
    RenkVeIconlar renkVeIconlar = new RenkVeIconlar();

    public Tablo(JTable jTable) {
        this.jTable = jTable;
        this.tabloModel = (DefaultTableModel) this.jTable.getModel();
        this.tabloSutun = new DefaultTableCellRenderer();
        tabloDuzenle();
    }
    
    protected void tabloDuzenle(){
    
        int tabloSutunSayısı = this.jTable.getColumnCount();
        
        this.jTable.getTableHeader().setFont(renkVeIconlar.getFontArialBold_16());
        this.jTable.getTableHeader().setForeground(renkVeIconlar.getMor());
        
        for(int i = 0; i<tabloSutunSayısı; i++){
            this.jTable.getColumnModel().getColumn(i).setCellRenderer(this.tabloSutun);
        }
    
    }
    
    public void tabloDoldur(OkulMuduru okulMuduru){
    
        tabloModel.insertRow(tabloModel.getRowCount(), new Object[]{
        
            okulMuduru.getId(),
            okulMuduru.getIsim(),
            okulMuduru.getSoyIsım(),
            okulMuduru.getYas(),
            okulMuduru.getAtamaPuanı()
            
        });
        
    }

    public DefaultTableModel getTabloModel() {
        return tabloModel;
    }
    
    
}

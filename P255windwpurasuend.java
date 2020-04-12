package javanyumon;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class P255windwpurasuend {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
/*-------------------------------------------------------------
ＡＷＴを使用してのウィンドウの作成		
		タイトル初めてのウインドウと終了機能
		ｘボタンで終了する機能の追加
-------------------------------------------------------------*/
		Frame fr =new Frame();  //Frameクラスのインスタンス化
		
		fr.setTitle("初めてのウインドウと終了機能");   //タイトルで表示する文字
		fr.setSize(600,400);  //ウィンドウの幅と高さの設定サイズ指定
		fr.setVisible(true); // //ウィンドウを画面に表示させる
		fr.addWindowListener (new WinListener () );
	}
}

 class  WinListner extends WindowAdapter {
    	   public void windowClosing (WindowEvent e) {
    		   System.exit(0);
    	   } 
       }
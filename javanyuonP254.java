package javanyumon;
import java.awt.Frame;
public class javanyuonP254 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

 /*-------------------------------------------------------------------
  AWTでウィンドウ画面の作成
  ＊ただし右上のx印は表示されているが機能実装されていない為
     エクリプスの停止ボタンでｘボタンを押したのと同じ状態【終了する】
		
-------------------------------------------------------------------*/
		Frame fr = new Frame();  // Frameクラスのインスタンス
		fr.setTitle("初めてのウィンドウ");//ウィンドウのバーに表示するタイトル
		fr.setSize(600,400);//ウィンドウの幅と高さの指定
		fr.setVisible(true);//setVisivleメソッドでウィンドウ画面が表示する()の中にはtrueを記入する
	}
}

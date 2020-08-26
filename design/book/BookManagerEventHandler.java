package design.book;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookManagerEventHandler implements ActionListener {
	BookManager bm = null; // 주의사항:절대로 new하면 안됨 - 왜냐하면 복제본이 만들어지는 거니까.
//	BookManager bm = new BookManager();

	public BookManagerEventHandler(BookManager bm) {
		this.bm = bm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String label = e.getActionCommand();// 입력|수정|상세보기
		System.out.println("label ======> " + label);
		if ("입력".equals(label)) {
			System.out.println("입력을 선택한거니?");
			bm.bookCRUD.setTitle(label);
			bm.bookCRUD.setSize(500, 400);
			bm.bookCRUD.setVisible(true);
		} else if ("수정".equals(label)) {
			System.out.println("수정을 선택한거니?");
			bm.bookCRUD.setTitle(label);
			bm.bookCRUD.setSize(500, 400);
			bm.bookCRUD.setVisible(true);
		} else if ("상세보기".equals(label)) {
			System.out.println("상세보기를 선택한거니?");
			bm.bookCRUD.setTitle(label);
			bm.bookCRUD.setSize(500, 400);
			bm.bookCRUD.setVisible(true);
		} else if ("나가기".equals(label)) {
			System.out.println("나가기를 선택한거니?");
			bm.bookCRUD.setTitle(label);
			bm.bookCRUD.setSize(500, 400);
			bm.bookCRUD.setVisible(true);
		}

	}

}

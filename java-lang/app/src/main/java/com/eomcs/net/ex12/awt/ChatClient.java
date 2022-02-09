package com.eomcs.net.ex12.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatClient extends Frame{
	private static final long serialVersionUID = 1L;

	public ChatClient() {
		super("계산기");
		this.addWindowListener(new WindowAdapter() { //익명클래스 // 수퍼클래스의 생성자 호출
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setSize(400, 300);

		Panel topPanel = new Panel();
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // 기본 레이아웃 관리자 교체

		TextField addressTf = new TextField(36);
		topPanel.add(addressTf);

		TextField portTf = new TextField(4);
		topPanel.add(portTf);

		Button connectBTN = new Button("연결");
		topPanel.add(connectBTN);

		add(topPanel, BorderLayout.NORTH);

		TextArea messageListTa = new TextArea();
		add(messageListTa, BorderLayout.CENTER);

		Panel bottomPanel = new Panel();
		bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // 기본 레이아웃 관리자 교체

		TextField messageTf = new TextField(40);
		bottomPanel.add(messageTf);

		Button sendBTN = new Button("보내기");
		bottomPanel.add(sendBTN);

		add(bottomPanel, BorderLayout.SOUTH);

		this.setVisible(true); // 윈도우 만들어달라고 운영체제에 요청

	}
	public static void main(String[] args) {
		new ChatClient();
	}

}

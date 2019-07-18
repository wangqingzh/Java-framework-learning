package com.wangqing.beans;

public class StuCard {
	private int cardId;
	private String cardInfo;
	public StuCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StuCard(int cardId, String cardInfo) {
		super();
		this.cardId = cardId;
		this.cardInfo = cardInfo;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public String getCardInfo() {
		return cardInfo;
	}
	public void setCardInfo(String cardInfo) {
		this.cardInfo = cardInfo;
	}
	@Override
	public String toString() {
		return "StuCard [cardId=" + cardId + ", cardInfo=" + cardInfo + "]";
	}
	
}

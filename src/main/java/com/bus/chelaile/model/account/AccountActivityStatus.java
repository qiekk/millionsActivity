package com.bus.chelaile.model.account;

import com.alibaba.fastjson.JSONObject;

/**
 * 用户 当前活动的答题状态
 * @author quekunkun
 *
 */
public class AccountActivityStatus {

	private boolean isRAnswer; //是否答对题
	private boolean canUsedCard; //是否使用复活卡
	private boolean isLive; //是否存活
	private int answerOrder; // 用户选择的是第几题
	private int order; //用户答到第几题了
	
	public AccountActivityStatus() {
		super();
		isLive = true;
		isRAnswer = false;
		answerOrder = -1;
		order = -1;
		canUsedCard = true;
	}
	
	public boolean isLive() {
		return isLive;
	}
	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}
	public boolean isRAnswer() {
		return isRAnswer;
	}
	public void setRAnswer(boolean isRAnswer) {
		this.isRAnswer = isRAnswer;
	}
	public boolean isCanUsedCard() {
		return canUsedCard;
	}
	public void setCanUsedCard(boolean canUsedCard) {
		this.canUsedCard = canUsedCard;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}

	public int getAnswerOrder() {
		return answerOrder;
	}

	public void setAnswerOrder(int answerOrder) {
		this.answerOrder = answerOrder;
	}

	
	@Override
	public String toString() {
		return "AccountActivityStatus [isRAnswer=" + isRAnswer + ", canUsedCard=" + canUsedCard + ", isLive=" + isLive
				+ ", answerOrder=" + answerOrder + ", order=" + order + "]";
	}

	public static void main(String[] args) {
		AccountActivityStatus acc = new AccountActivityStatus();
		acc.setLive(false);
		acc.setAnswerOrder(0);
		acc.setRAnswer(true);
		acc.setCanUsedCard(true);
		
		System.out.println(JSONObject.toJSONString(acc));
		String a = JSONObject.toJSONString(acc);
		
		AccountActivityStatus ac = JSONObject.parseObject(a, AccountActivityStatus.class);
		System.out.println(ac);
	}
}

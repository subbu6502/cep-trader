package com.ceptrader.generic.esper.pojoevents;

public class LastPrice extends Quote implements DataItem {
	private static final long	serialVersionUID	= 1L;
	
	@Deprecated
	public LastPrice() {
	}
	
	public LastPrice(
	        final int ref,
	        final String ticker,
	        final int size,
	        final double price) {
		this.ref = ref;
		this.ticker = ticker;
		this.size = size;
		this.price = price;
	}
	
	public LastPrice(
	        final int ref,
	        final String ticker,
	        final long timeStamp,
	        final int size,
	        final double price) {
		this.ref = ref;
		this.ticker = ticker;
		this.timeStamp = timeStamp;
		this.size = size;
		this.price = price;
	}
	
	public LastPrice(
	        final int ref,
	        final String ticker,
	        final long timeStamp,
	        final long duration,
	        final int size,
	        final double price) {
		this.ref = ref;
		this.ticker = ticker;
		this.timeStamp = timeStamp;
		this.duration = duration;
		this.size = size;
		this.price = price;
	}
}

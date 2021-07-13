package com.paul.sre.detect.controller.vo;

public class DetectResult {
	private boolean hasAnomaly;
	private long[] anomalyIndex;
	private double[] anomalyScore;
	public boolean isHasAnomaly() {
		return hasAnomaly;
	}
	public void setHasAnomaly(boolean hasAnomaly) {
		this.hasAnomaly = hasAnomaly;
	}
	public long[] getAnomalyIndex() {
		return anomalyIndex;
	}
	public void setAnomalyIndex(long[] anomalyIndex) {
		this.anomalyIndex = anomalyIndex;
	}
	public double[] getAnomalyScore() {
		return anomalyScore;
	}
	public void setAnomalyScore(double[] anomalyScore) {
		this.anomalyScore = anomalyScore;
	}
}

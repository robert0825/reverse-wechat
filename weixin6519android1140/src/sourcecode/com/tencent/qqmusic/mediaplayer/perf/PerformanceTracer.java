package com.tencent.qqmusic.mediaplayer.perf;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class PerformanceTracer
{
  private long lastTimeStampNanoSecond = 0L;
  private File mediaFile;
  private long playStartTimestampNanoSec = 0L;
  private final Map<String, SpeedCheck> speedMap = new LinkedHashMap();
  private long totalPcmInByte;
  private long totalTimeCostInNanoSec = 0L;
  
  private SpeedCheck getSpeedCheck(String paramString)
  {
    SpeedCheck localSpeedCheck = (SpeedCheck)this.speedMap.get(paramString);
    if (localSpeedCheck != null) {
      return localSpeedCheck;
    }
    localSpeedCheck = new SpeedCheck(paramString);
    this.speedMap.put(paramString, localSpeedCheck);
    return localSpeedCheck;
  }
  
  public void accept(Visitor paramVisitor)
  {
    ArrayList localArrayList = new ArrayList(this.speedMap.values());
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext()) {
      ((SpeedCheck)localIterator.next()).compute();
    }
    paramVisitor.visitSpeedCheck(localArrayList, new OverallInfo(this.mediaFile, Math.round(this.totalTimeCostInNanoSec / 1000000.0D), this.totalPcmInByte));
  }
  
  public void end(String paramString, int paramInt)
  {
    long l1 = System.nanoTime();
    long l2 = this.lastTimeStampNanoSecond;
    getSpeedCheck(paramString).update(paramInt, l1 - l2);
  }
  
  public void init(File paramFile)
  {
    this.mediaFile = paramFile;
    this.lastTimeStampNanoSecond = 0L;
    paramFile = this.speedMap.values().iterator();
    while (paramFile.hasNext()) {
      ((SpeedCheck)paramFile.next()).reset();
    }
  }
  
  public void playEnd() {}
  
  public void playStart()
  {
    this.totalPcmInByte = 0L;
  }
  
  public void roundEnd(int paramInt)
  {
    this.totalPcmInByte += paramInt;
    this.totalTimeCostInNanoSec += System.nanoTime() - this.playStartTimestampNanoSec;
  }
  
  public void roundStart()
  {
    this.playStartTimestampNanoSec = System.nanoTime();
  }
  
  public void start(String paramString)
  {
    getSpeedCheck(paramString);
    this.lastTimeStampNanoSecond = System.nanoTime();
  }
  
  private static class BufferSizeCheck
  {
    private int lastSize = 0;
    private int maxMismatch = 0;
    private final String name;
    private int sizeMismatchCount = 0;
    
    public BufferSizeCheck(String paramString)
    {
      this.name = paramString;
    }
    
    public int getMaxMismatch()
    {
      return this.maxMismatch;
    }
    
    public String getName()
    {
      return this.name;
    }
    
    public int getSizeMismatchCount()
    {
      return this.sizeMismatchCount;
    }
    
    void onEnd(int paramInt)
    {
      if (paramInt != this.lastSize)
      {
        paramInt = this.lastSize - paramInt;
        if (Math.abs(paramInt) > this.maxMismatch) {
          this.maxMismatch = paramInt;
        }
        this.sizeMismatchCount += 1;
      }
    }
    
    void onStart(int paramInt)
    {
      this.lastSize = paramInt;
    }
  }
  
  public static class OverallInfo
  {
    public final File mediaFile;
    public final long timeCostInMs;
    public final long totalPcmToBePlayed;
    
    public OverallInfo(File paramFile, long paramLong1, long paramLong2)
    {
      this.mediaFile = paramFile;
      this.timeCostInMs = paramLong1;
      this.totalPcmToBePlayed = paramLong2;
    }
  }
  
  public static class SpeedCheck
  {
    private static final double f = 1000000.0D;
    private double avg;
    private double max;
    private double min;
    private final String name;
    private long totalBufferLength;
    private long totalTimeNanoSecond;
    
    public SpeedCheck(String paramString)
    {
      this.name = paramString;
    }
    
    public void compute()
    {
      this.avg = (this.totalBufferLength * 1000000.0D / this.totalTimeNanoSecond);
    }
    
    public double getAvg()
    {
      return this.avg;
    }
    
    public double getMax()
    {
      return this.max;
    }
    
    public double getMin()
    {
      return this.min;
    }
    
    public String getName()
    {
      return this.name;
    }
    
    public long getTotalBufferLength()
    {
      return this.totalBufferLength;
    }
    
    public long getTotalTimeMs()
    {
      return Math.round(this.totalTimeNanoSecond / 1000000.0D);
    }
    
    void reset()
    {
      this.avg = 0.0D;
      this.max = 0.0D;
      this.min = 0.0D;
      this.totalTimeNanoSecond = 0L;
      this.totalBufferLength = 0L;
    }
    
    public String toString()
    {
      compute();
      return String.format(Locale.getDefault(), "%10s%15.2f%15.2f%15.2f%10d%15d", new Object[] { this.name, Double.valueOf(this.avg), Double.valueOf(this.max), Double.valueOf(this.min), Long.valueOf(this.totalTimeNanoSecond), Long.valueOf(this.totalBufferLength) });
    }
    
    public void update(int paramInt, long paramLong)
    {
      this.totalBufferLength += paramInt;
      this.totalTimeNanoSecond += paramLong;
      double d = paramInt * 1000000.0D / paramLong;
      if ((d > this.max) || (this.max == 0.0D)) {
        this.max = d;
      }
      while ((d >= this.min) && (this.min != 0.0D)) {
        return;
      }
      this.min = d;
    }
  }
  
  public static abstract interface Visitor
  {
    public abstract void visitSpeedCheck(List<PerformanceTracer.SpeedCheck> paramList, PerformanceTracer.OverallInfo paramOverallInfo);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\perf\PerformanceTracer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
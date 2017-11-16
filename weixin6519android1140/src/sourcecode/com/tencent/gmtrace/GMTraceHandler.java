package com.tencent.gmtrace;

import java.util.List;

public abstract class GMTraceHandler
{
  public abstract List<Integer> getPointId();
  
  public abstract void postBufferData(boolean paramBoolean);
  
  public void stopTrace() {}
  
  public abstract void syncDo(int paramInt, long paramLong);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\gmtrace\GMTraceHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
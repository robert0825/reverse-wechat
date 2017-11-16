package com.tencent.liteav.basic.module;

public abstract interface TXIModule
{
  public abstract void clearID();
  
  public abstract String getID();
  
  public abstract Object getStatusValue(int paramInt);
  
  public abstract void setID(String paramString);
  
  public abstract boolean setStatusValue(int paramInt, Object paramObject);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\module\TXIModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
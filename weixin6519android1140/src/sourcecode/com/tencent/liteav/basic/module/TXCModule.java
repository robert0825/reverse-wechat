package com.tencent.liteav.basic.module;

public class TXCModule
  implements TXIModule
{
  private String mID = "";
  
  public void clearID()
  {
    try
    {
      if (this.mID.length() != 0)
      {
        TXCStatus.stopRecord(this.mID);
        this.mID = "";
      }
      return;
    }
    finally {}
  }
  
  public void finalize()
  {
    clearID();
    super.finalize();
  }
  
  public String getID()
  {
    return this.mID;
  }
  
  public Object getStatusValue(int paramInt)
  {
    return TXCStatus.getValue(this.mID, paramInt);
  }
  
  public void setID(String paramString)
  {
    clearID();
    try
    {
      if (paramString.length() != 0)
      {
        this.mID = paramString;
        TXCStatus.startRecord(this.mID);
      }
      return;
    }
    finally {}
  }
  
  public boolean setStatusValue(int paramInt, Object paramObject)
  {
    return TXCStatus.setValue(this.mID, paramInt, paramObject);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\module\TXCModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
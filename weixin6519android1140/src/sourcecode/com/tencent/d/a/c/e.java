package com.tencent.d.a.c;

public class e
{
  public String eAR;
  public int errCode;
  
  public e(int paramInt)
  {
    this.errCode = paramInt;
    switch (this.errCode)
    {
    case 1: 
    default: 
      this.eAR = "errmsg not specified";
      return;
    case 0: 
      this.eAR = "ok";
      return;
    }
    this.eAR = "device not support soter";
  }
  
  public e(int paramInt, String paramString)
  {
    this.errCode = paramInt;
    this.eAR = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof e)) && (((e)paramObject).errCode == this.errCode);
  }
  
  public final boolean isSuccess()
  {
    return this.errCode == 0;
  }
  
  public String toString()
  {
    return "SoterCoreResult{errCode=" + this.errCode + ", errMsg='" + this.eAR + '\'' + '}';
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\a\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
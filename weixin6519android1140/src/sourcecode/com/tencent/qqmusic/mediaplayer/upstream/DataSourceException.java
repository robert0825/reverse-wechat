package com.tencent.qqmusic.mediaplayer.upstream;

public class DataSourceException
  extends Exception
{
  private final int errorCode;
  
  public DataSourceException(int paramInt, String paramString)
  {
    super(paramString);
    this.errorCode = paramInt;
  }
  
  public int getErrorCode()
  {
    return this.errorCode;
  }
  
  public String toString()
  {
    return "DataSourceException{errorCode=" + this.errorCode + "\nmessage=" + getMessage() + '}';
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\upstream\DataSourceException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
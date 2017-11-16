package com.tencent.qqvideo.proxy.pi;

public class IRefObject
{
  private long mNativePtr;
  
  public IRefObject(long paramLong)
  {
    this.mNativePtr = paramLong;
  }
  
  private static native void freeNativePtr(long paramLong);
  
  private long getNativePtr()
  {
    try
    {
      long l = this.mNativePtr;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public native void finalize();
  
  public synchronized native void release();
  
  public synchronized native void retain();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqvideo\proxy\pi\IRefObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
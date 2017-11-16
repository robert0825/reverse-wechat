package com.tencent.liteav.beauty.gpu_filters;

public class SemaphoreHandle
{
  private boolean signal = false;
  
  public void release()
  {
    try
    {
      while (!this.signal) {
        wait();
      }
      this.signal = false;
    }
    finally {}
  }
  
  public void take()
  {
    try
    {
      this.signal = true;
      notify();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\SemaphoreHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
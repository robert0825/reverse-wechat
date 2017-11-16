package com.tencent.mm.lan_cs;

import com.tencent.gmtrace.GMTrace;

public final class Server
{
  public static a gcc;
  
  public static class C2Java
  {
    public C2Java()
    {
      GMTrace.i(1336674353152L, 9959);
      GMTrace.o(1336674353152L, 9959);
    }
    
    public static void onConnect(String paramString, int paramInt)
    {
      GMTrace.i(1337077006336L, 9962);
      if (Server.gcc != null) {
        Server.gcc.onConnect(paramString, paramInt);
      }
      GMTrace.o(1337077006336L, 9962);
    }
    
    public static void onDisconnect(String paramString, int paramInt)
    {
      GMTrace.i(1337211224064L, 9963);
      if (Server.gcc != null) {
        Server.gcc.xZ();
      }
      GMTrace.o(1337211224064L, 9963);
    }
    
    public static void onRecv(String paramString, int paramInt, byte[] paramArrayOfByte)
    {
      GMTrace.i(1336942788608L, 9961);
      if (Server.gcc != null) {
        Server.gcc.onRecv(paramString, paramInt, paramArrayOfByte);
      }
      GMTrace.o(1336942788608L, 9961);
    }
    
    public static void onSend(String paramString, int paramInt1, int paramInt2)
    {
      GMTrace.i(1336808570880L, 9960);
      if (Server.gcc != null) {
        Server.gcc.fl(paramInt2);
      }
      GMTrace.o(1336808570880L, 9960);
    }
  }
  
  public static class Java2C
  {
    public Java2C()
    {
      GMTrace.i(1334392651776L, 9942);
      GMTrace.o(1334392651776L, 9942);
    }
    
    public static native int send(String paramString, int paramInt, byte[] paramArrayOfByte);
    
    public static native Object[] start();
    
    public static native void stop();
  }
  
  public static abstract interface a
  {
    public abstract void fl(int paramInt);
    
    public abstract void onConnect(String paramString, int paramInt);
    
    public abstract void onRecv(String paramString, int paramInt, byte[] paramArrayOfByte);
    
    public abstract void xZ();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\lan_cs\Server.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
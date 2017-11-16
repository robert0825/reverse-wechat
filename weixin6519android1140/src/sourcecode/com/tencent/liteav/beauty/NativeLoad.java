package com.tencent.liteav.beauty;

import com.tencent.liteav.basic.util.TXCSystemUtil;
import java.nio.ByteBuffer;

public class NativeLoad
{
  private static NativeLoad m_Instance = null;
  private static boolean m_bLoadJni = false;
  
  private NativeLoad()
  {
    TXCSystemUtil.loadLiteAVLibrary();
    if (!m_bLoadJni)
    {
      m_bLoadJni = true;
      OnLoadBeauty();
    }
  }
  
  public static native void OnLoadBeauty();
  
  public static NativeLoad getInstance()
  {
    if (m_Instance == null) {
      m_Instance = new NativeLoad();
    }
    return m_Instance;
  }
  
  public static native void nativeClearQueue();
  
  public static native void nativeDeleteYuv2Yuv();
  
  public static native void nativeGlMapBufferToQueue(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer);
  
  public static native void nativeGlReadPixs(int paramInt1, int paramInt2, byte[] paramArrayOfByte);
  
  public static native boolean nativeGlReadPixsFromQueue(int paramInt1, int paramInt2, byte[] paramArrayOfByte);
  
  public static native void nativeGlReadPixsToQueue(int paramInt1, int paramInt2);
  
  public static native int nativeLoadGLProgram(int paramInt);
  
  public static native void nativeglTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, byte[] paramArrayOfByte, int paramInt9);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\NativeLoad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
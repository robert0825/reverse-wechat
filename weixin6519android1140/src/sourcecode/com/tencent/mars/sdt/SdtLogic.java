package com.tencent.mars.sdt;

import com.tencent.mars.Mars;
import java.util.ArrayList;

public class SdtLogic
{
  private static final String TAG = "mars.SdtLogic";
  private static ICallBack callBack;
  
  static
  {
    try
    {
      ArrayList localArrayList = getLoadLibraries();
      Mars.checkLoadedModules(localArrayList, "mars.SdtLogic");
      callBack = null;
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      for (;;)
      {
        Object localObject = null;
        Mars.loadDefaultMarsLibrary();
      }
    }
  }
  
  private static native ArrayList<String> getLoadLibraries();
  
  private static void reportSignalDetectResults(String paramString) {}
  
  public static void setCallBack(ICallBack paramICallBack)
  {
    callBack = paramICallBack;
  }
  
  public static native void setHttpNetcheckCGI(String paramString);
  
  public static abstract interface ICallBack {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mars\sdt\SdtLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
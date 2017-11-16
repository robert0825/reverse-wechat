package com.qq.wx.voice.vad;

import java.io.PrintStream;

public final class a
{
  public static boolean DEBUG = false;
  public static boolean aDA = false;
  public long aDx = 0L;
  public EVadNative aDy = new EVadNative();
  public MMVoipVadNative aDz = new MMVoipVadNative();
  
  public static void ai(boolean paramBoolean)
  {
    aDA = paramBoolean;
    if (paramBoolean)
    {
      System.loadLibrary("MMVoipVadEmbed");
      if (DEBUG) {
        System.out.println("EVad loadLib MMVoipVadEmbed");
      }
    }
    do
    {
      return;
      System.loadLibrary("EVadEmbed");
    } while (!DEBUG);
    System.out.println("EVad loadLib EVadEmbed");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\qq\wx\voice\vad\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
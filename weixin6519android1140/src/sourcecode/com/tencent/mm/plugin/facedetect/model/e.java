package com.tencent.mm.plugin.facedetect.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.y.as;

public final class e
{
  private static long kSJ;
  private static long kSK;
  private static float kSL;
  
  static
  {
    GMTrace.i(5866925326336L, 43712);
    kSJ = -1L;
    kSK = -1L;
    kSL = -1.0F;
    GMTrace.o(5866925326336L, 43712);
  }
  
  public static boolean awc()
  {
    GMTrace.i(5865314713600L, 43700);
    boolean bool = Boolean.parseBoolean(as.gnb.B("last_login_face_use_debug_mode", "false"));
    GMTrace.o(5865314713600L, 43700);
    return bool;
  }
  
  public static boolean awd()
  {
    GMTrace.i(5865448931328L, 43701);
    boolean bool = Boolean.parseBoolean(as.gnb.B("last_login_face_is_force_upload_face", "false"));
    GMTrace.o(5865448931328L, 43701);
    return bool;
  }
  
  public static boolean awe()
  {
    GMTrace.i(5865583149056L, 43702);
    boolean bool = Boolean.parseBoolean(as.gnb.B("last_login_face_save_correct_debug_mode", "false"));
    GMTrace.o(5865583149056L, 43702);
    return bool;
  }
  
  public static boolean awf()
  {
    GMTrace.i(5865717366784L, 43703);
    boolean bool = Boolean.parseBoolean(as.gnb.B("last_login_face_save_final_debug_mode", "false"));
    GMTrace.o(5865717366784L, 43703);
    return bool;
  }
  
  public static boolean awg()
  {
    GMTrace.i(5865851584512L, 43704);
    boolean bool = Boolean.parseBoolean(as.gnb.B("last_login_face_save_lip_reading", "false"));
    GMTrace.o(5865851584512L, 43704);
    return bool;
  }
  
  public static boolean awh()
  {
    GMTrace.i(5865985802240L, 43705);
    boolean bool = Boolean.parseBoolean(as.gnb.B("last_login_face_save_final_voice", "false"));
    GMTrace.o(5865985802240L, 43705);
    return bool;
  }
  
  public static void bZ(long paramLong)
  {
    GMTrace.i(5865180495872L, 43699);
    kSJ = paramLong;
    GMTrace.o(5865180495872L, 43699);
  }
  
  public static void ei(boolean paramBoolean)
  {
    GMTrace.i(5866120019968L, 43706);
    as.gnb.M("last_login_face_use_debug_mode", String.valueOf(paramBoolean));
    GMTrace.o(5866120019968L, 43706);
  }
  
  public static void ej(boolean paramBoolean)
  {
    GMTrace.i(5866254237696L, 43707);
    as.gnb.M("last_login_face_save_correct_debug_mode", String.valueOf(paramBoolean));
    GMTrace.o(5866254237696L, 43707);
  }
  
  public static void ek(boolean paramBoolean)
  {
    GMTrace.i(5866388455424L, 43708);
    as.gnb.M("last_login_face_save_final_debug_mode", String.valueOf(paramBoolean));
    GMTrace.o(5866388455424L, 43708);
  }
  
  public static void el(boolean paramBoolean)
  {
    GMTrace.i(5866522673152L, 43709);
    as.gnb.M("last_login_face_save_lip_reading", String.valueOf(paramBoolean));
    GMTrace.o(5866522673152L, 43709);
  }
  
  public static void em(boolean paramBoolean)
  {
    GMTrace.i(5866656890880L, 43710);
    as.gnb.M("last_login_face_save_final_voice", String.valueOf(paramBoolean));
    GMTrace.o(5866656890880L, 43710);
  }
  
  public static void en(boolean paramBoolean)
  {
    GMTrace.i(5866791108608L, 43711);
    as.gnb.M("last_login_face_is_force_upload_face", String.valueOf(paramBoolean));
    GMTrace.o(5866791108608L, 43711);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
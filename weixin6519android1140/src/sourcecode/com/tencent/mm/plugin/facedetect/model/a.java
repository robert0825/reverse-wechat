package com.tencent.mm.plugin.facedetect.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;

public final class a
{
  public static boolean kSw;
  
  static
  {
    GMTrace.i(19907039199232L, 148319);
    kSw = false;
    GMTrace.o(19907039199232L, 148319);
  }
  
  public static abstract interface a
  {
    public static final String kSx;
    public static final String kSy;
    public static final String kSz;
    
    static
    {
      GMTrace.i(5861959270400L, 43675);
      kSx = e.ghz + "face_debug/";
      kSy = e.ghz + "facedir/";
      kSz = e.ghz + "face_debug_template/";
      GMTrace.o(5861959270400L, 43675);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
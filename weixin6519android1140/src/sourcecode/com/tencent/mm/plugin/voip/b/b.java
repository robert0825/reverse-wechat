package com.tencent.mm.plugin.voip.b;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;

public final class b
{
  private static Map<Integer, String> qNN;
  
  static
  {
    GMTrace.i(5378507014144L, 40073);
    HashMap localHashMap = new HashMap();
    qNN = localHashMap;
    localHashMap.put(Integer.valueOf(0), "CALLING_STATE_VIDEO_INVITING");
    qNN.put(Integer.valueOf(1), "CALLING_STATE_VOICE_INVITING");
    qNN.put(Integer.valueOf(2), "CALLING_STATE_VIDEO_WAITTING_ACCEPT");
    qNN.put(Integer.valueOf(3), "CALLING_STATE_VOICE_WAITTING_ACCEPT");
    qNN.put(Integer.valueOf(4), "CALLING_STATE_VIDEO_CONNECTING");
    qNN.put(Integer.valueOf(5), "CALLING_STATE_VOICE_CONNECTING");
    qNN.put(Integer.valueOf(6), "CALLING_STATE_VIDEO_TALKING");
    qNN.put(Integer.valueOf(7), "CALLING_STATE_VOICE_TALKING");
    qNN.put(Integer.valueOf(8), "CALLING_STATE_FINISH");
    qNN.put(Integer.valueOf(256), "CALLED_STATE_VIDEO_INVITING");
    qNN.put(Integer.valueOf(257), "CALLED_STATE_VOICE_INVITING");
    qNN.put(Integer.valueOf(258), "CALLED_STATE_VIDEO_CONNECTING");
    qNN.put(Integer.valueOf(259), "CALLED_STATE_VOICE_CONNECTING");
    qNN.put(Integer.valueOf(260), "CALLED_STATE_VIDEO_TALKING");
    qNN.put(Integer.valueOf(261), "CALLED_STATE_VOICE_TALKING");
    qNN.put(Integer.valueOf(262), "CALLED_STATE_FINISH");
    qNN.put(Integer.valueOf(4096), "ACTION_NOP");
    qNN.put(Integer.valueOf(4097), "ACTION_INVITE_RESPOND");
    qNN.put(Integer.valueOf(4098), "ACTION_CANCEL_INVITE");
    qNN.put(Integer.valueOf(4099), "ACTION_REJECT_INVITE");
    qNN.put(Integer.valueOf(4100), "ACTION_ACCEPT_INVITE");
    qNN.put(Integer.valueOf(4101), "ACTION_CLOSE_CAMERA");
    qNN.put(Integer.valueOf(4102), "ACTION_CONNECT_SUCC");
    qNN.put(Integer.valueOf(4103), "ACTION_SELF_HANGUP");
    qNN.put(Integer.valueOf(4104), "ACTION_ANOTHER_HANGUP");
    qNN.put(Integer.valueOf(4105), "ACTION_INVITE_TIMEOUT");
    qNN.put(Integer.valueOf(4106), "ACTION_SO_SHUTDOWN");
    qNN.put(Integer.valueOf(4107), "ACTION_PHONE_COMING");
    qNN.put(Integer.valueOf(4108), "ACTION_IGNORE_INVITE");
    qNN.put(Integer.valueOf(4109), "ACTION_ON_ERROR");
    qNN.put(Integer.valueOf(4110), "ACTION_SESSION_CALLED");
    GMTrace.o(5378507014144L, 40073);
  }
  
  public static c wA(int paramInt)
  {
    GMTrace.i(5377835925504L, 40068);
    c localc = new c(paramInt);
    localc.Q(0, 4098, 8);
    localc.Q(0, 4106, 8);
    localc.Q(0, 4107, 8);
    localc.Q(0, 4109, 8);
    localc.Q(0, 4097, 2);
    localc.Q(0, 4101, 1);
    localc.Q(1, 4097, 3);
    localc.Q(1, 4098, 8);
    localc.Q(1, 4106, 8);
    localc.Q(1, 4107, 8);
    localc.Q(1, 4109, 8);
    localc.Q(2, 4098, 8);
    localc.Q(2, 4099, 8);
    localc.Q(2, 4105, 8);
    localc.Q(2, 4106, 8);
    localc.Q(2, 4107, 8);
    localc.Q(2, 4109, 8);
    localc.Q(2, 4100, 4);
    localc.Q(2, 4101, 3);
    localc.Q(3, 4100, 5);
    localc.Q(3, 4098, 8);
    localc.Q(3, 4099, 8);
    localc.Q(3, 4105, 8);
    localc.Q(3, 4106, 8);
    localc.Q(3, 4107, 8);
    localc.Q(3, 4109, 8);
    localc.Q(4, 4102, 6);
    localc.Q(4, 4101, 5);
    localc.Q(5, 4102, 7);
    localc.Q(6, 4103, 8);
    localc.Q(6, 4104, 8);
    localc.Q(6, 4106, 8);
    localc.Q(6, 4107, 8);
    localc.Q(6, 4109, 8);
    localc.Q(6, 4101, 7);
    localc.Q(7, 4103, 8);
    localc.Q(7, 4104, 8);
    localc.Q(7, 4106, 8);
    localc.Q(7, 4107, 8);
    localc.Q(7, 4109, 8);
    localc.Q(4, 4098, 8);
    localc.Q(4, 4099, 8);
    localc.Q(4, 4106, 8);
    localc.Q(4, 4107, 8);
    localc.Q(4, 4103, 8);
    localc.Q(4, 4109, 8);
    localc.Q(5, 4098, 8);
    localc.Q(5, 4099, 8);
    localc.Q(5, 4106, 8);
    localc.Q(5, 4107, 8);
    localc.Q(5, 4103, 8);
    localc.Q(5, 4109, 8);
    localc.Q(0, 4110, 4);
    localc.Q(1, 4110, 5);
    GMTrace.o(5377835925504L, 40068);
    return localc;
  }
  
  public static boolean wB(int paramInt)
  {
    GMTrace.i(5377970143232L, 40069);
    if ((260 == paramInt) || (261 == paramInt) || (6 == paramInt) || (7 == paramInt))
    {
      GMTrace.o(5377970143232L, 40069);
      return true;
    }
    GMTrace.o(5377970143232L, 40069);
    return false;
  }
  
  public static boolean wC(int paramInt)
  {
    GMTrace.i(5378104360960L, 40070);
    if ((paramInt == 0) || (2 == paramInt) || (4 == paramInt) || (6 == paramInt) || (256 == paramInt) || (258 == paramInt) || (260 == paramInt))
    {
      GMTrace.o(5378104360960L, 40070);
      return true;
    }
    GMTrace.o(5378104360960L, 40070);
    return false;
  }
  
  public static boolean wD(int paramInt)
  {
    GMTrace.i(5378238578688L, 40071);
    if ((1 == paramInt) || (paramInt == 0) || (2 == paramInt) || (3 == paramInt))
    {
      GMTrace.o(5378238578688L, 40071);
      return true;
    }
    GMTrace.o(5378238578688L, 40071);
    return false;
  }
  
  public static String wy(int paramInt)
  {
    GMTrace.i(5377567490048L, 40066);
    if (qNN.containsKey(Integer.valueOf(paramInt)))
    {
      String str = (String)qNN.get(Integer.valueOf(paramInt));
      GMTrace.o(5377567490048L, 40066);
      return str;
    }
    GMTrace.o(5377567490048L, 40066);
    return "no found value";
  }
  
  public static c wz(int paramInt)
  {
    GMTrace.i(5377701707776L, 40067);
    c localc = new c(paramInt);
    localc.Q(256, 4098, 262);
    localc.Q(256, 4099, 262);
    localc.Q(256, 4105, 262);
    localc.Q(256, 4106, 262);
    localc.Q(256, 4107, 262);
    localc.Q(256, 4108, 262);
    localc.Q(256, 4109, 262);
    localc.Q(256, 4100, 258);
    localc.Q(256, 4101, 257);
    localc.Q(257, 4100, 259);
    localc.Q(257, 4098, 262);
    localc.Q(257, 4099, 262);
    localc.Q(257, 4105, 262);
    localc.Q(257, 4106, 262);
    localc.Q(257, 4107, 262);
    localc.Q(257, 4108, 262);
    localc.Q(257, 4109, 262);
    localc.Q(258, 4098, 262);
    localc.Q(258, 4106, 262);
    localc.Q(258, 4107, 262);
    localc.Q(258, 4103, 262);
    localc.Q(258, 4109, 262);
    localc.Q(258, 4102, 260);
    localc.Q(259, 4102, 261);
    localc.Q(259, 4098, 262);
    localc.Q(259, 4106, 262);
    localc.Q(259, 4107, 262);
    localc.Q(259, 4103, 262);
    localc.Q(259, 4109, 262);
    localc.Q(260, 4101, 261);
    localc.Q(260, 4103, 262);
    localc.Q(260, 4104, 262);
    localc.Q(260, 4106, 262);
    localc.Q(260, 4107, 262);
    localc.Q(260, 4109, 262);
    localc.Q(261, 4103, 262);
    localc.Q(261, 4104, 262);
    localc.Q(261, 4106, 262);
    localc.Q(261, 4107, 262);
    localc.Q(261, 4109, 262);
    GMTrace.o(5377701707776L, 40067);
    return localc;
  }
  
  public static int y(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    GMTrace.i(5378372796416L, 40072);
    if ((true == paramBoolean1) && (true == paramBoolean2)) {
      i = 0;
    }
    for (;;)
    {
      GMTrace.o(5378372796416L, 40072);
      return i;
      if ((true != paramBoolean1) || (paramBoolean2)) {
        if ((!paramBoolean1) && (true == paramBoolean2)) {
          i = 256;
        } else {
          i = 257;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.ui.chatting;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.chat.c;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;

final class dr
  extends c
{
  String chatroomName;
  String desc;
  String designerName;
  String designerRediretctUrl;
  int designerUIN;
  String eEa;
  f.a eRj;
  String eTo;
  String eTp;
  String eYm;
  String fwt;
  String gkG;
  String iconUrl;
  int jHw;
  int pageType;
  int position;
  long rFn;
  int rFo;
  String secondUrl;
  int tid;
  String title;
  String userName;
  boolean wFA;
  String wFB;
  Bundle wFC;
  boolean wFv;
  String wFw;
  boolean wFx;
  boolean wFy;
  String wFz;
  boolean wqK;
  
  public dr()
  {
    GMTrace.i(2397128622080L, 17860);
    GMTrace.o(2397128622080L, 17860);
  }
  
  public dr(au paramau, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, String paramString7, String paramString8)
  {
    GMTrace.i(2397262839808L, 17861);
    this.eRz = paramau;
    this.wqK = false;
    this.position = paramInt1;
    this.userName = paramString1;
    this.jHw = 10;
    this.wFv = false;
    this.title = paramString2;
    this.eTo = paramString3;
    this.eTp = paramString4;
    this.wFw = paramString5;
    this.designerUIN = paramInt2;
    this.designerName = paramString6;
    this.designerRediretctUrl = paramString7;
    this.fwt = paramString8;
    GMTrace.o(2397262839808L, 17861);
  }
  
  public dr(au paramau, String paramString, int paramInt)
  {
    this(paramString, paramInt);
    GMTrace.i(2398336581632L, 17869);
    this.eRz = paramau;
    GMTrace.o(2398336581632L, 17869);
  }
  
  public dr(au paramau, String paramString1, String paramString2)
  {
    GMTrace.i(2398739234816L, 17872);
    this.eRz = paramau;
    this.userName = paramString1;
    this.eRz = paramau;
    this.wFB = paramString2;
    this.jHw = 6;
    GMTrace.o(2398739234816L, 17872);
  }
  
  private dr(au paramau, boolean paramBoolean, int paramInt1, String paramString, int paramInt2)
  {
    this(paramau, paramBoolean, paramInt1, paramString, paramInt2, false);
    GMTrace.i(2397933928448L, 17866);
    GMTrace.o(2397933928448L, 17866);
  }
  
  public dr(au paramau, boolean paramBoolean, int paramInt1, String paramString, int paramInt2, byte paramByte)
  {
    this(paramau, paramBoolean, paramInt1, paramString, paramInt2);
    GMTrace.i(2398068146176L, 17867);
    GMTrace.o(2398068146176L, 17867);
  }
  
  private dr(au paramau, boolean paramBoolean1, int paramInt1, String paramString, int paramInt2, boolean paramBoolean2)
  {
    this(paramau, paramBoolean1, paramInt1, paramString, paramInt2, false, null, null, null);
    GMTrace.i(2397799710720L, 17865);
    GMTrace.o(2397799710720L, 17865);
  }
  
  public dr(au paramau, boolean paramBoolean1, int paramInt1, String paramString1, int paramInt2, boolean paramBoolean2, String paramString2, String paramString3, String paramString4)
  {
    this(paramau, paramBoolean1, paramInt1, paramString1, paramInt2, paramBoolean2, paramString2, paramString3, paramString4, null);
    GMTrace.i(2397665492992L, 17864);
    GMTrace.o(2397665492992L, 17864);
  }
  
  public dr(au paramau, boolean paramBoolean1, int paramInt1, String paramString1, int paramInt2, boolean paramBoolean2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this(paramau, paramBoolean1, paramInt1, paramString1, paramInt2, paramBoolean2, paramString2, paramString3, paramString4, paramString5, null, null, false, false);
    GMTrace.i(2397531275264L, 17863);
    GMTrace.o(2397531275264L, 17863);
  }
  
  public dr(au paramau, boolean paramBoolean1, int paramInt1, String paramString1, int paramInt2, boolean paramBoolean2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, boolean paramBoolean3, boolean paramBoolean4)
  {
    GMTrace.i(2397397057536L, 17862);
    this.eRz = paramau;
    this.wqK = paramBoolean1;
    this.position = paramInt1;
    this.userName = paramString1;
    this.jHw = paramInt2;
    this.wFv = paramBoolean2;
    this.title = paramString2;
    this.eTo = paramString3;
    this.eTp = paramString4;
    this.wFw = paramString5;
    this.eEa = paramString6;
    this.fwt = paramString7;
    this.wFx = paramBoolean3;
    this.wFy = paramBoolean4;
    GMTrace.o(2397397057536L, 17862);
  }
  
  public dr(au paramau, boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    this(paramau, paramBoolean, paramInt, paramString1, 0);
    GMTrace.i(2398202363904L, 17868);
    this.chatroomName = paramString2;
    GMTrace.o(2398202363904L, 17868);
  }
  
  private dr(String paramString, int paramInt)
  {
    GMTrace.i(2398470799360L, 17870);
    this.userName = paramString;
    this.jHw = paramInt;
    GMTrace.o(2398470799360L, 17870);
  }
  
  public dr(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(2398605017088L, 17871);
    this.userName = paramString1;
    this.jHw = paramInt;
    this.chatroomName = paramString2;
    GMTrace.o(2398605017088L, 17871);
  }
  
  public static dr Wm(String paramString)
  {
    GMTrace.i(2398873452544L, 17873);
    dr localdr = new dr();
    localdr.jHw = 7;
    localdr.fwt = paramString;
    GMTrace.o(2398873452544L, 17873);
    return localdr;
  }
  
  public static dr a(au paramau, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(2399141888000L, 17875);
    dr localdr = new dr();
    localdr.eRz = paramau;
    localdr.wqK = paramBoolean;
    localdr.position = paramInt;
    localdr.jHw = 0;
    localdr.wFA = false;
    GMTrace.o(2399141888000L, 17875);
    return localdr;
  }
  
  public static dr a(f.a parama, au paramau)
  {
    GMTrace.i(2399007670272L, 17874);
    dr localdr = new dr();
    localdr.eRj = parama;
    localdr.eRz = paramau;
    GMTrace.o(2399007670272L, 17874);
    return localdr;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
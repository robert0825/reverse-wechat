package com.tencent.mm.h;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.h;

public final class a
{
  public String desc;
  public String eBt;
  private c fLM;
  public int showType;
  public String url;
  
  public a()
  {
    GMTrace.i(1270907666432L, 9469);
    GMTrace.o(1270907666432L, 9469);
  }
  
  public static a dH(String paramString)
  {
    GMTrace.i(1271041884160L, 9470);
    paramString = c.dJ(paramString);
    if (paramString != null)
    {
      a locala = new a();
      locala.fLM = paramString;
      locala.url = paramString.url;
      locala.desc = paramString.desc;
      locala.showType = paramString.showType;
      locala.eBt = paramString.eBt;
      GMTrace.o(1271041884160L, 9470);
      return locala;
    }
    GMTrace.o(1271041884160L, 9470);
    return null;
  }
  
  public final boolean a(Context paramContext, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(1271176101888L, 9471);
    if ((this.showType == 3) || (this.showType == 4))
    {
      String str3 = this.fLM.fLY;
      String str4 = this.fLM.fLZ;
      String str1 = str3;
      String str2 = str4;
      int i;
      if (bg.nm(str3))
      {
        str1 = str3;
        str2 = str4;
        if (bg.nm(str4))
        {
          if (this.showType != 3) {
            break label184;
          }
          i = a.h.cUW;
          str1 = paramContext.getString(i);
          if (this.showType != 3) {
            break label192;
          }
          i = a.h.cTJ;
          label109:
          str2 = paramContext.getString(i);
        }
      }
      if ((bg.nm(str1)) || (bg.nm(str2)))
      {
        str3 = this.desc;
        str4 = this.eBt;
        if (bg.nm(str1))
        {
          label153:
          if (!bg.nm(str1)) {
            break label207;
          }
          label161:
          h.a(paramContext, str3, str4, str2, paramOnClickListener2);
        }
      }
      for (;;)
      {
        GMTrace.o(1271176101888L, 9471);
        return true;
        label184:
        i = a.h.cTM;
        break;
        label192:
        i = a.h.cSk;
        break label109;
        str2 = str1;
        break label153;
        label207:
        paramOnClickListener2 = paramOnClickListener1;
        break label161;
        h.a(paramContext, this.desc, this.eBt, str1, str2, paramOnClickListener1, paramOnClickListener2);
      }
    }
    if (this.showType == 1)
    {
      h.b(paramContext, this.desc, this.eBt, true);
      GMTrace.o(1271176101888L, 9471);
      return true;
    }
    if (this.showType == 5)
    {
      h.b(paramContext, this.desc, this.eBt, true);
      GMTrace.o(1271176101888L, 9471);
      return true;
    }
    GMTrace.o(1271176101888L, 9471);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
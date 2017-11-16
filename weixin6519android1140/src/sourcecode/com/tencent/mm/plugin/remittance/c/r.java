package com.tencent.mm.plugin.remittance.c;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.remittance.b.d;
import com.tencent.mm.plugin.x.a;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;
import java.util.HashMap;
import java.util.HashSet;

public final class r
{
  public static String TAG;
  public Object lock;
  public HashSet<String> ona;
  public HashMap<String, String> onb;
  
  static
  {
    GMTrace.i(10795266080768L, 80431);
    TAG = "MicroMsg.RemittanceLocalMsgMgr";
    GMTrace.o(10795266080768L, 80431);
  }
  
  public r()
  {
    GMTrace.i(10794594992128L, 80426);
    this.ona = null;
    this.onb = new HashMap();
    this.ona = new HashSet();
    this.lock = new Object();
    GMTrace.o(10794594992128L, 80426);
  }
  
  /* Error */
  private boolean FD(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 54
    //   5: ldc 56
    //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 41	com/tencent/mm/plugin/remittance/c/r:ona	Ljava/util/HashSet;
    //   14: aload_1
    //   15: invokevirtual 60	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   18: ifne +24 -> 42
    //   21: aload_0
    //   22: getfield 41	com/tencent/mm/plugin/remittance/c/r:ona	Ljava/util/HashSet;
    //   25: aload_1
    //   26: invokevirtual 63	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   29: istore_2
    //   30: ldc2_w 54
    //   33: ldc 56
    //   35: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   38: aload_0
    //   39: monitorexit
    //   40: iload_2
    //   41: ireturn
    //   42: getstatic 29	com/tencent/mm/plugin/remittance/c/r:TAG	Ljava/lang/String;
    //   45: ldc 65
    //   47: invokestatic 70	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: iconst_0
    //   51: istore_2
    //   52: ldc2_w 54
    //   55: ldc 56
    //   57: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   60: goto -22 -> 38
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	this	r
    //   0	68	1	paramString	String
    //   29	23	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	38	63	finally
    //   42	50	63	finally
    //   52	60	63	finally
  }
  
  public final boolean FC(String paramString)
  {
    GMTrace.i(10794729209856L, 80427);
    synchronized (this.lock)
    {
      boolean bool = this.ona.contains(paramString);
      GMTrace.o(10794729209856L, 80427);
      return bool;
    }
  }
  
  public final boolean O(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(10795131863040L, 80430);
    if ((TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString3)) || (TextUtils.isEmpty(paramString1)))
    {
      w.e(TAG, "msgxml or toUserName or antiRepeatid is null");
      GMTrace.o(10795131863040L, 80430);
      return false;
    }
    if (!FD(paramString1))
    {
      GMTrace.o(10795131863040L, 80430);
      return false;
    }
    au localau = new au();
    localau.setContent(paramString2);
    localau.dB(2);
    localau.db(paramString3);
    localau.E(bc.gR(paramString3));
    localau.dC(1);
    localau.setType(419430449);
    long l = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().P(localau);
    if (l < 0L)
    {
      w.e(TAG, com.tencent.mm.compatible.util.g.tC() + "insert msg failed :" + l);
      this.ona.remove(paramString1);
      GMTrace.o(10795131863040L, 80430);
      return false;
    }
    localau.C(l);
    f localf;
    boolean bool1;
    if (localau.aCp())
    {
      com.tencent.mm.modelstat.b.gWv.a(localau, com.tencent.mm.x.g.g(localau));
      localf = new f();
      localf.field_xml = localau.field_content;
      paramString3 = bg.Sx(paramString2);
      paramString2 = null;
      if (paramString3 != null)
      {
        paramString3 = f.a.C(paramString3, localau.field_reserved);
        paramString2 = paramString3;
        if (paramString3 != null)
        {
          localf.field_title = paramString3.title;
          localf.field_description = paramString3.description;
          paramString2 = paramString3;
        }
      }
      localf.field_type = 2000;
      localf.field_msgId = l;
      paramString3 = a.aWz().er(l);
      if ((paramString3 == null) || (paramString3.field_msgId != l)) {
        break label413;
      }
      bool1 = a.aWz().c(localf, new String[0]);
    }
    for (;;)
    {
      if (paramString2 != null)
      {
        paramString1 = new com.tencent.mm.plugin.remittance.b.c();
        paramString1.field_locaMsgId = localau.field_msgId;
        paramString1.field_transferId = paramString2.gjA;
        paramString1.field_receiveStatus = -1;
        paramString1.field_isSend = true;
        com.tencent.mm.plugin.remittance.a.b.bbf();
        com.tencent.mm.plugin.remittance.a.b.bbh().a(paramString1);
      }
      GMTrace.o(10795131863040L, 80430);
      return bool1;
      com.tencent.mm.modelstat.b.gWv.f(localau);
      break;
      label413:
      boolean bool2 = a.aWz().b(localf);
      bool1 = bool2;
      if (!bool2)
      {
        w.e(TAG, "PinOpenApi.getAppMessageStorage().insert msg failed id:" + l);
        this.ona.remove(paramString1);
        bool1 = bool2;
      }
    }
  }
  
  public final boolean ds(String paramString1, String paramString2)
  {
    GMTrace.i(10794997645312L, 80429);
    String str = (String)this.onb.get(paramString1);
    if (bg.nm(str))
    {
      w.w(TAG, "empty transid: %s", new Object[] { paramString1 });
      GMTrace.o(10794997645312L, 80429);
      return false;
    }
    boolean bool = O(paramString1, str, paramString2);
    GMTrace.o(10794997645312L, 80429);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
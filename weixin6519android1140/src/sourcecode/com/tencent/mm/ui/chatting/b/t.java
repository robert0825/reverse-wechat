package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.bf;
import com.tencent.mm.ui.chatting.cg.c.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class t
{
  private HashMap<Long, String> wJR;
  private HashMap<Long, cg.c.a> wJS;
  private LinkedHashMap<Long, au> wJT;
  public boolean wJU;
  long wJV;
  boolean wJW;
  private h wtd;
  
  public t(h paramh)
  {
    GMTrace.i(19084955615232L, 142194);
    this.wJR = new HashMap();
    this.wJS = new HashMap();
    this.wJT = new LinkedHashMap();
    this.wJU = false;
    this.wJV = 0L;
    this.wJW = false;
    this.wtd = paramh;
    GMTrace.o(19084955615232L, 142194);
  }
  
  public static boolean ceL()
  {
    GMTrace.i(19085626703872L, 142199);
    at.AR();
    if (!((Boolean)c.xh().get(75, Boolean.valueOf(false))).booleanValue())
    {
      GMTrace.o(19085626703872L, 142199);
      return true;
    }
    GMTrace.o(19085626703872L, 142199);
    return false;
  }
  
  public static void ceM()
  {
    GMTrace.i(19085760921600L, 142200);
    at.AR();
    c.xh().set(75, Boolean.valueOf(true));
    GMTrace.o(19085760921600L, 142200);
  }
  
  public final void aU(au paramau)
  {
    GMTrace.i(19085895139328L, 142201);
    if (paramau == null)
    {
      w.d("MicroMsg.TransformImp", "go VoiceTransTextAct need MsgInfo but null");
      GMTrace.o(19085895139328L, 142201);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("voice_trans_text_msg_id", paramau.field_msgId);
    localIntent.putExtra("voice_trans_text_img_path", paramau.field_imgPath);
    localIntent.putExtra("MMActivity.OverrideExitAnimation", R.a.aLt);
    localIntent.putExtra("MMActivity.OverrideEnterAnimation", 0);
    q.D(paramau);
    d.b(this.wtd.cdg().vKB.vKW, "subapp", ".ui.voicetranstext.VoiceTransTextUI", localIntent);
    this.wtd.cdg().vKB.vKW.overridePendingTransition(R.a.aLs, R.a.aLj);
    GMTrace.o(19085895139328L, 142201);
  }
  
  public final void ceK()
  {
    try
    {
      GMTrace.i(19085492486144L, 142198);
      this.wJT.clear();
      GMTrace.o(19085492486144L, 142198);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final cg.c.a fe(long paramLong)
  {
    try
    {
      GMTrace.i(19085224050688L, 142196);
      cg.c.a locala2 = (cg.c.a)this.wJS.get(Long.valueOf(paramLong));
      cg.c.a locala1 = locala2;
      if (locala2 == null) {
        locala1 = cg.c.a.wyx;
      }
      GMTrace.o(19085224050688L, 142196);
      return locala1;
    }
    finally {}
  }
  
  /* Error */
  public final boolean ff(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 222
    //   5: ldc -32
    //   7: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 45	com/tencent/mm/ui/chatting/b/t:wJT	Ljava/util/LinkedHashMap;
    //   14: lload_1
    //   15: invokestatic 210	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   18: invokevirtual 228	java/util/LinkedHashMap:containsKey	(Ljava/lang/Object;)Z
    //   21: ifeq +17 -> 38
    //   24: iconst_1
    //   25: istore_3
    //   26: ldc2_w 222
    //   29: ldc -32
    //   31: invokestatic 56	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   34: aload_0
    //   35: monitorexit
    //   36: iload_3
    //   37: ireturn
    //   38: iconst_0
    //   39: istore_3
    //   40: ldc2_w 222
    //   43: ldc -32
    //   45: invokestatic 56	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   48: goto -14 -> 34
    //   51: astore 4
    //   53: aload_0
    //   54: monitorexit
    //   55: aload 4
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	this	t
    //   0	58	1	paramLong	long
    //   25	15	3	bool	boolean
    //   51	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	24	51	finally
    //   26	34	51	finally
    //   40	48	51	finally
  }
  
  public final String v(long paramLong, String paramString)
  {
    try
    {
      GMTrace.i(19085089832960L, 142195);
      String str2 = (String)this.wJR.get(Long.valueOf(paramLong));
      String str1 = str2;
      if (com.tencent.mm.sdk.platformtools.bg.nm(str2))
      {
        paramString = m.NL().UE(paramString);
        str1 = str2;
        if (paramString != null)
        {
          str1 = str2;
          if (!com.tencent.mm.sdk.platformtools.bg.nm(paramString.field_content)) {
            str1 = paramString.field_content;
          }
        }
      }
      GMTrace.o(19085089832960L, 142195);
      return str1;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
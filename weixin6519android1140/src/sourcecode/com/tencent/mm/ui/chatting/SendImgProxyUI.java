package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.ao.d;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public class SendImgProxyUI
  extends MMBaseActivity
{
  private static boolean aDI;
  private r iBj;
  
  static
  {
    GMTrace.i(2395920662528L, 17851);
    aDI = false;
    GMTrace.o(2395920662528L, 17851);
  }
  
  public SendImgProxyUI()
  {
    GMTrace.i(2394846920704L, 17843);
    this.iBj = null;
    GMTrace.o(2394846920704L, 17843);
  }
  
  /* Error */
  private static ArrayList<String> a(ArrayList<String> paramArrayList1, int paramInt, ArrayList<String> paramArrayList2, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc2_w 41
    //   3: ldc 43
    //   5: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 45	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 46	java/util/ArrayList:<init>	()V
    //   15: astore 6
    //   17: aload_0
    //   18: ifnull +190 -> 208
    //   21: aload_0
    //   22: invokevirtual 50	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   25: astore 7
    //   27: aload 7
    //   29: invokeinterface 56 1 0
    //   34: ifeq +174 -> 208
    //   37: aload 7
    //   39: invokeinterface 60 1 0
    //   44: checkcast 62	java/lang/String
    //   47: astore 8
    //   49: aload 8
    //   51: invokevirtual 66	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   54: ldc 68
    //   56: invokevirtual 72	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   59: ifeq +111 -> 170
    //   62: aconst_null
    //   63: astore 5
    //   65: aload 8
    //   67: invokestatic 78	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   70: astore_0
    //   71: aload_0
    //   72: astore 5
    //   74: aload_0
    //   75: invokestatic 84	com/tencent/mm/sdk/platformtools/MMBitmapFactory:checkIsImageLegal	(Ljava/io/InputStream;)Z
    //   78: ifeq +33 -> 111
    //   81: aload_0
    //   82: astore 5
    //   84: aload 8
    //   86: invokestatic 90	com/tencent/mm/a/e:aY	(Ljava/lang/String;)I
    //   89: istore 4
    //   91: iload_3
    //   92: ifne +34 -> 126
    //   95: iload 4
    //   97: iload_1
    //   98: if_icmple +28 -> 126
    //   101: aload_0
    //   102: astore 5
    //   104: aload_2
    //   105: aload 8
    //   107: invokevirtual 94	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   110: pop
    //   111: aload_0
    //   112: ifnull -85 -> 27
    //   115: aload_0
    //   116: invokevirtual 99	java/io/InputStream:close	()V
    //   119: goto -92 -> 27
    //   122: astore_0
    //   123: goto -96 -> 27
    //   126: aload_0
    //   127: astore 5
    //   129: aload 6
    //   131: aload 8
    //   133: invokevirtual 94	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   136: pop
    //   137: goto -26 -> 111
    //   140: astore 5
    //   142: aload_0
    //   143: ifnull -116 -> 27
    //   146: aload_0
    //   147: invokevirtual 99	java/io/InputStream:close	()V
    //   150: goto -123 -> 27
    //   153: astore_0
    //   154: goto -127 -> 27
    //   157: astore_0
    //   158: aload 5
    //   160: ifnull +8 -> 168
    //   163: aload 5
    //   165: invokevirtual 99	java/io/InputStream:close	()V
    //   168: aload_0
    //   169: athrow
    //   170: aload 8
    //   172: invokestatic 90	com/tencent/mm/a/e:aY	(Ljava/lang/String;)I
    //   175: istore 4
    //   177: iload_3
    //   178: ifne +19 -> 197
    //   181: iload 4
    //   183: iload_1
    //   184: if_icmple +13 -> 197
    //   187: aload_2
    //   188: aload 8
    //   190: invokevirtual 94	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   193: pop
    //   194: goto -167 -> 27
    //   197: aload 6
    //   199: aload 8
    //   201: invokevirtual 94	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   204: pop
    //   205: goto -178 -> 27
    //   208: ldc2_w 41
    //   211: ldc 43
    //   213: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   216: aload 6
    //   218: areturn
    //   219: astore_2
    //   220: goto -52 -> 168
    //   223: astore_0
    //   224: aconst_null
    //   225: astore_0
    //   226: goto -84 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	paramArrayList1	ArrayList<String>
    //   0	229	1	paramInt	int
    //   0	229	2	paramArrayList2	ArrayList<String>
    //   0	229	3	paramBoolean	boolean
    //   89	96	4	i	int
    //   63	65	5	localArrayList	ArrayList<String>
    //   140	24	5	localException	Exception
    //   15	202	6	localArrayList1	ArrayList
    //   25	13	7	localIterator	java.util.Iterator
    //   47	153	8	str	String
    // Exception table:
    //   from	to	target	type
    //   115	119	122	java/lang/Exception
    //   74	81	140	java/lang/Exception
    //   84	91	140	java/lang/Exception
    //   104	111	140	java/lang/Exception
    //   129	137	140	java/lang/Exception
    //   146	150	153	java/lang/Exception
    //   65	71	157	finally
    //   74	81	157	finally
    //   84	91	157	finally
    //   104	111	157	finally
    //   129	137	157	finally
    //   163	168	219	java/lang/Exception
    //   65	71	223	java/lang/Exception
  }
  
  private static void e(ArrayList<Integer> paramArrayList, ArrayList<String> paramArrayList1)
  {
    GMTrace.i(14958297350144L, 111448);
    if (paramArrayList.size() != paramArrayList1.size())
    {
      w.e("MicroMsg.SendImgProxyUI", "[insertErrMsg] WTF");
      GMTrace.o(14958297350144L, 111448);
      return;
    }
    int i = 0;
    while (i < paramArrayList1.size())
    {
      int j = ((Integer)paramArrayList.get(i)).intValue();
      Object localObject = n.IZ().gr(j);
      int k = e.aY((String)paramArrayList1.get(i));
      ((d)localObject).setOffset(k);
      ((d)localObject).gm(k);
      n.IZ().a(j, (d)localObject);
      long l = ((d)localObject).gGZ;
      w.i("MicroMsg.SendImgProxyUI", "[insertErrMsg] msgLocalId:%s oriImgLocalId:%s", new Object[] { Long.valueOf(l), Integer.valueOf(j) });
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(l);
      ((au)localObject).dB(5);
      ((au)localObject).dM(80);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(l, (au)localObject);
      w.i("MicroMsg.SendImgProxyUI", "after update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", new Object[] { Long.valueOf(((ce)localObject).field_msgId), Long.valueOf(((ce)localObject).field_msgSvrId), ((ce)localObject).field_talker, Integer.valueOf(((ce)localObject).field_type), Integer.valueOf(((ce)localObject).field_isSend), ((ce)localObject).field_imgPath, Integer.valueOf(((ce)localObject).field_status), Long.valueOf(((ce)localObject).field_createTime) });
      i += 1;
    }
    GMTrace.o(14958297350144L, 111448);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2394981138432L, 17844);
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    ad.a(getWindow());
    w.i("MicroMsg.SendImgProxyUI", "onCreate isRunning:%b ,%d", new Object[] { Boolean.valueOf(aDI), Integer.valueOf(hashCode()) });
    if (aDI)
    {
      w.w("MicroMsg.SendImgProxyUI", "duplicate instance");
      finish();
      GMTrace.o(2394981138432L, 17844);
      return;
    }
    aDI = true;
    setContentView(R.i.cpE);
    if (!at.AU())
    {
      w.i("MicroMsg.SendImgProxyUI", "AccHasNotReady");
      com.tencent.mm.kernel.h.xw().initialize();
    }
    this.iBj = com.tencent.mm.ui.base.h.a(this, getString(R.l.dIe), false, null);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2243046670336L, 16712);
        w.i("MicroMsg.SendImgProxyUI", "test before sendMutiImage");
        SendImgProxyUI.a(SendImgProxyUI.this, SendImgProxyUI.this.getIntent());
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(Integer.valueOf(-1));
        at.xB().bQh();
        w.i("MicroMsg.SendImgProxyUI", "test before finish");
        SendImgProxyUI.a(SendImgProxyUI.this).dismiss();
        SendImgProxyUI.this.setResult(-1, SendImgProxyUI.this.getIntent().putIntegerArrayListExtra("GalleryUI_ImgIdList", localArrayList));
        SendImgProxyUI.aaR();
        SendImgProxyUI.this.finish();
        GMTrace.o(2243046670336L, 16712);
      }
    });
    GMTrace.o(2394981138432L, 17844);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2395115356160L, 17845);
    w.i("MicroMsg.SendImgProxyUI", "onDestroy isRunning:%b , %d", new Object[] { Boolean.valueOf(aDI), Integer.valueOf(hashCode()) });
    super.onDestroy();
    GMTrace.o(2395115356160L, 17845);
  }
  
  public void onResume()
  {
    GMTrace.i(2395249573888L, 17846);
    w.i("MicroMsg.SendImgProxyUI", "onResume isRunning:%b ,%d", new Object[] { Boolean.valueOf(aDI), Integer.valueOf(hashCode()) });
    super.onResume();
    GMTrace.o(2395249573888L, 17846);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\SendImgProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */